package edu.kh.array.ex.service;

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
	
	
	
	
	
	
	
	
	
	
}
