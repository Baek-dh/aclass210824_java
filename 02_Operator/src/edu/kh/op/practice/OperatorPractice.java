package edu.kh.op.practice;

import java.util.Scanner;

// 기능 제공용 클래스
public class OperatorPractice {
	/* 실습 문제3
	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	[실행화면]
	국어 : 60
	영어 : 80
	수학 : 40
	합계 : 180
	평균 : 60.0
	*/
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println(); // 줄바꿈
		
		int sum = kor + eng + math; // 점수 합계
		System.out.println("합계 : " + sum);
		
		double avg = sum / 3.0; // 평균
		System.out.printf("평균 : %.1f \n", avg);
		
	}
	
	
	/* 실습 문제5
	나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
	성인(19세 초과)인지 출력하세요.
	ex.
	나이 : 19
	
	청소년
	*/
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 삼항 연산자(중첩)
		
		// age <= 13 : 어린이
		// 13 < age <= 19  : 청소년
		// age > 19 : 성인
		
		//String result = age <= 13 ?  "어린이" : ( age > 19 ? "성인" : "청소년" ); 
		
		String result =  age > 13 && age <= 19 ? "청소년" : (age <=13 ) ? "어린이" : "성인";
		//  13 < age <= 19  
		// -> age가 13초과 이면서 19이하인 경우
		
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
}
