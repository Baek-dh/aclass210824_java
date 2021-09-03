package edu.kh.oop.abstraction.model.vo;

public class Student {
	// 클래스란? 객체의 특성(속성, 기능)에 대한 정의를 작성한 것
	// == 객체를 만들기 위한 설계도
	
	// *** 추상화 : 공통적인 부분을 추출하고, 불필요한 부분을 제거
	
	// 속성 == 값 == 데이터
	// 학생이 가질 수 있는 속성 : 학교명, 학년, 반, 번호, 이름, 돈
	public String schoolName;
	public int grade;
	public int room;
	public int number;
	public String name;
	// int money;
	
	
	// 기능 == 동작 == 행위
	// 학생이 할 수 있는 기능 : 공부하기, 수업듣기
	public void study() {
		System.out.println("오늘도 열공을 합니다.");
	}
	
	public void listeningLessons() {
		System.out.println(grade + "학년의 수업을 듣습니다.");
	}
	
	public void introduce() {
		System.out.printf("저는 %s에 다니는 %d학년 %d반 %d번 %s 입니다.\n", 
							schoolName, grade, room, number, name);

	}
	
	
	
	
	
	
}
