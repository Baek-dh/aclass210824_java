package edu.kh.control.condition.practice.service;

import java.util.Scanner;

public class PracticeService {
	
	/* 실습문제1
	아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면  "OO메뉴입니다"를,
	종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요. (OO은 해당 메뉴명)

	[실행 화면]
	1. 입력
	2. 수정
	3. 조회
	4. 삭제
	7. 종료
	메뉴 번호를 입력하세요 : 3
	조회 메뉴입니다.
	*/
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		int input = sc.nextInt();
		
		
		switch (input) {
		case 1: System.out.println("입력 메뉴입니다."); break;
		case 2: System.out.println("수정 메뉴입니다."); break;
		case 3: System.out.println("조회 메뉴입니다."); break;
		case 4: System.out.println("삭제 메뉴입니다."); break;
		case 7: System.out.println("프로그램을 종료합니다."); break;
		default: System.out.println("잘못 입력하셨습니다."); 
		}
		
	}
	
	
	/* 실습문제2
	키보드로 입력 받은 정수가 양수이면서 짝수일 때만 "짝수입니다."를 출력하고
	짝수가 아니면 "홀수입니다."를 출력하세요.
	양수가 아니면 "양수만 입력해주세요."를 출력하세요.

	[실행 화면 1]
	숫자를 한 개 입력하세요 : 8
	짝수입니다.

	[실행 화면 2]
	숫자를 한 개 입력하세요 : 17
	홀수입니다.
	
	[실행 화면 3]
	숫자를 한 개 입력하세요 : -3
	양수만 입력해주세요.
	 */
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		if(input > 0) {
			if(input % 2 == 0) {
				result = "짝수입니다.";
			}else {
				result = "홀수입니다.";
			}
			
		}else {
			result = "양수만 입력해주세요.";
		}
		
		System.out.println(result);
		
	}

	/* 실습문제3
	국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
	합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
	(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

	합격 했을 경우 과목 별 점수와 합계, 평균, "축하합니다, 합격입니다!"를 출력하고
	불합격인 경우에는 "불합격입니다."를 출력하세요.

	[실행화면 1]		[실행화면 2]
	국어점수 : 88		국어점수 : 88
	수학점수 : 50		수학점수 : 50
	영어점수 : 40		영어점수 : 45
	불합격입니다.		국어 : 88
					수학 : 50
					영어 : 45
					합계 : 183
					평균 : 61.0
					축하합니다, 합격입니다!

	 */
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(kor < 40 || math < 40 || eng < 40 || avg < 60.0){
			System.out.println("불합격입니다.");
		}else {
			System.out.println("국어 : " + kor );
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f\n축하합니다, 합격입니다!\n", avg );
			
		}
		
	}
	
	/* 실습문제4
	1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
	잘못 입력한 경우 "OO월은 잘못 입력된 달입니다."를 출력하세요. (switch문 사용)
	
	[실행화면 1]
	1~12 사이의 정수 입력 : 8
	8월은 31일까지 있습니다.
	
	[실행화면 2] 
	1~12 사이의 정수 입력 : 99
	99월은 잘못 입력된 달입니다.
	*/
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		case 2 :
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
	}
	
	/* 실습문제5
	키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 
	저체중/정상체중/과체중/비만을 출력하세요.

	BMI = 몸무게 / (키(m) * 키(m))
	BMI가 18.5미만일 경우 저체중  /  18.5이상 23미만일 경우 정상체중
	BMI가 23이상 25미만일 경우 과체중  /  25이상 30미만일 경우 비만
	BMI가 30이상일 경우 고도 비만

	[실행 화면]
	키(m)를 입력해 주세요 : 1.65
	몸무게(kg)를 입력해 주세요 : 58.4
	BMI 지수 : 21.45087235996327
	정상체중
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		if(bmi < 18.5) {
			result = "저체중";
		}else if(bmi < 23) {
			result = "정상체중";
		}else if(bmi < 25) {
			result = "과중";
		}else if(bmi < 30) {
			result = "비만";
		}else {
			result = "고도비만";
		}
		
		System.out.println("BMI지수 : " + bmi);
		System.out.println(result);
		
		
	}
	
	/* 실습문제6
	중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
	평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
	이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요. 
	70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.

	[실행 화면 1]
	중간 고사 점수 : 80
	기말 고사 점수 : 30
	과제  점수 : 60
	출석 횟수 : 18
	================= 결과 =================
	중간 고사 점수(20) : 16.0
	기말 고사 점수(30) : 9.0
	과제 점수       (30) : 18.0
	출석 점수       (20) : 18.0
	총점 : 61.0
	Fail [점수 미달]

	[실행 화면 2]
	중간 고사 점수 : 80
	기말 고사 점수 : 90
	과제  점수 : 50
	출석 횟수 : 15
	================= 결과 =================
	중간 고사 점수(20) : 16.0
	기말 고사 점수(30) : 27.0
	과제 점수       (30) : 15.0
	출석 점수       (20) : 15.0
	총점 : 73.0
	PASS
	
	[실행 화면 3]
	중간 고사 점수 : 100
	기말 고사 점수 : 80
	과제  점수 : 40
	출석 횟수 : 10
	================= 결과 =================
	Fail [출석 횟수 부족 (10/20)]
	*/
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midTermExam = sc.nextInt() * 0.2;
		
		System.out.print("기말 고사 점수 : ");
		double finalExam = sc.nextInt() * 0.3;
		
		System.out.print("과제 점수 : ");
		double homework = sc.nextInt() * 0.3;
		
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextInt(); // 자동 형변환
		
		// 출석 횟수가 14회 이하(결석 6회 이상)인 경우 
		if( attendance <= 20 - (20 * 0.3) ) {
			System.out.println("Fail [출석 횟수 부족 (" + (int)attendance  + "/20)]");
		
		}else {
			
			// 합계
			double sum = midTermExam + finalExam + homework + attendance;
			
			System.out.printf("중간 고사 점수(20) : %.1f\n", midTermExam);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalExam);
			System.out.printf("과제 점수(30) : %.1f\n", homework);
			System.out.printf("출석 점수(20) : %.1f\n", attendance);
			System.out.printf("총점 : %.1f\n", sum);
			
			if(sum >= 70.0) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [점수 미달]");
			}
		}

	}
	
	/* 실습문제7
	키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.

	단, 두 개의 정수 모두 0보다 크거나 같을 때만 작동하며 
	음수가 포함된 경우 "피연산자는 0보다 크거나 같은 수만 입력해주세요." 출력
	잘못된 연산 기호를 입력 했을 시 "잘못 입력하셨습니다." 출력
	피연산자1을 0으로 나눌 경우(/ 또는 %) "0으로 나눌 수 없습니다 출력＂

	[실행 화면 1]
	피연산자1 입력 : 15
	연산자 입력(+,-,*,/,%) : /
	피연산자2 입력 : 4
	15 / 4 = 3.750000
	
	[실행 화면 2]
	피연산자1 입력 : 15
	연산자 입력(+,-,*,/,%) : !
	잘못 입력하셨습니다.

	[실행 화면 3]
	피연산자1 입력 : 0
	연산자 입력(+,-,*,/,%) : / 
	0은 나눌 수 없습니다.
	 */
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char op = sc.next().charAt(0);
		
		// 피연산자가 0 이면서 연산자가 /인 경우
		if(num1 == 0  &&  op == '/') {
			System.out.println("0은 나눌 수 없습니다.");
		
		}else {
			
			double result = 0.0;
			
			int flag = 1; // flag를 boolean이 아닌 int로 선언하여
			// true/false 두 가지로 표현될 수 있는 신호를
			// 1,2,3 ... 같은 숫자로 더 많이 표현할 수 있도록 함
			
			int num2 = 0;
			
			// 연산자가 잘못 입력되었는지 확인
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				
				System.out.print("피연산자2 : ");
				num2 = sc.nextInt();
				
				// 피연산자가 음수인 경우
				if(num1 < 0 || num2 < 0) {
					// "피연산자는 0보다 크거나 같은 수만 입력해주세요." 
					// flag == 4
					flag = 4;
					
				}else {
					switch(op) { // 연산자에 따른 결과 계산
					case '+' : result = num1 + num2; break;
					case '-' : result = num1 - num2; break;
					case '*' : result = num1 * num2; break;
					case '/' : 
						if(num2 != 0) {
							result = num1 / num2; 
						}else {
							flag = 2;
						}
						break;
						
					case '%' : 
						if(num2 != 0) {
							result = num1 % num2; 
						}else {
							flag = 2;
						}
						break;
					} // switch end
					
				} // else end
				
			} else { //연산자를 잘못 입력한 경우
				flag = 3;
			}
			
			
			if(flag == 2) {
				System.out.println("0으로 나눌 수 없습니다");
				
			}else if(flag == 3) {
				System.out.println("잘못 입력하셨습니다.");
				
			}else if(flag == 4) {
				System.out.println("피연산자는 0보다 크거나 같은 수만 입력해주세요.");
				
			}else {
				System.out.printf("%d %c %d = %f\n",num1, op, num2, result);
			}
		}
	}
}
