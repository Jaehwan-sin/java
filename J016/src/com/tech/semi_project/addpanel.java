package com.tech.semi_project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class addpanel extends JFrame {

	ResultSet rs;
	Statement stmt;

	public addpanel() throws Exception {
		Connection con = makeConnection();
		String sql = "Select * from sizeinfo";
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);

		setTitle("정보기입");
		setSize(300, 220);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension framesize = getSize();
		Dimension windowsize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowsize.width - framesize.width) / 2, (windowsize.height - framesize.height) / 2);

		JTextField nametf = new JTextField(10);
		JTextField gendertf = new JTextField(10);
		JTextField colortf = new JTextField(10);
		JTextField sizetf = new JTextField(10);

		JButton clearbtn = new JButton("초기화");
		clearbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nametf.setText("");
				gendertf.setText("");
				colortf.setText("");
				sizetf.setText("");
			}
		});

		JButton confirmbtn = new JButton("확인");
		confirmbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String ename = nametf.getText();
				String egender = gendertf.getText();
				String ecolor = colortf.getText();
				String esize = sizetf.getText();

				String sql = "insert into sizeinfo values(" + "'" + ename + "','" + egender + "','" + ecolor + "','"
						+ esize + "')";

				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					stmt.executeUpdate(sql); // 쿼리 삽입 작업 실행
					rs = stmt.executeQuery("select * from sizeinfo");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});
		sizetf.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					confirmbtn.doClick();
					nametf.setText("");
					gendertf.setText("");
					colortf.setText("");
					sizetf.setText("");
					JOptionPane.showMessageDialog(null,"입력하신 값이 추가되었습니다.");
					countaddrow();
				}
			}
		});

		JPanel idPanel = new JPanel();
		idPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		idPanel.add(new JLabel("이름 : "));
		idPanel.add(nametf);

		JPanel namepanel = new JPanel();
		namepanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		namepanel.add(new JLabel("성별 : "));
		namepanel.add(gendertf);

		JPanel colorpanel = new JPanel();
		colorpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		colorpanel.add(new JLabel("색상 : "));
		colorpanel.add(colortf);

		JPanel sizepanel = new JPanel();
		sizepanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		sizepanel.add(new JLabel("사이즈 : "));
		sizepanel.add(sizetf);

		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(4, 1));
		formPanel.add(idPanel);
		formPanel.add(namepanel);
		formPanel.add(colorpanel);
		formPanel.add(sizepanel);

		JPanel btnPanel = new JPanel();
		btnPanel.add(clearbtn);
		btnPanel.add(confirmbtn);

		add(formPanel, BorderLayout.NORTH);
		add(btnPanel, BorderLayout.SOUTH);

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
}
