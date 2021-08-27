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
		
		switch( input ) {
		
		case 3 : color = "빨간색"; break;
		case 4 : color = "파란색"; break;
		case 5 : color = "노란색"; break;
		default : color = "흰색";
		}
		
		System.out.println(color);
		
	}
	
	
	
	

}
