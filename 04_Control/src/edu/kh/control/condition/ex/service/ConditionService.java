package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionService {

	// ���
	// - ���α׷��� �帧�� �ٲٴ�(�����ϴ�) ������ �ϴ� �ڵ�
	
	// ���ǹ�
	// - ��� �� �ϳ��� ���ǿ� ���� �ٸ� ����(�ڵ�)�� ����ǵ��� �ϴ� �ڵ�
	
	// if��
	// - ���ǽ��� true �϶��� ���ο� �ۼ��� �ڵ带 ����
	
	// if(���ǽ�){
	//		������ �ڵ�
	// }

	public void example1() {
		// Ű����� ������ �ϳ� �Է� �޾�
		// ����� ��� : "��� �Դϴ�"
		// ����� �ƴ� ��� : "����� �ƴմϴ�"
		// if�� ������ �ڵ� �ۼ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		
		int input = sc.nextInt();
		
		if( input > 0 ) {
			// �Է� ���� ���� 0 ���� Ŭ ���
			System.out.println("��� �Դϴ�.");
		}
		
		
		if( input <= 0 ) {
			// �Է� ���� ���� 0���� �۰ų� ���� ���
			System.out.println("����� �ƴմϴ�.");
		}
		
	}
	
	
	// if - else
	// - ���ǽ��� true�� ��� if��, false�� ��� else�� ���� �ڵ带 ����
	/* 
	 * if(���ǽ�) {
	 * 		���ǽ��� true�� ��� ������ �ڵ�
	 * 
	 * } else {
	 * 		���ǽ��� false�� ��� ������ �ڵ�
	 * }
	 * 
	 * */
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		if( input > 0 ) {
			System.out.println("��� �Դϴ�.");
			
		} else {
			
			System.out.println("����� �ƴմϴ�.");
		}
		
	}
	
	
	// if - else if - else ����
	public void example3() {
		
		// ������ �ϳ� �Է� �޾�
		// ����� ��� : "��� �Դϴ�."
		// ������ ��� : "���� �Դϴ�."
		// 0�� ���   : "0 �Դϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		
		String result; // ��� ����� ���� ����
		
		if( input > 0 ) { // ����
			result = "���";
			
		} else if( input < 0) { // �տ� ������ �������� ������ �ٸ� ����
			result = "����";
			
		} else { // �ռ� ���ǵ��� ��� �������� ���� ���
			result = "0";
			
		}
		
		System.out.println(result + " �Դϴ�.");
		
	}
	
	
	public void example4() {
		
		// ���̸� �Է� �޾�
		// 13�� ���� : "��� �Դϴ�"
		// 13�� �ʰ� 19�� ���� : "û�ҳ� �Դϴ�"
		// 19�� �ʰ� : "���� �Դϴ�."
		
		// if - else if - else
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age <= 13) { // ���
			result = "���";
			
		}else if(age > 19) { // ����
			result = "����";
			
		}else { // û�ҳ�
			result = "û�ҳ�";
			
		}
		
		System.out.println(result + " �Դϴ�.");
		
	}
	
	
	public void example5() {
		
		// ��(��)�� �ϳ� �Է� �޾�
		// �Է� ���� ���� 
		// 3,4,5   �̸� "��"
		// 6,7,8   �̸� "����"
		// 9,10,11 �̸� "����"
		// 12,1,2  �̸� "�ܿ�"
		// 1~12 ���� ���ڰ� �ƴϸ� "�߸� �Է��ϼ̽��ϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��(��) �Է� : ");
		int month = sc.nextInt();
		
		String result; // ��� ����� ���� ����
		
		if( month >= 3 && month <= 5  ) { // 3~5 ����
			result = "��";
			
		}else if( month >= 6 && month <= 8 ) {
			result = "����";
			
		}else if( month >= 9 && month <= 11 ) {
			result = "����";
			
		}else if( month == 12 || month == 1 || month == 2 ) {
			result = "�ܿ�";
			
		}else {
			result = "�߸� �Է��ϼ̽��ϴ�.";
			//System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
			// (����!) ���������� �ݵ�� �ʱ�ȭ �Ǿ�� �Ѵ�!
		}
		
		System.out.println(result);
	}
	
	public void example6() {
		
		// ������ �Է� �޾�
		// 90�� �̻��� ��� : A
		// 80�� �̻�, 90�� �̸��� ��� : B
		// 70�� �̻�, 80�� �̸��� ��� : C
		// 60�� �̻�, 70�� �̸��� ��� : D
		// 60�� �̸��� ��� : F
		// 100�� �ʰ� 0�� �̸��� ��� : �߸� �Է��ϼ̽��ϴ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		
		String result;
		
		if( score > 100  ||	  score < 0) { // 100�� �ʰ� 0�� �̸�
			result = "�߸� �Է��ϼ̽��ϴ�.";
			
		} else if( score >= 90 ) { // 90�� �̻�, 100�� ����
			result = "A";
			
		} else if( score >= 80 ) { // 80�� �̻�, 90�� �̸�
			result = "B";
			
		} else if( score >= 70 ) { // 70�� �̻�, 80�� �̸�
			result = "C";
			
		} else if( score >= 60 ) { // 60�� �̻�, 70�� �̸�
			result = "D";
			
		} else { // 0�� �̻�, 60�� �̸�
			result = "F";
		}
		
		System.out.println(result);
		
	}
	
	
	// ���� if�� ����
	public void example7() {
		
		// ���̱ⱸ ž�� ���� �˻�
		// ���̰� 12�� �̻�, Ű 140.0cm �̻� �� ��쿡�� "ž�� ����"
		// ���̰� 12�̸��� ��� : "���� ������ �ƴմϴ�."
		// Ű�� 140.0cm �̸� : "���� Ű�� �ƴմϴ�."
		// ���̸� 0�� �̸�, 100�� �ʰ� �� : "�߸� �Է��ϼ̽��ϴ�."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű �Է�(cm) : ");
		double height = sc.nextDouble();
		
		String result;
		
		// 0�� �̸�, 100�� �ʰ�
		if( age < 0  ||  age > 100 ) {
			result = "�߸� �Է��ϼ̽��ϴ�.";
		
		} else { // 0�� �̻�, 100�� ����
			
			if(age < 12) { // 12�� �̸�
				result = "���� ������ �ƴմϴ�.";
			
			}else { // 12�� �̻�
				
				if(height < 140.0) { // Ű 140.0cm �̸�
					result = "���� Ű�� �ƴմϴ�.";
				
				}else { // 12�� �̻�, Ű 140.0cm �̻�
					result = "ž�� ����";
				}
			}
		}
		
		System.out.println(result);
	}
	
	
	// ���̱ⱸ ž�� ���� �˻� ���α׷�
	// ���� - ���� : 12�� �̻�
	//     -  Ű : 140.0cm �̻�
	
	// ���̸� 0~100�� ���̷� �Է����� ���� ��� : "���̸� �߸� �Է� �ϼ̽��ϴ�."
	// Ű�� 0~250.0cm ���̷� �Է����� ���� ��� : "Ű�� �߸� �Է� �ϼ̽��ϴ�."
	// -> �Է��� ���� ���� �˻縦 �����Ͽ� �߸��� ��� ���α׷� ����
	
	// ���� O , Ű X : "���̴� �����ϳ�, Ű�� ����ġ ����";
	// ���� X , Ű O : "Ű�� �����ϳ�, ���̴� ����ġ ����";
	// ���� X , Ű X : "���̿� Ű ��� ����ġ ����";
	// ���� O , Ű O : "ž�� ����"
	
	public void example8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		String result;
		if( age < 0 || age > 100 ) {
			result = "���̸� �߸� �Է� �ϼ̽��ϴ�.";
			
		}else { // ���̸� 0~100 ���̸� �Է��� ���
			System.out.print("Ű �Է�(cm) : ");
			double height = sc.nextDouble();
	
			if( height < 0 || height > 250.0 ) {
				result = "Ű�� �߸� �Է� �ϼ̽��ϴ�.";
			
			} else { // Ű, ���̸� ���� ������ �Է��� ���
				
				// 1) ��ø if���� �̿��� ���
				if( age < 12 ) { // ���̰� ����ġ ���� ���
					
					if( height >= 140.0 ) {
						result = "Ű�� �����ϳ�, ���̰� ����ġ ����";
					}else {
						result = "���̿� Ű ��� ����ġ ����";
					}
					
				} else { // ���̰� ������ ���
					
					if( height >= 140.0 ) {
						result = "ž�� ����";
					}else {
						result = "���̴� �����ϳ�, Ű�� ����ġ ����";
					}
				}
				
				
				// 2) if - else if - else �� �̿��� ���
				
				/*if( age >= 12 && height >= 140.0 ) {
					result = "ž�� ����";
				
				} else if( age >= 12 && height < 140.0 ) {
					result = "���̴� �����ϳ�, Ű�� ����ġ ����";
					
				} else if( age < 12 && height >= 140.0 ) {
					result = "Ű�� �����ϳ�, ���̰� ����ġ ����";
					
				} else {
					result = "���̿� Ű ��� ����ġ ����";
					
				}*/
			}
		}
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
}
