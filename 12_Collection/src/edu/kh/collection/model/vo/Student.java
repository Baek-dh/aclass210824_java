package edu.kh.collection.model.vo;

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
	
	
	
	
	
	
	
}
