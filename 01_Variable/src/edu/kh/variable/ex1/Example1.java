package edu.kh.variable.ex1;
// 현재 class가 해당 패키지 안에 있음을 명시

public class Example1 {
	
	public static void main(String[] args) {
	// 메인 메소드 : 자바 프로그램을 실행 시킬 때 필요함.
		
		System.out.println(2 * 3.141592653589793 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592653589793 * 5 * 5 * 20);
		System.out.println(4 * 3.141592653589793 * 5 * 5);
		
		// Run 단축키 : ctrl + f11
		
		System.out.println("------------------------------------");
		
		// 변수를 생성하여 사용
		double pi = 3.141592653589793; // 원주율
		int r = 5; // 반지름
		int h = 20; // 높이
		
		System.out.println(2 * pi * r); // 원의 둘레
		System.out.println(pi * r * r); // 원의 넓이
		System.out.println(pi * r * r * h); // 원기둥의 부피
		System.out.println(4 * pi * r * r); // 구의 겉넓이
		
		// 변수의 장점
		// 1. 가독성이 좋아진다. (가독성 증가)
		// 2. 재사용이 가능하다.
		// 3. 코드 길이가 짧아진다. (코드량 감소)
		// 4. 유지보수성 증가
		
		
		
	}
	
}
