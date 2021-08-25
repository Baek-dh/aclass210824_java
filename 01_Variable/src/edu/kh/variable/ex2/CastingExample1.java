package edu.kh.variable.ex2;

public class CastingExample1 {

	public static void main(String[] args) {
		
		// 형변환 : 값의 범위가 다른 자료형들의 연산이 수행되는 경우
		//        값의 범위를 맞추기위해 자료형을 변환하는 것
		
		
		// 자동 형변환
		// - 값의 범위가 작은 자료형과 값의 범위가 큰 자료형 연산 시
		//   컴파일러가 자동으로
		//   값의 범위가 작은 자료형을
		//   큰 자료형으로 변환시키는 것
		
		int a = 12;
		double d = 3.3;
		double result = a + d; 
		// 12(int) + 3.3(double)
		// 12.0(double) + 3.3(dobule)
		// = 15.3 (double)
		
		System.out.println("result : " + result);
		
		
		// int -> long 자동형변환
		int iNum2 = 2147483647; // int 최대값
		long lNum2 = 10000000000L; // 100억
		long result2 = iNum2 + lNum2;
		System.out.println("result2 : " + result2);
		
		
		// float(4byte) -> double(8byte)
		float fNum3 = 1.23456f;
		double dNum3 = fNum3;
		// 1.23456f(float) -> 1.23456(double)
		
		// -> 대입 연산도 연산이기 때문에 자료형이 같아야 한다
		
		
		// long(8byte) -> float(4byte)
		// float는 long 보다 크기는 작지만
		// 값을 표현하는 범위가 훨씬 크다 == 자동 형변환 성립
		long lNum4 = Long.MAX_VALUE; // long의 최대값
		float fNum4 = lNum4; 
		System.out.println("fNum4 : " + fNum4);
		
		
		// char(2byte) -> int(4byte)
		char ch5 = '백';
		int iNum5 = ch5;
		// 문자형 char가 정수형 int로 자동 형변환이 가능한 이유?
		// -> 문자형 char는 실제로는 아스키코드,유니코드 같은 표에 작성된
		// 10진수 숫자에 따른 문자 모양을 출력하는 자료형이다.
		// (결론 : char도 결국에는 정수형이다)
		
		System.out.println("iNum5 : " + iNum5);
		
		
	}
}
