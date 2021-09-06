package edu.kh.array.practice.service;

import java.util.Arrays;
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
	
	
	/* 실습문제 8
	3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
	다시 정수를 받도록 하세요.
	[실행 화면]
	정수 : 4
	다시 입력하세요.
	정수 : -6
	다시 입력하세요.
	정수 : 5
	1, 2, 3, 2, 1
	*/
	public void practice8() {
		// 1. 사용자에게 3이상의 정수값을 입력받자
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) { // 3이상이거나 홀수인 경우 (즉, 잘 입력한 경우)
				
				// 사용자가 입력한 정수 크기 만큼의 배열 만듦
				int[] arr = new int[num];
				
				// 값을 출력용 변수 --> 오름차순일 경우 1씩 증가, 내림차순일 경우 1씩 감소
				int count = 0;
				
				// 값 넣기
				for(int i=0; i<arr.length; i++) {
					
					if(i <= arr.length / 2) { // 배열의 중간까지는 증가
						count++;
					}else { // 중간 이후부터 감소
						count--;
					}
					
					arr[i] = count;
					
					System.out.print(arr[i]);
					
					if(i < arr.length-1) {
						System.out.print(", ");
					}
				}
				
				break; // 제대로 실행 하고 무한 반복문 빠져나가기
				
			}else { // 잘못 입력한 경우
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	/* 실습문제 9
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
	[실행 화면]
	발생한 난수 : 9 7 6 2 5 10 7 2 9 6 
	*/
	public void practice9() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화한 후 출력
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}	
	
	
	/* 실습문제 10
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	1~10 사이의 난수를 발생시켜 배열에 초기화 후
	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	[실행 화면]
	발생한 난수 : 5 3 2 7 4 8 6 10 9 10
	최대값 : 10
	최소값 : 2
	*/
	public void practice10() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 최대값/최소값을 저장하기 위한 변수 선언 및 초기화
		int max = 1;  // 최소값을 담아줄 변수 , 1은 난수에서 발생할 수 있는 제일 작은 값
		int min = 10; // 최대값을 담아줄 변수 , 10은 난수에서 발생할 수 있는 제일 큰 값
		
		// 3. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화 후 출력
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
			
			// 4. 최대, 최소값 검사
			if(arr[i] > max) { // 해당 인덱스의 값이 max 보다 큰 경우
				max = arr[i]; // 해당 값을 max 변수에 담아줌
			}
			
			if(arr[i] < min) { // 해당 인덱스의  값이 min 보다 작은 경우
				min = arr[i]; // 해당 값을 min 변수에 담아줌
			}
		}
		
		System.out.println(); // 개행
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
				
	}	
	
	
	/* 실습문제 11
	10개의 값을 저장할 수  있는 정수형 배열을 선언 및 할당하고
	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
	[실행 화면]
	4 1 3 6 9 5 8 10 7 2 
	*/
	public void practice11() {
	
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스 값에 1부터 10 사이의 난수를 발생시키는데 이때 중복이 없도록
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<i; j++) { // 중복 제거
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	/* 실습문제 12
	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
	[실행 화면]
	3 4 15 17 28 40 
	*/
	public void practice12() {
		
		// 1. 크기가 6인 정수형 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 2. 배열에 중복값없이 1부터 45사이의 난수 초기화
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) { // 중복 제거
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 오름차순 정렬
		Arrays.sort(lotto);
		
		// 4. 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	
	/* 실습문제 13
	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	문자의 개수와 함께 출력하세요.
	[실행 화면]
	문자열 : application
	문자열에 있는 문자 : a, p, l, i, c, t, o, n
	문자 개수 : 8
	*/
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		int count = 0; // 문자 개수 카운트
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = str.charAt(i);
			
			boolean flag = true; // 중복 체크용 flag
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					flag = false; // 중복이발생했을 때
					break;
				}
			}
			
			if(flag) { // 중복이 발생하지 않았을 경우
				
				if(i == 0) {
					System.out.print(arr[i]);					
				}else {
					System.out.print(", " + arr[i]);					
				}
				
				count++;
			}
			
		}
		
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
		
	}	
	
	
	/* 실습문제 14
	사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
	배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
	늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
	*/
	
	/*
	 * Scanner 사용 시 문제점
	 * 
	 * 스캐너 입력 시 입력 버퍼라는 곳에 문자가 임시 저장된 후 읽어옴.
	 * 
	 * ex) //  입력버퍼 :  123\n
	 * next(), nextInt(), nextDouble() 등 ...
	 * -> 띄어쓰기 또는 엔터 전 까지 읽어들임
	 * -> 123  (입력 버퍼에 \n 가 남아있음)
	 * 
	 * nextLine()
	 * -> 엔터 까지 읽어들임
	 * -> 123\n
	 * 
	 * ex) 입력버퍼 : 100\n
	 * nextInt();  // 100 (\n남음) 
	 * nextLine(); // \n
	 * 
	 * *** 해결 방법 : 입력 버퍼에 남아있는 \n을 제거
	 * -> 제거 방법 :  next(), nextInt(), nextDouble() 등
	 * 				수행 후 바로 아랫줄에 nextLine()을 한번 작성한다.
	 * 
	 */
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남아있는 개행문자 제거

		String[] arr = new String[size]; // 3
		
		int idx = 0; // 값이 저장되는 배열의 현재 인덱스를 저장할 변수
		while(true) {
		
			// idx == 3
			for(int i=idx ; i<arr.length ; i++) { // 3~4   
				System.out.print(i + 1 + "번째 문자열 : ");
				arr[i] = sc.nextLine(); 
			}
			
			idx = arr.length; // 5
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char confirm = sc.nextLine().charAt(0);
			
			if(confirm == 'y' || confirm == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거
				
				// 배열의 깊은복사 + 얕은복사
				String[] copyArr = new String[arr.length + addSize]; // 기존배열 + 추가 크기만큼의 배열 생성
				
				System.arraycopy(arr, 0, copyArr, 0, arr.length);
				// -> arr 배열의 내용이 copyArr로 깊은 복사
				
				arr = copyArr; // 얕은 복사 
				// -> arr 참조하고 있던 기존 배열 대신 
				// 깊은 복사로 크기가 늘어난 배열을 참조 
				
			}else { //  confirm == 'n' || confirm == 'N'
				break;
			}
		}
		
		System.out.println( Arrays.toString(arr));
		
	}	
	
	/*
	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	문자의 개수와 함께 출력하세요.
	[실행 화면]
	문자열 : application
	문자열에 있는 문자 : a, p, l, i, c, t, o, n
	문자 개수 : 8
	 */
	
	public void practice13b() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		// 입력 받은 문자열 길이 만큼의 char 배열 생성
		char[] arr = new char[str.length()];
		
		int count = 0; // 문자열에 포함된 문자 개수를 세기 위한 변수
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = str.charAt(i); // 문자열의 문자를 char 배열에 저장
			
			boolean flag = true; // 중복이 되었는지 안되었는지를 알려줄 신호
			
			// 중복 검사
			for(int j=0 ; j<i ; j++) {
				if(arr[i] == arr[j]) { // 앞서 중복된 문자가 있을 경우
					flag = false;
					break;
				}
			}
			
			if(flag) { // 중복되지 않은 경우
				
				if(i == 0) { // 제일 앞글자
					System.out.print( arr[i] );
				}else {
					
					System.out.print( ", " + arr[i] );
				}
				
				count++; // 문자 개수 1 증가
			}
		}
		
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
	}
	
	/* 실습문제 14
	사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
	배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
	늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
	*/
	
	/* Scanner 사용 시 문제점
	 * 
	 * - 스캐너 등 키보드 입력 시 입력 버퍼라는 곳에 임시 저장된 후 
	 *   저장된 내용중 다음 정수, 실수, 단어, 문자열을 읽어옴.
	 * 				nextInt()
	 * 
	 * ex) 입력 버퍼 1 2 3 \n H e l l o \n
	 * 
	 * nextInt() -> 입력 버퍼에서 다음 정수를 얻어옴. (띄어쓰기 또는 개행문자 전 까지)
	 * 			 -> nextInt() == 123
	 * 				남은 입력 버퍼 : \n H e l l o \n
	 * 
	 * nextInt() 이후 nextLine()
	 * 			 -> 입력 버퍼에서 다음 문자열을 읽어옴. (다음으로 만나는 첫 개행 문자(포함) 까지)
	 * 			 -> nextLine() == \n
	 * 			    남은 입력 버퍼 : H e l l o \n
	 * 
	 * **** 이 문제를 해결하는 방법!
	 * 문제점 : next(), nextInt() 사용 후 
	 *        입력 버퍼 제일 앞에 \n이 남아있다
	 *        그래서 다음 nextLine() 시 제일 앞에 남아있는 \n을 읽어와
	 *        빈칸을 읽어오는 불상사가 발생함
	 *       
	 * 해결 방법 :  next(), nextInt()  구문 뒤에 
	 * 		      의미 없는 nextLine()을 한 번 작성하여   
	 * 			  입력 버퍼에 남은 \n을 제거
	 * 
	 * */
	
	
	public void practice14b() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남아있는 개행문자 제거
		
		String[] arr = new String[size];
		
		int index = 0; // 문자열을 입력 받고 나서 값이 저장된 마지막 인덱스 + 1 을 저장
					   // 배열의 길이가 증가된 후 시작 인덱스로 사용
		while(true) {
				
			for(int i=index ; i<arr.length ; i++) {
				System.out.print( i+1 + "번째 문자열 : ");
				arr[i] = sc.nextLine(); // -> 다음 입력된 문자열 중 엔터까지 읽어온다.
				// next(), nextDouble(), nextInt() 등등
				// -> 다음 입력된 단어,정수,실수를 읽어옴. (띄어쓰기 또는 엔터 이전까지 읽어옴)
			}
			
			index = arr.length; 
			
			
			System.out.println("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'Y' || ch == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거
				
				// 배열의 크기를 늘린 후 추가 입력
				// -> 한 번 만들어진 배열은 크기를 늘릴 수 없다
				// --> 더 큰 배열을 만들 기본 배열 내용을 깊은 복사
				String[] copyArr = new String[arr.length + addSize];
				
				System.arraycopy(arr, 0, copyArr, 0, arr.length); // 깊은 복사
				
				// 얕은 복사
				arr = copyArr;
				
			} else if(ch == 'N' || ch == 'n') {
				break; // while문 break
				
			} else {
				// 다시 입력 받는 동작
			}
			
		} // while end
		
		// 결과 출력
		System.out.println( Arrays.toString(arr) );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
