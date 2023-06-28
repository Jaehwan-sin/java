package com.tech.w09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FinallyExceptionExam {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		BufferedReader br = null;
		BufferedWriter bw = null;

		Date d = null;

//		파일의 내용 카피

		try {
//			입력도구
			fr = new FileReader("inSchool.txt");
			br = new BufferedReader(fr);

//			출력도구
			fw = new FileWriter("outSchool.txt", false);
			bw = new BufferedWriter(fw);

			String s = null;
			d = new Date(); // 현재시간

//			파일 카피
			long start = d.getTime();
			System.out.println("현재시간 : " + start);

//			카피
			while ((s = br.readLine()) != null) {// 파일에서 라인으로 입력받기
				bw.write(s);// bw에 출력
				bw.newLine();// 줄바꿈
			}
			d = new Date(); // 종료시간
			long end = d.getTime();
			System.out.println("토탈 복사에 사용한 시간 : " + (end - start));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//자원회수
			if (fr!=null) {try {br.close();} catch (IOException e) {}}
			if (br!=null) {try {br.close();} catch (IOException e) {}}
			if (fw!=null) {try {br.close();} catch (IOException e) {}}
			if (bw!=null) {try {br.close();} catch (IOException e) {}}
			}
		}

	}

