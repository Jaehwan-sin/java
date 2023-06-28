package com.tech.tab3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JTable;
import javax.swing.border.*;
import java.sql.*;

public class Default_JTable extends JFrame {

	// 테이블 헤더 데이터
	public String[] col_name = { "ID", "PWD" };

	// 테이블에 포함될 데이터
	public Object[][] data = new Object[50][2];

	JTextField name;

	// 생성자
	public Default_JTable() {
		final JFrame f = new JFrame();
		Container cp = f.getContentPane();

		cp.setLayout(new FlowLayout());
		name = new JTextField("", 10);
		name.setCaretColor(Color.blue);
		cp.add(new JLabel("검색조건 : "));
		cp.add(name);

		name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				for (int j = 0; j < 50; j++) {
					data[j][0] = "";
					data[j][1] = "";
				}
				dataGet();
				f.repaint();
			}
		});
		JTable table = new JTable(data, col_name);
		JScrollPane scrollPane = new JScrollPane(table);
		cp.add(scrollPane, BorderLayout.CENTER);

		f.setSize(500, 500);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Default_JTable default_JTable1 = new Default_JTable();
	}

	public void dataGet() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "111111");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select ID,PWD from swingmember where id =" + "'" + name.getText().trim() + "'");
			int i = 0;
			while (rs.next()) {
				data[i][0] = rs.getString("ID");
				data[i][1] = rs.getString("PWD");
				i++;
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
			}
		}
	}
}