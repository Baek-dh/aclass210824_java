package edu.kh.op.practice;

import java.util.Scanner;

// ��� ������ Ŭ����
public class OperatorPractice {
	/* �ǽ� ����3
	����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
	�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
	[����ȭ��]
	���� : 60
	���� : 80
	���� : 40
	�հ� : 180
	��� : 60.0
	*/
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in); // ��ĳ�� ����
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		System.out.println(); // �ٹٲ�
		
		int sum = kor + eng + math; // ���� �հ�
		System.out.println("�հ� : " + sum);
		
		double avg = sum / 3.0; // ���
		System.out.printf("��� : %.1f \n", avg);
		
	}
	
	
	/* �ǽ� ����5
	���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
	����(19�� �ʰ�)���� ����ϼ���.
	ex.
	���� : 19
	
	û�ҳ�
	*/
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		// ���� ������(��ø)
		
		// age <= 13 : ���
		// 13 < age <= 19  : û�ҳ�
		// age > 19 : ����
		
		//String result = age <= 13 ?  "���" : ( age > 19 ? "����" : "û�ҳ�" ); 
		
		String result =  age > 13 && age <= 19 ? "û�ҳ�" : (age <=13 ) ? "���" : "����";
		//  13 < age <= 19  
		// -> age�� 13�ʰ� �̸鼭 19������ ���
		
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
}
