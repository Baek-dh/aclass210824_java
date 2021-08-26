package edu.kh.variable.ex3;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 정수 2개를 입력 받아 각각 변수에 저장한 후
		// +, -, *, / 한 결과값을 출력
		
		// 결과 화면 예시)
		// 정수 입력1 : 10
		// 정수 입력2 : 5
		//
		// 결과
		// 10 + 5 = 15
		// 10 - 5 = 5
		// 10 * 5 = 50
		// 10 / 5 = 2
		
		// 입력 받을 때 문자열 오른쪽에 입력 받는 구문이 작성되게 하려면
		// print()를 사용
		
		System.out.print("정수 입력1 : ");
		int in1 = sc.nextInt();
		
		System.out.print("정수 입력2 : ");
		int in2 = sc.nextInt();
		
		// ctrl + alt + 방향키 위/아래 : 한 줄 복사
		// 만약에 뒤집혔다? 
		// 트레이 아이콘 -> 인텔 그래픽 -> 바로가기 키 -> 사용 안함
		
		System.out.println(); // 문자열을 출력하지 않고 줄만 바꿈
		
		System.out.println("결과");
		
		System.out.printf("%d + %d = %d\n", in1, in2, in1 + in2  );
		System.out.printf("%d - %d = %d\n", in1, in2, in1 - in2  );
		System.out.printf("%d * %d = %d\n", in1, in2, in1 * in2  );
		System.out.printf("%d / %d = %d\n", in1, in2, in1 / in2  );
		
		
		
		
	}
	
	
}
