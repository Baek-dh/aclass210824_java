package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {
	/* �ǽ����� 1
	���̰� 9�� �迭�� ���� �� �Ҵ��ϰ�, 1���� 9������ ���� �ݺ����� �̿��Ͽ� 
	������� �迭�� �� �ε��� ��ҿ� �����ϰ� ����� �� 
	¦�� ��° �ε��� ���� ���� ����ϼ���. (0 ��° �ε����� ¦���� ���)

	[���� ȭ��]
	1 2 3 4 5 6 7 8 9
	¦�� ��° �ε��� �� : 25
	*/
	public void practice1() {
		
		// �迭 ���� �� �Ҵ�
		int[] arr = new int[9];
		
		int sum = 0; // �հ� ����� ����
		
		// for���� �̿��Ͽ� 1~9 ���� �迭 �ʱ�ȭ
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = i + 1;  // 1 ~ 9 ���� ����
			
			System.out.print(arr[i] + " "); // ���
			
			if( i % 2 == 0  ) { // ¦�� ��° �ε���
				sum += arr[i];
			}
		}

		System.out.println(); // �ٹٲ�
		System.out.println("¦�� ��° �ε��� �� : " + sum);
		
	}
	
	
	
	
	/*�ǽ����� 2
	���̰� 9�� �迭�� ���� �� �Ҵ��ϰ�, 9���� 1������ ���� �ݺ����� �̿��Ͽ� 
	������� �迭�� �� �ε��� ��ҿ� �����ϰ� ����� �� 
	Ȧ�� ��° �ε��� ���� ���� ����ϼ���. (0 ��° �ε����� ¦���� ���)

	[���� ȭ��]
	9 8 7 6 5 4 3 2 1 
	Ȧ�� ��° �ε��� �� : 20
	 */
	public void practice2() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			
			// 9 ~ 1 ����
			
			/*arr[0] = 9 == arr.length - 0;
			arr[1] = 8 == arr.length - 1;
			arr[2] = 7 == arr.length - 2;
			arr[3] = 6 == arr.length - 3;*/
			
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 1) { // Ȧ�� ��° �ε���
				sum += arr[i];
			}
			
		}
		
		System.out.println();
		System.out.println("Ȧ�� ��° �ε��� �� : " + sum);
		
	}
	
	
	/* �ǽ����� 3
	����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ� 
	1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.

	[���� ȭ��]
	���� ���� : 5
	1 2 3 4 5 
	*/
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	/* �ǽ����� 4
	���� 5���� �Է� �޾� �迭�� �ʱ�ȭ �ϰ� 
	�˻��� ������ �ϳ� �Է� �޾� �迭���� ���� ���� �ִ� �ε����� ã�� ���.
	�迭�� ���� ���� ���� ��� "��ġ�ϴ� ���� �������� �ʽ��ϴ�" ���

	[���� ȭ�� 1]
	�Է� 0 : 5
	�Է� 1 : 8
	�Է� 2 : 9
	�Է� 3 : 10
	�Է� 4 : 4
	�˻��� �� : 8
	�ε��� : 1
	 */
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0 ; i<arr.length ; i++) {
			// ���� 5���� �Է¹޾� �迭 ��� �ʱ�ȭ
			System.out.print("�Է�" + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int input = sc.nextInt();
		
		boolean flag = true; // �˻� ����� �ְ�, ���� ���� ��ȣ�� ����� ����
		
		for(int i=0 ; i<arr.length ; i++) {
			// ���� ���� ����� index ���
			if(arr[i] == input) { // ���� ���� ���� ���
				System.out.println("�ε��� : " + i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("��ġ�ϴ� ���� �������� �ʽ��ϴ�");
		}
	}
	
	
	
	/* �ǽ����� 5
	���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
	������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.

	[���� ȭ��]
	���ڿ� : application
	���� : i
	application�� i�� �����ϴ� ��ġ(�ε���) : 4 8 
	i ���� : 2
	 */
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.next(); 
		
		// ���ڿ��� �ϳ��ϳ� �� ������ char�迭�� ����
		char[] arr = new char[str.length()];
		// str.length() : �Է� ���� ���ڿ��� ����
		
		// �˻��� ���� �Է� �ޱ�
		System.out.print("���� : ");
		char ch = sc.next().charAt(0);
		
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) :");
		
		int count = 0; // �˻� ��� ���� ī��Ʈ
		
		// ���ڸ� �ϳ��ϳ� �迭�� ����
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = str.charAt(i);
			// str.charAt(i) : �Է� ���� ���ڿ��� i��° ���ڸ� ����
			
			if(arr[i] == ch) { 
				// �Է� ���� ���ڿ����� ���� i�� ���ڰ� �˻��Ϸ��� ���ڿ� ���� ���
				System.out.print(i + " "); // ���� �ε��� ���
				count++;
			}
		}
		
		System.out.println(); // �ٹٲ�
		System.out.println(ch + "���� : " + count);
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
