package com.tech.tab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

import javax.print.CancelablePrintJob;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JoinScreen extends JFrame {

	JTextField jtf1 = null;
	String choice = null;
	Connection conn = null;

	public JoinScreen() {

		setTitle("회원관리 화면");

		// 1. 컴포넌트들을 만들어 보자.
		JLabel title = new JLabel("회원가입", JLabel.CENTER);

		title.setForeground(new Color(5, 0, 153));
		title.setFont(new Font("휴먼편지체", Font.BOLD, 30));

		JButton join = new JButton("회원가입");
		JButton cancel = new JButton("취소");

		JTextField id = new JTextField(10);
		JPasswordField pwd = new JPasswordField(10);
		JTextField name = new JTextField(10);
		JTextField phone = new JTextField(10);

		JRadioButton client = new JRadioButton("고객");
		JRadioButton manager = new JRadioButton("관리자");
		JRadioButton etc = new JRadioButton("기타");

		ButtonGroup bg = new ButtonGroup();
		bg.add(client);
		bg.add(manager);
		bg.add(etc);

		// radio panel
		JPanel radioPanel = new JPanel();
		radioPanel.add(client);
		radioPanel.add(manager);
		radioPanel.add(etc);

		// form panel
		JPanel idPanel = new JPanel();
		idPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		idPanel.add(new JLabel("아이디 : "));
		idPanel.add(id);

		JPanel pwdPanel = new JPanel();
		pwdPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pwdPanel.add(new JLabel("비밀번호 : "));
		pwdPanel.add(pwd);

		JPanel namePanel = new JPanel();
		namePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		namePanel.add(new JLabel("이    름 : "));
		namePanel.add(name);

		JPanel phonePanel = new JPanel();
		phonePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		phonePanel.add(new JLabel("연 락 처 : "));
		phonePanel.add(phone);

		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(4, 1));
		formPanel.add(idPanel);
		formPanel.add(pwdPanel);
		formPanel.add(namePanel);
		formPanel.add(phonePanel);

		// radio + form panel
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new FlowLayout());
		contentPanel.add(radioPanel);
		contentPanel.add(formPanel);

		// button panel
		JPanel panel = new JPanel();
		panel.add(join);
		panel.add(cancel);

		add(title, BorderLayout.NORTH);
		add(contentPanel, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);

		setBounds(200, 200, 250, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myId = id.getText();
				String myPwd = new String(pwd.getPassword());
				String myName = name.getText();
				String myPhone = phone.getText();

				conn = makeConnection();
				String insertmemberSql = "insert into swingmember values('" + myId + "','" + myPwd + "','" + myName
						+ "','" + myPhone + "')";

				int count = 0;
				try {
					Statement stmt = conn.createStatement();
					count = stmt.executeUpdate(insertmemberSql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("가입cnt : " + count);
				JOptionPane.showMessageDialog(null, "아이디 : " + myId + "이름 : " + myName + "전화번호 : " + myPhone);
				if (count >= 1) {
					JOptionPane.showMessageDialog(null, "가입완료");
					new LoginScreen();
					dispose();

				}
			}
		});
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new LoginScreen();// 로그인 창으로 화면전환하기 
				dispose();

			}
		});

	}

	public Connection makeConnection() {
		Connection conn = null;
//				커넥션을 완성해서 리턴해주기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "111111";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
			conn = DriverManager.getConnection(url, user, pass);
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

		return conn;
	}
}
