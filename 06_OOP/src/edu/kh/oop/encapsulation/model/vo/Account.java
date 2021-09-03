package edu.kh.oop.encapsulation.model.vo;

public class Account {

	// public : (공공의, 드러난), 어디서든지 누구든지 접근 가능함을 나타냄
	// private : (사적인, 비공개의), 해당 객체 내부에서만 사용 가능(외부 접근 불가)
	
	// 속성
	// public -> private 바꿈 (캡슐화)
	private String name;// 이름
	private String accountNumber; // 계좌번호
	private String password; // 비밀번호
	private int money; // 돈
	private int bankCode; // 은행 코드
	
	
	// 기능
	public void deposit() { // 입금 기능
		System.out.println("입금 기능 수행");
		
	}
	
	public void withdraw() { // 출금 기능
		System.out.println("출금 기능 수행");
	}
	
	
	/* private으로 직접 접근이 제한된 객체의 속성부분을
	 * 간접적으로 접근할 수 있는 기능을 작성
	 * --> 속성별로 값을 세팅하는 기능 setter와
	 *     값을 얻어갈 수 있게 하는 기능 getter를 작성
	 * */
	
	/* setter 작성 방법
	 * 
	 * public void set속성명 ( 속성자료형 속성명 ){
	 * 		this.속성명 = 속성명;
	 * }
	 * 
	 * */
	
	// name의 setter
	
	// public : 외부에서 접근 가능한 기능이라는 뜻
	public void setName( String name ) {
					// String name	-> 외부로 부터 전달 받은 값을 저장할 매개체
					// == 매개 변수
					// -> 외부로 부터 전달 받은 값을
					//    해당 기능 내부에서 name이라는 변수명으로 사용
		
		this.name = name;
		
		// this. : (여기, 이것, 현재 객체)
		
	}
	
	
	// accountNumber의 setter
	public void setAccountNumber( String accountNumber ) {
		this.accountNumber = accountNumber;
	}
	
	// password의 setter
	public void setPassword( String password ) {
		this.password = password;
	}
	
	// money의 setter
	public void setMoney( int money ) {
		this.money = money;
	}
	
	// bankCode의 setter
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	
	
	/* getter 작성법
	 * 
	 * public 속성자료형 get속성명(){
	 * 		return 속성명;
	 * }
	 */
	
	// name의 getter
	public String getName() {
		   // -> 호출된 곳으로 돌려보낼 값의 자료형 == 반환형 
		
		return name;
		
		// return : 호출된 곳으로 돌아가라 == 반환
		// return name; 
		// -> 호출된 곳으로 돌아갈 때 name속성에 저장된 값("홍길동")을
		//    가지고 돌아가라
	}
	
	
	// accountNumber의 getter
	public String getAccountNumber() {
		return accountNumber;
	}
	
	// password의 getter
	public String getPassword() {
		return password;
	}
	
	// money의 getter
	public int getMoney() {
		return money;
	}
	
	// bankCode의 getter
	public int getBankCode() {
		return bankCode;
	}
	
	
	
	
}
