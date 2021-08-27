package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionService {

	// 제어문
	// - 프로그램의 흐름을 바꾸는(제어하는) 역할을 하는 코드
	
	// 조건문
	// - 제어문 중 하나로 조건에 따라 다른 문장(코드)이 실행되도록 하는 코드
	
	// if문
	// - 조건식이 true 일때만 내부에 작성된 코드를 수행
	
	// if(조건식){
	//		수행할 코드
	// }

	public void example1() {
		// 키보드로 정수를 하나 입력 받아
		// 양수일 경우 : "양수 입니다"
		// 양수가 아닐 경우 : "양수가 아닙니다"
		// if문 가지고 코드 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		
		int input = sc.nextInt();
		
		if( input > 0 ) {
			// 입력 받은 값이 0 보다 클 경우
			System.out.println("양수 입니다.");
		}
		
		
		if( input <= 0 ) {
			// 입력 받은 값이 0보다 작거나 같을 경우
			System.out.println("양수가 아닙니다.");
		}
		
	}
	
	
	// if - else
	// - 조건식이 true일 경우 if문, false인 경우 else문 내부 코드를 수행
	/* 
	 * if(조건식) {
	 * 		조건식이 true일 경우 수행할 코드
	 * 
	 * } else {
	 * 		조건식이 false일 경우 수행할 코드
	 * }
	 * 
	 * */
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		if( input > 0 ) {
			System.out.println("양수 입니다.");
			
		} else {
			
			System.out.println("양수가 아닙니다.");
		}
		
	}
	
	
	// if - else if - else 예제
	public void example3() {
		
		// 정수를 하나 입력 받아
		// 양수일 경우 : "양수 입니다."
		// 음수일 경우 : "음수 입니다."
		// 0일 경우   : "0 입니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		
		String result; // 결과 저장용 변수 선언
		
		if( input > 0 ) { // 만약
			result = "양수";
			
		} else if( input < 0) { // 앞에 조건을 만족하지 않으면 다른 조건
			result = "음수";
			
		} else { // 앞선 조건들이 모두 만족되지 않을 경우
			result = "0";
			
		}
		
		System.out.println(result + " 입니다.");
		
	}
	
	
	public void example4() {
		
		// 나이를 입력 받아
		// 13세 이하 : "어린이 입니다"
		// 13세 초과 19세 이하 : "청소년 입니다"
		// 19세 초과 : "성인 입니다."
		
		// if - else if - else
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age <= 13) { // 어린이
			result = "어린이";
			
		}else if(age > 19) { // 성인
			result = "성인";
			
		}else { // 청소년
			result = "청소년";
			
		}
		
		System.out.println(result + " 입니다.");
		
	}
	
	
	public void example5() {
		
		// 달(월)을 하나 입력 받아
		// 입력 받은 달이 
		// 3,4,5   이면 "봄"
		// 6,7,8   이면 "여름"
		// 9,10,11 이면 "가을"
		// 12,1,2  이면 "겨울"
		// 1~12 사이 숫자가 아니면 "잘못 입력하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result; // 결과 저장용 변수 선언
		
		if( month >= 3 && month <= 5  ) { // 3~5 사이
			result = "봄";
			
		}else if( month >= 6 && month <= 8 ) {
			result = "여름";
			
		}else if( month >= 9 && month <= 11 ) {
			result = "가을";
			
		}else if( month == 12 || month == 1 || month == 2 ) {
			result = "겨울";
			
		}else {
			result = "잘못 입력하셨습니다.";
			//System.out.println("잘못 입력하셨습니다.");
			
			// (참고!) 지역변수는 반드시 초기화 되어야 한다!
		}
		
		System.out.println(result);
	}
	
	public void example6() {
		
		// 점수를 입력 받아
		// 90점 이상일 경우 : A
		// 80점 이상, 90점 미만일 경우 : B
		// 70점 이상, 80점 미만일 경우 : C
		// 60점 이상, 70점 미만일 경우 : D
		// 60점 미만인 경우 : F
		// 100점 초과 0점 미만인 경우 : 잘못 입력하셨습니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		String result;
		
		if( score > 100  ||	  score < 0) { // 100점 초과 0점 미만
			result = "잘못 입력하셨습니다.";
			
		} else if( score >= 90 ) { // 90점 이상, 100점 이하
			result = "A";
			
		} else if( score >= 80 ) { // 80점 이상, 90점 미만
			result = "B";
			
		} else if( score >= 70 ) { // 70점 이상, 80점 미만
			result = "C";
			
		} else if( score >= 60 ) { // 60점 이상, 70점 미만
			result = "D";
			
		} else { // 0점 이상, 60점 미만
			result = "F";
		}
		
		System.out.println(result);
		
	}
	
	
	// 중접 if문 예제
	public void example7() {
		
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력하셨습니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("키 입력(cm) : ");
		double height = sc.nextDouble();
		
		String result;
		
		// 0세 미만, 100세 초과
		if( age < 0  ||  age > 100 ) {
			result = "잘못 입력하셨습니다.";
		
		} else { // 0세 이상, 100세 이하
			
			if(age < 12) { // 12세 미만
				result = "적정 연령이 아닙니다.";
			
			}else { // 12세 이상
				
				if(height < 140.0) { // 키 140.0cm 미만
					result = "적정 키가 아닙니다.";
				
				}else { // 12세 이상, 키 140.0cm 이상
					result = "탑승 가능";
				}
			}
		}
		
		System.out.println(result);
	}
	
	
	// 놀이기구 탑승 제한 검사 프로그램
	// 조건 - 나이 : 12세 이상
	//     -  키 : 140.0cm 이상
	
	// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
	// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
	// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
	
	// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
	// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
	// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
	// 나이 O , 키 O : "탑승 가능"
	
	public void example8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		if( age < 0 || age > 100 ) {
			result = "나이를 잘못 입력 하셨습니다.";
			
		}else { // 나이를 0~100 사이를 입력한 경우
			System.out.print("키 입력(cm) : ");
			double height = sc.nextDouble();
	
			if( height < 0 || height > 250.0 ) {
				result = "키를 잘못 입력 하셨습니다.";
			
			} else { // 키, 나이를 정상 범위로 입력한 경우
				
				// 1) 중첩 if문을 이용한 방법
				if( age < 12 ) { // 나이가 적절치 않은 경우
					
					if( height >= 140.0 ) {
						result = "키는 적절하나, 나이가 적절치 않음";
					}else {
						result = "나이와 키 모두 적절치 않음";
					}
					
				} else { // 나이가 적절한 경우
					
					if( height >= 140.0 ) {
						result = "탑승 가능";
					}else {
						result = "나이는 적절하나, 키가 적절치 않음";
					}
				}
				
				
				// 2) if - else if - else 를 이용한 방법
				
				/*if( age >= 12 && height >= 140.0 ) {
					result = "탑승 가능";
				
				} else if( age >= 12 && height < 140.0 ) {
					result = "나이는 적절하나, 키가 적절치 않음";
					
				} else if( age < 12 && height >= 140.0 ) {
					result = "키는 적절하나, 나이가 적절치 않음";
					
				} else {
					result = "나이와 키 모두 적절치 않음";
					
				}*/
			}
		}
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
}
