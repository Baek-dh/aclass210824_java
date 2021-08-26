package edu.kh.variable.ex3;

// import : 외부 클래스는 얻어와서 해당 클래스 내부에서 사용 가능하게 함.
import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		
		// 스캐너를 통해서 입력 받은 문자열을 input 변수에 대입
		/*String input = sc.next(); 
		String input2 = sc.next();
		
		System.out.println("입력 받은 문자열 : " + input);
		System.out.println("입력 받은 문자열2 : " + input2);*/
		
		String input3 = sc.nextLine(); // 띄어 쓰기 포함 한 줄 입력 받기
		
		System.out.println("입력 받은 문자열3 : " + input3);
		
	}
	
}




