package edu.kh.variable.ex1;

public class Example3 {
	public static void main(String[] args) {
		
		// ctrl + d : 한 줄 삭제
		// ctrl + / : 한 줄 주석
		// 블록 지정 -> ctrl + / : 블록 지정된 라인 주석
		// 블록 지정 -> ctrl + shift + / : 블록 만큼 범위 주석
		
		// 문자열과 다른 자료형
		String str = "Hello";
		String str2 = "World";
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println( str + str2 ); // HelloWorld
		// 문자열 + 문자열 = 두 문자열 이어졌음
		
		System.out.println( num1 + num2 ); // 30
		// 정수 + 정수 = 두 정수 합
		
		// 결론 : 더해지는 자료형에 따라서 + 기호의 역할이 달라진다.
		// 1) 합  2) 이어쓰기
		
		
		// 문자열 + 정수 = 이어쓰기
		System.out.println(str + num1); // Hello10
		
		// 정수 + 문자열 = 이어쓰기
		System.out.println(num1 + str); // 10Hello
		
		// 문자열 + 정수 + 정수 = 이어쓰기
		System.out.println(str + num1 + num2); // Hello1020
		
		// Hello30 출력하기
		// -> 괄호() == 최우선 연산
		System.out.println( str + ( num1 + num2 ) ); // Hello30
		
		// 정수 + 정수 + 문자열 = 정수끼리 더하고 문자열과 이어써짐.
		// -> + 연산이 나열되어 있는 경우 앞에서 부터 순서대로 연산이 진행됨.
		System.out.println(num1 + num2 + str); // 30Hello
		
		// 정수 + 문자열 + 정수
		System.out.println(num2 + str2 + num1); //  20World10
						//  20  + "World" + 10
		
		
		// 추가 결론 : 문자열 + 다른 자료형 -> 이어쓰기, 나머지는 합
	}
}
