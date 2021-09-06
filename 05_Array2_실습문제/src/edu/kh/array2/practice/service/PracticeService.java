package edu.kh.array2.practice.service;

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

	/*�ǽ�����6
	����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� ���� ũ�⵵ �޾�
	������ ���� �迭�� ���� �� �Ҵ��ϼ���.
	�׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.

	[���� ȭ��]
	���� ũ�� : 4
	0���� ũ�� : 2
	1���� ũ�� : 6
	2���� ũ�� : 3
	3���� ũ�� : 5
	a b
	c d e f g h
	i j k
	l m n o p
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
	
	
	/*�ǽ�����7
	1���� ���ڿ� �迭�� �л� �̸� �ʱ�ȭ�Ǿ� �ִ�.
	3�� 2�� ¥�� 2���� ���ڿ� �迭 2���� ���� ���� �� �Ҵ��Ͽ�
	�л� �̸��� 2���� �迭�� ������� �����ϰ� �Ʒ��� ���� ����Ͻÿ�.
	(ù ��° 2���� �迭�� ��� ����� ��� �� ��° 2���� �迭�� ���� ����)
	String[] students = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", 
	"�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
	[���� ȭ��]
	== 1�д� ==
	���ǰ� ������
	����� �����
	���̹� �ں���
	== 2�д� ==
	�ۼ��� ������
	������ ��õ��
	��ǳǥ ȫ����
	*/
	public void practice7() {
		String[] students = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int index = 0;
		// 1�д��� ������ 2�д��� ���۵� ���� �̾ �����ϱ� ������
		// �л��� �̾ �� �� �ֵ��� index ���� ����

		// 1�д� �л� ����
		System.out.println("== 1�д� ==");
		for (int i = 0; i < seat1.length; i++) {
			
			for (int j = 0; j < seat1[i].length; j++) {
				
				seat1[i][j] = students[index++];
				
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		// 2�д� �л� ����
		System.out.println("== 2�д� ==");
		for (int i = 0; i < seat2.length; i++) {
			
			for (int j = 0; j < seat2[i].length; j++) {
				
				seat2[i][j] = students[index++];
				
				System.out.print(seat2[i][j] + " ");
			}
			
			System.out.println();
		}

	}	
	
	/* �ǽ�����8
	�� �������� �ڸ� ��ġ�� ���� ������ �л� �̸��� �˻��Ͽ�
	�ش� �л��� ��� �ڸ��� �ɾҴ��� ����ϼ���.
	[���� ȭ��]
	== 1�д� ==
	���ǰ� ������
	����� �����
	���̹� �ں���
	== 2�д� ==
	�ۼ��� ������
	������ ��õ��
	��ǳǥ ȫ����
	============================
	�˻��� �л� �̸��� �Է��ϼ��� : ��õ��
	�˻��Ͻ� ��õ�� �л��� 2�д� 2��° �� �����ʿ� �ֽ��ϴ�
	*/
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		String[] students = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int index = 0;
		// 1�д��� ������ 2�д��� ���۵� ���� �̾ �����ϱ� ������
		// �л��� �̾ �� �� �ֵ��� index ���� ����

		// 1�д� �л� ����
		System.out.println("== 1�д� ==");
		for (int i = 0; i < seat1.length; i++) {
			
			for (int j = 0; j < seat1[i].length; j++) {
				
				seat1[i][j] = students[index++];
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		// 2�д� �л� ����
		System.out.println("== 2�д� ==");
		for (int i = 0; i < seat2.length; i++) {
			
			for (int j = 0; j < seat2[i].length; j++) {
				
				seat2[i][j] = students[index++];
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String searchName = sc.next();	
		

		// �˻��� �д�, ��, �¿� ������ ������ ���� ����
		int seat = 0;
		int row = 0;
		String direction = null;
		
		for(int i=0; i<seat1.length ; i++) {
			
			for(int j=0; j<seat1[i].length ; j++) {
				
				if(seat1[i][j].equals(searchName)) {
					// 1�дܿ� ��ġ�ϴ� �̸��� ���� ���
					seat = 1;
					row = i+1;
					direction = j == 0 ? "����" : "������"; // ���� ������
					
				}else if(seat2[i][j].equals(searchName)) {
					// 2�дܿ� ��ġ�ϴ� �̸��� ���� ���
					seat = 2;
					row = i+1;
					direction = j == 0 ? "����" : "������"; // ���� ������
				}
			}
		}
		
		
		if(seat != 0) { // �˻� ����� ���� ���
			System.out.printf("�˻��Ͻ� %s �л��� %d�д� %d��° �� %s�� �ֽ��ϴ�.\n", 
							searchName, seat, row, direction);
		}else {
			System.out.println("�˻��� �л��� �������� �ʽ��ϴ�.");
		}
		
	}		
	
	/*�ǽ����� 9
	String 2���� �迭 5�� 5���� ����� ���� �� ���� ���� �� ���� �� �ε����� �����ϼ���.
	�׸��� ����ڿ��� ��� ���� �Է� �޾� �ش� ��ǥ�� ���� 'X'�� ��ȯ�� 2���� �迭�� ����ϼ���.
	[���� ȭ��]
	�� �ε��� �Է� : 4
	�� �ε��� �Է� : 2
	   0 1 2 3 4
	0 
	1
	2
	3
	4 X
	*/
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		char[][] board = new char[6][6]; // char�� 6�� 6�� 2���� �迭 ����

		// char�� �⺻���� '\u0000' == null�� ǥ���ϴ� �����̳�
		// ��� �� ��ĭ���� ��µ�.
		
		// ��� ���� �ε����� ǥ���ϴ� �κп� �ε��� ����
		for (int i = 0; i < board.length-1; i++) {
			board[0][i+1] = (char)(i + '0');
			board[i+1][0] = (char)(i + '0');
			
			// '0' == 60��
		}

		
		int rowIndex = 0;
		int colIndex = 0;
		
		while(true) {
			System.out.print("�� �ε��� �Է� : ");
			rowIndex = sc.nextInt();
			
			if(rowIndex < 0 || rowIndex > 4) {
				System.out.println("0~4���� �ε����� �Է����ּ���.");
				continue;
			}
			
			break;
		}

		
		while(true) {
			System.out.print("�� �ε��� �Է� : ");
			colIndex = sc.nextInt();
			
			if(colIndex < 0 || colIndex > 4) {
				System.out.println("0~4���� �ε����� �Է����ּ���.");
				continue;
			}
			
			break;
		}

		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i == rowIndex && j == colIndex) { // ����ڰ� �Է��� ��� ���� �ε��� ���� ���� ��
					board[i + 1][j + 1] = 'X';
					// ���� 2���� �迭�� �ε����� 1�� �߰��� ���� ȭ�鿡 ǥ�õ� �ε���
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}	
	
	
	/*�ǽ�����10
	�ǽ�����9�� ������ ������ �� �Է� �� 99�� �Էµ��� ������ ���� �ݺ��� �ǵ��� �����ϼ���.
	[���� ȭ��]
	�� �ε��� �Է� : 2 �� �ε��� �Է� : 3
	�� �ε��� �Է� : 2 �� �ε��� �Է� : 1
	0 1 2 3 4 0 1 2 3 4
	0 0
	1 1
	2 X 2 X
	3 3 X
	4 4
	�� �ε��� �Է� >> 99
	���α׷� ����
	*/
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		char[][] board = new char[67][6]; // char�� 6�� 6�� 2���� �迭 ����


		// ��� ���� �ε����� ǥ���ϴ� �κп� �ε��� ����
		for (int i = 0; i < board.length-1; i++) {
			board[0][i+1] = (char)(i + '0');
			board[i+1][0] = (char)(i + '0');
		}

		int rowIndex = 0;
		int colIndex = 0;
		do { // ������ �ѹ��� �ݺ��ϴ� do-while��
			
			while(true) {
				System.out.print("�� �ε��� �Է� : ");
				rowIndex = sc.nextInt();
				
				if(rowIndex != 99) {
					if(rowIndex < 0 || rowIndex > 4) {
						System.out.println("0~4���� �ε����� �Է����ּ���.");
						continue;
					}
				}
				
				break;
			}

			
			if (rowIndex != 99) { // �� �Է� �� 99�� �ƴ� ���

				while(true) {
					System.out.print("�� �ε��� �Է� : ");
					colIndex = sc.nextInt();
					
					if(colIndex < 0 || colIndex > 4) {
						System.out.println("0~4���� �ε����� �Է����ּ���.");
						continue;
					}
					
					break;
				}
				

				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						if (i == rowIndex && j == colIndex) { // ����ڰ� �Է��� ��� ���� �ε��� ���� ���� ��
							board[i + 1][j + 1] = 'X';
						}
						System.out.print(board[i][j] + " ");
					}
					System.out.println();
				}
			}
			
			
			System.out.println();
			
		} while (rowIndex != 99);
		System.out.println("���α׷� ����");
	}	
	

	/*
	�� �������� �ڸ� ��ġ�� ���� ������ �л� �̸��� �˻��Ͽ�
	�ش� �л��� ��� �ڸ��� �ɾҴ��� ����ϼ���.
	[���� ȭ��]
	== 1�д� ==
	���ǰ� ������
	����� �����
	���̹� �ں���
	== 2�д� ==
	�ۼ��� ������
	������ ��õ��
	��ǳǥ ȫ����
	============================
	�˻��� �л� �̸��� �Է��ϼ��� : ��õ��
	�˻��Ͻ� ��õ�� �л��� 2�д� 2��° �� �����ʿ� �ֽ��ϴ�.
	*/
	
	public void practice8b() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", 
				"�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		
		
		int index = 0; // students �迭�� ��Ҹ� �����ϴ� �뵵�� ����
		
		// 1�дܿ� �л� ����
		System.out.println("===1�д�===");
		for(int row=0 ; row<seat1.length ; row++) {
			for(int col=0 ; col<seat1[row].length ; col++) {
				seat1[row][col] = students[index];
				//seat2[row][col] = students[index+6];
				index++;
				System.out.print(seat1[row][col] +  " ");
			}
			System.out.println(); // �ٹٲ�
		}
		
		// 2�д� �л� ����
		System.out.println("===2�д�===");
		for(int row=0 ; row<seat2.length ; row++) {
			for(int col=0 ; col<seat2[row].length ; col++) {
				seat2[row][col] = students[index];
				index++;
				System.out.print(seat2[row][col] +  " ");
			}
			System.out.println(); // �ٹٲ�
		}
		
		
		// �˻� 
		System.out.println("============================");
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String inputName = sc.next();
		
		// �˻� �� �˻� ����� ���� ��쿡
		// �л��� ��ġ�� ������ ������ ����
		int seat = 0; // �� �д�
		int searchRow = 0; // �� ����
		String direction = ""; // ����, ������ ����
		
		for(int row=0 ; row<seat1.length ; row++) {
			for(int col=0 ; col<seat1[row].length ; col++) {
				
				// 1�дܿ� �˻��� �л��� �ִ� ���
				if( inputName.equals( seat1[row][col] )  ) {
					seat = 1; // 1�д�
					searchRow = row + 1; // �� ����
					
					direction = col == 0 ? "����" : "������"; // ���� ������
					/*if(col == 0) {
						direction = "����";
					}else {
						direction = "������";
					}*/
				} else if( inputName.equals( seat2[row][col] )  ) {
					// 2�дܿ� �˻��� �л��� �ִ� ���
					seat = 2; // 2�д�
					searchRow = row + 1; // �� ����
					direction = col == 0 ? "����" : "������"; // ���� ������
				}
			}
		}
		
		
		// ��� ���
		if(seat != 0) {
			System.out.printf("�˻��Ͻ� %s �л��� %d�д� %d��° �� %s�� �ֽ��ϴ�.\n",
					inputName, seat, searchRow, direction);
		}else {
			System.out.println("�˻� ����� �����ϴ�.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
