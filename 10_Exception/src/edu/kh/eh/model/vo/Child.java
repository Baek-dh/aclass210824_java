package edu.kh.eh.model.vo;

import java.io.EOFException;
import java.io.IOException;

public class Child extends Parent  {

	// 상속 받은 methodA 오버라이딩
	@Override
	public void methodA() throws EOFException{
						 // IOException보다 더 구체적이기 때문에 가능함
		
		// - throws Exception인 경우 
		// Exception Exception is not compatible with 
		// throws clause in Parent.methodA()
		
		// 오버라이딩 시 예외처리 구문의 예외 범위는
		// 같거나 더 구체적이여야 한다.
		
	}
	
}
