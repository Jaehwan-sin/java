package com.tech.w03net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UriConnectNaverExam {
//	네이버 소스 크롤링
//	크롤링(crawling) 혹은 스크레이핑(scraping)은 웹 페이지를 그대로 가져와서 거기서 데이터를 추출해 내는 행위다.
	public static void main(String[] args) throws Exception {
		URL site = new URL("https//dict.naver.com");
		URLConnection url = site.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream(), "utf-8"));
		String inLine;
		while ((inLine=in.readLine())!=null) {
			System.out.println(inLine);
		}
		in.close();
	}
}
