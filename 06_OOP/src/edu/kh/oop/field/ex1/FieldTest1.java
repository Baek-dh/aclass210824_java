package edu.kh.oop.field.ex1;

public class FieldTest1 {
	
	// Field : 클래스에서 객체의 속성을 정의하는 부분
	// [접근제한자] [예약어] [자료형] 변수명 [=초기값]; 
	
	// 접근제한자
	// public(+) : 모든, 같은 프로젝트 내부
	// protected(#) : 같은 패키지 또는 다른 패키지 이지만 상속 관계
	// (default)(~) : 같은 패키지 내부
	// private(-) : 사적인, 같은 객체 내부
	
	public    String test1 = "+";
	protected String test2 = "#";
	/*(default)*/  String test3 = "~";
	private   String test4 = "-";
	
	
	public void example1() {
		
		System.out.println( test1  );
		System.out.println( test2  );
		System.out.println( test3  );
		System.out.println( test4  ); 
		// private 접근 제한자는 같은 객체 내부에서 접근 가능핟.
		
	}
	
	
	
	
	
	
}
