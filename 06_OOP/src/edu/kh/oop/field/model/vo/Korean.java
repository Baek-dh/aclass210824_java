package edu.kh.oop.field.model.vo;

public class Korean {

	// 속성 == 필드(field)
	private String name;
	private String id; // 주민등록번호
	//private static int nationalCode = 82; // static 예약어 추가
	public static int nationalCode = 82; // static 예약어 추가
	
	//public final static String LANGUAGE = "한글";
	public static final String LANGUAGE = "한글";
	
	
	
	
	// -> 공용되는 상수  ex) PI
	
	// ***** static 예약어가 작성된 코드는 
	// 프로그램 실행 시 static 영역에 자동으로 추가된다.
	
	/* JVM의 Static 영역 == 공유 메모리 영역 == 정적 메모리 영역
	 * 
	 * *** 필드 세분화
	 * 1) 멤버 변수 == 인스턴스 변수  (static x)
	 * - private String name;
	 * 
	 * (참고) 클래스 내부에 작성되는 필드, 메소드를 통틀어 "멤버" 라고함
	 * 		단, static 제외 
	 * 
	 * - 생성 : new 연산자를 통해 Heap 영역에 객체(인스턴스)가 생성될 때
	 * - 소멸 : 객체가 소멸될 때 같이 소멸
	 * 			-> 객체 소멸 시점 : 어떠한 참조 변수에도 참조되지 않을 때 GC가 소멸 시킴
	 * 
	 * 
	 * 2) 클래스 변수 == static 변수 (static o)
	 * - public static int nationalCode;
	 * 
	 * - 생성 : 프로그램 실행 시 Static 영역에 생성됨.
	 * - 소멸 : 프로그램 종료 시 자동 소멸됨.
	 * 
	 * */
	
	
	
	// 기능
	public void setName(String name) {
						// 매개 변수
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setNationalCode(int nationalCode) {
		this.nationalCode = nationalCode;
	}
	
	public int getNationalCode() {
		return nationalCode;
	}
	
}





