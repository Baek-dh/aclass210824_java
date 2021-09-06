package edu.kh.oop.field.ex2;

import edu.kh.oop.field.ex1.FieldTest1;

public class FieldTest3 extends FieldTest1 {

	public void example3() {
		
		// FieldTest1 인스턴스 생성 == 객체 생성
		FieldTest1 f1 = new FieldTest1();
		
		System.out.println( f1.test1 );	// +  public
		// System.out.println( f1.test2 );	// #  
		// protected : 같은 패키지 또는 상속 관계
		
		System.out.println( test2 );
		
		
		//System.out.println( f1.test3 );	// ~ 
		// (default) : 같은 패키지
		
		//System.out.println( f1.test4 );	// -
		// private : 같은 객체
		
		
	}
	
}
