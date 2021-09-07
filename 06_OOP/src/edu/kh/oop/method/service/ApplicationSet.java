package edu.kh.oop.method.service;

// 응용 기능만을 모아둔 클래스
public class ApplicationSet {

	// 제곱 반환 메소드
	public int squared(int num) {
		// 전달 받은 값의 제곱을 리턴
		return num * num;
	}
	
	
	// 배열 생성 및 초기화 메소드
	public int[] createArray(int size) {
		
		// 배열 생성
		int[] arr = new int[size];
		
		// 순서대로 1부터 1씩 증가하는 값으로 초기화
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i + 1;
		}
		
		// 생성된 int[]을 리턴
		return arr;
	}
	
	
	
	
	// 정수 배열을 전달 받아 
	// 각 요소에 저장된 값의 합 리턴하기
	public int arraySum(int[] arr) {
		
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	
	
	
	
	
	
}
