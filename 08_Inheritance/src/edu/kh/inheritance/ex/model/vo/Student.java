package edu.kh.inheritance.ex.model.vo;

// final 클래스 : 상속 불가능 클래스
public final class Student extends Person {
				// 물려받을 자식         // 물려주는 부모
	
	// * extends 라는 키워드를 사용하는 이유?!
	// - "확장하다" 라는 의미로
	//   자식이 부모의 멤버(필드, 메서드)를 물려 받으므로써
	//   자식이 가지게되는 멤버의 양이 늘어나기(확장) 때문
	
	
	// 필드
	/*private String name;
	private int age;
	private String nationality;*/
	// Person 클래스와 중복되는 필드, 메서드를 물려받아 사용할 예정
	// -> 중복되는 내용 제거
	
	
	private int grade; // 학년
	private int classRoom; // 반
	
	// 생성자
	public Student() { }  // 기본 생성자
	
	// 매개변수 있는 생성자
	// Student가 가지고있는 필드 : grade, classRoom
	//                         name, age, nationality
	
	public Student(int grade, int classRoom, String name, int age, String nationality) {
		// 방법 2) super() 생성자 사용
		
		// * super() 생성자
		// - 자식 생성자 내부 첫 줄에 작성 가능하며
		//   자식 객체 생성 시 내부의 부모 부분을 생성하는데 사용되는 생성자
		//   (참고)자식 객체 부분의 생성보다 부모 부분이 먼저 생성된다.
		
		//super(); // 부모 기본 생성자 호출
		
		// 부모 매개변수 있는 생성자
		super(name, age, nationality);
		// -> 코드 재사용성 증가, 코드 길이 감소
		
		
		this.grade = grade;
		this.classRoom = classRoom;
		
		// this.name // -> 상속 받은 부모의 필드가 private이면 직접 접근 불가
		// 방법 1) 부모 필드 간접 접근 방법인 setter 이용
//		setName(name);
//		setAge(age);
//		setNationality(nationality);
		
	}
	
	

	// getter/setter
	/*public String getName() {
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
	}*/

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	
	// 자식 객체가 가지고있는 모든 필드 정보를 문자열로 반환하는 메소드
	public String information() {
		// 이름 / 나이 / 국적 / 반 / 번호
		
//		return getName() + " / " + getAge() + " / " + getNationality()
//				+ " / " + grade + " / " + classRoom;
		
		return super.information() + " / " + grade + " / " + classRoom;
		
		// information() 이라고 작성하게 되면
		// -> 이게 부모? 자식? 누구의 것인지 확실히 구분되지 않아
		//   자식의 메소드로 판단하여 호출함.
		//  -> 같은 메소드가 호출되는 현상 (재귀호출)이 무한히 반복되어
		//     메소드가 쌓이는 메모리 영역 Stack이 넘쳐 흐름
		//     (StackOverflow)
		
		// 해결 방법 : super 참조변수를 붙여
		// 이름이 같은 메소드 중 부모의 메소드를 참조하도록 지정
		// -> 코드 재사용성 증가, 코드길이 감소
	}
	
	
	// Object의 toString() 상속 받아 오버라이딩한 Person을
	// 상속 받은 Student에서 toString()을 또 오버라이딩 하기
	@Override
	public String toString() {
		
		return super.toString() + " / " + grade  + " / " + classRoom;
	}
	
	
	// final 메서드 오버라이딩 불가 확인
	/*@Override
	public void breath() {
		// Cannot override the final method from Person
		// -> Person에 있는 final 메서드로 오버라이딩 불가
	}*/
	
	
	
	
	
	
	
	
	
}
