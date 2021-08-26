package edu.kh.variable.practice;

public class CastingPractice1 {
	public static void main(String[] args) {
		
		// 변수 : 메모리에 값을 기록하기 위한 공간
		// 변수 선언 : 메모리 값을 기록하기 위한 공간을 할당
		// 기본 자료형 8가지 : 
		// boolean,  byte, short, int, long,  float, double,   char
		// 논리형               정수형               실수형         문자형
		
		// 참조형 : String(문자열)
		
		// 변수 명명 규칙 :
		// 1. 카멜표기법 : 첫 글자는 소문자, 연결되는 단어의 첫 글자는 대문자
		// 2. 대/소문자 구분
		// 3. $,_ 특수 기호 가능
		// 4. 숫자로 시작 불가
		// 5. 예약어 사용 X
		
		// + 한글로 변수명 선언 가능 (하지만 사용 자제)
		// int 숫자 = 10;
		
		// 상수 : 메모리에 한번만 값을 기록할 수 있는 변수
		
		// 리터럴 : 값 자체
		// -> 자료형별로 별도의 표기법 존재
		// 10(int + byte, short),  123L(long)
		// 3.14f(float), 1.23(double),  'A' (char),  "abc"(String)
		// true/false(boolean)
		
		// 컴퓨터의 값 처리 원칙
		// -> 연산 시 같은 자료형 끼리만 가능, 결과도 같은 자료형
		// ex) 10 + 20 =30
		//    int + int = int
		
		// 자동 형변환
		// 값의 범위가 큰 자료형의 값과 작은 자료형의 값이 연산될 때
		// 컴파일러가 자동으로 작은 자료형을 큰 자료형으로 형변환
		
		// 1 + 0.5 = 1.5
		// int + double = double
		// -> double + double = double
		
		// 강제 형변환
		// 값의 범위가 큰 자료형을 작은 자료형으로 변환
		// 변환 시 데이터 손실이 발생할 수 있음.
		// double -> int      long -> int
		//  (int)3.14          (int)100L
		
		// 데이터 오버플로우
		// -> 연산 시 값의 범위를 초과
		// 최대값 초과 시 최소값 부터 다시 시작
		
		
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A'; 
		
		System.out.println( iNum1 / iNum2 ); // 2
						//  10   /  4    = 2.5 -(int)-> 2
						// (int) / (int) =  (int)
		
		
		System.out.println( (int)dNum ); // 2
		
		
		System.out.println( iNum2 * dNum ); // 10.0
		//  double * double
		//  4.0 *  2.5 = 10.0
		
		
		System.out.println( (double)iNum1 ); // 10.0
		// 강제 형변환은 값의 범위가 작은 자료형 -> 큰 자료형으로 변경 가능
		
		
		System.out.println( (double)iNum1 / iNum2 ); // 2.5
		// 10.0 / 4.0 = 2.5
		
		System.out.println( dNum ); // 2.5
		
		
		System.out.println( (int)fNum ); // 3
		// 3.0f -> 3 
		
		
		System.out.println( iNum1/(int)fNum ); // 3
		//           10 / 3.0f
		//  (int)(iNum1 / fNum)
		
		//   iNum1/(int)fNum
		//     10 / 3 = 3    

		System.out.println( iNum1 / fNum );// 3.3333333
		
		System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335
		
		// float, double 차이점
		// 1. 값의 범위 차이(byte 크기가 다름)
		// 2. 정밀도의 차이
		// (참고) 2진수로는 소수를 표현하는데 한계가 있음
		// -> 무한 소수로 표현되는 2진수를 
		//    출력 시 유한한 10진수로 표현함 
		//  -> 실질적으로는 불가능하기 때문에 근사치를 출력
		
		// 소수점 아래로 값을 많이 표현할수록 정밀도가 높다
		// float : 소수점 아래로 7 ~ 8
		// double : 소수점 아래로 15 ~ 16
		
		
		System.out.println( ch ); // 'A'
		
		System.out.println( (int)ch ); // 65
		
		
		System.out.println( ch + iNum1 ); // 75
		//				   int + int
		
		
		System.out.println( (char)(ch + iNum1) ); // 'K'

	}
}
