package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Student;

public class SetService {

	// Set(집합)
	// - 순서가 존재하지 않음 (== 인덱스가 없음)
	// - 중복 데이터(객체) 저장 불가능. (null도 1개만 저장 가능)
	// -> 일반적인 Set에서 중복 데이터 확인을 위해 equals()가 반드시 오버라이딩 되어있어야 한다.
	
	
	public void example1() {
		
		// HashSet
		// - hash 함수를 이용해서 데이터를 저장하고 빠른 검색이 가능한 Set
		
		
		// * hash 함수란?
		// -> 입력된 단어를 지정된 길이의 문자열로 변환하는 함수
		
		// * hashCode() 메소드
		// -> 해시함수를 이용해 데이터가 다르면 중복되지 않는 숫자를 만드는 메소드.
		
		
		// *** HashSet 사용 선행조건!!! ***
		// 1) Set에 저장되려는 객체에 equals() 오버라이딩 되어있어야 한다.
		// 2) + hashCode()도 오버라이딩 되어 있어야 한다.
		
		
		// String을 이용한 HashSet 예제
		// -> 자바 제공 클래스들은 기본적으로 equals(), hashCode()등의 메소드가 
		//    작성되어 있는 경우가 많음
		
		Set<String> set = new HashSet<String>();
		
		set.add( "삼성" );
		set.add(new String("Apple"));
		set.add(new String("사과"));
		set.add(new String("바나나"));
		set.add(new String("오렌지"));
		set.add(new String("Apple"));
		
		System.out.println("저장된 데이터 개수 : " + set.size());
		// -> 6개의 데이터를 추가했지만 5개가 나올 것이다!
		// 왜? Set은 중복 데이터를 허용 X
		
		
		System.out.println(  set.toString()   );
		// -> set에 저장된 데이터를 모두 출력
		// -> 순서가 엉망진창 == 순서가 유지되지 않는다.
		
		
		// 간이 로또 번호 생성기
		Set<Integer> lotto = new HashSet<Integer>();
		// 컬렉션은 객체만 저장 가능!!
		// int -> Integer
		
		// Set의 특징인 중복 허용 X를 이용하여 중복 없는 랜덤 값을 저장
		
		while(true) {
			
			int random =  (int)(Math.random() * 45 + 1); // 1 ~ 45 랜덤 값
			
			lotto.add(random); // Set에 발생한 랜덤 값을 추가
			// -> add() 수행 중 중복 값이 추가되는 경우 자동으로 제거됨.
			
			if(lotto.size() == 6) {
				// size() : 저장된 데이터의 개수
				break;
			}
		}
		
		System.out.println("생성된 번호 : " + lotto);
		
		
		// Set에서 값을 하나씩 반복 접근하는 방법
		// 왜 필요할까? Set은 순서 유지가 안되기 때문에(index 존재 X) 
		// 			 원하는 데이터를 하나씩 꺼내는 것이 불가능하다.
		
		// 1. Iterator (반복자)
		// 컬렉션에서 제공하는 
		// 컬렉션 객체 반복 접근자(순서대로 하나씩 반복 접근)
		
		Iterator<Integer> it = lotto.iterator();
		// lotto.iterator()
		// -> lotto 집합(Set)에 저장된 내용들이 하나 씩 꺼내올 후 있는 형태로 변환됨.
		
		while(it.hasNext()) {
			// hasNext() : 다음 꺼내올 값이 있으면 true
			
			int num = it.next();  // Integer -> int (auto unboxing)
			// next() : 다음 값을 얻어옴.
			
			System.out.println("발생한 랜덤 값 : " + num);
		}
		
		///////////////////////////////////////////
		
		// 2. 향상된 for문 
		// for( 하나씩 꺼내어 저장할 변수  : 컬렉션 또는 배열명  )
		
		System.out.println("<향상된 for문 사용>");
		
		for( int num : lotto ) {
			System.out.println("발생한 랜덤 값 : " + num);
		}
	}
	
	
	
	public void example2() {
		// HashSet 사용을 위한 준비 사항
		// (꼭 알아두기!) 
		// -> HashSet, HashMap, HashTable, LinkedHashSet, .....
		//   Hash라는 단어가 들어간 컬렉션 객체를 사용하는 경우
		//   저장하려는 객체에 반드시 hashCode(), equals() 오버라이딩이 되어 있어야 함!
		
		// 학생 저장 Set 생성
		Set<Student> stdSet = new HashSet<Student>();
		
		stdSet.add( new Student("홍길동", 15, 2) );
		stdSet.add( new Student("홍길동", 15, 2) ); // 중복
		// -> equals() 오버라이딩 O, hashCode() 오버라이딩 X  --> 중복 저장 되어버림...
		// -> equals() 오버라이딩 O, hashCode() 오버라이딩 O  --> 중복 저장 X
		//  *** equals(),  hashCode() 오버라이딩 후 Set 사용!!!!!!!!@#$%^&*(
		
		System.out.println(stdSet);
		
	}
	
	
	public void example3() {
		
		// TreeSet : 이진 트리 구조를 이용해 데이터를 저장하는 Set
		// - Set 특징 : 순서 X, 중복 X
		// - Binary Tree 특징 : 오름차순 자동 정렬
		
		Set<Integer> lotto = new TreeSet<Integer>();
		
		while(true) {
			
			// 1~45 난수 발생
			int random = (int)(Math.random() * 45 + 1);
			
			// 발생된 난수 lotto에 추가
			lotto.add(random);
			
			if(lotto.size() == 6) { // 번호가 6개가 되면 멈춤
				break;
			}
		}
		
		System.out.println("자동 생성된 번호 : " + lotto);
	}
	
	
	
	public void example4() {
		
		// 천원 단위로 돈을 입력 받아
		// 입력된 금액 / 1000 한 횟수 만큼 로또 번호를 자동으로 생성하여 
		// List에 저장 후 출력하기
		// (List + Set)
		
		Scanner sc = new Scanner(System.in);
		
		// 자동 생성된 번호들을 저장할 List 생성
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		// -> Integer만 저장하는 Set을 저장하는 List 생성
		
		System.out.print("금액 입력(천원 단위) : ");
		int price = sc.nextInt();
		
		for(int i=0 ; i < price/1000 ; i++) {
			
			// 1) 로또 번호를 생성(Set)
			Set<Integer> lotto = new TreeSet<Integer>();
			
			while(true) {
				int random = (int)(Math.random() * 45 + 1); // 1~45 난수 발생
				
				lotto.add(random); // 발생된 난수 lotto에 추가
				
				if(lotto.size() == 6) { // 번호가 6개가 되면 멈춤
					break;
				}
			}
			
			// 2) 생성된 로또 번호를 List에 추가
			list.add(lotto);
			
		}
		
		
		// 3) 향상된 for문으로 List에 저장된 데이터 순서대로 출력
		for( Set<Integer> lotto : list  ) {
			System.out.println(lotto);
		}
		
		
	}
	
	
	
	
	
	
	
	
}
