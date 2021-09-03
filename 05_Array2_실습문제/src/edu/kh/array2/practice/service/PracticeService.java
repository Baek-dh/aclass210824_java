package edu.kh.array2.practice.service;

import java.util.Random;
import java.util.Scanner;

public class PracticeService {

	/*�ǽ����� 1 
	 3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
	 �ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� ��(0, 0)���� ����
	 �������� ���� �� ����ϼ���. 
	 ex. 
	 (0, 0)(0, 1)(0, 2) 
	 (1, 0)(1, 1)(1, 2) 
	 (2, 0)(2, 1)(2, 2)
	 
	 */
	public void practice1() {
		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

	/* �ǽ����� 2 
	 4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ� 
	 1) 1 ~ 16���� ���� ���ʴ�� �����ϼ���. 
	 2) ����� ������ ���ʴ�� ����ϼ���.
	 
	 ex. 
		 1  2  3  4 
		 5  6  7  8 
		 9 10 11 12 
		13 14 15 16 
	 */
	public void practice2() {
		int[][] arr = new int[4][4];

		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

	}

	/*
	 * �ǽ����� 3 
	 * 4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ� 
	 * 1) 16 ~ 1�� ���� ���� �Ųٷ� �����ϼ���. 
	 * 2) ����� ������ ���ʴ��
	 * ����ϼ���.
	 * 
	 * ex. 
	 * 16 15 14 13 
	 * 12 11 10 9 
	 * 8 7 6 5 
	 * 4 3 2 1
	 */
	public void practice3() {
		int[][] arr = new int[4][4];

		int value = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

	}

	/* �ǽ����� 4
	4�� 4�� 2���� �迭�� �����Ͽ�
	0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� ��
	�Ʒ��� ����ó�� ó���ϼ���.
	*/
	// �ǽ����� 4�� �ڵ� ����
	public void practice4() {
		
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
	 * 2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է¹޵�, 
	 * 1~10���� ���ڰ� �ƴϸ� ���ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.�� 
	 * ��� �� �ٽ� ������ �ް� �ϼ���. 
	 * ũ�Ⱑ ������ ������ �迭 �ȿ��� 
	 * ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
	 * (char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ� 65�� A�� ��Ÿ��, ���ĺ��� �� 26����)
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
