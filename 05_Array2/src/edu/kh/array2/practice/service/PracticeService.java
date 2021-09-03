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
	
	
	
	/* 실습문제 4
	4행 4열 2차원 배열을 생성하여
	0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
	아래의 내용처럼 처리하세요.
	*/
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		// arr.length == 행의 개수
		// arr[row].length == 각 행별 열의 개수
		
		// 1) 2차원 배열에 모두 난수로 채워넣기
		// 2) 난수를 3행3열까지만 채워넣을 수 있도록 반복문 조건식에 -1을 추가
		// 3) 각 행 별 합계 구해 마지막 열에 대입 == 각 행 별 열의 값을 마지막 열에 누적
		// 4) 각 열 별 합계 구해 마지막 행에 대입 == 각 열 별 행의 값을 마지막 행에 누적
		// 5) 생성된 난수를 4행 4열에 누적
		for(int row=0 ; row<arr.length-1 ; row++) {
			
			for(int col=0 ; col<arr[row].length-1 ; col++) {
				
				// 난수 발생 후 배열에 대입
				arr[row][col] = (int)(Math.random() * 10 + 1);
				
				// 각 행의 마지막 열에 난수를 누적
				arr[row][3] += arr[row][col];
				
				// 각 열의 마지막 행에 난수를 누적
				arr[3][col] += arr[row][col];
				
				// 생성된 난수를 4행 4열에 누적
				arr[3][3] += arr[row][col];
			}
		}
		
		
		// 출력용 for문
		for(int row=0 ; row<arr.length ; row++) {
			for(int col=0 ; col<arr[row].length ; col++) {
				System.out.printf("%4d",arr[row][col]); // 출력
			}
			System.out.println(); // 줄 바꿈
		}
	}
	
	
	// 실습문제 4번 코드 변형
	public void practice4b() {
		
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
	2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
	“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
	크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
	(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자) 
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
	
	
	
	public void practice5b() {
		
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
			int[][] arr = new int[rowSize][colSize];
			
			for(int row=0; row<arr.length ; row++) {
				for(int col=0 ; col<arr[row].length ; col++) {
					
					// 'A' ~ 'Z'
					// 65  ~ 90 난수
					arr[row][col] = (int)(Math.random() * 26 + 65) ;
										// 65 <= random < 91
					
					System.out.print((char)arr[row][col] + " ");
				}
				System.out.println();
			}
			
			break;
		}
		
	}
	
	
	/* 실습문제 6 
	 * 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 
	 * 열의 크기도 받아 문자형 가변 배열을 선언 및 할당하세요. 
	 * 그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
	 */
	
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
