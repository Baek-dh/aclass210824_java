package edu.kh.array.ex.service;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayService1 {

	/* 배열(Array)
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수는 하나의 배열명으로 부르고, 구분은 index를 이용함(index 는 0부터 시작)
	 * 
	 * */
	
	public void example1() {
		
		// 1. 배열 선언
		
		// Stack 메모리 영역에 int[] 자료형 변수 arr1을 선언.
		// -> Heap 영역에 있는 int[]을 참조할 수 있는 변수 arr1을 선언
		// --> 참조형 변수 == 주소를 저장하여 해당 주소에 있는 값을 참조하여 사용
		//    (참조형 변수는 오로지 주소만을 저장한다!!!!!!!!!!!!!!!)
		int[] arr1;
		
		int arr2[];
		
		int num;
		
		// [] : 배열 기호
		
		
		// 2. 배열 할당( 할당 : 메모리상에 데이터 저장 공간을 확보하는 것 )
		
		arr1 = new int[3];
		// new int[3];
		// 1) new : Heap 메모리 영역에 새로운 공간을 할당 하겠다.
		// 2) int[3] : int 자료형 변수 3개가 묶여있는 int[] 배열.
		
		// 1) + 2) : Heap 메모리 영역에 int 자료형 변수 3개 묶여있는 int[]을 새롭게 할당.
		// --> 할당한 위치의 주소가 생김.
		
		
		// arr1 = new int[3];
		
		// arr1의 자료형 : int[]
		// new int[3]으로 만들어진 배열의 자료형 : int[]
		// -> 둘의 자료형이 같으므로 대입 연산이 가능하다
		
		// new int[3] 구문을 통해 할당된 메모리 공간의 주소를
		// arr1 변수에 대입
		
		
		//arr1 = 1; // arr1의 자료형은 int[],   1의 자료형은 int --> 대입 불가
		
		// 3. 배열 초기화 (대입)
		arr1[0] = 1; // arr1이 참조하는 배열의 0번 인덱스에 1을 대입
		arr1[1] = 100;
		arr1[2] = 9000;
		
		// 4. 배열 사용
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		
		
		//System.out.println("arr1[3] : " + arr1[3]);
		// arr1 변수가 참조하는 배열에는 3번 인덱스가 없음
		// java.lang.ArrayIndexOutOfBoundsException: 3
		// -> 배열 인덱스 범위 초과 에러 발생
		
		// 5. 배열 + for문 같이 사용
		for(int i=0 ; i<=2 ; i++) {
			// for문에서 i == index
			
			System.out.println( arr1[i]  );
		}
		
	}
	
	
	public void example2() {
		
		// 배열 기초 복습
		
		int[] arr = new int[3];
		// 1) Stack 영역에 int[] 참조형 변수 arr을 선언하고
		
		// 2) Heap 영역에 int 3칸짜리 int[]을 새롭게 할당 하고
		//	  할당된 배열의 시작 주소를
		
		// 3) int[] 참조형 변수 arr에 대입
		
		// * Heap 영역에 할당된 공간은 비어 있을 수 없다!
		// -> 자료형 기본값으로 컴파일러에 의해서 초기화 되어있음.
		System.out.println("컴파일러에 의한 초기화 확인");
		
		for(int i=0 ; i<=2 ; i++) {
			System.out.print(arr[i] + " ");
			
			// arr이 참조하고있는 배열의 각 인덱스 값을 순서대로 출력
		}
		
		
		// 배열의 각 인덱스에 값 대입 (배열 초기화)
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		System.out.println();
		System.out.println("배열 초기화");
		
		// 배열명.length : 배일의 길이(칸 수)
		// arr.length == 3
		for(int i=0 ; i<arr.length ; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("배열 길이 : " + arr.length);
		
	}
	
	
	public void example3() {
		// 배열 초기화
		
		// int[] 참조형 변수 arr을 선언한 후
		// arr에 새롭게 생성된 int 5칸짜리 배열의 시작 주소를 대입하고
		// 배열의 각 인덱스 요소에 2,4,6,8,10 을 대입
		
		int[] arr = new int[5];
		
		// 1) 인덱스를 이용한 직접 초기화
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		
		
		int[] arr2 = new int[5];
		
		// 2) for문을 이용한 초기화
		for(int i=0 ; i<arr2.length ; i++) {
			// i = 0 1 2 3 4
			// 값 = 2 4 6 8 10
			arr2[i] = i * 2 + 2;  // (i+1) * 2
		}
		
		
		// 3) 배열 선언과 동시에 초기화
		
		int[] arr3 = {2,4,6,8,10};
		// int[] 참조형 변수 arr3에
		// 새롭게 할당된 int 5칸짜리 int[]배열의 시작 주소를 대입하고
		// 각 인덱스를 2,4,6,8,10 으로 초기화
		
		
		// 1), 2), 3) 초기화 결과 한번에 출력하기
		/*for(int i=0 ; i<arr.length ; i++) { // 1번 초기화 결과 출력
			System.out.print(arr[i] +  " ");
		}*/
		
		// 자바의 Arrays 클래스 : 자바에서 배열과 관련된 유용한 기능을 제공하는 클래스
		
		// Arrays.toString(배열명) : 해당 배열에 저장된 모든 요소가 순서대로 출력
		System.out.println( "arr 초기화 확인 : "  +  Arrays.toString(arr)    );
		System.out.println( "arr2 초기화 확인 : "  +  Arrays.toString(arr2)    );
		System.out.println( "arr3 초기화 확인 : "  +  Arrays.toString(arr3)    );
		
	}
	
	
	public void example4() {
		
		// int 자료형 배열 5칸짜리를 선언 및 할당한 후
		// 각 배열 인덱스 요소에 입력 받은 정수를 대입하고
		// 입력이 완료된 후 한 번에 출력하기
		
		// ex)
		// 입력 0 : 10
		// 입력 1 : 5
		// 입력 2 : 17
		// 입력 3 : 30
		// 입력 4 : 100
		
		// 입력된 정수들 : [10, 5, 17, 30, 100]
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputArr = new int[5];
		
		for(int i=0 ; i<inputArr.length ; i++) {
			
			System.out.print("입력 " + i + " : ");
			inputArr[i] = sc.nextInt(); // 입력 받은 정수를 배열 요소에 대입
		}
		
		System.out.println();
		System.out.println("입력된 정수들 : " + Arrays.toString(inputArr) );
		
	}
	
	
	public void example5() {
		
		// 5명의 키(cm)를 입력 받아 배열의 각 인덱스에 초기화 하고
		// 5명의 키, 평균 키 출력
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5]; // 자료형[] -> 해당 자료형 배열
		
		
		for(int i=0 ; i<arr.length ; i++) {
			// index는 0부터 1씩 증가하는 정수 == int 자료형으로 제어 가능
			
			System.out.print( (i+1) + "번 키 입력 : ");
			arr[i] = sc.nextDouble();
		}
		
		System.out.println("입력 받은 키 : " + Arrays.toString(arr));
		
		// 평균 == 합계 / 합계에 참여한 수의 개수
		double sum = 0;
		for(int i=0; i<arr.length ; i++) {
			sum += arr[i]; // 배열에 저장된 키를 얻어와 sum에 누적
		}
		
		System.out.println("평균 키 : "  +   ( sum  /  arr.length )   );
												// 유지 보수성 향상을 위해
												// 직접 값을 적지 않고
												// 변수명 또는
												// 값을 얻어올 수 있는 코드 작성
		
	}
	
	
	public void example6() {
		
		// 예제 5번과 같은 동작을 하지만
		// 입력 받은 키를 모두 출력할 때
		// 입력 받은 역순으로 출력하기
		
		/*
		1번 키 입력 : 170.5
		2번 키 입력 : 165.7
		3번 키 입력 : 184.3
		4번 키 입력 : 190.2
		5번 키 입력 : 174.4
		입력 받은 키 : [174.4, 190.2, 184.3, 165.7, 170.5]   (역순)
		평균 키 : 177.02
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		
		// 입력 
		for(int i=0; i<arr.length ; i++) {
			System.out.print( (i+1) + "번 키 입력 : ");
			arr[i] = sc.nextDouble();
		}
		
		// 출력
		System.out.print("입력 받은 키 : [");
		
		// 역순 출력을 위한 for문 + 합계
		double sum = 0;
		for(int i=arr.length-1 ; i>=0 ; i--) {
			
			System.out.print(arr[i]);
			sum += arr[i]; // 합계 누적
			
			
			if(i > 0) { // 반복문이 마지막이 아닐 경우
				System.out.print(", ");
			}
			
		}
		
		System.out.println("]");
		System.out.println("평균 키 : " + (sum / arr.length));
	}
	
	
	public void example7() {
		
		// 5명의 키를 입력 받아 배열에 저장한 후
		// 최장신, 최단신을 찾아 출력
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		
		// 입력
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print( (i+1) + "번 입력 : "  );
			arr[i] = sc.nextDouble();
		}
		
		
		// * 최대값, 최소값 찾기
		// 10  20  15  27  35  14  20  30
		
		//double max = 0.0; // 최대값을 저장하기 위한 변수
		//double min = Double.MAX_VALUE; // 최소값을 저장하기 위한 변수
		
		// 최대/최소 찾기 방법 1  ( max, min 변수를 값을 입력 받기 전에 준비 )
		// * 최대값을 저장하기 위한 변수에는 가장 작은값으로 초기화
		// * 최소값을 저장하기 위한 변수에는 가장 큰값으로 초기화
		
		
		double max = arr[0];
		double min = arr[0];
		// 최대/최소 찾기 방법 2 ( max, min 변수를 값을 입력 받은 후 준비 )
		// * 최대, 최소를 저장하기 위한 변수에 배열의 첫 번째 요소 값을 대입
		
		
		for(int i=0 ; i<arr.length ; i++) {
			
			// 최대값 찾기
			if( arr[i] > max ) {
				// 현재 접근한 배열 인덱스의 값이   
				// max 변수에 저장된 값보다 큰 경우
				max = arr[i];
			}
			
			// 최소값 찾기
			if( arr[i] <  min ) {
				// 현재 접근한 배열 인덱스의 값이   
				// min 변수에 저장된 값보다 작은 경우
				min = arr[i];
			}
		}
		
		// 최장신 찾기
		System.out.println("최장신 : " + max);
		
		// 최단신 찾기
		System.out.println("최단신 : " + min);
		
	}
	
	
	
	public void example8() {
		
		// 입력 받은 정수 만큼의 크기를 가진 int 배열을 선언 및 할당 하고
		// 배열의 각 인덱스에 5의 배수들을 하나씩 초기화
		
		// ex)
		// 배열 크기 입력 : 4
		// [5, 10, 15, 20]
		
		
		// 배열 크기 입력 : 6
		// [5, 10, 15, 20, 25, 30]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기 입력 : ");
		int size = sc.nextInt();
		
		// int형 배열 선언 및 할당
		// ** 코드 수행 중 원하는 크기에 배열을 만들 수 있다!!!
		int[] arr = new int[size];
		
		// 할당된 배열의 각 인덱스 요소에 5의 배수 초기화
		for(int i=0; i<arr.length ; i++) {
					  /*size도 가능*/
			
			arr[i] = (i+1) * 5;
		}
		
		// 결과 출력
		System.out.println( Arrays.toString(arr) );
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
