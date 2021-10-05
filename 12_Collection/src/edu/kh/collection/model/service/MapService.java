package edu.kh.collection.model.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.model.vo.Student;

public class MapService {
	
	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	
	// - Key는 중복을 허용하지 않고, 순서가 없어서 (== Set 특징)
	//   Map 내부에 뒤죽박죽으로 저장됨
	
	// - Value는 Key에 의해서 서로 구분되기 때문에 중복이 가능하다
	//	 (== List 특징)
	
	
	public void example1() {
		
		// HashMap<K, V> : Java Map중 가장 기초되는 Map
		// -> Key에 해당하는 객체는
		//    반드시 equals(), hashCode()가 오버라이딩 되어 있어야 함.
		
		Map<String, Student> map = new HashMap<String, Student>();
		// Key는 String,  Value는 Student로 제한된 Map 생성
		
		
		// put(Key , Value) : Map에 데이터 추가
		map.put("S001", new Student("홍길동", 15, 2) );
		map.put("S002", new Student("김미영", 19, 3) );
		map.put("S003", new Student("홍길동", 15, 2) ); // Value 중복 (O)
		
		map.put("S002", new Student("김민지", 19, 3) ); // Key 중복 (X)
		// -> 기존에 value를 새로운 value로 수정한다
		
		System.out.println(map); // map.toString()
		
	}
	
	
	
	public void example2() {
		
		// Map에서 데이터 하나씩 접근하는 방법
		Map<Integer, String> map = new HashMap<>();
											// == 타입 추론
		
		map.put( 1, "고추바사삭" );
		map.put( 2, "뿌링클" );
		map.put( 3, "허니콤보" );
		map.put( 4, "블랙알리오" );
		map.put( 5, "황금올리브" );
		map.put( 6, "자메이카 통다리" );
		
		
		// get(key) : 매개변수로 작성된 key와 매핑되는 value를 반환
		System.out.println(  map.get(3)  ); // 허니콤보
		System.out.println(  map.get(5)  ); // 황금올리브
		
		
		// 모든 요소 반복 접근하기 
		
		// 1. Iterator 사용
		
		// 1) map에서 key만 모아둔 집합(Set)을 얻어오는 메소드인 keySet() 호출
		Set<Integer> set =  map.keySet();
		
		// 2) 얻어온 set을 반복 접근하기 위한 Iterator로 변경
		Iterator<Integer> it = set.iterator();
		
		// 3) while문을 이용해서 반복 접근
		while(it.hasNext()) {
			
			// 4) 다음 접근한 key를 얻어와 변수에 저장
			int key = it.next();
			
			// 5) get(key) 메소드를 이용해서 value를 얻어와 출력
			System.out.printf("key : %d , value : %s \n", key , map.get(key) );
		}
		
		
		
		// 2. 향상된 for문 사용
		
		System.out.println("-------------------------------");
		
		// 1) keySet() 메소드를 이용하여 key만 뽑아내기
		Set<Integer> set2 = map.keySet();
		
		// 2) 향상된 for문으로 반복 접근
		for( int key : set2  ) {
			
			// 3) get(key)로 value 얻어오기
			System.out.printf("key : %d , value : %s \n", key , map.get(key));
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
