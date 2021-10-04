package edu.kh.collection.model.service;

import edu.kh.collection.model.vo.Student;

public class ArrayService {
	/* 배열
	 * - 한 가지 자료형의 변수 여러 개를 묶어 다루는 것.
	 * - 한 번 지정된 크기를 변경할 수 없다.
	 * */
	
	// Student 객체 배열
	private Student[] stdList = new Student[3];
								// Student 객체 참조 변수 3개 생성

	
	private int index = 0; // add() 메소드 호출 시 추가할 index를 지정하는 변수
	
	
	// 매개변수로 전달 받은 Student 객체 주소를 stdList에 순서대로 추가
	public boolean add(Student std) {
		
		// 배열 길이 증가 코드 추가
		// == 새로운 더 큰 배열을 만들어 깊은 복사 후 
		//    stdList로 얕은 복사
		
		// 배열이 꽉 찼을 때 배열 길이를 2배 증가
		if(index == stdList.length) {
			
			// 1) 두배 큰 배열 생성
			Student[] newList = new Student[stdList.length * 2];
			
			// 2) 깊은 복사(데이터 자체를 복사 == 복제)
			System.arraycopy(stdList, 0, newList, 0, stdList.length);
			
			// 3) 얕은 복사(주소만 복사)
			stdList = newList; // stdList 참조 변수가 증가한 배열을 참조
		}
		
		
		stdList[index] = std;
		index++;
		
		return true;
	}
	
	
	// stdList에 저장된 객체 정보를 모두 반환
	@Override
	public String toString() {
		
		String str = "";
		
		for(int i=0 ; i<index ; i++) {
			str += stdList[i].toString() + ", ";
		}
		
		return str;
	}
	
	
	
	
	
}



