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
	�迭�� ���� ���� ���� ��� ����ġ�ϴ� ���� �������� �ʽ��ϴ١� ���

	[���� ȭ�� 1]
	�Է� 0 : 5
	�Է� 1 : 8
	�Է� 2 : 9
	�Է� 3 : 10
	�Է� 4 : 4
	�˻��� �� : 8
	�ε��� : 1
	
	[���� ȭ�� 2]
	�Է� 0 : 5
	�Է� 1 : 8
	�Է� 2 : 9
	�Է� 3 : 10
	�Է� 4 : 4
	�˻��� �� : 1
	��ġ�ϴ� ���� �������� �ʽ��ϴ�.

	*/
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		// ���� 5�� �Է� �ޱ�
		for(int i=0; i<arr.length ; i++) {
			System.out.print("�Է� " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int search = sc.nextInt();
		
		
		boolean flag = true; // �˻� ����� ��ȣ
		
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] == search) {
				System.out.print("�ε��� : " + i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("��ġ�ϴ� ���� �������� �ʽ��ϴ�.");
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
	
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.next();
		
		System.out.print("���� : ");
		char ch = sc.next().charAt(0); // �Է� ���� ���ڿ� �� ���� ���� �տ� �Էµ� ���ڸ� ���� ch�� ����
		
		// �Է� ���� ���ڿ� ���� ��ŭ�� char �迭 ���� �� �Ҵ�.
		char[] arr = new char[str.length()];
		// str.length() : ���ڿ� ����
		
		
		// ��ġ�ϴ� ������ ������ ���� ���� ���� ����
		int count = 0;
		
		// �ݺ��� ������ ���ڿ� ���
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		
		// ���ڿ��� �迭�� �ִ� �Ͱ� ���ÿ� �˻�, ī��Ʈ ����
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = str.charAt(i);
			
			if(arr[i] == ch) { // �ش� �ε��� ���� �˻��� ���ڿ� ���� ��� 
				System.out.print(i + " ");	// ���� �ε����� ���ڿ� �ڿ� �̾ ���
				count++;	// �׸��� count 1����
			}
		}
		
		System.out.println();	// �ٹٲ�
		System.out.println(ch + "���� : " + count);
		
	}
	
	
	/* �ǽ����� 6
	����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
	�迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
	�׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���.

	[���� ȭ��]
	���� : 5
	�迭 0��° �ε����� ���� �� : 4
	�迭 1��° �ε����� ���� �� : -4
	�迭 2��° �ε����� ���� �� : 3
	�迭 3��° �ε����� ���� �� : -3
	�迭 4��° �ε����� ���� �� : 2
	4 -4 3 -3 2 
	�� �� : 2
	 */
	public void practice6() {
		// ����ڿ��� ���� �Է¹ް� �� �� ��ŭ�� �迭 ���� �� �Ҵ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ
		for(int i=0; i<arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}
		
		//  ��ü �� ���� �� �� �� ���
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("�� �� : " + sum);
	}
	
	
	/* �ǽ����� 7
	�ֹε�Ϲ�ȣ ��ȣ�� �Է� �޾� char �迭�� ������ �� ����ϼ���.
	��, char �迭 ���� �� ������ ��Ÿ���� ���� ���ĺ��� *�� �����ϼ���.

	[���� ȭ��]
	�ֹε�Ϲ�ȣ(-����) : 123456-1234567
	123456-1******
	*/
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			
			if(i <= 7) { // 7�� �ε��� ���ϱ�����
				arr[i] = str.charAt(i);
			}else { // �� ���ĺ��ʹ� *�� ������
				arr[i] = '*';
			}
			
			System.out.print(arr[i]);
		}
	}
	
	
	
	
	
	
	
}
