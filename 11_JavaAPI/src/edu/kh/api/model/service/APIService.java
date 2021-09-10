package edu.kh.api.model.service;

public class APIService {

	// Wrapper 클래스
	// - 기본 자료형을 객체화 시켜주는 클래스
	
	// 왜 사용하는가?
	// 1) 기본 자료형과 관련된 특정 값, 기능을 제공하기 위하여
	
	// 2) 기본 자료형을 다룰 수 없는 경우에 사용하기 위하여
	//    ex) 매개변수가 Object인 경우, 
	//		  Collection을 사용하기 위하여 (Collection은 객체만 취급함)
	
	
	/* Wrapper 클래스는 java.lang 패키지에 있음
	 * 
	 *  기본자료형		Wrapper Class
	 *  byte		Byte
	 *  short		Short
	 *  int			Integer
	 *  long		Long
	 *  float		Float
	 *  double		Double
	 *  boolean		Boolean
	 *  char		Character
	 *  
	 *  기본 자료형 -> 객체  : 포장(Boxing)
	 *  객체 -> 기본 자료형  : 포장 풀기(UnBoxing)
	 * 
	 *  * Wrapper 클래스에서 자주 사용되는 필드, 메소드는 모두 static으로 선언되어 있다!
	 *   -> 객체 생성을 안해도 클래스명.필드  형식으로 사용할 수 있다.
	 * 
	 * */

	public void example1() {
		
		// Integer Wrapper 클래스 살펴보기
		System.out.println(  Integer.MAX_VALUE  ); // int 최대값
		System.out.println(  Integer.MIN_VALUE  ); // int 최소값
		System.out.println(  Integer.BYTES      ); // int의 바이트 크기 : 4
		System.out.println(  Integer.SIZE       ); // int의 비트 크기 : 32
		System.out.println(  Integer.TYPE       ); // 어떤 기본 자료형을 포장한 것인가 : int
		
		// -> 모든 Wrapper 클래스에서 가능함
		
	}
	
	public void example2() {
		
		// 문자열로 되어있는 숫자를     숫자 자료형을 변경하기
		
		// ex)  "123"  ->   123
		
		String str1 = "12345";
		
		System.out.println( str1 + 5 ); // 123455
		
		
		int num1 = Integer.parseInt(str1);
		// -> str1 문자열이 int값으로만 이루어져 있는지 분석하여
		//    int로만 이루어져 있는 경우 int 자료형으로 형변환하여 반환
		
		// parse : 분석하다
		// parsing : 구문 분석 , 데이터의 성질 자체를 바꾸는 것
		
		System.out.println( num1 + 5 ); // 12350
		
		
		// 다른 Wrapper클래스의 parseXXX 구문
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3");
		long l = Long.parseLong("4");
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("0.2");
		boolean bool = Boolean.parseBoolean("true");

		// Character.parseCharacter()는 존재하지 않음!!!!!
		// 왜? 문자열을 문자로 바꿀 수 없기 때문에....
		// -> 대신 charAt(index)을 이용하여 원하는 문자만 뽑아올 수 있다.
		
	}
	
	
	public void example3() {
		
		// Boxing   
		Integer i1 = new Integer(100); // 100 이라는 int를 Integer로 포장
		
		
		// UnBoxing
		int num1 = i1.intValue(); // i1 객체에 있는 int값(100)을 반환 
		
		// * 수동적인 Boxing/UnBoxing 방법을 자바에서 추천하지 않음.
		// -> JDK 1.9 버전 부터 삭제 예정 코드로 등록됨
		// --> 자동으로 포장하고 푸는 것을 가능하게 하는 기술이 나타남!
		
		// AutoBoxing
		Integer i2 = 200;  //  Integer자료형 =  int자료형
						   // 원래는 연산이 안되는게 맞지만, Wrapper클래스만 가능
		
		// AutoUnBoxing
		int num2 = i2 + 100; 
		// i2는 Integer이지만 int와의 연산을 위해 자동으로 포장이 해제됨.
		
		
	}
	
	
	
	
	
	
	
	
	
}
