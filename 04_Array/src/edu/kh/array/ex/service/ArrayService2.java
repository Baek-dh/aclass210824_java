package edu.kh.array.ex.service;

import java.util.Arrays;

public class ArrayService2 {

	// 배열 복사
	// - 얕은 복사 : 참조하는 배열의 시작 주소만을 복사
	// -> 객체의 매개변수, 반환형 전달 시 사용
	
	
	// - 깊은 복사 : 원본 배열과 동일한 자료형, 동일하거나 더 큰 크기 ,
	//				동일한 데이터를 가지는 새로운 배열을 만드는 것
	// -> 원본 데이터 유지, 원본과 똑같은 배열이 필요할 때
	
	
	public void example1() {
		// 얕은 복사 예제
		
		int[] arr = {1,2,3,4,5};
		
		// 얕은 복사 진행
		int[] copyArr = arr;
		// arr, copyArr은 동일한 주소에 있는 int[]을 참조
		
		
		System.out.println("변경 전"); 
		System.out.println( Arrays.toString(arr) );
		System.out.println( Arrays.toString(copyArr) );
		// -> 복사가 되었는지 확인
		
		// 복사한 배열의 0번째 요소를 변경
		copyArr[0] = 999;
		
		System.out.println("변경 후"); 
		System.out.println( Arrays.toString(arr) );		
		System.out.println( Arrays.toString(copyArr) );
		// 얕은 복사 -> arr, copyArr은 같은 배열을 참조
		// -> arr, copyArr 둘 다 0번 인덱스 값이 변경됨
	}
	
	
	
	public void example2() {
		// 깊은 복사 예제
		
		int[] arr = {1,2,3,4,5};
		
		// 깊은 복사 진행
		
		// 1) 복사를 위한 새로운 배열 선언 및 할당
		int[] copyArr = new int[ arr.length  ];
					// -> 원본 배열과 같은 크기의 새로운 배열 할당
		
		// 2) 원본 배열의 내용을 복사용 배열에 초기화하기
		
		// 2-1) for문을 이용한 깊은 복사
		/*for(int i=0 ; i<arr.length ; i++) {
			copyArr[i] = arr[i];
		}*/
		
		// 2-2) System.arraycopy(원본배열, 원본 복사 시작 인덱스, 복사배열, 복사배열의 삽입 시작 인덱스, 복사길이);
		System.arraycopy( arr, 0, copyArr, 0, arr.length);
		// 원본 배열 arr에서 0번 인덱스 부터 5개의 데이터를
		// 복사 배열 copyArr의 0번 인덱스 부터 차례대로 삽입
		
		
		
		System.out.println("변경 전"); 
		System.out.println( Arrays.toString(arr) );
		System.out.println( Arrays.toString(copyArr) );
		// -> 복사가 되었는지 확인
		
		// 복사한 배열의 0번째 요소를 변경
		copyArr[0] = 999;
		
		System.out.println("변경 후"); 
		System.out.println( Arrays.toString(arr) );		
		System.out.println( Arrays.toString(copyArr) );
		
	}
	
	
	////////////////////////////////////////////////////////
	// 배열 응용 심화
	
	public void example3() {
		// 배열 요소 중복 검사
		
		int[] arr = {4, 2, 3, 4, 1};
		
		// 비교 기준 선정을 위한 for문
		for(int i=0 ; i< arr.length - 1 ; i++) {
			
			// 비교 대상을 선정하는 for문
			for(int j=1 + i ; j < arr.length ; j++) {
				
					// 비교 기준
				if( arr[i]  ==  arr[j]    ) {
								 // 비교 대상
					System.out.println(arr[i]  + " 중복");
					break;
				}
			}
		}
	}
	
	
	public void example4() {
		
		// 난수를 발생시켜 중복되는 값이 있는지 확인
		// 조건 1. 난수의 생성 범위 0 ~ 20
		// 조건 2. 난수 생성 개수 : 4개
		
		// Math.random() 
		// -> 0.0 이상 1.0 미만의 난수를 발생시키는 메소드(기능)
		// -> double
		
		int[] arr = new int[4];
		
		// 배열 요소에 0~20 사이 난수를 대입
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = (int)(Math.random() * 21);
			
			// 0.0 <= random < 1.0
			// 0.0 <= random < 21.0
			// 0 <= random < 21
			//  -->   0 <= random <= 20
		}
		
		System.out.println( Arrays.toString(arr) );
		
		// 중복 검사 코드
		for(int standard=0 ; standard<arr.length - 1 ; standard++) { // 비교 기준 선정
			
			// 비교 대상
			for(int target = 1 + standard ; target < arr.length ; target++) { 
				
				if(arr[standard]  == arr[target]) {
					System.out.println(arr[standard] + " 중복");
				}
			}
		}
	}
	
	
	// 로또 번호 생성기
	// 조건1. 1 ~ 45 사이 난수
	// 조건2. 6개
	// 조건3. 중복 X
	// + 추가조건 : 오름차순 정렬
	public void lottoNumberConstructor() {
		
		int[] lotto = new int[6];
		
		for(int i=0 ; i<lotto.length ; i++) {
			
			// 1~45사이 난수
			int ran =  (int)( Math.random() * 45 + 1 )  ;
			// 0.0 <= random < 1.0
			// 0.0 <= random < 45.0
			// 1.0 <= random < 46.0
			// 1 <= random < 46
			
			lotto[i] = ran;
			
			// 현재 생성된 난수 ran이
			// lotto 배열에 존재하는 경우는 난수를 재생성
			for(int x=0 ; x<i ; x++) {
				// 앞서 저장된 난수를 접근하기 위한 for문
				
				// 앞서 저장된 난수와,  새로 생성된 난수가 같을 경우
				// == 중복이 발생했다.
				// == i값이 다음으로 증가하지 않고 난수를 다시 만들어야된다
				// -> 결론 : i값 증가시키지 않으면 된다
				if( lotto[x] == ran  ) {
					i--; // 중복이 발생한 경우 제자리에서 다시 난수 발생
					break;
				}
			}
		}
		
		// Arrays.sort(배열명)
		// -> 배열 내 값들을 오름차순 순서로 정렬
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
		
		
	}
	
	
	
	
	
	
	
	
	
}
