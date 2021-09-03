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
	배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력

	[실행 화면 1]
	입력 0 : 5
	입력 1 : 8
	입력 2 : 9
	입력 3 : 10
	입력 4 : 4
	검색할 값 : 8
	인덱스 : 1
	
	[실행 화면 2]
	입력 0 : 5
	입력 1 : 8
	입력 2 : 9
	입력 3 : 10
	입력 4 : 4
	검색할 값 : 1
	일치하는 값이 존재하지 않습니다.

	*/
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		// 정수 5개 입력 받기
		for(int i=0; i<arr.length ; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		
		boolean flag = true; // 검색 결과용 신호
		
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] == search) {
				System.out.print("인덱스 : " + i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
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
	
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0); // 입력 받은 문자열 중 제일 제일 앞에 입력된 문자를 얻어와 ch에 대입
		
		// 입력 받은 문자열 길이 만큼의 char 배열 선언 및 할당.
		char[] arr = new char[str.length()];
		// str.length() : 문자열 길이
		
		
		// 일치하는 문자의 개수를 세기 위한 변수 선언
		int count = 0;
		
		// 반복문 수행전 문자열 출력
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		// 문자열에 배열에 넣는 것과 동시에 검색, 카운트 수행
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = str.charAt(i);
			
			if(arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우 
				System.out.print(i + " ");	// 현재 인덱스를 문자열 뒤에 이어서 출력
				count++;	// 그리고 count 1증가
			}
		}
		
		System.out.println();	// 줄바꿈
		System.out.println(ch + "개수 : " + count);
		
	}
	
	
	/* 실습문제 6
	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

	[실행 화면]
	정수 : 5
	배열 0번째 인덱스에 넣을 값 : 4
	배열 1번째 인덱스에 넣을 값 : -4
	배열 2번째 인덱스에 넣을 값 : 3
	배열 3번째 인덱스에 넣을 값 : -3
	배열 4번째 인덱스에 넣을 값 : 2
	4 -4 3 -3 2 
	총 합 : 2
	 */
	public void practice6() {
		// 사용자에게 값을 입력받고 그 값 만큼의 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		//  전체 값 나열 및 총 합 출력
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	
	/* 실습문제 7
	주민등록번호 번호를 입력 받아 char 배열에 저장한 후 출력하세요.
	단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.

	[실행 화면]
	주민등록번호(-포함) : 123456-1234567
	123456-1******
	*/
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			
			if(i <= 7) { // 7번 인덱스 이하까지는
				arr[i] = str.charAt(i);
			}else { // 그 이후부터는 *값 들어가도록
				arr[i] = '*';
			}
			
			System.out.print(arr[i]);
		}
	}
	
	
	
	
	
	
	
}
