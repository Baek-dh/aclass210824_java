package edu.kh.io.model.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOService {

	// File 클래스 : 파일 또는 폴더를 다룰 수 있는 자바 제공 클래스
	// 1) 이미 존재하는 파일 또는 폴더를 선택해서 다룸
	// 2) 존재하지 않는 파일 또는 폴더를 생성
	
	
	public void example1() {
		// 1. 존재하지 않는 파일 test1.txt 파일을 현재 프로젝트 폴더에 생성
		
		File f1 = new File("test1.txt");
							// 상대경로(현재 위치 기준)
							// 			--> 13_IO 폴더(프로젝트)
		
		
		// boolean createNewFile()
		// - 파일 생성 메서드
		// - 생성 성공 시 true, 실패 시 false 반환
							// -> 이미 파일이 존재하면 실패
		
		try {
			if( f1.createNewFile() ) {
				// Unhandled exception type IOException
				
				System.out.println("파일 생성 성공");
				
			}else {
				System.out.println("파일이 이미 존재합니다.");
			}
		
		}catch(IOException e) {
			System.out.println("파일 생성 중 예외 발생");
			e.printStackTrace(); 
			// 발생한 예외, 예외의 경로를 모두 출력
		}
	}
	
	
	
	// 스트림(Stream, 시냇물, 흐름) : 입출력산 데이터가 흘러가는 통로
	// -> 바이트 기반 스트림(1byte), 문자 기반 스트림(2byte) 
	
	public void example2() {
		
		// FileInputStream : 파일에 작성된 내용을 1byte씩 입력 받는 스트림
		// -> FileInputStream 객체 생성 시
		//    FileNotFoundException 예외 발생 가능성이 있어 이를 처리해야 함
		
		FileInputStream fis = null; // FileInputStream 참조 변수 선언. 
		
		try {
			
			fis = new FileInputStream("byte/inputTest1.txt");
			// 상대 경로(현재 위치를 기준 == 13_IO 프로젝트)
			
			// 외부에 있는 파일에 작성된 내용을
			// 1byte씩 내부로 읽어들이기
			
			// int read() : 파일의 데이터를 1byte씩 순서대로 읽어옴.
			//				더 이상 읽어올 데이터가 없으면 -1 반환
			// -> IOException 발생 가능성이 있음 -> 예외처리
			
			while(true) {
				int data = fis.read();
				
				if(data == -1) { // 더 이상 읽어올 데이터가 없으면 반복을 멈춤
					break;
				}
				
					
				System.out.print( (char)data );
				// int -> char 강제 형변환해서
				// 읽어들인 문자를 그대로 출력
			}
			
			
			//fis.close(); // FileInputStream을 닫음
						 // == 연결이 끊어짐 
						 // == FileInputStream 통로가 메모리로 반환 
						 // --> 자원 반환
			
		}catch(IOException e) {
			// -> 예외처리에 다형성이 적용된 형태
			// IOException은 FileNotFoundException의 부모이기 때문에
			// 다형성이 적용되어 
			// 발생되는 IOException, FileNotFoundException 모두 처리 가능
			
			e.printStackTrace();
		
		}finally { // 예외가 발생하든 말든 무조건 수행
			
			try {
				fis.close(); // 자원 반환
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	public void example3() {
		
		// 이번 수업의 point!
		// 1. 입출력의 개념
		// 2. 통로 개념(Stream, Connection)
		// 3. 자원 반환
		
		
		// FileOutputStream : 1바이트 단위로 프로그램 -> 파일로 쓰기(출력)
		
		// 1) FileOutputStream 참조 변수 선언
		FileOutputStream fos = null;
		
		// 2) try-catch-finally 작성
		try {
			
			// 4) FileOutputStream 객체 생성
			fos = new FileOutputStream("byte/outputTest1.txt", true);
			// 경로에 작성된 파일이 존재하지 않으면 자동으로 새파일을 생성함.
			// 있으면 덮어쓰기(false)
			// true == 이어쓰기
			
			
			// 5) Scanner로 입력 받은 문자열을 하나의 변수에 저장
			
			Scanner sc = new Scanner(System.in);
			
			String str = "";
			
			for(int i=0; i<3 ; i++) {
				
				System.out.print("입력 : ");
				str += sc.nextLine() + "\n";
				
			}
			
			
			// 6) 스트림에 연결된 파일로 출력하기
			// void write( 문자 )
			for(int i=0 ; i<str.length() ; i++) {
				fos.write( str.charAt(i)  );
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			
			// 3) 사용한 스트림 자원 반환
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public void example4() {
		
		// FileReader : 파일 -> 프로그램으로 문자(2byte) 단위로 읽어오는 문자 기반 스트림
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("char/inputTest2.txt");
			
			while(true) {
				
				int data = fr.read(); // 한 문자씩 읽어옴. 없으면 -1
				
				if(data == -1) {
					break;
				}
				
				System.out.print(  (char)data );
									// int->char 다운캐스팅
			}
			
		}catch (IOException e) {
			e.printStackTrace();
	
		}finally {
			
			try {
				fr.close(); // 자원 반환
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}
	}
	
	
	
	
	
	public void example5() {
		
		// FileWriter : 프로그램 -> 파일로 쓰는(출력) 문자 기반 스트림
		
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("char/outputTest2.txt", true);
			// true : 이어쓰기
			// false : 덮어쓰기
			
			Scanner sc = new Scanner(System.in);
			String str = "";
			
			for(int i=0 ; i<3 ; i++) {
				
				System.out.print("입력 : ");
				
				str += sc.nextLine() + "\n";
			}
			
			// FileWriter.write(문자열) : 문자열을 한 번에 출력함
			fw.write(str);
			
			System.out.println("파일 출력 완료");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
