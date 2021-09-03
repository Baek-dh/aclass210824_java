package edu.kh.oop.encapsulation.model.service;

import edu.kh.oop.encapsulation.model.vo.Account;
import edu.kh.oop.encapsulation.model.vo.Book;

public class EncapsulationService {

	public void example1() {
		
		// Account 객체를 하나 생성하여 이를 참조하는 변수 ac에 주소 저장
		Account ac = new Account();
		
		// 캡슐화가 적용되지 않았을 경우
		/*ac.name = "백동현";
		ac.accountNumber = "123-123456-10";
		ac.password = "1111";
		ac.bankCode = 10;
		ac.money = 1000000; // 100만원
		
		System.out.println( ac.money );
		System.out.println( ac.password );
		ac.money -= 1000000; // 100만원 출금*/
		
		// -> 외부의 잘못된 사용으로 인한 객체의 손상
		
		
		// *** 캡슐화 진행 시 객체의 속성에 직접적인 접근이 불가능해짐.
		// (위쪽 코드에서 에러 발생하는 이유)
		
		// setter를 이용한 값 세팅하기
		ac.setName("홍길동");
		// Account 객체의 기능 중 setName의 매개변수에 "홍길동" 값을 전달
		
		ac.setAccountNumber("123-1234-1234");
		ac.setPassword("1111");
		ac.setMoney(1000000);
		ac.setBankCode(10);
		
		
		// getter를 이용하여 값을 얻어와 출력하기
		System.out.println( ac.getName()  );
		System.out.println( ac.getAccountNumber() );
		System.out.println( ac.getPassword() );
		System.out.println( ac.getMoney() );
		System.out.println( ac.getBankCode() );
	}
	
	
	
	public void example2() {
		
		// Book 객체를 생성하여 이를 참조하는 변수 book1에 주소를 대입
		
		// * 자바에서 객체란?
		// new 연산자를 통해 Heap 영역에 생성된 것
		// -> 객체를 만들기 위해서 설계도(클래스)가 필요
		
		Book book1 = new Book();
		
		// book1에 값 세팅 후 출력
		book1.setTitle("어린왕자");
		book1.setAuthor("생택쥐베리");
		book1.setPrice(8000);
		
		System.out.println("제목 : " + book1.getTitle());
		System.out.println("저자 : " + book1.getAuthor());
		System.out.println("가격 : " + book1.getPrice());
		
	}
	
	
	
	
	
	
	
	
}
