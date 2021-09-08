package edu.kh.oarr.ex.model.vo;

// getter / setter 자동 완성

// alt [+shift] + s  -> r

public class Book {

	// 필드
	private String title;	// 제목
	private String author;	// 저자
	private int price;		// 가격
	
	// 생성자
	public Book() {  } // 기본 생성자
	
	// 매개변수 있는 생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String information() {
		// 객체가 가지고 있는 필드 정보 반환 메소드
		return title + " / " + author + " / " + price;
				// 어린왕자 / 생택쥐베리 / 8000
	}
	
	
	
}






