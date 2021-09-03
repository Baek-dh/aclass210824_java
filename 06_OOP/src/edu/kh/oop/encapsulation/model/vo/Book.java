package edu.kh.oop.encapsulation.model.vo;

public class Book {
	// 클래스란?
	// -> 객체의 특성(속성, 기능)을 정의한 것.
	//    객체를 만들기 위한 설계도.
	
	// 속성 == 값 == 데이터
	private String title; // 제목
	private String author;  // 저자
	private int price; // 가격
	// private : 객체 내에서만 접근 가능
	
	// -> 책이 가지고있는 공통된 부분만을 작성 == 추상화
	
	// -> 속성에 private 추가하여 외부로 부터의 직접 접근을 차단 == 캡슐화
	// * 캡슐화의 이유 : 객체의 손상을 막기 위해
	// * 캡슐화를 진행하는 경우 속성에 직접 접근이 안되므로 간접 접근 방법을 제공
	//   --> 간접 접근 기능(getter/setter)
	
	// 기능 == 동작 == 수행
	public void knowledgeTransfer() { // 지식 전달 기능
		
	}
	
	
	public void setTitle( String title  ) {
							// -> 매개 변수
							// 전달 받은 값을 저장하는 매개체
		this.title = title;
		
		// this : 여기, 이것, 현재 객체
		
		// 현재 객체의 title 속성은 private이지만
		// setTitle() 메소드도 같은 객체에 있으므로 접근 가능
	}
	
	
	public String getTitle() {
		  // -> 돌려 보낼 값의 자료형 == 반환형
		  // * void : 돌려보낼 반환값이 없음
		
		return title;
		
		// return : 호출한 곳으로 돌아감 == 반환
		// return title; 호출한 곳으로 돌아갈 때 title 속성값을 가지고 돌아감
	}
	
	
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	
	
	
	
}
