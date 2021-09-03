package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.Student;

public class AbstractionService {

	
	public void example1() {
		
		// 학생 객체를 만들어서 학교명, 학년, 반, 번호, 이름을 입력하고
		// 출력 + 기능 수행
		
		Student std =  new Student(); // 객체 생성
		// 참조변수 std
		
		// -> Heap 영역에 Student 객체를 새로 생성하고 
		//    이 객체를 참조할 수 있도록 
		//    객체 시작 주소를 std 변수에 저장
		
		std.schoolName = "KH고등학교";
		std.grade = 3;
		std.room = 5;
		std.number = 10;
		std.name = "홍길동";
		
		// -> new Student() 구문으로 추상화된 객체를 만들고
		//    객체에 속성을 대입해서 구체화시킴.
		// (추상화 <-> 구체화)
		
		System.out.println( "이름 : " + std.name );
		System.out.println( "학년 : " + std.grade );
		
		
		// 저는 KH고등학교에 다니는 3학년 5반 10번 홍길동 입니다.
		System.out.printf("저는 %s에 다니는 %d학년 %d반 %d번 %s 입니다.\n", 
						std.schoolName, std.grade, std.room, std.number, std.name);
		
		
		// 또 다른 학생 생성
		Student std2 = new Student();
		
		std2.schoolName = "KH고등학교";
		std2.grade = 1;
		std2.room = 2;
		std2.number = 3;
		std2.name = "김영희";
		
		System.out.printf("저는 %s에 다니는 %d학년 %d반 %d번 %s 입니다.\n", 
				std2.schoolName, std2.grade, std2.room, std2.number, std2.name);


		std.study();
		std2.study();
		
		std.listeningLessons();
		std2.listeningLessons();
		
		std.introduce();
		std2.introduce();
		
		
	}
	
	
}
