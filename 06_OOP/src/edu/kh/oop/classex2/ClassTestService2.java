package edu.kh.oop.classex2;

// 다른 패키지에 존재하는 클래스인 경우 import 수행
import edu.kh.oop.classex1.ClassTest1;
// import edu.kh.oop.classex1.ClassTest2;

public class ClassTestService2 {

	public void test() {
		ClassTest1 t1 = new ClassTest1(); // public 문제 없음
		// -> 같은 프로젝트
		
		// ClassTest2 t2 = new ClassTest2(); //(dafault) 문제 발생!
		// 왜? 패키지가 달라서 접근 불가능
	}
	
	// 클래스에서 왜 접근제한자를 사용할까?
	// 1. 보안 또는 접근 권한 : 특정 기능 수행시만 사용할 수 있는 클래스
	// 2. 클래스명 중복 : 접근 권한을 다르게 함으로써
	//				  외부 패키지 작업 시 중복되는 이름이 노출되지 않게ㅅ
	// * 특별한 경우가 아니면 모두 public으로 작성하는 것이 암묵적 규칙
	
	
	
	
}
