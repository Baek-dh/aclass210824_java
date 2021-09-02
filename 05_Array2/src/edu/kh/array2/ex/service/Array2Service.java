package edu.kh.array2.ex.service;

import java.util.Scanner;

public class Array2Service {

	/* 1차원 배열 : 자료형이 같은 변수의 묶음
	 * 2차원 배열 : 자료형이 같은 1차원 배열의 묶음
	 * 
	 * - 2차원 배열은 각 칸 마다 2개의 인덱스 번호를 부여 받음.
	 * -> arr[1][3]    앞에[1] == 행,   뒤에[3] == 열
	 * */
	
	public void example1() {
		
		// 2차원 배열 선언
		int[][] arr;
		// Stack 메모리 영역에 
		// int[][] (int 2차원 배열)을 참조할 참조 변수 arr을 선언.
		// (참조 변수 == 참조형 변수 == 레퍼런스 변수 == 레퍼런스)
		// ** 참조 변수 값이 아닌 주소(4byte)를 저장
		
		
		// 2차원 배열 할당
		// -> new 자료형[행크기][열크기];
		arr = new int[2][3]; // 2행 3열
		// 행의 인덱스 번호 : 0, 1
		// 열의 인덱스 번호 : 0, 1, 2
		
		
		// 2차원 배열 초기화
		
		// 방법 1. 인덱스를 이용하여 직접 초기화
		/*arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;*/
		
		// 방법 2. for문을 이용한 초기화
		
		int num = 10; // 배열에 초기화 되는 값
		
		for(int row=0 ; row<arr.length ; row++) {
			// arr.length == 행의 개수 == 2
			
			for(int col=0 ; col<arr[row].length ; col++ ) {
				// arr[row].length == 열의 개수 == 3
				//    row == 0 , 1
				
				// 수식
				//arr[row][col] =  (row*30) + 10*col + 10 ;
				
				// 단순하게 하는 방법
				arr[row][col] = num;
				
				num += 10; // num 값을 10 증가시킴
			}
		}
		
		
		
		// 결과 출력
		// 모든 행, 모든 열을 순서대로 접근하는 2중 for문
		for(int row=0 ; row<arr.length ; row++ ) { // 행 반복
			
			for(int col=0 ; col<arr[row].length ; col++ ) { // 열 반복

				System.out.print( arr[row][col] + " " );
			}
			
			System.out.println(); // 다음 행 출력 전에 줄바꿈
		}
	}
	
	
	public void example2() {
		
		// 2차원 배열 선언과 동시에 초기화
		
		int[] temp1 = {10, 20, 30}; // 1차원 배열 선언과 동시에 초기화
		int[] temp2 = {40, 50, 60}; // 1차원 배열 선언과 동시에 초기화
		
		
		int[][] arr = {
						{10, 20, 30},    // ,를 붙여서 행을 구분
						{40, 50, 60}
					  };
		
		
		// 출력 시 행, 열 역순으로 출력
		
		// 정방향
		// 10 20 30
		// 40 50 60
		
		// 역방향
		// 60 50 40
		// 30 20 10
		
		for(int row = arr.length - 1 ; row >= 0 ; row--) { // 행 역순 반복
			
			for(int col = arr[row].length -1 ; col >=0 ; col-- ) {
				System.out.print(arr[row][col] + " ");
			}
			
			System.out.println();
		}
		
	}
	
	
	
	public void example3() {
		
		// 행과 열의 크기를 입력 받아
		// int형 2차원 배열을 선언 및 할당하고
		// 2차원 배열의 각 인덱스에 1부터 순서대로 1씩 증가하는 수를 초기화 하고 출력
		
		// ex)
		// 행 크기 : 3
		// 열 크기 : 2
		// 1 2
		// 3 4
		// 5 6
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int rowSize = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int colSize = sc.nextInt();
		
		// 입력 받은 값 만큼의 크기를 가진 2차원 배열 선언 및 할당
		int[][] arr = new int[rowSize][colSize];
		
		int num = 1; // 배열 요소에 대입될 값
		
		// 배열 요소 초기화 및 출력
		for( int row=0 ; row<arr.length ; row++ ) { // 행 반복
			
			for( int col=0 ; col<arr[row].length ; col++ ) { // 열 반복
				
				arr[row][col] = num++; // 대입 후 num 1증가
				//num++;
				
				System.out.print(arr[row][col] + " ");
			}
			
			System.out.println(); // 행 구분을 위한 줄바꿈
		}
	}
	
	
	
	public void example4() {
		
		// 3행 3열짜리 int 2차원 배열을 선언 및 초기화
		// 각 행의 합, 열의 합 출력
		
		int[][] arr = {
						{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
					  };
		
		
		// 행의 합 출력
		for(int row=0 ; row < arr.length ; row++) { // 행 반복
			
			// 행이 바뀌는 시점에 합계를 다시 계산할 수 있도록 
			// sum을 행 반복이 시작되는 부분에 작성
			int sum = 0; // 행 합계 저장용 변수
			
			for(int col=0 ; col < arr[row].length ; col++) { // 열 반복
				
				sum += arr[row][col]; // 한 행의 값 누적
			}
			
			System.out.println(row + "번째 행 합 : " + sum);
		
		}
		
		
		/* 00 01 02
		 * 10 11 12
		 * 20 21 22
		 * */
		
		// 열의 합 구하기
		// 기존과 다르게 열 부터 접근하는 경우
		// arr[row].length 를 이용하여 열의 개수를 구해오는 것이 불가능
		// -> 대안으로 0부터 시작하는 변수를 별도로 선언하여
		//    행을 간접적으로 지정하게함.
		
		int temp = 0; // 행 지정
		
		for(int col=0 ; col<arr[temp].length ; col++) { // 열 반복
			
			int sum = 0;
			for(int row=0 ; row<arr.length ; row++) { // 행 반복

				sum += arr[row][col];
			}
			
			System.out.println(col + "번째 열 합 : " + sum);
			
			
			// 열을 반복하는 for문의 조건식 부분에서
			// 특정 행을 지정하는 temp 값이
			// 행의 마지막 인덱스를 초과하지 않도록 추가 조건을 작성
			if( temp < arr.length - 1 ) {
				temp++;
			}
		}
	}
	
	
	public void example5() {
		
		// 가변배열
		// - 행의 개수는 정해져 있으나
		//   열의 개수가 정해져 있지 않은 2차원 배열
		
		int[][] arr = new int[4][];
								// 열 개수 지정 X
		
		arr[0] = new int[3]; // 0번 행에 3열짜리 1차원 배열 추가
		arr[1] = new int[4]; // 1번 행에 4열짜리 1차원 배열 추가
		arr[2] = new int[5]; // 2번 행에 5열짜리 1차원 배열 추가
		arr[3] = new int[2]; // 3번 행에 2열짜리 1차원 배열 추가
		
		
		int num = 0; // 0부터 1씩 순서대로 증가하며 배열 요소 초기화하는 변수
		
		for(int row=0 ; row<arr.length ; row++) { // 행 반복
							// == 4
			
			for(int col=0 ; col<arr[row].length ; col++ ) { // 열 반복
				
				arr[row][col] = num++; // 증감 연산자 후위 연산
							
				System.out.printf("%4d", arr[row][col]);
			}
			
			System.out.println(); // 행 변경 줄바꿈
		}
	}
	
	
	
	
	
	
	
	
}


