package com.tech.w05db;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Studentinfo extends JFrame {

	JTextField s_no, s_name, s_addr, s_grade, s_birth, s_subj, s_score;
	JButton privButton, nextButton, insertButton, deleteButton, clearButton;
	ResultSet rs;
	Statement stmt;

	public Studentinfo() throws SQLException {
		Connection con = makeConnection();
		String sql = "select * from studentinfo";
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);// stmt는 SQL구문을 실행하는 역할
		rs = stmt.executeQuery(sql);

		setTitle("학생 정보 샘플 데이터");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 2));

//		화면구성
		add(new JLabel("s_no"));
		add(s_no = new JTextField());
		s_no.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("s_name"));
		add(s_name = new JTextField());
		s_name.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("s_addr"));
		add(s_addr = new JTextField());
		s_addr.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("s_grade"));
		add(s_grade = new JTextField());
		s_grade.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("s_birth"));
		add(s_birth = new JTextField());
		s_birth.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("s_subj"));
		add(s_subj = new JTextField());
		s_subj.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("s_score"));
		add(s_score = new JTextField());
		s_score.setHorizontalAlignment(JLabel.CENTER);

		privButton = (new JButton("priv"));
		add(privButton);
		privButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("priv 신호");
				try {
					rs.previous();
					s_no.setText(rs.getInt("번호") + "");
					s_name.setText(rs.getString("이름"));
					s_addr.setText(rs.getString("주소"));
					s_grade.setText(rs.getInt("학년") + "");
					s_birth.setText(rs.getString("생년월일"));
					s_subj.setText(rs.getString("학과번호"));
					s_score.setText(rs.getInt("학점") + "");
				} catch (SQLException e1) {
					System.out.println("자료없음 priv");
				}

			}
		});
		nextButton = (new JButton("next"));
		add(nextButton);
		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("next 신호");
				try {
					rs.next();
					s_no.setText(rs.getInt("번호") + "");
					s_name.setText(rs.getString("이름"));
					s_addr.setText(rs.getString("주소"));
					s_grade.setText(rs.getInt("학년") + "");
					s_birth.setText(rs.getString("생년월일"));
					s_subj.setText(rs.getString("학과번호"));
					s_score.setText(rs.getInt("학점") + "");
				} catch (SQLException e1) {
					System.out.println("자료없음 next");
				}

			}
		});
		insertButton = (new JButton("insert"));
		add(insertButton);
		insertButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("insert 신호");
				int ss_no = Integer.parseInt(s_no.getText());
				String ss_name = s_name.getText();
				String ss_addr = s_addr.getText();
				int ss_grade = Integer.parseInt(s_grade.getText());
				String ss_birth = s_birth.getText();
				String ss_subj = s_subj.getText();
				int ss_score = Integer.parseInt(s_score.getText());

				String sql = "insert into studentinfo values(" + "'" + ss_no + "','" + ss_name + "','" + ss_addr + "','"
						+ ss_grade + "','" + ss_birth + "','" + ss_subj + "','" + ss_score + "')";

				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					stmt.executeUpdate(sql);
					rs = stmt.executeQuery("select * from studentinfo");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		deleteButton = (new JButton("delete"));
		add(deleteButton);
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("delete 신호");
				String ss_no = s_no.getText();

				String sql = "delete from studentinfo where 번호='" + ss_no + "'";

				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					int cnt = stmt.executeUpdate(sql);
					System.out.println("삭제갯수 : " + cnt);
					rs = stmt.executeQuery("select * from studentinfo");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		clearButton = (new JButton("clear"));
		add(clearButton);
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("clear 신호");
				s_no.setText("");
				s_name.setText("");
				s_addr.setText("");
				s_grade.setText("");
				s_birth.setText("");
				s_subj.setText("");
				s_score.setText("");

			}
		});

		setVisible(true);
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

	public static void main(String[] args) throws SQLException {
		new Studentinfo();
	}
}
