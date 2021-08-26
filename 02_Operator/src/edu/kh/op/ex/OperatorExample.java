package edu.kh.op.ex;

import java.util.Scanner;

// 기능 제공용 클래스
public class OperatorExample {

	// 기능 == 행동 == 메소드
	// 기능별로 메소드 하나씩 생성하면 된다!
	
	public void example1() {
		// 단항 연산자 -> 논리 부정 연산 (!)
		// 논리 값을 반대로 변경하는 연산자
		
		boolean isTrue = true;
		
		System.out.println("isTrue : " + isTrue); // true
		System.out.println("!isTrue : " + !isTrue); // false
		
	}
	
	
	public void example2() {
		// 증감 연산자(++, --)
		// - 피연산자를 1 증가시키거나 감소시키는 연산자
		
		// 전위 연산
		// - 먼저 1을 증가 또는 감소시키고 나서 다른 연산을 수행
		int num1 = 10; 
		
		int num2 = ++num1; 
		// -> num2 대입 연산이 이루어지기 전에
		//    num1을 1 증가(10 -> 11) 시킴
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		
		// 후위 연산
		// - 다른 연산을 먼저 수행한 후 마지막에 1 증가 또는 감소
		int num3 = 10;
		int num4 = num3++;
		// -> num4에 num3(10)를 먼저 대입한 후
		//    num3를 1 증가(10 -> 11) 시킴
		
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		//      3++ + --5
		//      3 + 4
		//  c = 7  
		
		// 최종적으로 a,b,c 의 값은 얼마인가?
		// a == 4
		// b == 4
		// c == 7
		System.out.println(a + " / " + b + " / " + c);
							// 4 / 4 / 7
		
	}
	
	
	public void example3() {
		// 산술 연산자 (+ - * / %)
		// - 우선 순위 
		// 선 : * / %
		// 후 : + -
		
		// "/" : 나눴을 때 몫을 구하는 연산자
		// "%" : 나눴을 때 나머지를 구하는 연산자
		
		int num = 5;
		System.out.printf("%d / %d = %d\n", num, 3, num/3);
		System.out.printf("%d %% %d = %d\n", num, 3, num%3);
		// %%를 쓰는 이유 : %d, %f, %s %를 이용해서 패턴을 지정하기 때문에
		// %문자를 단독 사용할 수 없음. -> %% 작성해야 '%'로 인식됨
		
		
		// 나누어 떨어지다 == 나눴을 때 나머지가 0이다
		// ex) 3으로 나눠서 떨어지는 수
		// 3 6 9 12 15 ... (3의 배수)
		
		System.out.println(  5 % 3 == 0  );
		// 5를 3으로 나눴을 때 나머지가 0인가?
		// == 5는 3의 배수인가? false
		
		System.out.println(  273 % 3 == 0  );
		// 273을 3으로 나눴을 때 나머지가 0인가?
		// == 273은 3의 배수인가? true
	}
	
	
	public void example4() {
		// 비교 연산자( ==, !=, >, <, >=, <= )
		// - 연산 기호가 두개 연달아 작성되는 형태일 경우
		//   "=" 기호가 항상 오른쪽
		
		// - 비교 연산자의 연산 결과는 무조건 true / false (논리형) 이다.
		
		int a = 10;
		int b = 20;
		
		System.out.println( a == b ); // false
		System.out.println( a != b ); // true
		System.out.println( !(a == b) ); // true
		System.out.println( (a == b) == false ); // true
		
		System.out.println("------------------------------");
		
		int c = 4;
		int d = 5;
		
		System.out.println( c < d  ); // true
		System.out.println( c+1 < d  ); // false
		System.out.println( c+1 <= d  ); // true
		
		System.out.println( (++c != d) == (--c != d)  );
						//    5 != 5        4  != 5
						//    false    ==    true   -> false
		
		
		System.out.println("---------------------------------");
		
		int num = 123;
		
		System.out.println("num은 짝수인가? " +  (num % 2 == 0)  );
		System.out.println("num은 짝수인가? " +  (num % 2 != 1)  );
		
		System.out.println("num은 홀수인가? " +  (num % 2 == 1)  );
		System.out.println("num은 홀수인가? " +  (num % 2 != 0)  );
	}
	
	
	public void example5() {
		// 논리 연산자 (&&, ||)
		
		// &&(AND) : 둘다 true 일때만 true, 나머지는 false
		// -> 그리고( ~이고), ~면서, ~이면서, ~부터 ~까지, ~사이
		
		
		// ||(OR) : 둘다 false 일때만 false, 나머지는 true
		// -> 또는, ~거나, ~이거나
		
		int a = 100;
		
		// a는 100 이상이면서 짝수인가?
		System.out.println(  (a >= 100)  &&  (a % 2 == 0)    );

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		// 입력 받은 정수가 1 이상 100 이하인가?
		// == input이 1에서 100 사이 정수인가?
		
		boolean result =  input >= 1  &&  input <= 100;
		
		System.out.println("입력 받은 수는 1 이상, 100 이하인가? " + result);
		
		
		// 입력 받은 수가 1 미만 이거나 100 초과인가?
		boolean result2 = input < 1   ||  input > 100;
		System.out.println("입력 받은 수는 1 미만 이거나, 100 초과인가?" + result2);
		
	}
	
	
	public void example6() {
		
		// 복합 대입 연산자( +=, -=, *=, /=, %= )
		// - 피연산자가 자신과 연산 후 결과를 다시 자신에게 대입
		// - 증감 연산자는 1씩 증가, 감소
		//   복합 대입 연산자는 원하는 만큼 증가, 감소, 곱, 나누기 가능
		
		int a = 10;
		
		a += 5; // a = 10 + 5; == 15
		System.out.println(a); // 15
		
		a -= 10; // a = 15 - 10 == 5
		System.out.println(a); // 5
		
		a *= 4; // a = 5 * 4 == 20
		System.out.println(a); // 20
		
		a /= 3; // a = 20 / 3 == 6
		System.out.println(a); // 6
		
		a %= 5; // a = 6 % 5 == 1
		System.out.println(a); // 1
	}
	
	
	public void example7() {
		// 삼항 연산자  (  조건식 ? 식1 : 식2  )
		
		// - 조건식 : 연산 결과가 true/false인 식
		//			(비교, 논리, 논리 부정 연산자가 포함된 식)
		
		// - 조건식 결과가 true일 때  : 식1 수행
		// - 조건식 결과가 false일 때 : 식2 수행
		
		// 입력 받은 수가 홀수인지, 짝수인지 검사
		// 홀수이면 "홀수 입니다"
		// 짝수이면 "짝수 입니다"
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		String result = input % 2 == 1 ? "홀수" : "짝수";
		// 조건식 결과에 따라 result 변수에 "홀수" 또는 "짝수" 문자열을 대입
		
		System.out.println( result + " 입니다");
		
	}
	
	
	public void example8() {
		
		// 정수를 하나 입력 받아 양수인지, 음수인지 판별
		
		// 결과화면)
		// 정수 하나 입력 : 3
		// 3은/는 양수입니다.
		
		// 결과화면)
		// 정수 하나 입력 : -5
		// -5은/는 음수입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		String result = input >= 0 ? "양수" : "음수";
		
		System.out.println(input + "은/는 " + result + "입니다.");
		
	}
	
	
	public void example9() {
		// 예제 8번에서 발생한 이슈사항 : 0은 양수? 음수? 해결하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		// 삼항 연산자의 중첩 사용
		String result = input > 0 ? "양수" : ( input == 0 ? "0" : "음수" );
		
		System.out.println(input + "은/는 " + result + "입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
