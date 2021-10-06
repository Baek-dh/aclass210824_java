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

	// File Ŭ���� : ���� �Ǵ� ������ �ٷ� �� �ִ� �ڹ� ���� Ŭ����
	// 1) �̹� �����ϴ� ���� �Ǵ� ������ �����ؼ� �ٷ�
	// 2) �������� �ʴ� ���� �Ǵ� ������ ����
	
	
	public void example1() {
		// 1. �������� �ʴ� ���� test1.txt ������ ���� ������Ʈ ������ ����
		
		File f1 = new File("test1.txt");
							// �����(���� ��ġ ����)
							// 			--> 13_IO ����(������Ʈ)
		
		
		// boolean createNewFile()
		// - ���� ���� �޼���
		// - ���� ���� �� true, ���� �� false ��ȯ
							// -> �̹� ������ �����ϸ� ����
		
		try {
			if( f1.createNewFile() ) {
				// Unhandled exception type IOException
				
				System.out.println("���� ���� ����");
				
			}else {
				System.out.println("������ �̹� �����մϴ�.");
			}
		
		}catch(IOException e) {
			System.out.println("���� ���� �� ���� �߻�");
			e.printStackTrace(); 
			// �߻��� ����, ������ ��θ� ��� ���
		}
	}
	
	
	
	// ��Ʈ��(Stream, �ó���, �帧) : ����»� �����Ͱ� �귯���� ���
	// -> ����Ʈ ��� ��Ʈ��(1byte), ���� ��� ��Ʈ��(2byte) 
	
	public void example2() {
		
		// FileInputStream : ���Ͽ� �ۼ��� ������ 1byte�� �Է� �޴� ��Ʈ��
		// -> FileInputStream ��ü ���� ��
		//    FileNotFoundException ���� �߻� ���ɼ��� �־� �̸� ó���ؾ� ��
		
		FileInputStream fis = null; // FileInputStream ���� ���� ����. 
		
		try {
			
			fis = new FileInputStream("byte/inputTest1.txt");
			// ��� ���(���� ��ġ�� ���� == 13_IO ������Ʈ)
			
			// �ܺο� �ִ� ���Ͽ� �ۼ��� ������
			// 1byte�� ���η� �о���̱�
			
			// int read() : ������ �����͸� 1byte�� ������� �о��.
			//				�� �̻� �о�� �����Ͱ� ������ -1 ��ȯ
			// -> IOException �߻� ���ɼ��� ���� -> ����ó��
			
			while(true) {
				int data = fis.read();
				
				if(data == -1) { // �� �̻� �о�� �����Ͱ� ������ �ݺ��� ����
					break;
				}
				
					
				System.out.print( (char)data );
				// int -> char ���� ����ȯ�ؼ�
				// �о���� ���ڸ� �״�� ���
			}
			
			
			//fis.close(); // FileInputStream�� ����
						 // == ������ ������ 
						 // == FileInputStream ��ΰ� �޸𸮷� ��ȯ 
						 // --> �ڿ� ��ȯ
			
		}catch(IOException e) {
			// -> ����ó���� �������� ����� ����
			// IOException�� FileNotFoundException�� �θ��̱� ������
			// �������� ����Ǿ� 
			// �߻��Ǵ� IOException, FileNotFoundException ��� ó�� ����
			
			e.printStackTrace();
		
		}finally { // ���ܰ� �߻��ϵ� ���� ������ ����
			
			try {
				fis.close(); // �ڿ� ��ȯ
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	public void example3() {
		
		// �̹� ������ point!
		// 1. ������� ����
		// 2. ��� ����(Stream, Connection)
		// 3. �ڿ� ��ȯ
		
		
		// FileOutputStream : 1����Ʈ ������ ���α׷� -> ���Ϸ� ����(���)
		
		// 1) FileOutputStream ���� ���� ����
		FileOutputStream fos = null;
		
		// 2) try-catch-finally �ۼ�
		try {
			
			// 4) FileOutputStream ��ü ����
			fos = new FileOutputStream("byte/outputTest1.txt", true);
			// ��ο� �ۼ��� ������ �������� ������ �ڵ����� �������� ������.
			// ������ �����(false)
			// true == �̾��
			
			
			// 5) Scanner�� �Է� ���� ���ڿ��� �ϳ��� ������ ����
			
			Scanner sc = new Scanner(System.in);
			
			String str = "";
			
			for(int i=0; i<3 ; i++) {
				
				System.out.print("�Է� : ");
				str += sc.nextLine() + "\n";
				
			}
			
			
			// 6) ��Ʈ���� ����� ���Ϸ� ����ϱ�
			// void write( ���� )
			for(int i=0 ; i<str.length() ; i++) {
				fos.write( str.charAt(i)  );
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			
			// 3) ����� ��Ʈ�� �ڿ� ��ȯ
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public void example4() {
		
		// FileReader : ���� -> ���α׷����� ����(2byte) ������ �о���� ���� ��� ��Ʈ��
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("char/inputTest2.txt");
			
			while(true) {
				
				int data = fr.read(); // �� ���ھ� �о��. ������ -1
				
				if(data == -1) {
					break;
				}
				
				System.out.print(  (char)data );
									// int->char �ٿ�ĳ����
			}
			
		}catch (IOException e) {
			e.printStackTrace();
	
		}finally {
			
			try {
				fr.close(); // �ڿ� ��ȯ
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}
	}
	
	
	
	
	
	public void example5() {
		
		// FileWriter : ���α׷� -> ���Ϸ� ����(���) ���� ��� ��Ʈ��
		
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("char/outputTest2.txt", true);
			// true : �̾��
			// false : �����
			
			Scanner sc = new Scanner(System.in);
			String str = "";
			
			for(int i=0 ; i<3 ; i++) {
				
				System.out.print("�Է� : ");
				
				str += sc.nextLine() + "\n";
			}
			
			// FileWriter.write(���ڿ�) : ���ڿ��� �� ���� �����
			fw.write(str);
			
			System.out.println("���� ��� �Ϸ�");
			
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