package edu.kh.eh.model.exception;

public class DivideByTwoException extends Exception {

	// 사용자 정의 예외를 만드는 방법
	// - 아무 Exception 클래스를 상속 받으면 된다!
	
	// 1) UnCheckedException이고 싶음 
	//   -> RuntimeException 또는 그 후손 클래스
	
	// 2) CheckedException이고 싶음
	//  -> RuntimeException 제외한 나머지
	
	
	// 예외가 발생했다
	// == new 예외클래스() 가 수행되어 예외 객체가 생성되었다
	// -> 객체 생성을 위해서는 생성자가 있어야 한다.
	// --> 사용자 정의 예외에는 생성자를 작성해야 한다.
	
	
	public DivideByTwoException() {
		
		super("2로 나눌 수 없습니다.");
			  // 예외 발생 시 작성되는 문구
	}
	
	public DivideByTwoException(String message) {
		super(message);
		// 출력하려는 예외 문구를 매개변수로 얻어온 값으로 지정
	}
	
	
	
	
}
