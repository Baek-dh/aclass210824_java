package edu.kh.oop.constructor.model.service;

import edu.kh.oop.constructor.model.vo.User;

public class ConstructorService {

	// 필드
	
	// 생성자
	
	// 메소드
	public void example1() {
		
		// 1) 기본 생성자를 이용한 User 객체 생성
		User user1 = new User();
		
		// 기본 생성자를 이용해 만들어진 User 객체의 필드를 초기화
		user1.setUserId( "user01"  ); 
		user1.setUserPassword( "pass01"  ); 
		user1.setUserName( "홍길동"  ); 
		user1.setUserAge( 25  ); 
		user1.setUserGender( '남'  ); 
		
		
		// 기본 생성자를 이용해 만들어진 User 객체의 필드를 출력
		System.out.println(user1.getUserId());
		System.out.println(user1.getUserPassword());
		System.out.println(user1.getUserName());
		System.out.println(user1.getUserAge());
		System.out.println(user1.getUserGender());
		
		// User 객체 새롭게 생성 + 필드 초기화
		/*User user2 = new User();
		
		user2.setUserId("user02");
		user2.setUserPassword("pass02");
		user2.setUserName("김삼순");
		user2.setUserAge(20);
		user2.setUserGender('여');*/
		
		User user2 = new User("user02", "pass02", "김삼순", 20, '여');
		// 매개 변수 있는 생성자 사용 이유
		// -> 코드 길이의 감소
		
		System.out.println(user2.getUserId());
		System.out.println(user2.getUserPassword());
		System.out.println(user2.getUserName());
		System.out.println(user2.getUserAge());
		System.out.println(user2.getUserGender());
		
	}

	
	public void example2() {
		
		// 오버로딩
		// Over : 넘치다
		// Loading : 적재
		// OverLoading : 과적
		// -> 하나의 메소드 이름에는 하나의 기능이 있어야 되지만
		// 하나의 메소드 이름에 여러 기능이 적재되는 기술
		
		// 매개 변수가 여러 개일 경우, 
		// 매개 변수에 순서에 맞게 알맞은 값을 작성해야 한다.
		User user1 = new User(20, "user01"); // userAge, userId
		User user2 = new User("user02", 25); // userId, userAge
		User user3 = new User("user03", "pass03"); // userId, userPassword
		
		
	}
	
	
	
	
}
