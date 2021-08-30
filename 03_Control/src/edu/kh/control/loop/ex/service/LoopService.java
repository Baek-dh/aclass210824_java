package edu.kh.control.loop.ex.service;

import java.util.Scanner;

public class LoopService {

	/*	for문
	 * 
	 * 	for(초기식 ; 조건식 ; 증감식){
	 * 		// 반복 수행 코드
	 * 	}
	 * 
	 * - 초기식 : for문 내부에서 사용할 변수. 보통 for문의 반복 제어를 위해 사용함.
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식.
	 * 			 보통 초기식에 사용한 변수를 이용하여 조건식을 작성함.
	 * 
	 * - 증감식 : 초기식에 사용된 변수를 for문이 종료할 때 마다 증가 또는 감소시켜
	 * 		     조건식의 결과를 변화하게함.
	 * 
	 * */
	
	public void example1() {
		// for문 기초 사용법1
		// 1~10 까지 1씩 증가하며 반복해서 출력 
		
		// i가 10일 때 까지는 반복
		// == i가 1부터 증가해서 10이 될때 까지 조건식이 true 이여야 한다
		for(int i=1 ; i <= 10  ;  i++ ) {
			// 증감식이 단순히 초기식 1 증가/감소로 작성된 경우
			// 전위, 후위 연산을 구분하지 않음.(똑같음)
			
			System.out.println(i + "출력");
		}
	}
	
	
	public void example2() {
		// for문 기초 사용법2
		// 5에서 15까지 1씩 증가하며 출력
		for(int i=5 ; i <= 15 ; ++i) {
			 System.out.println( i + "출력");
		}
	}
	
	public void example3() {
		// for문 기초 사용법3
		// 1부터 20까지 2씩 증가하며 출력
		for(int i=1 ; i <= 20 ; i += 2 ) {
			
			// 복합 대입 연산자 (+=)
			// -> 기존 변수의 값에 새로운 값을 누적시켜 저장
			System.out.println(i);
			
		}
	}
	
	public void example4() {
		// for문 기초 응용법1
		
		// 10부터 1까지 1씩 감소하며 출력
		for(int i=10 ; i <= 1 ; i--) {
			System.out.println(i);
			
			// 오류 1 : 조건식 부등호 방향을 잘못 작성한 경우
			// -> 한 번도 실행되지 않거나, 무한히 실행됨
		}
		
	}
	
	public void example5() {
		// for문 기초 응용법2
		// 1.0 부터 5.0 까지 0.5씩 증가
		for(double i = 1.0 ; i <= 5.0 ; i += 0.5 ) {
			// 1.0 1.5 2.0 2.5 3.0 3.5 4.0 4.5 5.0
			System.out.println(i);
		}
	}
	
	public void example6() {
		// for문 기초 응용법3
		// 'A' ~ 'Z' 순서대로 알파벳 모두 출력하기
		// char == 문자형 == 실제로는 정수를 저장
		//  -> 저장된 정수값에 맞는 문자 모양을 유니코드표에서 찾아 출력
		
		// 방법 1
		/*for(int i=65 ; i<=90 ; i++) {
			System.out.println( (char)i );
		}*/
		
		// 방법2
		for(char i = 'A' ; i <= 'Z' ; i++) {
			System.out.println(i);
		}
	}


	public void example7() {
		// for문 응용1
		// 정수를 5개를 입력 받아 합계 출력
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 반복되어 입력되는 수를 누적할 변수 sum 선언
					 // 0으로 초기화
		// 0으로 초기화 하는 이유 : 누적된 값의 최종 결과를 정확히 추출하기 위해서
		
		for(int i=1 ; i<=5 ; i++) {
			// 특정 횟수만큼 반복해야되는 경우
			// -> 초기식의 값이 몇이 되느냐가 아닌
			//    초기식이 변하는 값의 종류가 몇 가지인가
			// -> 변하는 값의 수 == 반복 횟수
			System.out.print(i + "번 입력 : ");
			int input = sc.nextInt();
			
			sum += input; // 누적
			
		}
		
		System.out.println("합계 : " + sum);
		
	}
	
	
	public void example8() {
		// for문 응용 2 (for + if)
		
		// 1~20까지 1씩 증가하며 출력
		// 단, 5의 배수를 출력할 때는 (5), (10) 처럼 괄호를 붙여서 출력
		// ex)  1 2 3 4 (5) 6 7 8 9 (10)....
		
		for(int i=1 ; i<=20 ; i++) {
			
			if(  i % 5 == 0  ) {// i가 5의 배수일 경우 == 5로 나눴을 때 나머지가 0
				System.out.print( "(" + i + ") "  );
				
			}else {
				System.out.print( i + " " );
				
			}
		}
	}
	
	
	public void example9() {
		// for문 응용 3
		// 2 ~ 9 사이 정수를 입력 받아
		// 해당 숫자의 구구단을 출력하시오.
		// 단, 2 ~ 9 사이 숫자가 아닐 경우 "잘못 입력하셨습니다." 출력
		// 2 x 1 =  2
		// 2 x 2 =  4
		// ...
		// 2 x 5 = 10
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // 2 ~ 9 사이를 입력 받은 경우
			
			for(int i=1 ; i<=9 ; i++) {
				
				// 2 x 1 =  2
				// 2 x 9 = 18
				System.out.printf("%d x %d = %2d\n", dan, i, dan*i );
				// %2d : 2칸 확보 후 오른쪽 정렬로 출력
				
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	public void example10() {
		
		// for문 응용문제
		// 정수를 두개 입력 받아
		// 두 정수 사이의 모든 정수의 합계를 구함
		// 단, 합계에서 3의 배수는 제외
		
		// ex) 예시 1 : 정수1이 정수2보다 작을 경우
		// 정수 입력1 : 1
		// 정수 입력2 : 10
		// 3의 배수를 제외한 합계 :  37
		
		// 예시1 성공 시 추가 조건
		// -> 정수1이 정수 2보다 클 경우도 정상적인 계산
		// 정수 입력1 : 10
		// 정수 입력2 : 1
		// 3의 배수를 제외한 합계 :  37
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 입력2 : ");
		int input2 = sc.nextInt();
		
		int sum = 0; // 합계를 누적할 변수 sum 선언
		
		/*
		if( input1 <= input2 ) { // 입력1이 입력 2보다 작거나 같을 때
			for(int i=input1 ; i<=input2 ; i++) {
				if(i % 3 != 0) { // 3의 배수가 아닌 경우
					sum += i;
				}
			}
		
		}else { // 입력2가 입력 1보다 작을 때
			for(int i=input2 ; i<=input1 ; i++) {
				if(i % 3 != 0) { // 3의 배수가 아닌 경우
					sum += i;
				}
			}
		}
		*/
		
		int num1; // 항상 작은 값을 저장하는 변수
		int num2; // 항상 큰 값을 저장하는 변수
		
		if(input1 < input2) {
			num1 = input1;
			num2 = input2;
		}else {
			num1 = input2;
			num2 = input1;
		}
		
		for(int i = num1 ; i<= num2 ; i++) {
					// 1      // 5
					// i = 1 2 3 4 5
			
			if(i % 3 != 0) { // 3의 배수가 아닌 경우
				sum += i;
			}
		}
		
		System.out.println("3의 배수를 제외한 합계 : " + sum);
	}
	
	
	/////////////////////////////////////////////////////////////////////////
	
	// 중첩 반복문
	// - 반복문 내부 수행코드에 반복문이 작성되는 코드
	
	// 시계 -> 0 ~ 59초 반복하다가 60초가 되면 1분 증가
	
	public void example11() {
		// 0분 0초부터 59분 59초까지 출력
		for(int min=0 ; min < 60 ; min++) {
			
			// 1분 == 60초
			for(int sec=0 ; sec < 60 ; sec++) {
				
				System.out.printf("%02d분 %02d초\n", min, sec);
				// %02d : 2칸 확보하여 오른쪽 정렬, 빈칸에 0 추가
				// -> 01 02 03
			}
		}
	}
	
	
	public void example12() {
		// 중첩 반복문 기초1
		// 구구단 2~9단 모두 출력하기
		// 각 단을 구분 할 수 있도록 한칸 띄기
		
		// 2 x 9 = 18
		//
		// 3 x 1 = 3
		
		for(int dan=2 ; dan<=9 ; dan++) { // 단 반복
			
			for(int su=1 ; su<=9 ; su++) { // 곱해지는 수 반복
				System.out.printf("%d x %d = %2d\n", dan, su, dan*su);
			}
			
			System.out.println(); // 한칸 띄기
		}
	}
	
	
	public void example13() {
		// 중첩 반복문 기초2
		// 구구단 2~9단 모두 출력하기
		// 한 줄에 한 단씩 출력하기
		
		// ex)
		// 2x1= 2 2x2= 4 ... 2x9=18
		// 3x1= 3 3x2= 6 ... 3x9=27
		// ..
		// 9x1= 9 9x2=18 ... 9x9=81 
		
		for(int dan=2 ; dan<=9 ; dan++) {
			
			for(int su=1 ; su<=9 ; su++) {
				System.out.printf("%dx%d=%2d ", dan, su, dan*su);
			}
			System.out.println();
		}
	}
	
	
	public void example14() {
		// 중첩 반복문 응용1
		
		// 2중 for문을 이용하여 다음 모양을 출력하시오.
		
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int i=1 ; i<=5 ; i++) { // 줄(행)을 제어하는 반복문
			
			for(int j=1 ; j<=5 ; j++) { // 칸(열)을 제어하는 반복문
				System.out.print(j);
			}
			System.out.println(); // 줄바꿈
			
		}
		
	}
	
	
	public void example15() {
		// 중첩 반복문 응용2
		
		// 2중 for문을 이용하여 다음 모양을 출력하시오.
		
		// 54321
		// 54321
		// 54321
		// 54321
		
		// 4회만 반복하는 for문
		for(int i=1 ; i<=4 ; i++) {
			
			// 5회 반복 시 4->1까지 줄어드는 for문
			for(int j=5 ; j>=1 ; j--) {
				System.out.print(j); // 4321 순서대로 출력
			}
			
			System.out.println(); // 줄바꿈
		}
	}
	
	
	public void example16() {
		// 중첩 반복문 응용3
		
		// 9 ~ 2단까지 거꾸로 출력
		// 각 단 사이에 띄어쓰기 추가
		
		// === 9단 ===
		// 9 x 9 = 81
		// 9 x 8 = 72
		// ...
		
		// === 2단 ===
		// 2 x 9 = 18
		// ...
		// 2 x 2 = 2
		
		for(int dan=9 ; dan >= 2 ; dan--) {
			
			System.out.println("=== " + dan + "단 ==="); // 단 시작 시 몇 단인지 출력
			
			for(int su=9 ; su >= 1 ; su--) {
				System.out.printf("%d x %d = %d\n", dan, su, dan * su);
			}
			
			System.out.println(); // 단이 끝날 때 마다 줄 바꿈
		}
	}
	
	
	public void example17() {
		// 중첩 반복문 응용 4
		
		// 2중 for문을 이용하여 아래 모양을 출력
		
		// 1
		// 12
		// 123
		// 1234
		
		for(int i=1 ; i<=4 ; i++) { // 1~4행 까지 반복
			
			// i=1 일때 1
			// i=2 일때 12
			// i=3 일때 123
			// i=4 일때 1234
			
			for(int j=1 ; j<=i ; j++) { // 반복 되는 행의 수에 따라 출력되는 횟수가 변경됨
				System.out.print(j);
			}
			System.out.println(); // 줄바꿈
		}
	}
	
	
	public void example18() {
		// 중첩 반복문 응용 5
		
		// 2중 for문을 이용하여 아래 모양을 출력
		
		// 1234
		// 123
		// 12
		// 1
		
		for(int i=4 ; i>=1 ; i--) {
			
			for(int j=1 ; j <= i ; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	
	public void example19() {
		// 중첩 반복문 응용 6
		
		//  1  2  3  4
		//  5  6  7  8
		//  9 10 11 12
		
		int count = 1; // 1 ~ 12까지 증가하는 수
		
		for(int i=1 ; i<=3 ; i++) { // 3줄(행)
			
			for(int j=1 ; j<=4 ; j++) { // 4칸(열)
				System.out.printf("%3d", count);
				
				count++;
				// 1출력 -> 1증가 -> count=2
				// 2출력 -> 1증가 -> count=3
				// 3출력 -> 1증가 -> count=4
				// 4출력 -> 1증가 -> count=5
			}
			
			System.out.println(); // 줄바꿈
			
		}
	}
	
	
	///////////////////////////////////////////////////////////////////////////////
	
	
	// while문
	
	/* 별도의 초기식, 증감식이 존재하지 않고
	 * 반복 종료 조건을 자유롭게 설정하는 반복문
	 * --> 언제 끝날지는 모르지만 종료하는 조건은 있음.
	 * 
	 * while( 조건식 ){
	 * 	조건식이 true일 경우 수행할 구문
	 * }
	 * 
	 * 
	 * */
	
	public void example20() {
		
		// 입력된 모든 정수의 합 구하기
		// 단, 0이 입력되면 결과 출력 후 종료
		
		Scanner sc = new Scanner(System.in);
		
		
		int input = -1; // 초기값이 0일경우 while문을 수행할 수 없으므로
						// 0 이외의 아무 값이나 대입
		
		int sum = 0;
		
		while(input != 0) {
			// while문의 조건식이 true일 때 수행 O
			// <-> while문의 조건식이 false일 때 수행 X
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input; // 누적
		}
		
		System.out.println("합계 : " + sum);
		
	}
	
	
	public void example21() {
		
		// while문을 for문 처럼 사용하기
		
		
		// for(초기식 ; 조건식 ; 증감식) 
		
		// while(조건식) + 초기식 + 증감식
		
		// while문을 이용하여 1 ~ 10까지 출력
		
		int i=1; // 초기식
		while(i <= 10) { // 조건식
			System.out.println(i); // 출력
			
			i++; // 증감식
		}
		
	}
	
	
	
	
	
}




