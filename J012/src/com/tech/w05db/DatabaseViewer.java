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

//Swing으로 db컨트롤
public class DatabaseViewer extends JFrame {

	JTextField code, name, shop, writer, price;
	JButton privButton, nextButton, insertButton, deleteButton, clearButton;
	ResultSet rs;
	Statement stmt;

	public DatabaseViewer() throws SQLException {
		Connection con = makeConnection();
		String sql = "Select * from bookinfo"; // oracle bookinfo 테이블의 정보를 다 가져오는 명령
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);// 스크롤 할 때 센서 부착하는 명령
		rs = stmt.executeQuery(sql);// 오라클에서 불러온 데이터를 rs에 저장해놓는다.

		setTitle("DatabaseViewer");
		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 2));
//		화면구성
		add(new JLabel("Code"));
		add(code = new JTextField());
		add(new JLabel("name"));
		add(name = new JTextField());
		add(new JLabel("shop"));
		add(shop = new JTextField());
		add(new JLabel("writer"));
		add(writer = new JTextField());
		add(new JLabel("price"));
		add(price = new JTextField());

		privButton = (new JButton("priv"));
		add(privButton);
		privButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("priv 신호");
				try {
					rs.previous();
					code.setText(rs.getString("bb_code"));
					name.setText(rs.getString("bb_name"));
					shop.setText(rs.getString("bb_shop"));
					writer.setText(rs.getString("bb_writer"));
					price.setText(rs.getInt("bb_price") + "");
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
					code.setText(rs.getString("bb_code"));
					name.setText(rs.getString("bb_name"));
					shop.setText(rs.getString("bb_shop"));
					writer.setText(rs.getString("bb_writer"));
					price.setText(rs.getInt("bb_price") + "");

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
				System.out.println("Inesert 신호");
				String ecode = code.getText();
				String ename = name.getText();
				String eshop = shop.getText();
				String ewriter = writer.getText();
				int eprice = Integer.parseInt(price.getText());// 가격은 숫자이기때문에 int 형식으로 형 변환

				String sql = "insert into bookinfo values(" + "'" + ecode + "','" + ename + "','" + eshop + "','"
						+ ewriter + "','" + eprice + "')";
//				쿼리에 넣기
				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					stmt.executeUpdate(sql); // 쿼리 삽입 작업 실행
					rs = stmt.executeQuery("select * from bookinfo");
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
//				입력한 코드가 일치하면 삭제가 되도록 만들기
				System.out.println("Delete 신호");
				String ecode = code.getText();

				String sql = "delete from bookinfo where BB_CODE='" + ecode + "'";
				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					int cnt = stmt.executeUpdate(sql);
					System.out.println("삭제갯수 : " + cnt);
					rs = stmt.executeQuery("select * from bookinfo");
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
				code.setText("");
				name.setText("");
				shop.setText("");
				writer.setText("");
				price.setText("");

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
		new DatabaseViewer();
	}
}
