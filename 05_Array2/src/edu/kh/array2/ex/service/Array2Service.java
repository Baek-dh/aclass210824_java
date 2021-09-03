package edu.kh.array2.ex.service;

import java.util.Scanner;

public class Array2Service {

	/* 1���� �迭 : �ڷ����� ���� ������ ����
	 * 2���� �迭 : �ڷ����� ���� 1���� �迭�� ����
	 * 
	 * - 2���� �迭�� �� ĭ ���� 2���� �ε��� ��ȣ�� �ο� ����.
	 * -> arr[1][3]    �տ�[1] == ��,   �ڿ�[3] == ��
	 * */
	
	public void example1() {
		
		// 2���� �迭 ����
		int[][] arr;
		// Stack �޸� ������ 
		// int[][] (int 2���� �迭)�� ������ ���� ���� arr�� ����.
		// (���� ���� == ������ ���� == ���۷��� ���� == ���۷���)
		// ** ���� ���� ���� �ƴ� �ּ�(4byte)�� ����
		
		
		// 2���� �迭 �Ҵ�
		// -> new �ڷ���[��ũ��][��ũ��];
		arr = new int[2][3]; // 2�� 3��
		// ���� �ε��� ��ȣ : 0, 1
		// ���� �ε��� ��ȣ : 0, 1, 2
		
		
		// 2���� �迭 �ʱ�ȭ
		
		// ��� 1. �ε����� �̿��Ͽ� ���� �ʱ�ȭ
		/*arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;*/
		
		// ��� 2. for���� �̿��� �ʱ�ȭ
		
		int num = 10; // �迭�� �ʱ�ȭ �Ǵ� ��
		
		for(int row=0 ; row<arr.length ; row++) {
			// arr.length == ���� ���� == 2
			
			for(int col=0 ; col<arr[row].length ; col++ ) {
				// arr[row].length == ���� ���� == 3
				//    row == 0 , 1
				
				// ����
				//arr[row][col] =  (row*30) + 10*col + 10 ;
				
				// �ܼ��ϰ� �ϴ� ���
				arr[row][col] = num;
				
				num += 10; // num ���� 10 ������Ŵ
			}
		}
		
		
		
		// ��� ���
		// ��� ��, ��� ���� ������� �����ϴ� 2�� for��
		for(int row=0 ; row<arr.length ; row++ ) { // �� �ݺ�
			
			for(int col=0 ; col<arr[row].length ; col++ ) { // �� �ݺ�

				System.out.print( arr[row][col] + " " );
			}
			
			System.out.println(); // ���� �� ��� ���� �ٹٲ�
		}
	}
	
	
	public void example2() {
		
		// 2���� �迭 ����� ���ÿ� �ʱ�ȭ
		
		int[] temp1 = {10, 20, 30}; // 1���� �迭 ����� ���ÿ� �ʱ�ȭ
		int[] temp2 = {40, 50, 60}; // 1���� �迭 ����� ���ÿ� �ʱ�ȭ
		
		
		int[][] arr = {
						{10, 20, 30},    // ,�� �ٿ��� ���� ����
						{40, 50, 60}
					  };
		
		
		// ��� �� ��, �� �������� ���
		
		// ������
		// 10 20 30
		// 40 50 60
		
		// ������
		// 60 50 40
		// 30 20 10
		
		for(int row = arr.length - 1 ; row >= 0 ; row--) { // �� ���� �ݺ�
			
			for(int col = arr[row].length -1 ; col >=0 ; col-- ) {
				System.out.print(arr[row][col] + " ");
			}
			
			System.out.println();
		}
		
	}
	
	
	
	public void example3() {
		
		// ��� ���� ũ�⸦ �Է� �޾�
		// int�� 2���� �迭�� ���� �� �Ҵ��ϰ�
		// 2���� �迭�� �� �ε����� 1���� ������� 1�� �����ϴ� ���� �ʱ�ȭ �ϰ� ���
		
		// ex)
		// �� ũ�� : 3
		// �� ũ�� : 2
		// 1 2
		// 3 4
		// 5 6
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ũ�� : ");
		int rowSize = sc.nextInt();
		
		System.out.print("�� ũ�� : ");
		int colSize = sc.nextInt();
		
		// �Է� ���� �� ��ŭ�� ũ�⸦ ���� 2���� �迭 ���� �� �Ҵ�
		int[][] arr = new int[rowSize][colSize];
		
		int num = 1; // �迭 ��ҿ� ���Ե� ��
		
		// �迭 ��� �ʱ�ȭ �� ���
		for( int row=0 ; row<arr.length ; row++ ) { // �� �ݺ�
			
			for( int col=0 ; col<arr[row].length ; col++ ) { // �� �ݺ�
				
				arr[row][col] = num++; // ���� �� num 1����
				//num++;
				
				System.out.print(arr[row][col] + " ");
			}
			
			System.out.println(); // �� ������ ���� �ٹٲ�
		}
	}
	
	
	
	public void example4() {
		
		// 3�� 3��¥�� int 2���� �迭�� ���� �� �ʱ�ȭ
		// �� ���� ��, ���� �� ���
		
		int[][] arr = {
						{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
					  };
		
		
		// ���� �� ���
		for(int row=0 ; row < arr.length ; row++) { // �� �ݺ�
			
			// ���� �ٲ�� ������ �հ踦 �ٽ� ����� �� �ֵ��� 
			// sum�� �� �ݺ��� ���۵Ǵ� �κп� �ۼ�
			int sum = 0; // �� �հ� ����� ����
			
			for(int col=0 ; col < arr[row].length ; col++) { // �� �ݺ�
				
				sum += arr[row][col]; // �� ���� �� ����
			}
			
			System.out.println(row + "��° �� �� : " + sum);
		
		}
		
		
		/* 00 01 02
		 * 10 11 12
		 * 20 21 22
		 * */
		
		// ���� �� ���ϱ�
		// ������ �ٸ��� �� ���� �����ϴ� ���
		// arr[row].length �� �̿��Ͽ� ���� ������ ���ؿ��� ���� �Ұ���
		// -> ������� 0���� �����ϴ� ������ ������ �����Ͽ�
		//    ���� ���������� �����ϰ���.
		
		int temp = 0; // �� ����
		
		for(int col=0 ; col<arr[temp].length ; col++) { // �� �ݺ�
			
			int sum = 0;
			for(int row=0 ; row<arr.length ; row++) { // �� �ݺ�

				sum += arr[row][col];
			}
			
			System.out.println(col + "��° �� �� : " + sum);
			
			
			// ���� �ݺ��ϴ� for���� ���ǽ� �κп���
			// Ư�� ���� �����ϴ� temp ����
			// ���� ������ �ε����� �ʰ����� �ʵ��� �߰� ������ �ۼ�
			if( temp < arr.length - 1 ) {
				temp++;
			}
		}
	}
	
	
	public void example5() {
		
		// �����迭
		// - ���� ������ ������ ������
		//   ���� ������ ������ ���� ���� 2���� �迭
		
		int[][] arr = new int[4][];
								// �� ���� ���� X
		
		arr[0] = new int[3]; // 0�� �࿡ 3��¥�� 1���� �迭 �߰�
		arr[1] = new int[4]; // 1�� �࿡ 4��¥�� 1���� �迭 �߰�
		arr[2] = new int[5]; // 2�� �࿡ 5��¥�� 1���� �迭 �߰�
		arr[3] = new int[2]; // 3�� �࿡ 2��¥�� 1���� �迭 �߰�
		
		
		int num = 0; // 0���� 1�� ������� �����ϸ� �迭 ��� �ʱ�ȭ�ϴ� ����
		
		for(int row=0 ; row<arr.length ; row++) { // �� �ݺ�
							// == 4
			
			for(int col=0 ; col<arr[row].length ; col++ ) { // �� �ݺ�
				
				arr[row][col] = num++; // ���� ������ ���� ����
							
				System.out.printf("%4d", arr[row][col]);
			}
			
			System.out.println(); // �� ���� �ٹٲ�
		}
	}
	
	
	
	
	
	
	
	
}

