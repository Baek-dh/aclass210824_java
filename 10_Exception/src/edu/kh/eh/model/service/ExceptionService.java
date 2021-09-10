package edu.kh.eh.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.eh.model.exception.DivideByTwoException;

public class ExceptionService {
	
	// 예외(Exception) : 소스 코드의 수정으로 해결 가능한 오류
	
	public void example1() {
		
		// 1. try - catch
		
		// try : 예외가 발생할 가능성이 있는 코드를 내부에 작성해서 시도하는 부분.
		
		// catch : try 구문 안에서 발생한 예외를 잡아내서 처리하는 부분.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 입력 받아 나누기한 몫 구하기");
		
		// 입력 1 : 4
		// 입력 2 : 2
		// 4 / 2 = 2

		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
		/*try {
		
			System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		
		}catch(ArithmeticException e) {
			  // try 구문에서 발생한 예외 중 catch할 예외를 매개변수로 작성
			System.out.println("0으로 나눌 수 없습니다.");
			
			// ArithmeticException : 산술 예외
			// -> 0으로 나누기를 진행하는 경우 보통 발생함.
		}*/
		
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		}
		
		// -> try-catch 구문을 사용하지 않아도 예외처리가 가능한 상황
		
		// -> ArithmeticException 처럼 if문을 통해 사전에 예외 발생을 방지할 수 있는 예외들이 있다.
		//    --> 꼭 예외처리 (try-catch)를 쓸 필요가 없다.
		//    --> UnCheckedException (꼭 예외처리 구문으로 확인할 필요 없다)
	}
	
	
	public void example2() {
		
		// 정수 두개를 입력 받아 두 정수의 곱을 출력하는 메소드
		// 단, 정수를 입력 받는 메소드는 별도로 작성
		
		int num1 = inputNumber(1);
		int num2 = inputNumber(2);
		
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		
	}
	
	
	public int inputNumber(int i) {
							// i == 순서
		
		Scanner sc= new Scanner(System.in);
		
		int num = 0;
		
		while(true) {
			System.out.print( i + "번째 정수 입력 : ");
			
			try {
				num = sc.nextInt(); // 다음 정수를 입력 받아 얻어와야 되지만
										// 실수 또는 다른 자료형을 입력했을 때
										// InputMismatchException 발생한다.
				break;
				
			}catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				
				sc.nextLine(); // 입력 버퍼에 남아있는 잘못 입력된 내용을 얻어와서
							   // 입력 버퍼를 깨끗이 하여 다음 정수 입력 시 문제가 발생하지 않도록 함.
			}
		}
			
		return num;
	}
	
	
	public void example3() {
		
		// finally :  try-catch 수행 후 마지막에 무조건 실행하는 코드를 작성하는 부분
		
		
		String str = null;
		// null : 아무것도 참조하지 않음. (비어 있다 X)
		
		str = "abc";
		try {
			System.out.println(  str.length()  );
			// NullPointerException : null 참조 예외
			// -> 참조 변수가 참조하는 객체가 없음을 의미
			
		}catch (NullPointerException e) {
			System.out.println("객체를 참조하고 있지 않습니다.");
		
		} finally {
			System.out.println("무조건 수행되는 코드");
			
		}
		
	}
	
	
	
	
	public void example4() {
		
		// throw : 예외 강제 발생 구문 (예외를 던짐)
		
		//throw new NullPointerException();
		// -> UnCheckedException : 반드시 예외처리 할 필요가 없음
		
		//throw new IOException();
		// -> CheckedException : 반드시 예외처리 해야함.
		// - if문으로 해결 불가
		// - 예외 상황이 발생할 수 있는 경우가 많을 때 무조건 확인해라
		
		BufferedReader br = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		// 키보드로 부터 문자열 입력 받기 위한 객체 선언
		// (Scanner 없던 시절에 사용하던 입력 방법, 속도는 더 빠름)
		
		System.out.print("문자열 입력 : ");
		
		try {
			String str = br.readLine(); // 입력된 문자열을 얻어와 str에 저장
										// IOExceptoin을 발생시킬 가능성이 있다.
										// -> try-catch로 처리
			
			System.out.println(str);
			
		}catch(IOException e) {
			System.out.println("예외 발생");
		}
		
		// shift + f2 -> JAVA API 문서 페이지에서 검색
		
	}
	
	
	public void example5() {
		
		// 두 정수를 입력 받아 나눈 몫 출력
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("입력 1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("입력 2 : ");
			int num2 = sc.nextInt();
			
			System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
			
		} catch(InputMismatchException e) {
			System.out.println("정수만 입력해주세요.");
			
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
		} catch(Exception e) { 
			// Exception : 모든 예외의 최상위 부모
			
			// 매개변수의 다형성이 적용되어 앞에서 처리되지 않은 모든 예외를
			// 처리할 수 있다.
			System.out.println("뭔지 모르겠지만 예외가 발생함");
			
			e.printStackTrace();
			// -> 어떤 예외가 발생했고
			//    이 예외가 발생하기 위해 호출된 모든 메소드를 순서대로 출력
			//  --> 예외 발생 시 console에 출력되는 빨간문장을 의미
		}
		
		
		// 예외 처리 시 catch문을 여러 개 작성할 수 있다.
		
		// try 구문에서 예외 발생 시 catch문을 위에서 아래로 차례대로 지나가며
		// 알맞은 catch문에 처리된다.
		
		// 발생하는 예외에 따라서 선택적으로 처리 할 수 있다.
		
		// catch문을 여러 개 작성하는 경우
		// 처리하려는 예외의 상속 관계를 파악하여
		// 부모를 아래쪽에서 처리하게 해야한다.
		
	}
	
	
	public void example6() {
		// methodA, methodB 에서 발생하는 예외를 모아서 처리
		
		try {
			methodA(); 
			
		}catch (IOException e) {
			System.out.println("예외 처리됨");
		}
		
	}
	
	public void methodA() throws IOException {
		
		methodB();
		// Unhandled exception type IOException
		
	}
	
	public void methodB() throws IOException{
		
		throw new IOException();
		// IOException 예외 강제 발생
	}
	
	
	
	public void example7() {
		
		try {
			divide(10, 2);
			
		}catch(DivideByTwoException e) {
			System.out.println("2로 나눌 수 없습니다.");
			e.printStackTrace();
		}
		
	}
	
	public void divide(int num1, int num2) throws DivideByTwoException  {
		
		if(num2 != 2) {
			System.out.println(num1 / num2);
		}else {
			
			// num2가 2인 경우 예외 강제 발생
			throw new DivideByTwoException("2로 못나눕니다!");
		}
		
	}
	
	
	
	
	
	
	

	
	
	
}
