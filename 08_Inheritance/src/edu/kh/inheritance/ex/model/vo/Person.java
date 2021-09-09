package edu.kh.inheritance.ex.model.vo;

// java.lang 패키지를 컴파일러가 자동으로 import 하는 구문을 추가하여
// String, Object 같은 클래스를 바로 사용 가능하게함


// MVC Model 2 패턴
// -> 수행하는 역할에 따라 클래스를 Model, View, Controller로 나눠서 관리하는 패턴

// model : 비즈니스 로직과 관련된 클래스를 모아두는 패키지
//         -> 데이터 전송, 가공, 저장, 데이터베이스 관련 내용과 관련된 코드

// VO(Value Object) : 값을 저장하는 용도의 객체

public class Person extends Object {
			// 클래스명 옆에 상속 구문이 누락된 경우
	 		// 컴파일러에 의해서 자동으로 extends Object 구문이 추가된다

	// 필드
	private String name; // 이름
	private int age;  // 나이
	private String nationality; // 국적

	// 생성자 : 객체 생성 + 객체 생성시 필드 초기화 + 특정 기능 수행
	public Person() { } // 기본 생성자
	
	// ** 생성자를 하나도 작성하지 않은 경우
	// -> 컴파일러가 자동으로 기본 생성자를 추가해줌
	
	// 매개변수 있는 생성자
	public Person(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		
		// this 참조변수 : 객체 생성 시 내부에 같이 생성되며, 객체의 시작 주소를 참조
		// 오버로딩 : 하나의 메서드명으로 여러 기능을 정의 하는 것 
		//    -> 성립 조건 : 1) 매개변수의 개수   2)타입     3)순서
	}
	
	// 기능 (method)
	// VO 클래스는 getter/setter + 필드 정보를 한 번에 출력하는 용도의 메서드 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	
	// 필드 정보를 한 번에 출력하는 용도의 메서드 
	public String information() {
		return name + " / " + age + " / " + nationality;
	}
	
	
	// 오버라이딩 : 자식 클래스가 부모로 부터 상속 받은 메서드를 재정의(재작성) 하는 것.
	
	// 성립 조건
	// 1) 메소드명이 동일해야 한다.
	// 2) 매개변수의 개수, 타입, 순서가 모두 동일해야 한다.
	// 3) 반환형(리턴타입)도 동일해야 한다.
	// 4) 부모의 private 메소드는 접근이 불가해서 오버라이딩 할 수 없다.
	// 5) 접근 제한자의 범위는 같거나 더 넓어야 한다.
	// 6) 예외 처리의 범위는 같거나 더 구체적이여야 한다.
	
	// Object.toString() 오버라이딩
	// -> Object는 모든 객체가 가지는 기능을 추상화하여 모아둔 클래스
	// -> toString() : 객체의 모든 필드 정보를 문자열로 반환하는 용도의 메서드
	
	// Object의 toString() 메소드 : 클래스명 + @ + 16진수 해시코드
	// -> 사용 목적에 맞지 않으므로 상속 받은 자식이 재정의!
	
	@Override // Override 어노테이션:해당 메서드는 오버라이딩 되었다를 컴파일러에게 알려주는 구문
	public String toString() {
		// 내부 코드 재정의
		return name + " / " + age + " / " + nationality;
	}
	
	
	
	// Person 객체만의 기능 + 상속 되어도 오버라이딩 불가
	// -> final 메서드
	// 상속 관계 내에서 더 이상 오버라이딩 되지 않음.
	// -> 정의 될수 있는 마지막 메서드
	public final void breath() {
		System.out.println("사람은 코나 입으로 호흡을 해야한다.");
	}
	
	
	
	public String overridingTest() {
		return "Person 클래스에 작성된 오버라이딩 테스트 메서드";
	}
	
	
	
	
	
	
}
