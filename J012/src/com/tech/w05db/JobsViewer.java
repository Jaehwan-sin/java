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

public class JobsViewer extends JFrame {

	JTextField id, title, min__salary, max__salary;
	JButton privButton, nextButton, insertButton, deleteButton, clearButton;
	ResultSet rs;
	Statement stmt;

	public JobsViewer() throws SQLException {
		Connection con = makeConnection();
		String sql = "Select * from jobs";
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);// 스크롤 할 때 센서 부착하는 명령
		rs = stmt.executeQuery(sql);

		setTitle("JobsViewer");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 2));

		add(new JLabel("ID"));
		add(id = new JTextField());
		add(new JLabel("TITLE"));
		add(title = new JTextField());
		add(new JLabel("MIN__SALARY"));
		add(min__salary = new JTextField());
		add(new JLabel("MAX__SALARY"));
		add(max__salary = new JTextField());

		privButton = (new JButton("priv"));
		add(privButton);
		privButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					rs.previous();
					id.setText(rs.getString("JOB_ID"));
					title.setText(rs.getString("JOB_TITLE"));
					min__salary.setText(rs.getString("MIN_SALARY"));
					max__salary.setText(rs.getString("MAX_SALARY"));
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
				try {
					rs.next();
					id.setText(rs.getString("JOB_ID"));
					title.setText(rs.getString("JOB_TITLE"));
					min__salary.setText(rs.getString("MIN_SALARY"));
					max__salary.setText(rs.getString("MAX_SALARY"));
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
				String eid = id.getText();
				String etitle = title.getText();
				String emin_salary = min__salary.getText();
				String emax_salary = max__salary.getText();

				String sql = "insert into JOBS values(" + "'" + eid + "','" + etitle + "','" + emin_salary + "','"
						+ emax_salary + "')";

				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					stmt.executeUpdate(sql);
					rs = stmt.executeQuery("select * from JOBS");
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
				String eid = id.getText();

				String sql = "delete from JOBS where JOB_ID='" + eid + "'";

				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					int cnt = stmt.executeUpdate(sql);
					System.out.println("삭제갯수 : " + cnt);
					rs = stmt.executeQuery("select * from JOBS");
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
				id.setText("");
				title.setText("");
				min__salary.setText("");
				max__salary.setText("");

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
		new JobsViewer();
	}
}
