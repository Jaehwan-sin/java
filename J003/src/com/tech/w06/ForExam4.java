package com.tech.w06;

public class ForExam4 {
//	For �ݺ���
	public static void main(String[] args) {
//		�ݺ����� ����� �հ� ���ϱ�
//		¦���� �հ� even
//		Ȧ���� �հ� odd
		
		int even=0,odd=0;
//		int sum=0; // sum=��������
		for (int i = 0; i <= 10; i++) {
			if (i%2==0) {// ¦�� ���ǽ�
				even+=i;// if ���� �� �����϶� �߰�ȣ ���� ����
			}else {// Ȧ�� ���ǽ�
				odd+=i;
			}	

		}
		// �������
		System.out.println("¦�� : "+even);
		System.out.println("Ȧ�� : "+odd);
		
		
		even=0;
		odd=0;
		for (int i = 0; i <= 10; i=i+2)
				even+=i;// for ���� for ���� �� �����϶� �߰�ȣ ���� ����
		// �������
		System.out.println("¦�� : "+even);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		for(�ʱⰪ;���ǽ�;������) {
//			����
//		}
//	������� : �ʱⰪ->���ǽ�->����->������->���ǽ�[���ǽ�->����->������]
//		����for��
		
			
	}
}
