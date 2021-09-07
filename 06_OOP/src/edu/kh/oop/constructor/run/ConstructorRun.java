package edu.kh.oop.constructor.run;

import edu.kh.oop.constructor.model.service.ConstructorService;

public class ConstructorRun {
	public static void main(String[] args) {
		
		ConstructorService service = new ConstructorService();
		
		// ConstructorService의 기본 생성자를 작성하지 않았지만
		// 문제 없이 사용할 수 있다!
		// 왜? 컴파일러가 기본 생성자를 자동으로 추가 해주니까!
		
		service.example1();
		
		
	}
}
