package com.tech.semi_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class ViewHome extends JFrame {

	JTextField tname;
	JLabel namelabel, genderlabel, colorlabel, sizelabel;
	Image image1;
	Image changeimg1;
	ImageIcon[] img;
	static JTabbedPane pane;
	ResultSet rs;
	Statement stmt;

	Genderpanel genderpanel = new Genderpanel();
	Colorpanel colorpanel = new Colorpanel();
	Sizepanel sizepanel = new Sizepanel();

	public ViewHome() throws Exception {

		Connection con = makeConnection();
		String sql = "Select * from sizeinfo"; // oracle sizeinfo 테이블의 정보를 다 가져오는 명령
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);// 스크롤 할 때 센서 부착하는 명령
		rs = stmt.executeQuery(sql);// 오라클에서 불러온 데이터를 rs에 저장해놓는다.

		setTitle("옷 사이즈 선택하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 700);

		// 컴포넌트
		JLabel title = new JLabel("옷 사이즈 선택하기", JLabel.CENTER);

		title.setForeground(new Color(0, 0, 0));
		title.setFont(new Font("고딕체", Font.BOLD, 30));

		// 버튼
		JButton insertbtn = new JButton("추가");
		JButton deletebtn = new JButton("삭제");
		JButton clearbtn = new JButton("초기화");
		JButton confirmbtn = new JButton("확인");

		// 텍스트필드, 버튼
		JTextField nametf = new JTextField(10);

//		이미지 처리
		JPanel imagepanel = new JPanel();
		img = new ImageIcon[1];
		img[0] = new ImageIcon("src/clothes2.png");
		image1 = img[0].getImage();
		changeimg1 = image1.getScaledInstance(450, 300, Image.SCALE_SMOOTH);

		img[0] = new ImageIcon(changeimg1);
		JLabel timage = new JLabel();
		timage.setIcon(new ImageIcon(changeimg1));
		imagepanel.add(timage);

		// form panel
		JPanel idPanel = new JPanel();
		idPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		idPanel.add(new JLabel("이름 : "));
		idPanel.add(nametf);

		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(1, 4, 10, 30));
		formPanel.add(idPanel);
		formPanel.add(genderpanel);
		formPanel.add(colorpanel);
		formPanel.add(sizepanel);
		formPanel.setPreferredSize(new Dimension(20, 20));

		// form panel
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new GridLayout(2, 0));
		contentPanel.add(imagepanel);
		contentPanel.add(formPanel);
		// button panel
		JPanel btnpanel = new JPanel();
		btnpanel.add(insertbtn);
		insertbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String ename = nametf.getText();
				String egender = "";
				String ecolor = "";
				String esize = "";

				if (genderpanel.man.isSelected()) {
					egender = genderpanel.man.getText();
				} else if (genderpanel.women.isSelected()) {
					egender = genderpanel.women.getText();
				}

				if (colorpanel.black.isSelected()) {
					ecolor = colorpanel.black.getText();
				} else if (colorpanel.white.isSelected()) {
					ecolor = colorpanel.white.getText();
				}

				if (sizepanel.XS.isSelected()) {
					esize = sizepanel.XS.getText();
				} else if (sizepanel.S.isSelected()) {
					esize = sizepanel.S.getText();
				} else if (sizepanel.M.isSelected()) {
					esize = sizepanel.M.getText();
				} else if (sizepanel.L.isSelected()) {
					esize = sizepanel.L.getText();
				} else if (sizepanel.XL.isSelected()) {
					esize = sizepanel.XL.getText();
				}

				String sql = "insert into sizeinfo values(" + "'" + ename + "','" + egender + "','" + ecolor + "','"
						+ esize + "')";
				JOptionPane.showMessageDialog(null, "입력하신 값이 추가되었습니다.");
				countaddrow();

				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					rs = stmt.executeQuery(sql);
					rs = stmt.executeQuery("select * from sizeinfo");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			
		});
		btnpanel.add(deletebtn);
		deletebtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Delete 신호");
				String ename = nametf.getText();

				String sql = "delete from sizeinfo where 이름='" + ename + "'";
				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					int cnt = stmt.executeUpdate(sql);
					System.out.println("삭제갯수 : " + cnt);
					rs = stmt.executeQuery("select * from sizeinfo");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnpanel.add(clearbtn);
		clearbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nametf.setText("");
				genderpanel.genderbg.clearSelection();
				colorpanel.colorbg.clearSelection();
				sizepanel.sizebg.clearSelection();
			}
		});
		btnpanel.add(confirmbtn);
		confirmbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new Confirm();
				} catch (Exception e1) {
				}

			}
		});

		add(title, BorderLayout.NORTH);
		add(contentPanel, BorderLayout.CENTER);
		add(btnpanel, BorderLayout.SOUTH);

		setVisible(true);
	}

	protected void countaddrow() {
		// TODO Auto-generated method stub
		
	}

	private Connection makeConnection() {
		Connection con = null;
//		DB접속 메소드
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "111111";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("DB연결성공");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 없음");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결실패");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public static void main(String[] args) throws Exception {
		new ViewHome();
	}
}
