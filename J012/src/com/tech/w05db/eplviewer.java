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

public class eplviewer extends JFrame {

	JTextField 순위, 팀, 경기수, 승점, 승, 무, 패;
	JButton privButton, nextButton, insertButton, deleteButton, clearButton;
	ResultSet rs;
	Statement stmt;

	public eplviewer() throws SQLException {
		Connection con = makeConnection();
		String sql = "select * from epl";
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);

		setTitle("EPL 순위표");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 2));

		add(new JLabel("순위"));
		add(순위 = new JTextField());
		순위.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("팀"));
		add(팀 = new JTextField());
		팀.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("경기수"));
		add(경기수 = new JTextField());
		경기수.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("승점"));
		add(승점 = new JTextField());
		승점.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("승"));
		add(승 = new JTextField());
		승.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("무"));
		add(무 = new JTextField());
		무.setHorizontalAlignment(JLabel.CENTER);
		add(new JLabel("패"));
		add(패 = new JTextField());
		패.setHorizontalAlignment(JLabel.CENTER);

		privButton = (new JButton("이전"));
		add(privButton);
		privButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					rs.previous();
					순위.setText(rs.getInt("순위") + "");
					팀.setText(rs.getString("팀"));
					경기수.setText(rs.getInt("경기수") + "");
					승점.setText(rs.getInt("승점") + "");
					승.setText(rs.getInt("승") + "");
					무.setText(rs.getInt("무") + "");
					패.setText(rs.getInt("패") + "");
				} catch (SQLException e1) {
					System.out.println("자료없음 priv");
				}

			}
		});
		nextButton = (new JButton("다음"));
		add(nextButton);
		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					rs.next();
					순위.setText(rs.getInt("순위") + "");
					팀.setText(rs.getString("팀"));
					경기수.setText(rs.getInt("경기수") + "");
					승점.setText(rs.getInt("승점") + "");
					승.setText(rs.getInt("승") + "");
					무.setText(rs.getInt("무") + "");
					패.setText(rs.getInt("패") + "");
				} catch (SQLException e1) {
					System.out.println("자료없음 next");
				}

			}
		});
		insertButton = (new JButton("삽입"));
		add(insertButton);
		insertButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(순위.getText());
				String team = 팀.getText();
				int games = Integer.parseInt(경기수.getText());
				int point = Integer.parseInt(승점.getText());
				int win = Integer.parseInt(승.getText());
				int draw = Integer.parseInt(무.getText());
				int lose = Integer.parseInt(패.getText());

				String sql = "insert into epl values(" + "'" + num + "','" + team + "','" + games + "','" + point
						+ "','" + win + "','" + draw + "','" + lose + "')";

				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					stmt.executeUpdate(sql);
					rs = stmt.executeQuery("select * from epl");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		deleteButton = (new JButton("삭제"));
		add(deleteButton);
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(순위.getText());

				String sql = "delete from epl where 순위='" + num + "'";

				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					int cnt = stmt.executeUpdate(sql);
					System.out.println("삭제갯수 : " + cnt);
					rs = stmt.executeQuery("select * from epl");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		clearButton = (new JButton("초기화"));
		add(clearButton);
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				순위.setText("");
				팀.setText("");
				경기수.setText("");
				승점.setText("");
				승.setText("");
				무.setText("");
				패.setText("");
				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					stmt.executeUpdate(sql);
					rs = stmt.executeQuery(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

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
		new eplviewer();
	}
}
