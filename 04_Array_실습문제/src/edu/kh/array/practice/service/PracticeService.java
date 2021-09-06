package edu.kh.array.practice.service;

import java.util.Arrays;
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
	
	
	/* �ǽ����� 8
	3�̻��� Ȧ���� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
	�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
	��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
	�ٽ� ������ �޵��� �ϼ���.
	[���� ȭ��]
	���� : 4
	�ٽ� �Է��ϼ���.
	���� : -6
	�ٽ� �Է��ϼ���.
	���� : 5
	1, 2, 3, 2, 1
	*/
	public void practice8() {
		// 1. ����ڿ��� 3�̻��� �������� �Է¹���
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) { // 3�̻��̰ų� Ȧ���� ��� (��, �� �Է��� ���)
				
				// ����ڰ� �Է��� ���� ũ�� ��ŭ�� �迭 ����
				int[] arr = new int[num];
				
				// ���� ��¿� ���� --> ���������� ��� 1�� ����, ���������� ��� 1�� ����
				int count = 0;
				
				// �� �ֱ�
				for(int i=0; i<arr.length; i++) {
					
					if(i <= arr.length / 2) { // �迭�� �߰������� ����
						count++;
					}else { // �߰� ���ĺ��� ����
						count--;
					}
					
					arr[i] = count;
					
					System.out.print(arr[i]);
					
					if(i < arr.length-1) {
						System.out.print(", ");
					}
				}
				
				break; // ����� ���� �ϰ� ���� �ݺ��� ����������
				
			}else { // �߸� �Է��� ���
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	}
	
	/* �ǽ����� 9
	10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�,
	1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���.
	[���� ȭ��]
	�߻��� ���� : 9 7 6 2 5 10 7 2 9 6 
	*/
	public void practice9() {
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �� �ε����� 1���� 10 ������ ������ �߻����� �ʱ�ȭ�� �� ���
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}	
	
	
	/* �ǽ����� 10
	10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�,
	1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ ��
	�迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
	[���� ȭ��]
	�߻��� ���� : 5 3 2 7 4 8 6 10 9 10
	�ִ밪 : 10
	�ּҰ� : 2
	*/
	public void practice10() {
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �ִ밪/�ּҰ��� �����ϱ� ���� ���� ���� �� �ʱ�ȭ
		int max = 1;  // �ּҰ��� ����� ���� , 1�� �������� �߻��� �� �ִ� ���� ���� ��
		int min = 10; // �ִ밪�� ����� ���� , 10�� �������� �߻��� �� �ִ� ���� ū ��
		
		// 3. �� �ε����� 1���� 10 ������ ������ �߻����� �ʱ�ȭ �� ���
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
			
			// 4. �ִ�, �ּҰ� �˻�
			if(arr[i] > max) { // �ش� �ε����� ���� max ���� ū ���
				max = arr[i]; // �ش� ���� max ������ �����
			}
			
			if(arr[i] < min) { // �ش� �ε�����  ���� min ���� ���� ���
				min = arr[i]; // �ش� ���� min ������ �����
			}
		}
		
		System.out.println(); // ����
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
				
	}	
	
	
	/* �ǽ����� 11
	10���� ���� ������ ��  �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
	1~10 ������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���.
	[���� ȭ��]
	4 1 3 6 9 5 8 10 7 2 
	*/
	public void practice11() {
	
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �� �ε��� ���� 1���� 10 ������ ������ �߻���Ű�µ� �̶� �ߺ��� ������
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<i; j++) { // �ߺ� ����
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	/* �ǽ����� 12
	�ζ� ��ȣ �ڵ� ������ ���α׷��� �ۼ��ϴµ� �ߺ� �� ���� ������������ �����Ͽ� ����ϼ���.
	[���� ȭ��]
	3 4 15 17 28 40 
	*/
	public void practice12() {
		
		// 1. ũ�Ⱑ 6�� ������ �迭 ���� �� �Ҵ�
		int[] lotto = new int[6];
		
		// 2. �迭�� �ߺ������� 1���� 45������ ���� �ʱ�ȭ
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) { // �ߺ� ����
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. �������� ����
		Arrays.sort(lotto);
		
		// 4. ���
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	
	/* �ǽ����� 13
	���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� ������ �迭�� �����ϰ�
	������ ������ �Բ� ����ϼ���.
	[���� ȭ��]
	���ڿ� : application
	���ڿ��� �ִ� ���� : a, p, l, i, c, t, o, n
	���� ���� : 8
	*/
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		int count = 0; // ���� ���� ī��Ʈ
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = str.charAt(i);
			
			boolean flag = true; // �ߺ� üũ�� flag
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					flag = false; // �ߺ��̹߻����� ��
					break;
				}
			}
			
			if(flag) { // �ߺ��� �߻����� �ʾ��� ���
				
				if(i == 0) {
					System.out.print(arr[i]);					
				}else {
					System.out.print(", " + arr[i]);					
				}
				
				count++;
			}
			
		}
		
		System.out.println();
		System.out.println("���� ���� : " + count);
		
		
	}	
	
	
	/* �ǽ����� 14
	����ڰ� �Է��� �迭�� ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
	�迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���.
	��, ����ڿ��� �迭�� ���� �� ������ ����� �� ���� �� �Է��� ����,
	�ø� ���� � �����͸� ���� ������ ��������.
	����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ� �迭 ��ü ���� ����ϼ���.
	*/
	
	/*
	 * Scanner ��� �� ������
	 * 
	 * ��ĳ�� �Է� �� �Է� ���۶�� ���� ���ڰ� �ӽ� ����� �� �о��.
	 * 
	 * ex) //  �Է¹��� :  123\n
	 * next(), nextInt(), nextDouble() �� ...
	 * -> ���� �Ǵ� ���� �� ���� �о����
	 * -> 123  (�Է� ���ۿ� \n �� ��������)
	 * 
	 * nextLine()
	 * -> ���� ���� �о����
	 * -> 123\n
	 * 
	 * ex) �Է¹��� : 100\n
	 * nextInt();  // 100 (\n����) 
	 * nextLine(); // \n
	 * 
	 * *** �ذ� ��� : �Է� ���ۿ� �����ִ� \n�� ����
	 * -> ���� ��� :  next(), nextInt(), nextDouble() ��
	 * 				���� �� �ٷ� �Ʒ��ٿ� nextLine()�� �ѹ� �ۼ��Ѵ�.
	 * 
	 */
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int size = sc.nextInt();
		sc.nextLine(); // �Է¹��ۿ� �����ִ� ���๮�� ����

		String[] arr = new String[size]; // 3
		
		int idx = 0; // ���� ����Ǵ� �迭�� ���� �ε����� ������ ����
		while(true) {
		
			// idx == 3
			for(int i=idx ; i<arr.length ; i++) { // 3~4   
				System.out.print(i + 1 + "��° ���ڿ� : ");
				arr[i] = sc.nextLine(); 
			}
			
			idx = arr.length; // 5
			
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char confirm = sc.nextLine().charAt(0);
			
			if(confirm == 'y' || confirm == 'Y') {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // �Է� ���� ���๮�� ����
				
				// �迭�� �������� + ��������
				String[] copyArr = new String[arr.length + addSize]; // �����迭 + �߰� ũ�⸸ŭ�� �迭 ����
				
				System.arraycopy(arr, 0, copyArr, 0, arr.length);
				// -> arr �迭�� ������ copyArr�� ���� ����
				
				arr = copyArr; // ���� ���� 
				// -> arr �����ϰ� �ִ� ���� �迭 ��� 
				// ���� ����� ũ�Ⱑ �þ �迭�� ���� 
				
			}else { //  confirm == 'n' || confirm == 'N'
				break;
			}
		}
		
		System.out.println( Arrays.toString(arr));
		
	}	
	
	/*
	���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� ������ �迭�� �����ϰ�
	������ ������ �Բ� ����ϼ���.
	[���� ȭ��]
	���ڿ� : application
	���ڿ��� �ִ� ���� : a, p, l, i, c, t, o, n
	���� ���� : 8
	 */
	
	public void practice13b() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.next();
		
		// �Է� ���� ���ڿ� ���� ��ŭ�� char �迭 ����
		char[] arr = new char[str.length()];
		
		int count = 0; // ���ڿ��� ���Ե� ���� ������ ���� ���� ����
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = str.charAt(i); // ���ڿ��� ���ڸ� char �迭�� ����
			
			boolean flag = true; // �ߺ��� �Ǿ����� �ȵǾ������� �˷��� ��ȣ
			
			// �ߺ� �˻�
			for(int j=0 ; j<i ; j++) {
				if(arr[i] == arr[j]) { // �ռ� �ߺ��� ���ڰ� ���� ���
					flag = false;
					break;
				}
			}
			
			if(flag) { // �ߺ����� ���� ���
				
				if(i == 0) { // ���� �ձ���
					System.out.print( arr[i] );
				}else {
					
					System.out.print( ", " + arr[i] );
				}
				
				count++; // ���� ���� 1 ����
			}
		}
		
		System.out.println();
		System.out.println("���� ���� : " + count);
		
	}
	
	/* �ǽ����� 14
	����ڰ� �Է��� �迭�� ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
	�迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���.
	��, ����ڿ��� �迭�� ���� �� ������ ����� �� ���� �� �Է��� ����,
	�ø� ���� � �����͸� ���� ������ ��������.
	����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ� �迭 ��ü ���� ����ϼ���.
	*/
	
	/* Scanner ��� �� ������
	 * 
	 * - ��ĳ�� �� Ű���� �Է� �� �Է� ���۶�� ���� �ӽ� ����� �� 
	 *   ����� ������ ���� ����, �Ǽ�, �ܾ�, ���ڿ��� �о��.
	 * 				nextInt()
	 * 
	 * ex) �Է� ���� 1 2 3 \n H e l l o \n
	 * 
	 * nextInt() -> �Է� ���ۿ��� ���� ������ ����. (���� �Ǵ� ���๮�� �� ����)
	 * 			 -> nextInt() == 123
	 * 				���� �Է� ���� : \n H e l l o \n
	 * 
	 * nextInt() ���� nextLine()
	 * 			 -> �Է� ���ۿ��� ���� ���ڿ��� �о��. (�������� ������ ù ���� ����(����) ����)
	 * 			 -> nextLine() == \n
	 * 			    ���� �Է� ���� : H e l l o \n
	 * 
	 * **** �� ������ �ذ��ϴ� ���!
	 * ������ : next(), nextInt() ��� �� 
	 *        �Է� ���� ���� �տ� \n�� �����ִ�
	 *        �׷��� ���� nextLine() �� ���� �տ� �����ִ� \n�� �о��
	 *        ��ĭ�� �о���� �һ�簡 �߻���
	 *       
	 * �ذ� ��� :  next(), nextInt()  ���� �ڿ� 
	 * 		      �ǹ� ���� nextLine()�� �� �� �ۼ��Ͽ�   
	 * 			  �Է� ���ۿ� ���� \n�� ����
	 * 
	 * */
	
	
	public void practice14b() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int size = sc.nextInt();
		sc.nextLine(); // �Է� ���ۿ� �����ִ� ���๮�� ����
		
		String[] arr = new String[size];
		
		int index = 0; // ���ڿ��� �Է� �ް� ���� ���� ����� ������ �ε��� + 1 �� ����
					   // �迭�� ���̰� ������ �� ���� �ε����� ���
		while(true) {
				
			for(int i=index ; i<arr.length ; i++) {
				System.out.print( i+1 + "��° ���ڿ� : ");
				arr[i] = sc.nextLine(); // -> ���� �Էµ� ���ڿ� �� ���ͱ��� �о�´�.
				// next(), nextDouble(), nextInt() ���
				// -> ���� �Էµ� �ܾ�,����,�Ǽ��� �о��. (���� �Ǵ� ���� �������� �о��)
			}
			
			index = arr.length; 
			
			
			System.out.println("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'Y' || ch == 'y') {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // �Է� ���� ���๮�� ����
				
				// �迭�� ũ�⸦ �ø� �� �߰� �Է�
				// -> �� �� ������� �迭�� ũ�⸦ �ø� �� ����
				// --> �� ū �迭�� ���� �⺻ �迭 ������ ���� ����
				String[] copyArr = new String[arr.length + addSize];
				
				System.arraycopy(arr, 0, copyArr, 0, arr.length); // ���� ����
				
				// ���� ����
				arr = copyArr;
				
			} else if(ch == 'N' || ch == 'n') {
				break; // while�� break
				
			} else {
				// �ٽ� �Է� �޴� ����
			}
			
		} // while end
		
		// ��� ���
		System.out.println( Arrays.toString(arr) );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
