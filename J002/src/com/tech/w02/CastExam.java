package com.tech.w02;

public class CastExam {
	public static void main(String[] args) {
		//����ȯ : Casting
		int intvalue=65; //ASCII �ڵ� 10,13�� �ڵ�� ENTER�� �ǹ��Ѵ�.
		char charValue=(char) intvalue;//�� ������ ��������ȯ, �Ǵ� ����� ����ȯ
		// ū ������->��������� ������
//		byte<char<short<int<long<float<double
		System.out.println(charValue);
		System.out.println(intvalue);
		
		char charValue2='a';
		int intvalue2=charValue2;//�ڵ�����ȯ, ������ ����ȯ ����->ū ����� �ֱ�
		System.out.println(charValue2);
		System.out.println(intvalue2);
	}
}
