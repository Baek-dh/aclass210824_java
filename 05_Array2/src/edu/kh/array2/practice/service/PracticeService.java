package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		
		String[][] arr = new String[3][3];
		
		for(int row=0 ; row<arr.length ; row++) {
			for(int col=0 ; col<arr[row].length ; col++) {
				
				arr[row][col] =  "(" + row + ", " + col + ")" ;// (2, 2)
				
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
	}
	
	
	
	/* �ǽ����� 4
	4�� 4�� 2���� �迭�� �����Ͽ�
	0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� ��
	�Ʒ��� ����ó�� ó���ϼ���.
	*/
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		// arr.length == ���� ����
		// arr[row].length == �� �ະ ���� ����
		
		// 1) 2���� �迭�� ��� ������ ä���ֱ�
		// 2) ������ 3��3�������� ä������ �� �ֵ��� �ݺ��� ���ǽĿ� -1�� �߰�
		// 3) �� �� �� �հ� ���� ������ ���� ���� == �� �� �� ���� ���� ������ ���� ����
		// 4) �� �� �� �հ� ���� ������ �࿡ ���� == �� �� �� ���� ���� ������ �࿡ ����
		// 5) ������ ������ 4�� 4���� ����
		for(int row=0 ; row<arr.length-1 ; row++) {
			
			for(int col=0 ; col<arr[row].length-1 ; col++) {
				
				// ���� �߻� �� �迭�� ����
				arr[row][col] = (int)(Math.random() * 10 + 1);
				
				// �� ���� ������ ���� ������ ����
				arr[row][3] += arr[row][col];
				
				// �� ���� ������ �࿡ ������ ����
				arr[3][col] += arr[row][col];
				
				// ������ ������ 4�� 4���� ����
				arr[3][3] += arr[row][col];
			}
		}
		
		
		// ��¿� for��
		for(int row=0 ; row<arr.length ; row++) {
			for(int col=0 ; col<arr[row].length ; col++) {
				System.out.printf("%4d",arr[row][col]); // ���
			}
			System.out.println(); // �� �ٲ�
		}
	}
	
	
	// �ǽ����� 4�� �ڵ� ����
	public void practice4b() {
		
		int[][] arr = new int[4][4];
		
		// ��� ��� ��� == ������ �ʴ� Ư�� ���� �̸��� �ٿ��ִ� �뵵
		final int ROW_LAST_INDEX = arr.length - 1;
		final int COL_LAST_INDEX = arr[0].length - 1;
		
		// arr�� ���� �ϰ��ִ� 2���� �迭�� ��Ҹ�
		// ��� ���������� �����Ͽ�
		// ���� ����, ���� ��, ���� ��, �� ��, ��±��� �� ���� ����
		for(int row=0 ; row<arr.length ; row++) {
			for(int col=0 ; col<arr[row].length ; col++) {
				
				// ������ ��, ���� �ƴ� ��쿡�� ���� ����
				if( row != ROW_LAST_INDEX && col != COL_LAST_INDEX ) {
					
					arr[row][col] = (int)(Math.random() * 10 + 1); // ���� ����
					
					// �� ���� ������ ���� ������ ����
					arr[row][COL_LAST_INDEX] += arr[row][col];
					
					// �� ���� ������ �࿡ ������ ����
					arr[ROW_LAST_INDEX][col] += arr[row][col];
					
					// ������ ������ 4�� 4���� ����
					arr[ROW_LAST_INDEX][COL_LAST_INDEX] += arr[row][col];
				}
				
				System.out.printf("%4d", arr[row][col]); // ���
			}
			System.out.println(); // �ٹٲ�
		}
		
	}
	
	
	
	/* �ǽ����� 5
	2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է¹޵�, 1~10���� ���ڰ� �ƴϸ�
	���ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.�� ��� �� �ٽ� ������ �ް� �ϼ���.
	ũ�Ⱑ ������ ������ �迭 �ȿ��� ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
	(char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ� 65�� A�� ��Ÿ��, ���ĺ��� �� 26����) 
	 */
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("�� ũ�� : ");
			int rowSize = sc.nextInt();
			if(rowSize < 1 || rowSize > 10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				continue;
			}
			
			System.out.print("�� ũ�� : ");
			int colSize = sc.nextInt();
			if(colSize < 1 || colSize > 10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				continue;
			}
			
			// �迭 ���� + ���� ���� + ���
			char[][] arr = new char[rowSize][colSize];
			
			for(int row=0; row<arr.length ; row++) {
				for(int col=0 ; col<arr[row].length ; col++) {
					
					// 'A' ~ 'Z'
					// 65  ~ 90 ����
					arr[row][col] = (char) ((int)(Math.random() * 26 + 65)) ;
										// 65 <= random < 91
					
					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
			}
			
			break;
		}
		
	}
	
	
	
	public void practice5b() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("�� ũ�� : ");
			int rowSize = sc.nextInt();
			if(rowSize < 1 || rowSize > 10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				continue;
			}
			
			System.out.print("�� ũ�� : ");
			int colSize = sc.nextInt();
			if(colSize < 1 || colSize > 10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				continue;
			}
			
			// �迭 ���� + ���� ���� + ���
			int[][] arr = new int[rowSize][colSize];
			
			for(int row=0; row<arr.length ; row++) {
				for(int col=0 ; col<arr[row].length ; col++) {
					
					// 'A' ~ 'Z'
					// 65  ~ 90 ����
					arr[row][col] = (int)(Math.random() * 26 + 65) ;
										// 65 <= random < 91
					
					System.out.print((char)arr[row][col] + " ");
				}
				System.out.println();
			}
			
			break;
		}
		
	}
	
	
	/* �ǽ����� 6 
	 * ����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� 
	 * ���� ũ�⵵ �޾� ������ ���� �迭�� ���� �� �Ҵ��ϼ���. 
	 * �׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
	 */
	
	public void practice6() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ũ�� : ");
		int rowSize = sc.nextInt();
		
		char[][] arr = new char[rowSize][]; // ���� �迭
		
		// 2���� ���� �迭 ���� �� �Ҵ� 
		for(int row=0 ; row<arr.length ; row++) {
			
			System.out.print(row + "���� ���� ���� : ");
			int colSize = sc.nextInt();
			
			arr[row] = new char[colSize];
		}
	
		// 2���� ���� �迭�� 'a'���� ���ʴ�� �迭 ��Ҹ� �ʱ�ȭ + ���
		char value = 'a';
		for(int row=0 ; row<arr.length ; row++) {
			
			for(int col=0 ; col<arr[row].length ; col++) {
				
				arr[row][col] = value++; // �迭�� ���ĺ� ���� �� ���� ���ĺ����� ����
				
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
}
