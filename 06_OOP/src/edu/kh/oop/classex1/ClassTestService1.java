package edu.kh.oop.classex1;

public class ClassTestService1 {

	public void test() {
		// ClassTest1 ,ClassTest2 클래스를 얻어와
		// 객체 생성하기
		
		ClassTest1 t1 = new ClassTest1(); // public 문제 없음
		// -> 같은 프로젝트
		
		ClassTest2 t2 = new ClassTest2(); // (default) 문제 없음
		// -> 같은 패키지
		
	}
	
}
