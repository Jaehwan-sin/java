package com.tech.w06;


public class ForFloatExam {
	public static void main(String[] args) {
//		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
//			System.out.println("print : "+x);
//		}
		
//		printf
		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
			System.out.printf("print : %.2f \n",+x);//.2�� �Ҽ��� ��°�ڸ����� ǥ���ض� / �ڿ� x�� %.2f�� �����ض�
		}
		
//		printf2
		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
			System.out.printf("print : %5.2f \n",+x);//.2�� �Ҽ��� ��°�ڸ����� ǥ���ض� / �ڿ� x�� %.2f�� �����ض�
		}
		
		int num=100;
		float score=100.0f;
		String str="����";
//		char ch='��';
		
//		Printf ��� ��� %n�� �� �ٲ�
		System.out.printf("num: %d \n",num);//%d �� ���� ���
//		System.out.printf("c : %c \n",ch);//%c �� ���ڿ� ���
		System.out.printf("str : %s \n",str);//%s �� ������ ���
//		System.out.printf("��Ʈ�� %s�� �ִ� %d%% %c %.1f%% \n",str,num,ch,score);// %%�� %�� ������ ǥ��
		
	}
}
