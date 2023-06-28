package com.tech.w01;

public class StringEqualExam {
	public static void main(String[] args) {
		String strVar1="È«±æµ¿";
		String strVar2="È«±æµ¿";
		//°´Ã¼»ý¼º
		String strVar3=new String("È«±æµ¿");
		
		System.out.println(strVar1);
		System.out.println(strVar2);
		System.out.println(strVar3);
		
//		ºñ±³
		System.out.println(strVar1==strVar2);
		System.out.println(strVar2==strVar3);
		
		System.out.println();
		//equalÇÔ¼ö Á¦°ø
		System.out.println(strVar1.equals(strVar3));
		System.out.println(strVar2.equals(strVar3));
	}
}
