package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Dog;

public class ExampleService {
	
	public void example1() {
		// 1) 추상클래스를 이용한 객체 생성
		
		// Animal animal = new Animal();
		// Cannot instantiate the type Animal 
		// -> 객체화 불가능. 왜? 추상 클래스이기 때문에
		
		
		// 2) 추상 클래스를 상속 받아 구현한 일반 클래스 객체 생성
		Dog dog = new Dog("강아지과", "잡식", 100);
		dog.hunt();
		
		// 3) 추상 클래스는 부모 타입 참조 변수로 사용할 수 있다.
		Animal animal = new Dog("강아지과", "잡식", 50); // 다형성 업캐스팅 적용
		
		animal.hunt(); // 정적 바인딩 : 미완성 메소드와 연결됨
					   // 동적 바인딩 : 오버라이딩된 Dog의 hunt()와 연결됨
		
		
	}
	
	
	public void example2() {
		
		Marker[] arr = new Marker[3];
		
		arr[0] = new MyCalculator();
		arr[1] = new NewCalculator();
		arr[2] = new Test();
		
		
		
		
	}
	
	
	
	
	
	
}
