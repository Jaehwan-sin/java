package com.tech.w07chat;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChatServer extends JFrame implements ActionListener {
	JButton btnExit;
	TextArea ta;
	Vector vChatList;
	ServerSocket ss;
	Socket sockClient;

	public ChatServer() {
		setTitle("Gui 채팅 서버 ver 1.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		vChatList = new Vector();
		btnExit = new JButton("서버종료");
		btnExit.addActionListener(this);
		ta = new TextArea();
		add(ta, BorderLayout.CENTER);
		add(btnExit, BorderLayout.SOUTH);

		setBounds(280, 280, 400, 200);
		setVisible(true);

		chatStart();
	}

	public void chatStart() {
		// 서버를 스타트

		try {
			ss = new ServerSocket(5011);
			while (true) {
				sockClient = ss.accept();// 클라이언트 접속
				ta.append(sockClient.getInetAddress().getHostAddress() + "접속함\n");// 클라이언트 ip확인
				ChatHandle threadChat = new ChatHandle();// 생성자호출
				vChatList.add(threadChat);// 클라이언트가 접속할때마다
				threadChat.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	class ChatHandle extends Thread {// 쓰레드 클래스
		BufferedReader br = null;// 입력준비
		PrintWriter pw = null;// 출력준비

		public ChatHandle() {
			try {
				InputStream is = sockClient.getInputStream();// 입력
				br = new BufferedReader(new InputStreamReader(is));
				OutputStream os = sockClient.getOutputStream();// 출력
				pw = new PrintWriter(new OutputStreamWriter(os));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 입력
		}

		public void sendAllClient(String msg) {
//			모든 클라이언트에 메시지 전달
			int size = vChatList.size();// 클라이언트갯수
			for (int i = 0; i < size; i++) {
				ChatHandle chr = (ChatHandle) vChatList.elementAt(i);
				chr.pw.println(msg);// 메시지 출력
				chr.pw.flush();// 즉시전송
			}
		}

		@Override
		public void run() {
			try {
				String name = br.readLine();
				sendAllClient(name + "님께서 새로 입장");

				while (true) {
					String msg = br.readLine();
					String str = sockClient.getInetAddress().getHostName();// 컴퓨터이름
					ta.append(msg + "\n");// 내용추가
					if (msg.equals("@@exit")) {
						break;
					} else {
						// 모든 클라이언트에 메시지 전달
						sendAllClient(name + " : " + msg);
					}
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				vChatList.remove(this);

				try {
					br.close();
					pw.close();
					sockClient.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("서버종료");

	}

	public static void main(String[] args) {
		new ChatServer();
	}
}
