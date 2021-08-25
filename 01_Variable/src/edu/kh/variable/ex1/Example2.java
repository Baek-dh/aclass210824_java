package edu.kh.variable.ex1;

public class Example2 {

	public static void main(String[] args) {
		
		// 변수 선언 : 메모리(RAM)에 데이터를 저장할 수 있는 공간을 할당 하는 것.
		// -> 선언된 변수의 자료형에 따라 
		//  저장할 수 있는 데이터의 종류와 크기가 달라진다.
		
		// 기본 자료형 (8가지)
		// 논리형 : boolean(1byte)
		// 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte) 
		// 실수형 : float(4byte), double(8byte)
		// 문자형 : char(2byte)
		
		boolean isTrue; // is true -> isTure (변수 명명 규칙 -> 카멜표기법)
		
		byte byteNumber;
		short shortNumber;
		int intNumber; // 메모리에 정수를 저장할 수 있는 공간 4바이트를 할당하고
					   // 그 공간을 intNumber라고 부르겠다.
		long longNumber;
		
		
		float floatNumber;
		double doubleNumber;
		// 메모리에 실수를 저장할수 있는 공간 8바이트를 할당하고
		// 그 공간을 doubleNumber라고 부르겠다.
		
		char ch;
		
		
		// 값 대입 : 변수에 값을 대입하는 것
		// 리터럴 : 변수에 대입되는 값 자체를 의미
		//      -> 자료형 별로 리터럴 작성 방법이 다름
		
		// boolean의 리터럴 : true / false
		isTrue = true;  // 참
		isTrue = false; // 거짓
		
		// int의 리터럴 : 1, 2, 0, -1 (단순 정수 입력)
		byteNumber = 1;
		shortNumber = 2;
		intNumber = 4; // int가 자바 정수 기본형
		
		// * byte, short는 별도의 리터럴 표기방법이 정해져 있지 않음.
		// 왜? byte, short 자료형은
		// 옛날 버전 프로그램 또는 다른 언어와 연결될 때만 사용됨.
		// 임시로 사용되기 때문에 별도 리터럴 표기방법이 존재하지 않고
		// int의 리터럴 표기방법을 빌려다 쓴다.
		
		// long 리터럴 : 정수 뒤에 l, L 붙임
		longNumber = 8l; // L 소문자
		longNumber = 80000L; // L 대문자
		
		
		// float 리터럴 : 실수 뒤에 f, F 붙임
		floatNumber = 3.14f;
		floatNumber = 123456.789f;
		
		// double 리터럴 : 3.14, 2.56 (일반 실수)
		doubleNumber = 3.141592;
		
		
		// char 리터럴 : 'A', '가' (홑 따옴표 내에 문자 하나)
		ch = 'A';
		ch = '백';
		ch = '9'; // 숫자 9 모양의 문자
		
		
		// 문자열 변수 선언, 대입
		// String 리터럴 : "Hello", "안녕" (쌍 따옴표 내에 문자열)
		String str;
		str = "점심 뭐먹죠?";
		
		
		System.out.println(isTrue);
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(ch);
		System.out.println(str);
		
		
		
		// 변수 초기화 : 선언된 변수에 처음으로 값을 대입하는 것
		int age;
		age = 100; // 처음 값 대입 == 초기화
		
		// 변수 선언과 동시에 초기화
		int count = 10000;
		double pi = 3.14;
		
		System.out.println( "age : " + age   );
						//  age : 100
		
		System.out.println( "count : " + count );
		System.out.println( "pi : " + pi );
		
		
		
		// 상수 : 메모리상에 값을 한 번만 저장할 수 있는 변수
		// 상수 사용 시 final 이라는 키워드를 자료형 앞에 붙임.
		// + 상수명은 모두 대문자로 작성!!
		final double PI = 3.1415926535;
		// PI = 1.23; // 에러발생!
		// The final local variable PI cannot be assigned. 
		// It must be blank and not using a compound assignment
		
		
	}
	
}





