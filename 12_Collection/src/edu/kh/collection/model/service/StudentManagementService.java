package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.vo.Student;

public class StudentManagementService {

	private Scanner sc = new Scanner(System.in);
	
	private List<Student> stdList = new ArrayList<Student>();
	
	
	public void displayMenu() {
		
		int sel = 0;
		
		do {
			
			System.out.println("======== �л� ���� ���α׷� ========");
			System.out.println("1. �л� ��ü ��ȸ");
			System.out.println("2. �л� ���� �߰�"); // �̸�, ����, �г�
			System.out.println("3. �л� ���� ����"); // �̸�, ����, �г�
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �̸� �˻�");
			System.out.println("0. ����");
			
			System.out.print("�޴� ���� >> ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine(); // ���๮�� ����
			
				
				switch(sel) {
				case 1 : selectAll(); break;
				case 2 : addStudent(); break;
				case 3 : updateStudent(); break;
				//case 4 : deleteStudent(); break;
				//case 5 : searchStudentName();  break;
				case 0 : System.out.println("���α׷� ����"); break;
				default : System.out.println("�޴��� �ִ� ��ȣ�� �Է����ּ���.");
				
				}
				
			}catch (InputMismatchException e) {
				System.out.println("������ �Է����ּ���.");
				sel = -1; // �� ó�� sel == 0 �ΰ�� �ٷ� ����Ǵ� ���� ����
				sc.nextLine(); // �Է¹��ۿ� �����ִ� �߸� �Է��� ���� ����
			}
			
		}while(sel != 0);
		
	}
	
	
	// 1. �л� ��ü ��ȸ
	private void selectAll() {
		System.out.println("[�л� ��ü ��ȸ]");
		
		// �л� ������ ���� ���
		// 1�� �̸� ���� �г�
		// 2�� �̸� ���� �г�
		// 3�� �̸� ���� �г�
		
		// �л� ������ ���� ���
		// "�Էµ� �л� ������ �����ϴ�."
		
		// **  boolean isEmpty() �޼ҵ� **
		// -> �÷����� ��������� true, �ƴϸ� false ��ȯ
		
		// if(stdList == null)  (X)
		// --> JAVA���� null�� �����ϴ� �ּҰ� ������ �ǹ�. (��� �ִ� X)
		
		if( stdList.isEmpty() ) { // stdList�� ����ִٸ�
			System.out.println("�Էµ� �л� ������ �����ϴ�.");
		
		} else { // stdList�� ������� �ʴٸ�
			
			// �Ϲ� for�� ���
			for(int i=0 ; i<stdList.size() ; i++ ) {
				
				// stdList�� i��° �ε��� ��Ҹ� ���� Student �������� s�� ����
				Student s = stdList.get(i);
				
				System.out.printf("%d�� %s %d�� %d�г� \n", i+1, s.getName(), s.getAge(), s.getGrade());   
				
			}
			
		}
	}
	
	
	// 2,3�� �޴��� �л� ���� �Է� �޼ҵ�
	private Student inputStudent() throws InputMismatchException {
		// �޼ҵ� ���� �� ���� �߻� ��
		// ������ ó�� ����(try-catch)�� ���� ���
		// ȣ���� �޼ҵ�� ���ܸ� ������. (throws)
		
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		
		// �Է� ���� ���� �̿��� Student ��ü�� ���� �� �ʱ�ȭ�� �� �ش� ��ü�� �ּҸ� ��ȯ
		return new Student(name, age, grade);
		
	}
	

	
	// 2. �л� ���� �߰�
	private void addStudent() throws InputMismatchException {
		System.out.println("[�л� ���� �߰�]");
		
		// �̸�, ����, �г��� �Է� �޾� stdList�� �߰�
		
		// �Է� ���� ������ ������ �л� ��ü�� ��ȯ �޾� stdList�� �߰�
		stdList.add( inputStudent() );
	}
	
	
	// 3. �л� ���� ����
	// �̸�, ����, �г��� �Է� �޾� Ư�� index�� �ִ� �л� ������ ����
	private void updateStudent() {
		
		// + �ε��� ��ȣ�� �Է� �޾ƾ� �ǰ���?
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}