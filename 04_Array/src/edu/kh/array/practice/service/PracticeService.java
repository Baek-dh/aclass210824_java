package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {
	/* 실습문제 1
	길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여 
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 
	짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

	[실행 화면]
	1 2 3 4 5 6 7 8 9
	짝수 번째 인덱스 합 : 25
	*/
	public void practice1() {
		
		// 배열 선언 및 할당
		int[] arr = new int[9];
		
		int sum = 0; // 합계 저장용 변수
		
		// for문을 이용하여 1~9 까지 배열 초기화
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = i + 1;  // 1 ~ 9 까지 대입
			
			System.out.print(arr[i] + " "); // 출력
			
			if( i % 2 == 0  ) { // 짝수 번째 인덱스
				sum += arr[i];
			}
		}

		System.out.println(); // 줄바꿈
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	
	
	
	/*실습문제 2
	길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여 
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 
	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

	[실행 화면]
	9 8 7 6 5 4 3 2 1 
	홀수 번째 인덱스 합 : 20
	 */
	public void practice2() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			
			// 9 ~ 1 대입
			
			/*arr[0] = 9 == arr.length - 0;
			arr[1] = 8 == arr.length - 1;
			arr[2] = 7 == arr.length - 2;
			arr[3] = 6 == arr.length - 3;*/
			
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 1) { // 홀수 번째 인덱스
				sum += arr[i];
			}
			
		}
		
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
		
	}
	
	
	/* 실습문제 3
	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

	[실행 화면]
	양의 정수 : 5
	1 2 3 4 5 
	*/
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	/* 실습문제 4
	정수 5개를 입력 받아 배열을 초기화 하고 
	검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
	배열에 같은 수가 없을 경우 "일치하는 값이 존재하지 않습니다" 출력

	[실행 화면 1]
	입력 0 : 5
	입력 1 : 8
	입력 2 : 9
	입력 3 : 10
	입력 4 : 4
	검색할 값 : 8
	인덱스 : 1
	 */
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0 ; i<arr.length ; i++) {
			// 정수 5개를 입력받아 배열 요소 초기화
			System.out.print("입력" + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		
		boolean flag = true; // 검색 결과가 있고, 없고에 대한 신호로 사용할 변수
		
		for(int i=0 ; i<arr.length ; i++) {
			// 같은 값이 저장된 index 출력
			if(arr[i] == input) { // 같은 값이 있을 경우
				System.out.println("인덱스 : " + i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다");
		}
	}
	
	
	
	/* 실습문제 5
	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

	[실행 화면]
	문자열 : application
	문자 : i
	application에 i가 존재하는 위치(인덱스) : 4 8 
	i 개수 : 2
	 */
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next(); 
		
		// 문자열을 하나하나 뜯어내 저장할 char배열을 생성
		char[] arr = new char[str.length()];
		// str.length() : 입력 받은 문자열의 길이
		
		// 검색할 문자 입력 받기
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) :");
		
		int count = 0; // 검색 결과 개수 카운트
		
		// 문자를 하나하나 배열에 대입
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = str.charAt(i);
			// str.charAt(i) : 입력 받은 문자열의 i번째 문자를 얻어옴
			
			if(arr[i] == ch) { 
				// 입력 받은 문자열에서 얻어온 i번 문자가 검색하려는 문자와 같은 경우
				System.out.print(i + " "); // 현재 인덱스 출력
				count++;
			}
		}
		
		System.out.println(); // 줄바꿈
		System.out.println(ch + "개수 : " + count);
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
