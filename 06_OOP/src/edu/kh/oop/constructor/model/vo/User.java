package edu.kh.oop.constructor.model.vo;


// ctrl + shift + '-'(위쪽 숫자 옆에 있는) : 한 화면 가로 분리
// ctrl + shift + '[' : 한 화면 세로 분리

public class User {

	/* 클래스 구조
	 * 
	 * public class 클래스명{
	 * 		
	 * 	  필드
	 * 	  생성자
	 *    메소드
	 * }
	 * 
	 * */
	
	// 필드
	// 캡슐화 원칙에 의해서 기본적으로 private
	private String userId; // 사용자 ID
	private String userPassword; // 사용자 비밀번호
	private String userName; // 사용자 이름
	private int userAge; // 사용자 나이
	private char userGender; // 사용자 성별
	
	// 생성자
	
	/* - new 연산자를 통해 객체 생성 시
	 *   생성된 객체의 필드 값을 초기화하고, 지정된 기능을 수행 하는 것이 목적.
	 * 
	 * - 생성자 작성 규칙
	 * 1) 생성자의 이름은 반드시 클래스명과 같아야 한다.
	 * 2) 생성자는 반환형이 존재하지 않는다.
	 * 3) 생성자가 하나라도 존재하는 경우
	 *    컴파일러에 의해서 기본 생성자가 자동 추가되지 않음.
	 *    -> 매개 변수 있는 생성자 작성 시
	 *       기본 생성자를 반드시 명시해 주는 것이 좋다.
	 * 
	 * */
	
	// 기본 생성자
	// [접근제한자] 클래스명() { ... }
	public User() {
		// 객체 생성 시 수행될 코드 작성
		
		System.out.println("기본 생성자에 의해서 User 객체가 생성 되었습니다.");
	}
	// -> 생성자가 하나도 작성되지 않은 경우
	//    절대로 객체를 생성할 수 없기 때문에
	//    컴파일러가 자동으로 기본 생성자를 추가 해줌!
	//public User() { }
	
	
	// 매개 변수 있는 생성자
	// - 객체 생성 시 매개변수로 전달 받은 값을 이용해서
	//   객체의 필드를 초기화 하는 용도의 생성자
	// -> 객체가 생성 되자마자 필드에 값이 들어가 있음.
	
	// -> 매개 변수 있는 생성자 == setter 여러 개를 한번에 수행하는 모양
	public User( String userId, String userPassword, String userName,
				int userAge, char userGender) {
		// 매개 변수가 5개 == 전달 받는 값이 5개
		
//		this.userId = userId;
//		this.userPassword = userPassword;
		
		this(userId, userPassword); // this 생성자
		// -> 같은 클래스 내부에 작성된 다른 생성자를 호출할 때 사용
		// -> 중복 제거를 통한 코드 길이 감소 효과를 위해 사용
		// (주의사항) 반드시 생성자 첫 번째 줄에 작성해야함.
		
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}
	
	// 생성자 오버로딩 -> 1) 매개 변수의 개수가 다르면 성립
	public User(String userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	// 생성자 오버로딩 -> 2) 매개 변수의 개수는 같으나 타입이 다르면 성립
	public User(String userId, int userAge) {
		this.userId = userId;
		this.userAge = userAge;
	}
	
	// 생성자 오버로딩 -> 3) 매개 변수의 개수, 타입은 같으나 순서가 다르면 성립
	public User(int userAge, String userId) {
		this.userId = userId;
		this.userAge = userAge;
	}
	
	// !!!오버로딩 시 주의사항 -> 변수명이 달라도 타입이 같으면 오버로딩이 성립 안됨!!!
	/*public User(int userAge, String userName) {
		this.userName = userName;
		this.userAge = userAge;
	}*/
	
	
	
	// 메소드
	// getter/setter
	public String getUserId() {
		// 현재 객체의 필드에 있는 userId를 반환
		return userId;
	}
	
	public void setUserId(String userId) {
		// 매개변수로 전달 받은 userId를 현재 객체의 필드에 있는 userId에 저장
		this.userId = userId;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getUserAge() {
		return userAge;
	}
	
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	public char getUserGender() {
		return userGender;
	}
	
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
}


