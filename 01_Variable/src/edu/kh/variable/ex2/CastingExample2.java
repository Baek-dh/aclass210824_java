package edu.kh.variable.ex2;

public class CastingExample2 {

	public static void main(String[] args) {
		
		// 강제 형변환
		// - 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로
		//   강제로 변환 하는 것.
		// - 큰 데이터를 강제로 잘라서 변환하는 자료형에 넣어주기 때문에
		//   데이터 손실이 발생할 수 있다.
		
		int iNum = 290;
		byte bNum = (byte)iNum; // iNum을 byte로 강제 형변환
		// byte의 값의 범위는 -128 ~ 127 까지인데
		// 더 큰 수인 290이 대입 되었으므로 데이터 손실이 발생함.
		System.out.println("bNum : " + bNum); // 34
		
		
		// 강제 형변환 활용 1번 - 소수점 아래 버림 처리
		double height = 169.5;
		int iNum2 = (int)height;	
		
		System.out.println("iNum2 : " + iNum2);
		
		// 강제 형변환 활용 2번 - 특정 정수가 어떤 문자를 나타내는지 확인
		// int -> char
		int iNum3 = 75;
		System.out.println(   (char)iNum3  );
		
		// 소문자 a보다 5칸 뒤에있는 문자는 무엇인가?
		char ch = 'a';
		System.out.println(  (char)(ch + 5)  );
		
		
		char ch2 = 'a' + 5;
		// 강제 형변환의 대상이지만 이를 무시하는 특별한 경우
		// -> char 자료형 변수 선언과 동시에 초기화를 하는 경우
		//    초기화 되는 값이 int 자료형이 이라도 자동으로 char로 인식됨
		
		
		
		// 데이터 오버플로우
		// -> 코드 내 연산 중 결과가 값의 범위를 초과하는 경우 발생
		// -> 컴파일러가 에러를 검출하지 못함.
		//    기획, 설계 단계에서 예측을 해야만 한다.
		
		int view1 = Integer.MAX_VALUE; // int 최대값
					// 2147483647
		System.out.println("view1 : " + (view1 + 1) );
	}
}


