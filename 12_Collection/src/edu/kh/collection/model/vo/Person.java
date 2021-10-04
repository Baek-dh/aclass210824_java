package edu.kh.collection.model.vo;

public class Person {

	// 필드
	private char gender;
	private double height;
	
	
	// 기본 생성자
	public Person() { }

	// 매개 변수 있는 생성자
	public Person(char gender, double height) {
		super();
		this.gender = gender;
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	} 
	
	@Override
	public String toString() {
		
		return gender + " / " + height;
	}
	
	
	
	
	
	
	
	
	
}
