package edu.kh.inheritance.ex.model.service;

import edu.kh.inheritance.ex.model.vo.Person;
import edu.kh.inheritance.ex.model.vo.Student;

public class InheritanceService {

	public void example1() {
		// Person, Student 상속 확인
		
		// 1) Person 객체 생성
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(20);
		p1.setNationality("대한민국");
		
		// 2) Student 객체 생성
		Student s1 = new Student();
		
		// * s1. 입력 후 상속 받은 부모의 setter/getter가 자동 완성 구문에 포함되어 있는지 확인
		s1.setName("헤르미온느");  	// 상속받은 메서드
		s1.setAge(15); 				// 상속받은 메서드
		s1.setNationality("영국"); 	// 상속받은 메서드
		s1.setGrade(2);
		s1.setClassRoom(3);
		
		System.out.println( s1.getName() ); 		// 상속받은 메서드
		System.out.println( s1.getAge() ); 			// 상속받은 메서드
		System.out.println( s1.getNationality() ); 	// 상속받은 메서드
		System.out.println( s1.getGrade() );
		System.out.println( s1.getClassRoom() );
		
		
		// Object는 모든 클래스의 최상위 부모(조상)이다.
		// == 모든 클래스는 Object 클래스의 후손이다.
		
		p1.hashCode(); 
		// Person에는 hashCode()가 작성되지 않았지만 사용할 수 있다
		// == 상속 받은 Object의 hashCode()를 사용할 수 있다.
		
		s1.hashCode();
		// Object -> Person -> Student 계속 물려 받아 사용할 수 있음
		
		
		Student s2 = new Student(3, 10, "고길동", 16, "대한민국");
		
		System.out.println("===== super() 생성자 확인 =====");
		System.out.println( s2.getName()  );
		System.out.println( s2.getAge()  );
		System.out.println( s2.getNationality()  );
		
		
		System.out.println("===== super 참조변수 확인 =====");
		System.out.println(s2.information());
		
	}
	
	public void example2() {
		// 오버라이딩 , 오버로딩 예제
		
		// 1. Object의 toString()을 오버라이딩 하기 전 
		// edu.kh.inheritance.ex.model.vo.Person@139a55
		
		// 2. Object의 toString()을 오버라이딩 후 
		// 홍길동 / 20 / 대한민국
		
		Person p1 = new Person("홍길동", 20, "대한민국");
		
		System.out.println(  p1  );
		// print 관련 구문 내에 참조변수를 작성하면 해당 객체의 toString()을 출력함
		
		Student s1 = new Student( 3, 3, "안젤리나졸리", 19, "미국");
		System.out.println( s1.toString() );
		System.out.println( s1 );
	}
	
	
	
	
	
	
}
