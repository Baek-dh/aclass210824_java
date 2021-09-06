package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {

	/*실습문제 1 
	 3행 3열짜리 문자열 배열을 선언 및 할당하고
	 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은
	 형식으로 저장 후 출력하세요. 
	 ex. 
	 (0, 0)(0, 1)(0, 2) 
	 (1, 0)(1, 1)(1, 2) 
	 (2, 0)(2, 1)(2, 2)
	 
	 */
	public void practice1() {
		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

	/* 실습문제 2 
	 4행 4열짜리 정수형 배열을 선언 및 할당하고 
	 1) 1 ~ 16까지 값을 차례대로 저장하세요. 
	 2) 저장된 값들을 차례대로 출력하세요.
	 
	 ex. 
		 1  2  3  4 
		 5  6  7  8 
		 9 10 11 12 
		13 14 15 16 
	 */
	public void practice2() {
		int[][] arr = new int[4][4];

		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

	}

	/*
	 * 실습문제 3 
	 * 4행 4열짜리 정수형 배열을 선언 및 할당하고 
	 * 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요. 
	 * 2) 저장된 값들을 차례대로
	 * 출력하세요.
	 * 
	 * ex. 
	 * 16 15 14 13 
	 * 12 11 10 9 
	 * 8 7 6 5 
	 * 4 3 2 1
	 */
	public void practice3() {
		int[][] arr = new int[4][4];

		int value = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

	}

	/* 실습문제 4
	4행 4열 2차원 배열을 생성하여
	0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
	아래의 내용처럼 처리하세요.
	*/
	// 실습문제 4번 코드 변형
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		// 상수 사용 방법 == 변하지 않는 특정 값의 이름을 붙여주는 용도
		final int ROW_LAST_INDEX = arr.length - 1;
		final int COL_LAST_INDEX = arr[0].length - 1;
		
		// arr이 참조 하고있는 2차원 배열의 요소를
		// 모두 순차적으로 접근하여
		// 난수 대입, 행의 합, 열의 합, 총 합, 출력까지 한 번에 수행
		for(int row=0 ; row<arr.length ; row++) {
			for(int col=0 ; col<arr[row].length ; col++) {
				
				// 마지막 행, 열이 아닌 경우에만 난수 대입
				if( row != ROW_LAST_INDEX && col != COL_LAST_INDEX ) {
					
					arr[row][col] = (int)(Math.random() * 10 + 1); // 난수 대입
					
					// 각 행의 마지막 열에 난수를 누적
					arr[row][COL_LAST_INDEX] += arr[row][col];
					
					// 각 열의 마지막 행에 난수를 누적
					arr[ROW_LAST_INDEX][col] += arr[row][col];
					
					// 생성된 난수를 4행 4열에 누적
					arr[ROW_LAST_INDEX][COL_LAST_INDEX] += arr[row][col];
				}
				
				System.out.printf("%4d", arr[row][col]); // 출력
			}
			System.out.println(); // 줄바꿈
		}
		
	}

	
	/* 실습문제 5 
	 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 
	 * 1~10사이 숫자가 아니면 “반드시 1~10 사이의 정수를 입력해야 합니다.” 
	 * 출력 후 다시 정수를 받게 하세요. 
	 * 크기가 정해진 이차원 배열 안에는 
	 * 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
	 * (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
	 */
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("행 크기 : ");
			int rowSize = sc.nextInt();
			if(rowSize < 1 || rowSize > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			System.out.print("열 크기 : ");
			int colSize = sc.nextInt();
			if(colSize < 1 || colSize > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			// 배열 생성 + 난수 대입 + 출력
			char[][] arr = new char[rowSize][colSize];
			
			for(int row=0; row<arr.length ; row++) {
				for(int col=0 ; col<arr[row].length ; col++) {
					
					// 'A' ~ 'Z'
					// 65  ~ 90 난수
					arr[row][col] = (char) ((int)(Math.random() * 26 + 65)) ;
										// 65 <= random < 91
					
					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
			}
			
			break;
		}
		
	}

	/*실습문제6
	사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
	문자형 가변 배열을 선언 및 할당하세요.
	그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.

	[실행 화면]
	행의 크기 : 4
	0열의 크기 : 2
	1열의 크기 : 6
	2열의 크기 : 3
	3열의 크기 : 5
	a b
	c d e f g h
	i j k
	l m n o p
	*/
	
	public void practice6() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int rowSize = sc.nextInt();
		
		char[][] arr = new char[rowSize][]; // 가변 배열
		
		// 2차원 가변 배열 선언 및 할당 
		for(int row=0 ; row<arr.length ; row++) {
			
			System.out.print(row + "행의 열의 개수 : ");
			int colSize = sc.nextInt();
			
			arr[row] = new char[colSize];
		}
	
		// 2차원 가변 배열에 'a'부터 차례대로 배열 요소를 초기화 + 출력
		char value = 'a';
		for(int row=0 ; row<arr.length ; row++) {
			
			for(int col=0 ; col<arr[row].length ; col++) {
				
				arr[row][col] = value++; // 배열에 알파벳 대입 후 다음 알파벳으로 변경
				
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	/*실습문제7
	1차원 문자열 배열에 학생 이름 초기화되어 있다.
	3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
	학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
	(첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
	String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
	"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
	[실행 화면]
	== 1분단 ==
	강건강 남나나
	도대담 류라라
	문미미 박보배
	== 2분단 ==
	송성실 윤예의
	진재주 차천축
	피풍표 홍하하
	*/
	public void practice7() {
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int index = 0;
		// 1분단이 끝나고 2분단이 시작될 때도 이어서 들어가야하기 때문에
		// 학생을 이어서 셀 수 있도록 index 변수 생성

		// 1분단 학생 대입
		System.out.println("== 1분단 ==");
		for (int i = 0; i < seat1.length; i++) {
			
			for (int j = 0; j < seat1[i].length; j++) {
				
				seat1[i][j] = students[index++];
				
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		// 2분단 학생 대입
		System.out.println("== 2분단 ==");
		for (int i = 0; i < seat2.length; i++) {
			
			for (int j = 0; j < seat2[i].length; j++) {
				
				seat2[i][j] = students[index++];
				
				System.out.print(seat2[i][j] + " ");
			}
			
			System.out.println();
		}

	}	
	
	/* 실습문제8
	위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
	해당 학생이 어느 자리에 앉았는지 출력하세요.
	[실행 화면]
	== 1분단 ==
	강건강 남나나
	도대담 류라라
	문미미 박보배
	== 2분단 ==
	송성실 윤예의
	진재주 차천축
	피풍표 홍하하
	============================
	검색할 학생 이름을 입력하세요 : 차천축
	검색하신 차천축 학생은 2분단 2번째 줄 오른쪽에 있습니다
	*/
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int index = 0;
		// 1분단이 끝나고 2분단이 시작될 때도 이어서 들어가야하기 때문에
		// 학생을 이어서 셀 수 있도록 index 변수 생성

		// 1분단 학생 대입
		System.out.println("== 1분단 ==");
		for (int i = 0; i < seat1.length; i++) {
			
			for (int j = 0; j < seat1[i].length; j++) {
				
				seat1[i][j] = students[index++];
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		// 2분단 학생 대입
		System.out.println("== 2분단 ==");
		for (int i = 0; i < seat2.length; i++) {
			
			for (int j = 0; j < seat2[i].length; j++) {
				
				seat2[i][j] = students[index++];
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String searchName = sc.next();	
		

		// 검색된 분단, 줄, 좌우 방향을 지정할 변수 선언
		int seat = 0;
		int row = 0;
		String direction = null;
		
		for(int i=0; i<seat1.length ; i++) {
			
			for(int j=0; j<seat1[i].length ; j++) {
				
				if(seat1[i][j].equals(searchName)) {
					// 1분단에 일치하는 이름이 있을 경우
					seat = 1;
					row = i+1;
					direction = j == 0 ? "왼쪽" : "오른쪽"; // 삼항 연산자
					
				}else if(seat2[i][j].equals(searchName)) {
					// 2분단에 일치하는 이름이 있을 경우
					seat = 2;
					row = i+1;
					direction = j == 0 ? "왼쪽" : "오른쪽"; // 삼항 연산자
				}
			}
		}
		
		
		if(seat != 0) { // 검색 결과가 있을 경우
			System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.\n", 
							searchName, seat, row, direction);
		}else {
			System.out.println("검색한 학생이 존재하지 않습니다.");
		}
		
	}		
	
	/*실습문제 9
	String 2차원 배열 5행 5열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
	그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요.
	[실행 화면]
	행 인덱스 입력 : 4
	열 인덱스 입력 : 2
	   0 1 2 3 4
	0 
	1
	2
	3
	4 X
	*/
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		char[][] board = new char[6][6]; // char형 6행 6열 2차원 배열 생성

		// char의 기본값은 '\u0000' == null을 표현하는 문자이나
		// 출력 시 빈칸으로 출력됨.
		
		// 행과 열의 인덱스를 표시하는 부분에 인덱스 대입
		for (int i = 0; i < board.length-1; i++) {
			board[0][i+1] = (char)(i + '0');
			board[i+1][0] = (char)(i + '0');
			
			// '0' == 60번
		}

		
		int rowIndex = 0;
		int colIndex = 0;
		
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			rowIndex = sc.nextInt();
			
			if(rowIndex < 0 || rowIndex > 4) {
				System.out.println("0~4사이 인덱스를 입력해주세요.");
				continue;
			}
			
			break;
		}

		
		while(true) {
			System.out.print("열 인덱스 입력 : ");
			colIndex = sc.nextInt();
			
			if(colIndex < 0 || colIndex > 4) {
				System.out.println("0~4사이 인덱스를 입력해주세요.");
				continue;
			}
			
			break;
		}

		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i == rowIndex && j == colIndex) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
					board[i + 1][j + 1] = 'X';
					// 실제 2차원 배열의 인덱스에 1을 추가한 값이 화면에 표시된 인덱스
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}	
	
	
	/*실습문제10
	실습문제9와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요.
	[실행 화면]
	행 인덱스 입력 : 2 행 인덱스 입력 : 3
	열 인덱스 입력 : 2 열 인덱스 입력 : 1
	0 1 2 3 4 0 1 2 3 4
	0 0
	1 1
	2 X 2 X
	3 3 X
	4 4
	행 인덱스 입력 >> 99
	프로그램 종료
	*/
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		char[][] board = new char[67][6]; // char형 6행 6열 2차원 배열 생성


		// 행과 열의 인덱스를 표시하는 부분에 인덱스 대입
		for (int i = 0; i < board.length-1; i++) {
			board[0][i+1] = (char)(i + '0');
			board[i+1][0] = (char)(i + '0');
		}

		int rowIndex = 0;
		int colIndex = 0;
		do { // 무조건 한번은 반복하는 do-while문
			
			while(true) {
				System.out.print("행 인덱스 입력 : ");
				rowIndex = sc.nextInt();
				
				if(rowIndex != 99) {
					if(rowIndex < 0 || rowIndex > 4) {
						System.out.println("0~4사이 인덱스를 입력해주세요.");
						continue;
					}
				}
				
				break;
			}

			
			if (rowIndex != 99) { // 행 입력 시 99가 아닌 경우

				while(true) {
					System.out.print("열 인덱스 입력 : ");
					colIndex = sc.nextInt();
					
					if(colIndex < 0 || colIndex > 4) {
						System.out.println("0~4사이 인덱스를 입력해주세요.");
						continue;
					}
					
					break;
				}
				

				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						if (i == rowIndex && j == colIndex) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
							board[i + 1][j + 1] = 'X';
						}
						System.out.print(board[i][j] + " ");
					}
					System.out.println();
				}
			}
			
			
			System.out.println();
			
		} while (rowIndex != 99);
		System.out.println("프로그램 종료");
	}	
	

	/*
	위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
	해당 학생이 어느 자리에 앉았는지 출력하세요.
	[실행 화면]
	== 1분단 ==
	강건강 남나나
	도대담 류라라
	문미미 박보배
	== 2분단 ==
	송성실 윤예의
	진재주 차천축
	피풍표 홍하하
	============================
	검색할 학생 이름을 입력하세요 : 차천축
	검색하신 차천축 학생은 2분단 2번째 줄 오른쪽에 있습니다.
	*/
	
	public void practice8b() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		
		
		int index = 0; // students 배열의 요소를 선택하는 용도의 변수
		
		// 1분단에 학생 대입
		System.out.println("===1분단===");
		for(int row=0 ; row<seat1.length ; row++) {
			for(int col=0 ; col<seat1[row].length ; col++) {
				seat1[row][col] = students[index];
				//seat2[row][col] = students[index+6];
				index++;
				System.out.print(seat1[row][col] +  " ");
			}
			System.out.println(); // 줄바꿈
		}
		
		// 2분단 학생 대입
		System.out.println("===2분단===");
		for(int row=0 ; row<seat2.length ; row++) {
			for(int col=0 ; col<seat2[row].length ; col++) {
				seat2[row][col] = students[index];
				index++;
				System.out.print(seat2[row][col] +  " ");
			}
			System.out.println(); // 줄바꿈
		}
		
		
		// 검색 
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String inputName = sc.next();
		
		// 검색 후 검색 결과가 있을 경우에
		// 학생의 위치를 저장할 변수를 선언
		int seat = 0; // 몇 분단
		int searchRow = 0; // 몇 번줄
		String direction = ""; // 왼쪽, 오른쪽 방향
		
		for(int row=0 ; row<seat1.length ; row++) {
			for(int col=0 ; col<seat1[row].length ; col++) {
				
				// 1분단에 검색한 학생이 있는 경우
				if( inputName.equals( seat1[row][col] )  ) {
					seat = 1; // 1분단
					searchRow = row + 1; // 몇 번줄
					
					direction = col == 0 ? "왼쪽" : "오른쪽"; // 삼항 연산자
					/*if(col == 0) {
						direction = "왼쪽";
					}else {
						direction = "오른쪽";
					}*/
				} else if( inputName.equals( seat2[row][col] )  ) {
					// 2분단에 검색한 학생이 있는 경우
					seat = 2; // 2분단
					searchRow = row + 1; // 몇 번줄
					direction = col == 0 ? "왼쪽" : "오른쪽"; // 삼항 연산자
				}
			}
		}
		
		
		// 결과 출력
		if(seat != 0) {
			System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.\n",
					inputName, seat, searchRow, direction);
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
