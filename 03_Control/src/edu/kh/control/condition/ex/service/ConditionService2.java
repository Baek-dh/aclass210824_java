package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionService2 {
	
	// switch문
	// - 식 하나로 많은 경우의 수를 처리할 때 사용하는 조건문
	// - 식의 결과값과 일치하는 case문이 수행됨.
	
	/* switch(식){
	 * 
	 * case 결과값1: 수행코드1; break;
	 * case 결과값2: 수행코드2; break;
	 * case 결과값3: 수행코드3; break;
	 * ...
	 * default : case를 만족하지 않을 경우의 코드;
	 * }
	 * */
	
	public void example1() {
		// 키보드로 정수를 입력 받아
		// 3인 경우 : 빨간색
		// 4인 경우 : 파란색
		// 5인 경우 : 노란색  출력
		// 나머지 경우 : 흰색
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		String color;
		
		/*switch( input ) {
		
		case 3 : color = "빨간색"; break;
		case 4 : color = "파란색"; break;
		case 5 : color = "노란색"; break;
		default : color = "흰색";
		}*/
		
		// if문으로 변경
		if( input == 3) {
			color = "빨간색";
			
		}else if( input == 4 ) {
			color = "파란색";
			
		}else if( input == 5 ) {
			color = "노란색";
			
		}else {
			color = "흰색";
		}
		
		System.out.println(color);
		
	}
	
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String team;
		
		// case 끝에 작성하는 break;
		// -> 현재 case의 코드를 수행하고 switch문을 멈춰라
		
		switch(input % 4) { // 0 1 2 3
		case 1 : team = "한식팀"; break;
		case 2 : team = "일식팀"; break;
		case 3 : team = "중식팀"; break;
		default : team = "양식팀"; 
		}

		System.out.println(team);
	}
	
	
	
	public void example3() {
		
		// 달(월) 을 입력 받아 해당 달의 계절을 출력
		// 단, 1~12월 사이가 아닐 경우 "잘못 입력하셨습니다" 출력
		// (switch문 사용)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
		case 3: case 4: case 5: result = "봄"; break;
		case 6: case 7: case 8: result = "여름"; break;
		case 9: case 10: case 11: result = "가을"; break;
		case 12: case 1 : case 2 : result = "겨울"; break;
		default : result = "잘못 입력하셨습니다";
		}
		
		System.out.println(result);
		// alt + 화살표 위아래 -> 줄 이동
	}
	
	
	public void example4() {
		// 정수 2개와 연산자를 입력 받아 알맞은 결과를 출력
		
		// 결과화면)
		// 정수 입력1 : 10
		// 정수 입력2 : 20
		// 연산자 입력 : +
		// 결과 : 10 + 20 = 30
		
		// + 추가조건 : 정수 입력2가 0이고 연사자가 /(나누기)일 경우
		// "0으로 나눌 수 없습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		
		// sc.next() == 문자열을 입력 받음 == String
		char op = sc.next().charAt(0); 
		
		// 스캐너에 nextChar() 라는 기능은 존재하지 않음.
		// * String에서 특정 위치에 있는 문자 하나를 반환하는 기능(메소드)
		//  --> String.charAt(index);  (index == 위치)
		
		// 입력 받은 문자열에서 0번째 위치에 있는 문자를 꺼내 op 변수에 대입
		
		int result = 0; // 두 수의 연산 결과 저장용 변수
		
		boolean flag = true; // 결과를 출력할지, 말지를 지정하는 논리값
		// true == 깃발 올라감 / false == 깃발 내려감
		
		switch(op) {
		case '+' :  result = num1 + num2;  break;
		case '-' :  result = num1 - num2;  break;
		case '*' :  result = num1 * num2;  break;
		
		case '/' :  
			if( num2 == 0 ) {
				System.out.println("0으로 나눌 수 없습니다.");
				flag = false; // 깃발 내림 --> 결과 출력 X
			}else {
				result = num1 / num2;  
			}
			break;
		
		case '%' :  result = num1 % num2;  break;
		
		default : 
			System.out.println("해당 연산자는 존재하지 않습니다.");
			flag = false; // 깃발 내림 --> 결과 출력 X
		}
		
		
		if(flag) { // 깃발이 올라가 있을 때만 결과를 출력
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result  );
		}
	}
	

}
