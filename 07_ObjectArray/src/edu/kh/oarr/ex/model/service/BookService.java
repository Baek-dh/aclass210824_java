package edu.kh.oarr.ex.model.service;

import java.util.Scanner;

import edu.kh.oarr.ex.model.vo.Book;

public class BookService {

	public void example1() {
		
		// Book 객체 배열 선언 및 할당
		Book[] books = new Book[3];
						// Book 참조 변수 3개
		
		// Book 객체 배열 요소 초기화
		books[0] = new Book("어린왕자", "생택쥐베리", 8000);
		books[1] = new Book("자바의정석", "남궁 성", 30000);
		books[2] = new Book("삼국지", "이문열", 100000);
		
		
		// for문을 이용하여 Book 객체 배열 요소 정보 모두 출력
		for(int i=0 ; i<books.length ; i++) {
			System.out.println(   books[i].information()  );
		}
		
		// books 배열의 요소 중
		// 제목이 "자바의정석"인 Book 객체의 가격(price)을 출력
		for(int i=0 ; i<books.length ; i++) {
			
			// books[i] 요소가 참조하는 Book 객체의 제목이 "자바의정석"인 경우
			if( books[i].getTitle().equals("자바의정석") ) {
				 
				System.out.println("자바의정석 가격 : " + books[i].getPrice());
			}
		}
		
	}
	
	
	public void example2() {
		
		
		// 기본 자료형 1차원 배열 선언 및 초기화
		int[] arr = {1,2,3};
		
		// 객체 배열 선언과 동시에 초기화
		Book[] books = {  
							new Book("그리스로마신화", "제우스", 10000),
							new Book("어린왕자", "생택쥐베리", 8000),
							new Book("자바의정석", "남궁 성", 30000)
					   };
		// Book[] 객체 배열 선언 및
		// 3칸 할당 + Book 객체 생성 및 초기화
		
		// books가 참조 하는 책의 가격 합 구하기
		int sum = 0;
		for(int i=0 ; i<books.length ; i++) {
			sum += books[i].getPrice();
		}
		
		System.out.println("가격 합 : " + sum);
	}
	
	
	
	public void example3() {
		
		// Book 객체 3개를 저장할 수 있는 배열을 선언 및 할당하고
		// 책 3권의 정보를 입력 받아 Book 객체 배열에 순서대로 저장.
		// + 가격이 가장 비싼 책, 가장 저렴한 책의 정보를 출력
		
		
		Book[] books = new Book[3]; // Book 객체 배열 선언 및 할당
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<books.length ; i++) {
			
			System.out.print(i + "번째 책 제목 : ");
			String title = sc.nextLine();
			
			System.out.print(i + "번째 책 저자 : ");
			String author = sc.nextLine();
			
			System.out.print(i + "번째 책 가격 : ");
			int price = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남아있는 개행문자 제거
			
			// 입력 받은 값을 이용해 Book 객체 생성후
			// books 배열에 순서대로 저장
			books[i] = new Book(title, author, price);
			
			System.out.println( books[i].information()   );
		}
		
		
		////// 가격 비교
		
		// 가장 가격이 큰/작은 값을 가진 책의 인덱스를 저장할 변수
		int maxIndex = 0;
		int minIndex = 0;
		
		for(int i=1 ; i<books.length ; i++) {
			// i를 1부터 시작하면 for문을 한 바퀴 줄일 수 있음
			
			// 현재 인덱스의 가격이 maxIndex의 가격보다 높은 경우
			if( books[i].getPrice()  > books[maxIndex].getPrice()    ) {
				maxIndex = i; // 최대값을 나타내는 maxIndex 변경
			}
			
			// 현재 인덱스의 가격이 minIndex의 가격보다 낮은 경우
			else if( books[i].getPrice()  < books[minIndex].getPrice()    ) {
				minIndex = i; // 최소값을 나타내는 minIndex 변경
			}
		}
		
		// 결과 출력
		System.out.println("가장 비싼 책 : " + books[maxIndex].information());
		System.out.println("가장 싼 책 : " + books[minIndex].information());
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
