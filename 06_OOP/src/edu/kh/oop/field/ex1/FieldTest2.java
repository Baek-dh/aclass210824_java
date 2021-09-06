package edu.kh.oop.field.ex1;

public class FieldTest2 {

	public void example2() {
		
		// FieldTest1 객체 생성
		FieldTest1 f1 = new FieldTest1();
		
		// f1이 참조하는 객체의 필드를 출력
		System.out.println( f1.test1 ); // +
		System.out.println( f1.test2 ); // #
		System.out.println( f1.test3 ); // ~
		// System.out.println( f1.test4 ); 
		// -> The field FieldTest1.test4 is not visible
		// -> 같은 패키지 다른 클래스(객체) 이기 때문에
		//   private 접근 제한자가 설정된 test4에 접근 불가
		
		
		
	}
	
}
