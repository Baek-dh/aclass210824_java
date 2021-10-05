package edu.kh.collection.model.vo;

import java.util.Objects;

public class Student extends Person{
	// class란? 객체를 만들기 위한 설계도 필드, 메소드(+생성자)로 이루어짐
	
	// 접근 제한자
	// + public : 같은 프로젝트 내부 어디서든
	// # protected : 같은 패키지 + 상속 관계
	// ~ (default) : 같은 패키지
	// - private  : 같은 객체 내에서만 접근 가능 
	
	private String name;
	private int age;
	private int grade;
	// -> 캡슐화 원칙에 의해서 private으로 선언
	
	
	// 생성자 : 객체 생성 시 호출되는 일종의 메소드
	//        객체 생성 + 초기화 용도로 사용
	
	public Student() { } // 기본 생성자
	
	// 매개 변수 있는 생성자
	// 매개 변수 : 전달 받은 값을 저장하는 변수
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		
		// this 참조 변수 : 현재 객체의 시작주소를 참조하는 참조 변수
		// == 객체 자신을 참조함.
	}
	
	
	
	public Student(char gender, double height, String name, int age, int grade) {
		super(gender, height);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	

	// getter / setter : 캡슐화로 인해 직접 접근이 차단된 필드에 대한 간접 접근 방법
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	
	// 오버라이딩 : 상속 받은 메소드를 자식 클래스에서 재정의 
	// 오버로딩 : 같은 이름의 메소드를 여러 개 작성하는 기술
	
	// toString() : Object 클래스의 메소드로 필드 정보를 하나의 문자열로 반환하는 용도로
	//				오버라이딩 하여 사용하는 메소드
	
	@Override
	public String toString() {
		return   name + " / " + age + " / " + grade  + " / " + super.toString();
 	}													//  gender + " / " + height;

	@Override
	public int hashCode() {
		return Objects.hash(age, grade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && grade == other.grade && Objects.equals(name, other.name);
	}
	
	// alt + [shift] + s -> Generate hashCode() and equals()...
	
	
	
	
	
	
	// Object.equalus() 메소드
	// -> 상속 받아 오버라이딩 하는 용도의 메소드
	// -> 두 객체가 서로 같은 값을 가지고 있는지 비교하는 코드로 오버라이딩
	// --> 현재 객체와 매개변수로 얻어온 객체의 필드 값이 모두 같으면
	//     같은 객체(true)라는 결과를 반환하도록 오버라이딩 해야된다!!
	/*
	@Override
	public boolean equals(Object obj) {
							// Student
		// 매개변수로 전달 받은 객체 다운 캐스팅
		Student other = (Student)obj;
		
		return this.name.equals(other.name) &&
				this.age == other.age        &&
				this.grade == other.grade;
	}
	
	
	// Object.hashCode()
	// -> 동등한 객체( equals() 결과가 true인 두 객체 )는
	//    동일한 hashCode() 값을 반환해야 한다.
	
	// == equals()를 오버라이딩 하는 경우 hashCode()도 오버라이딩 해야되면
	//    equals()가 true면 두 객체의 hashCode()도 같은 값을 가져야 한다.
	
	@Override
	public int hashCode() {
		// 값이 같은 객체는 hashCode값도 같아야 된다
		// ==> 값을 이용해서 hashCode를 만들면 가능하다
		
		final int PRIME = 31; // 31이라는 소수가 연산 속도가 빠름
		
		int result = 1; // 결과 저장 변수
		
		result = result * PRIME + ( name == null ? 0 : name.hashCode() );
		
		result = result * PRIME + age;
		
		result = result * PRIME + grade;
		
		return result;
		
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
}
