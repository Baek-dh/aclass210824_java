package edu.kh.variable.ex3;

public class PrintExample {
	
	public static void main(String[] args) {
		
		double dNum1 = 3.14;
		
		System.out.print("안녕하세요");
		System.out.println(123);
		System.out.println(dNum1);
		
		// 안녕하세요123
		// 3.14
		
		int iNum1 = 5;
		int iNum2 = 20;
		
		// 두 변수의 합을 다음과 같이 출력하시오.
		// 5 + 20 = 25
		
		System.out.println( iNum1  + " + " + iNum2 + " = " + (iNum1 + iNum2));
		
		// printf를 이용하여 출력하기
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1+iNum2  );
		
		// System.out.printf("패턴 + 문자열",  값);
		System.out.printf("%d x %d = %2d\n", 5, 1, 5*1);
		System.out.printf("%d x %d = %2d\n", 5, 2, 5*2);
		
		// %2d : 출력될 공간을 2칸을 확보하고 오른쪽 정렬로 10진수 출력
		// %-2d : 출력될 공간을 2칸을 확보하고 왼쪽 정렬로 10진수 출력
		
		
		// 소수점 아래 몇째자리까지 표현하기
		System.out.println( 10 / 3.0 );
		
		// 소수점 아래 둘째자리까지 표현
		System.out.printf("%.2f \n", 10 / 3.0 );
		
		
		// escape 문자
		
		System.out.print("Hello\n");
		System.out.print("\tWorld");
		System.out.println(" \"apple\" ");  //  "apple"
		// -> 문자열 리터럴 표기법 : "" 내부 작성 
		// \"  : 기호가 아닌 문자 그대로의 쌍따옴표
		
		System.out.println("abc\\def");  //   abc\def;  
		//  \\ : "\" 문자 그대로 출력
		
		
	}
	
}
