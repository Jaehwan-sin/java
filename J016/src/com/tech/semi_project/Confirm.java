package com.tech.semi_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class Confirm extends JFrame {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String colNames[] = { "이름", "성별", "색상", "사이즈" };
	private static DefaultTableModel model = new DefaultTableModel(colNames, 0);

	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private JTextField searchField;
	private static JTable table;

	private JPanel createSelectPanel() {
		JPanel selectPanel = new JPanel();

		try {
			String query = "SELECT 이름, 성별, 색상, 사이즈 FROM sizeinfo";
			Class.forName(driver);
			con = DriverManager.getConnection(url, "hr", "111111");
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				model.addRow(new Object[] { rs.getString("이름"), rs.getString("성별"), rs.getString("색상"),
						rs.getString("사이즈") });
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		selectPanel.add(scrollPane);

		tableCellCenter(table);
		CellheaderCenter(table);
		header();
		return selectPanel;
	}

	private void header() {
		JTableHeader header = table.getTableHeader();

		int headerHeight = header.getPreferredSize().height;
		header.setPreferredSize(new Dimension(header.getWidth(), headerHeight + 15));
	}

	private JPanel btn() {

		JPanel btnpanel = new JPanel();
		JButton btn1 = new JButton("돌아가기");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new ViewHome();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btn2 = new JButton("추가");
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new addpanel();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btn5 = new JButton("삭제");
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model2 = (DefaultTableModel) table.getModel();
				int row = table.getSelectedRow();
				if (row < 0)
					return;
				String name = (String) model2.getValueAt(row, 0);

				String query = "DELETE FROM sizeinfo WHERE 이름 = ?";

				try {
					Class.forName(driver);
					con = DriverManager.getConnection(url, "hr", "111111");
					pstmt = con.prepareStatement(query);

					pstmt.setString(1, name);
					int cnt = pstmt.executeUpdate();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				} finally {
					try {
						pstmt.close();
						con.close();
					} catch (Exception e3) {
						e3.printStackTrace();
					}
				}
				model2.removeRow(row);
			}
		});

		JButton btn6 = new JButton("새로고침");
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String sql = "select * from sizeinfo";
					con = DriverManager.getConnection(url, "hr", "111111");
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();

					model.setRowCount(0);

					while (rs.next()) {
						String 이름 = rs.getString("이름");
						String 성별 = rs.getString("성별");
						String 색상 = rs.getString("색상");
						String 사이즈 = rs.getString("사이즈");

						Object data[] = { 이름, 성별, 색상, 사이즈 };
						model.addRow(data);
					}
				} catch (Exception e2) {
					System.out.println("새로고침되지 않음");
					e2.printStackTrace();
				} finally {
					try {
						if (rs != null) {
							rs.close();
						}
						if (pstmt != null) {
							pstmt.close();
						}
					} catch (Exception e3) {
						System.out.println("xx");
					}
				}
				searchField.setText("사이즈를 입력하세요.");
			}
		});

		btnpanel.add(btn1);
		btnpanel.add(btn2);
		btnpanel.add(btn5);
		btnpanel.add(btn6);

		return btnpanel;

	}

	public Confirm() throws Exception {
		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.blue);

		JLabel title = new JLabel("테이블 확인", JLabel.CENTER);
		title.setForeground(new Color(0, 0, 0));
		title.setFont(new Font("고딕체", Font.BOLD, 30));

		JPanel panel = new JPanel();
		panel.add(createSelectPanel());

		JPanel panel2 = new JPanel();
		panel2.add(btn());

		searchField = new JTextField("사이즈를 입력하세요.",18);
		searchField.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
			searchField.setText("");	
			}
		});
		
		JButton searchbtn = new JButton("검색");
		searchbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String searchKeyword = searchField.getText().trim();
				searchKeyword = searchKeyword.toUpperCase();
				try {
					String query = "SELECT 이름, 성별, 색상, 사이즈 FROM sizeinfo WHERE 사이즈 LIKE ?";
					Class.forName(driver);
					con = DriverManager.getConnection(url, "hr", "111111");
					pstmt = con.prepareStatement(query);
					pstmt.setString(1, searchKeyword);
					rs = pstmt.executeQuery();

					model.setRowCount(0);
					
					boolean found = false;
					
					while (rs.next()) {
						found = true;
						model.addRow(new Object[] { rs.getString("이름"), rs.getString("성별"), rs.getString("색상"),
								rs.getString("사이즈") });
					}
					if (!found) {
						JOptionPane.showMessageDialog(null, "일치하는 값이 없습니다. \n 다시 입력해주세요.");
					} else if (searchField.getText()=="") {
						rs = pstmt.executeQuery();
					} 
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				} finally {
					try {
						rs.close();
						pstmt.close();
						con.close();
					} catch (Exception e3) {
						e3.printStackTrace();
					}
				}
			}
		});

		searchField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10){
					searchbtn.doClick();
				}
			}
		});
		
		JPanel searchpanel = new JPanel();
		searchpanel.add(searchField);
		searchpanel.add(searchbtn);

		JPanel topPanel = new JPanel(new GridLayout(2, 0));
		topPanel.add(title);
		topPanel.add(searchpanel);

		add(panel2, BorderLayout.SOUTH);
		add(topPanel, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);

		setVisible(true);
	}

//	JTable의 값이 중앙에 오도록 하는 코드
	public static void tableCellCenter(JTable table) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();

		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr);
		}

	}

//	JTable의 헤더 값이 중앙에 오도록 하는 코드
	public static void CellheaderCenter(JTable t) {
		DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		table.getTableHeader().setDefaultRenderer(renderer);
	}
	
//	추가되는 값이 JTable의 맨 마지막 행에 추가되도록 하는 코드
	public static void countaddrow() {
		int rowCount = model.getRowCount();
		model.addRow(new Object[] {"이름","성별","색상","사이즈"});
		
		if (rowCount < 0) {
			table.scrollRectToVisible(table.getCellRect(rowCount , 0, true));
		}
	}

}
