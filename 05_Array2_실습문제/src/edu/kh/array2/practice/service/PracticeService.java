package edu.kh.array2.practice.service;

import java.util.Random;
import java.util.Scanner;

public class PracticeService {

	/*실습문제 1 
	 3행 3열짜리 문자열 배열을 선언 및 할당하고
	 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은
	 형식으로 저장 후 출력하세요. 
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

	/* 실습문제 2 
	 4행 4열짜리 정수형 배열을 선언 및 할당하고 
	 1) 1 ~ 16까지 값을 차례대로 저장하세요. 
	 2) 저장된 값들을 차례대로 출력하세요.
	 
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
	 * 실습문제 3 
	 * 4행 4열짜리 정수형 배열을 선언 및 할당하고 
	 * 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요. 
	 * 2) 저장된 값들을 차례대로
	 * 출력하세요.
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

	/* 실습문제 4
	4행 4열 2차원 배열을 생성하여
	0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
	아래의 내용처럼 처리하세요.
	*/
	// 실습문제 4번 코드 변형
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		// 상수 사용 방법 == 변하지 않는 특정 값의 이름을 붙여주는 용도
		final int ROW_LAST_INDEX = arr.length - 1;
		final int COL_LAST_INDEX = arr[0].length - 1;
		
		// arr이 참조 하고있는 2차원 배열의 요소를
		// 모두 순차적으로 접근하여
		// 난수 대입, 행의 합, 열의 합, 총 합, 출력까지 한 번에 수행
		for(int row=0 ; row<arr.length ; row++) {
			for(int col=0 ; col<arr[row].length ; col++) {
				
				// 마지막 행, 열이 아닌 경우에만 난수 대입
				if( row != ROW_LAST_INDEX && col != COL_LAST_INDEX ) {
					
					arr[row][col] = (int)(Math.random() * 10 + 1); // 난수 대입
					
					// 각 행의 마지막 열에 난수를 누적
					arr[row][COL_LAST_INDEX] += arr[row][col];
					
					// 각 열의 마지막 행에 난수를 누적
					arr[ROW_LAST_INDEX][col] += arr[row][col];
					
					// 생성된 난수를 4행 4열에 누적
					arr[ROW_LAST_INDEX][COL_LAST_INDEX] += arr[row][col];
				}
				
				System.out.printf("%4d", arr[row][col]); // 출력
			}
			System.out.println(); // 줄바꿈
		}
		
	}

	
	/* 실습문제 5 
	 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 
	 * 1~10사이 숫자가 아니면 “반드시 1~10 사이의 정수를 입력해야 합니다.” 
	 * 출력 후 다시 정수를 받게 하세요. 
	 * 크기가 정해진 이차원 배열 안에는 
	 * 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
	 * (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
	 */
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("행 크기 : ");
			int rowSize = sc.nextInt();
			if(rowSize < 1 || rowSize > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			System.out.print("열 크기 : ");
			int colSize = sc.nextInt();
			if(colSize < 1 || colSize > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			// 배열 생성 + 난수 대입 + 출력
			char[][] arr = new char[rowSize][colSize];
			
			for(int row=0; row<arr.length ; row++) {
				for(int col=0 ; col<arr[row].length ; col++) {
					
					// 'A' ~ 'Z'
					// 65  ~ 90 난수
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
		
		System.out.print("행의 크기 : ");
		int rowSize = sc.nextInt();
		
		char[][] arr = new char[rowSize][]; // 가변 배열
		
		// 2차원 가변 배열 선언 및 할당 
		for(int row=0 ; row<arr.length ; row++) {
			
			System.out.print(row + "행의 열의 개수 : ");
			int colSize = sc.nextInt();
			
			arr[row] = new char[colSize];
		}
	
		// 2차원 가변 배열에 'a'부터 차례대로 배열 요소를 초기화 + 출력
		char value = 'a';
		for(int row=0 ; row<arr.length ; row++) {
			
			for(int col=0 ; col<arr[row].length ; col++) {
				
				arr[row][col] = value++; // 배열에 알파벳 대입 후 다음 알파벳으로 변경
				
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
	}
	

}
