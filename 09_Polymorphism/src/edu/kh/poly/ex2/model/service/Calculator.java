package edu.kh.poly.ex2.model.service;

public interface Calculator {
	
	// 인터페이스
	// - 상수형 필드와 추상 메소드만을 작성할 수 있는
	//   추상 클래스의 변형체
	
	public static final double PI = 3.14;
	double PI2 = 3.14;
	
	
	// 인터페이스 사용 목적
	// 1. 일관된 인터페이스(작업환경)을 제공
	//  -> implements 구문을 이용한 인터페이스 상속을 통해
	//     상속 받은 모든 클래스에서 동일한 메소드를 강제적으로 오버라이딩 하게 함.
	//     == 상속 받은 자식 클래스의 일관성 형성
	
	// 2. 클래스간의 접점을 만들어 강제적인 부모, 자식 관계 형성
	
	
	// 묵시적으로 메소드는 public abstract
	
	int plus(int num1, int num2);
	
	abstract int minus(int num1, int num2);
	
	public abstract int multiple(int num1, int num2);
	
	public  int divide(int num1, int num2);
	
	
	
	
	

}
