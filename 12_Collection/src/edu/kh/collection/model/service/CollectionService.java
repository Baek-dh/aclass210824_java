package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.kh.collection.model.vo.Person;
import edu.kh.collection.model.vo.Student;

public class CollectionService {
	
	public void example1() {
		
		ArrayService array = new ArrayService();
		
		// ctrl + alt + 화살표 아래
		
		// 학생 객체를 추가
		if(  array.add( new Student("홍길동", 15, 2) )    ) {
			System.out.println("학생 정보 추가 성공");
		}
		
		if(  array.add( new Student("고길동", 16, 3) )    ) {
			System.out.println("학생 정보 추가 성공");
		}
		
		if(  array.add( new Student("희동이", 8, 1) )    ) {
			System.out.println("학생 정보 추가 성공");
		}
		
		// 4번째 학생 정보 추가
		// -> stdList 길이가 3이기 때문에 배열 범위 초과 예외 발생
		// --> 배열 길이 증가 코드 추가
		if(  array.add( new Student("김영희", 17, 1) )    ) {
			System.out.println("학생 정보 추가 성공");
		}
		
		
		// 추가된 학생 정보 출력
		System.out.println( array.toString()  );
		
	}
	
	
	// List 예제
	public void example2() {
		
		// Collection이란? 자바에서 제공하는 자료구조를 담당하는 프레임워크
		
		// 1) 크기 제약이 없음
		// 2) 추가, 수정, 삭제, 정렬 등의 기능이 내장되어 있음.
		// 3) 여러 데이터 타입 저장 가능.
		
		
		// List (인터페이스)
		// 순서가 유지되며 (index 활용)
		// 중복 데이터 저장이 가능하다. (값이 같아도 index로 구분되기 때문에)
		
		// ArrayList
		// - List의 후손 클래스
		// - 배열과 비슷한 형태의 리스트 (가장 기본적이고 많이 사용됨)
		
		ArrayList list = new ArrayList(); // 기본 생성자로 생성 시 초기 용량 10
		ArrayList stdList = new ArrayList(3); // 초기 용량 3 
		
		// 1. add(E e) : 리스트의 맨 끝에 추가
		if(   stdList.add( new Student("홍길동", 15, 2)  )   ) {
			System.out.println("학생 정보 추가 성공(ArrayList)");
		}
		
		if(   stdList.add( new Student("고길동", 16, 3)  )   ) {
			System.out.println("학생 정보 추가 성공(ArrayList)");
		}
		
		if(   stdList.add( new Student("희동이", 8, 1)  )   ) {
			System.out.println("학생 정보 추가 성공(ArrayList)");
		}
		
		// 자동으로 ArrayList 길이가 증가하는지 확인
		if(   stdList.add( new Student("김영희", 17, 1)  )   ) {
			System.out.println("학생 정보 추가 성공(ArrayList)");
		}
		
		
		// 2. toString() : 리스트에 저장된 모든 요소를 한 줄의 문자열로 반환
		System.out.println( stdList.toString() );
		
		
		// 3. add(int index, E e) : 지정된 index에서 삽입
		stdList.add( 1, new Student("박철수", 13, 6)  );
		
		System.out.println("중간 삽입 확인");
		System.out.println(stdList); // 참조 변수만 작성하는 경우 자동으로 toString() 수행됨
		
		
		// 4. size() : 리스트에 저장된 데이터 개수 반환
		System.out.println("저장된 학생 수 : " + stdList.size() );
		
		
		// 5. get(int index) : 리스트에 저장된 index번째 요소 반환
		System.out.println(stdList.get(0));
		System.out.println(stdList.get(1));
		System.out.println(stdList.get(2));
		System.out.println(stdList.get(3));
		System.out.println(stdList.get(4));
		
		
		// for문, get(), size() 같이 사용하기
		System.out.println("==================");
		
		for(int i=0 ; i<stdList.size() ; i++) {
			System.out.println( stdList.get(i)  );
		}
		
		System.out.println("==================");
		
		
		// 5. Object set(int index, E e) : 리스트의 index번째 요소를 e로 변경하고
		//								   기존에 있던 값을 반환							
		Object obj = stdList.set(0, new Student("이민호", 18, 2) );
		System.out.println("반환된 Object : " + obj);
		System.out.println(stdList);
		
		
		// 6. Object remove(int index) : 리스트의 index번째 요소를 삭제하고
		//							     기존에 있던 값을 반환
		Object obj2 = stdList.remove(1);
		System.out.println("제거된 학생 정보 : " + obj2); // 박철수 제거
		System.out.println(stdList); // 박철수 제거 확인
		
		
		
		
		// * 다른 자료형 추가
		stdList.add( "문자열도 객체다"  );
		//stdList.add( new Integer(100) );
		
		// 컬렉션은 객체만 저장 가능하다!
		stdList.add(100); // 100 (int) -- Auto Boxing  -->  100 (Integer)
		
		
		ArrayList list2 = new ArrayList();
		list2.add(  new Student("김갑수", 19, 3)  );
		list2.add(  new Student("김삼순", 12, 5)  );
		
		stdList.add(list2);
		
		// stdList에 저장된 정보 모두 출력
		for(int i=0 ; i<stdList.size(); i++) {
			System.out.println( stdList.get(i)  );
		}
		
		
		System.out.println("===================");
		
		System.out.println("stdList의 요소중 Student 객체에 접근하는 경우 이름만 출력하기");
		
		for(int i=0 ; i< stdList.size() ; i++) {
			
			if( stdList.get(i) instanceof Student ) {
				// stdList의 i번째 요소가 Student 객체 또는 Student를 상속 받은 객체인 경우
				
				// ArrayList에 저장되는 데이터 데이터 타입은 모두 Object 타입으로 인식된다.
				// -> get(i)를 통해서 얻어오는 데이터의 타입은 모두 Object
				
				System.out.println( ( (Student)stdList.get(i) ).getName()    );
				// Object -> Student 다운 캐스팅
		
			} else {
				
				System.out.println(stdList.get(i));
			}
			
		}
		
	}
	
	
	// 향상된 for문 (for each 문)
	// - 컬렉션이나 배열의 모든 요소를 처음부터 끝까지 순서대로 접근하는 용도의 for문
	public void example3() {
		
		ArrayList list = new ArrayList();
		list.add("김밥");
		list.add("라면");
		list.add("탕수육");
		list.add("파스타");
		
		// list에 저장된 데이터를 모두 출력
		
		// 1) 기존 for문
		for(int i=0 ; i<list.size(); i++){
			System.out.println(  list.get(i)  );
		}
		
		System.out.println("===========");
		
		// 2) 향상된 for문
		// for( 하나씩 꺼내서 담을 변수 선언 : 컬렉션 또는 배열명 )
		
		for( Object obj  :  list ) {
			// for문이 반복될 때 마다
			// list에 저장된 요소를 처음부터 순서대로 하나씩 꺼내
			// obj 변수에 저장
			System.out.println(obj);
		}
		
	}
	
	
	public void example4() {
		
		// Generics(제네릭, 제네릭스, 지네릭스) : <E>
		// 클래스, 메소드, 컬렉션 내부에 사용되는 클래스 타입을 한 종류로 제한하는 기능
		// -> 타입 제한
		
		// 제네릭의 이점
		// 1) 하나의 타입으로 제한이 되기 때문에 
		//     instanceof 같은 타입 검사, 다운캐스팅의 작업이 필요 없어진다.
		//     -> 코드 활용 방법이 쉬워짐
		//     == 컴파일 단계에서의 강력한 타입 체크
		
		// 2) 하나의 코드로 여러 타입 처리가 가능하다. (다형성)
		
		
		// ** 컬렉션 타입 제한 기능의 제네릭 사용
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		// Student로 타입이 제한된 ArrayList 객체 생성
		// == 생성된 ArrayList에는 Student만 저장 가능
		// == 저장된 데이터는 모두 Student이다
		
		// add(Student e)
		stdList.add( new Student("김개똥", 9, 2) );
		stdList.add( new Student("김스벅", 10, 3) );
		stdList.add( new Student("김투썸", 11, 4) );
		stdList.add( new Student("김할리스", 12, 5) );
		
		// 향상된 for문으로 모두의 이름만 출력
		for( Student std  : stdList   ) {
			// stdList가 Student로 타입이 제한되어 있기 때문에
			// 하나씩 순서대로 꺼내서 저장하는 변수의 타입도 Student 타입을 사용한다.
			// == instanceof 검사가 필요 없음
			
			System.out.println( std.getName()  );
			// std가 Student 타입이기 때문에 다운캐스팅이 필요 없다
		}
	}
	
	
	
	
	public void example5() {
		// 컬렉션과 다형성
		
		// - 다형성이란?   부모 타입의 참조변수로 상속 관계에 있는 자식 객체를 참조하는 것.
		// - 인터페이스의 특징 : 상속 받은 자식에게 동일한 이름의 기능을 강제적으로 오버라이딩 시킴
		//					-> 자식들의 형태가 비슷해진다.
		//					+ 객체 생성 X, 부모 타입 참조 변수 사용 O
		
		
		// ArrayList : 배열 모양의 List로 검색에 효율적임.
		// LinkedList : 요소 하나 하나가 줄로 연결된 모양으로 추가, 삭제에 효율적임.
		
		
		// 1) 다형성 미적용
		LinkedList<String> list1 = new LinkedList<String>();
		
		// 추가
		list1.add("AAA");
		list1.add("BBB");
		list1.add("CCC");
		list1.add("DDD");
		
		// 삭제
		list1.remove(0);
		list1.remove(0);
		list1.remove(0);
		
		ex5_1(list1); // 매개변수로 ArrayList<String> 전달
		
		list1 = ex5_2(); // 반환값으로 ArrayList<String> 반환
		
		// 추가 삭제가 빈번하므로 LinkedList가 더 효율적임
		
	}

	// 매개변수가 ArrayList<String>인 메소드
	public void ex5_1(LinkedList<String> list ) {
		System.out.println(list);
	}
	
	// 반환형이 ArrayList<String>인 메소드
	public LinkedList<String> ex5_2(){
		return new LinkedList<String>();
	}
	
	
	
	public void example6() {
		
		// 2) 컬렉션에 다형성 적용
		List<String> list2 = new LinkedList<String>();
		// 부모 타입(List) 참조 변수로 자식 타입 객체(ArrayList) 참조
		// -> LinkedList로 자식 객체를 변경해고 문제가 발생하지 않음
		//  왜? 
		//  이유 1. ArrayList, LinkedList 둘다 부모인 List를 상속 받았기 때문에
		//        사용하는 메소드의 이름이 같음.
		//  이유 2. ex6_1(), ex6_2() 두 메소드의 매개변수, 반환형이 
		//   	  부모 타입으로 작성되어 있기 때문에 참조하는 자식 객체가 변해도 다형성이 항상 적용됨 
		
		// ***** 컬렉션에 다형성 적용 시 이점 *****
		// -> 유지보수성 향상, 범용성 향상
		
		// 추가
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");
		list2.add("DDD");
		
		// 삭제
		list2.remove(0);
		list2.remove(0);
		list2.remove(0);
		list2.remove(0);
		
		ex6_1(list2);
		
		list2 = ex6_2();
		
	}
	
	// 매개변수가 부모타입인 List<String> == 매개변수의 다형성
	public void ex6_1( List<String> list ) {
		System.out.println(list);
	}
	
	// 반환형이 부모타입인 List<String> == 반환형의 다형성
	public List<String> ex6_2(){
		return new ArrayList<String>();
	}
	
	
	
	// 제네릭에 다형성 적용
	// -> 하나의 코드로 여러 타입 처리가 가능하다. (다형성)
	public void example7() {
		
		List<Person> list = new ArrayList<Person>();
		// 제네릭이 부모타입인 Person으로 제한된 ArrayList 객체를 생성
		
		list.add( new Person('남', 180.5) ); // 부모 타입 객체 추가
		list.add( new Student('여', 163.7, "김삼순", 17, 1) ); // 자식 타입 객체 추가 -> 에러 없음
		// -> 제네릭이 부모타입을 지정되면 부모 + 자식 객체를 저장할 수 있다.
		
		for(Person p : list) {
			System.out.println( p.toString()  );
								// -> 정적 바인딩
			// 실행 중 오버라이딩된 자식의 toString()가 연결됨 -> 동적 바인딩
			// - 동적 바인딩의 효과 : 하나의 코드로 여러 타입의 코드를 수행할 수 있음.
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
