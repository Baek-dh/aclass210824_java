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
			System.out.println("6. �̸�, ����, �г��� ��ġ�ϴ� �л� �ε��� ��ȸ");
			System.out.println("7. �̸�, ����, �г��� ��ġ�ϴ� �л� �ε��� ��ȸ version2");
			System.out.println("0. ����");
			
			System.out.print("�޴� ���� >> ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine(); // ���๮�� ����
			
				
				switch(sel) {
				case 1 : selectAll(); break;
				case 2 : addStudent(); break;
				case 3 : updateStudent(); break;
				case 4 : deleteStudent(); break;
				case 5 : searchStudentName();  break;
				
				case 6 : selectIndex(); break;
				case 7 : selectIndex2(); break;
				
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
	private void updateStudent() throws InputMismatchException {
		
		// 1) �ε��� ��ȣ �Է� �ޱ�
		System.out.print("������ �л��� �ε��� ��ȣ �Է� : ");
		int inputIndex = sc.nextInt();
		sc.nextLine(); // �Է� ���ۿ��� ���� ���� ����
		// 2) �ش� �ε����� stdList�� �ִ��� �˻�
		
		// 2-1) ����ִ��� Ȯ��
		if( stdList.isEmpty()  ) {
			System.out.println("�Էµ� �л� ������ �����ϴ�.");
		}else {
			
			// 2-2) ���� �Է� Ȯ��
			if(inputIndex < 0) {
				System.out.println("������ �Է��� �� �����ϴ�.");
			}else {
				
				// 2-3) �Էµ� �ε����� stdList ���� ���� �ִ��� Ȯ��
				if( inputIndex < stdList.size() ) {
					
					// 3-1) �ε����� ���� ��� �л� ������ �Է� �޾� ����
					stdList.set(inputIndex,  inputStudent());
												// -> Student ��ü �ּ� ��ȯ
					
				}else {
					
					// 3-2) �ε����� ���� ��� "index�� �������� ����" ���� ���
					System.out.println("index�� �������� ����");
				}
			}
		}	
	}
	
	
	
	// 4. �л� ���� ����
	private void deleteStudent() {
		System.out.println("[�л� ���� ����]");
		
		// �ε��� ��ȣ�� �Է� �޾� �ش� �ε��� �л� ������ ����
		System.out.print("������ �л� �ε��� ��ȣ �Է� : ");
		int inputIndex = sc.nextInt();
		sc.nextLine();
		
		if( !stdList.isEmpty() ) { // stdList ������� �ʴٸ�
			
			if( inputIndex >= 0 ) { // �Է� ���� index�� 0 �Ǵ� ���
				
				if(inputIndex < stdList.size() ) { // �����ϴ� index�� ���
					stdList.remove(inputIndex);
					System.out.println("�����Ǿ����ϴ�.");
					
				}else { // �������� �ʴ� �ε���
					System.out.println("index�� �������� ����");
				}
				
			}else { // ����
				System.out.println("������ �Է��� �� �����ϴ�.");
			}
			
		}else {// stdList ����ִٸ�
			System.out.println("�Էµ� �л� ������ �����ϴ�.");
		}
		
	}
	
	
	// �л� �̸� �˻�
	private void searchStudentName() {
		
		// �̸��� �Է� �޾� ��ġ�ϴ� �л��� �ε��� ��ȣ�� �л� ������ ���
		// ������ "�������� �ʴ� �л��Դϴ�" ���
		
		// 1) �̸� �Է�
		System.out.print("�˻��� �л� �̸� �Է� : ");
		String inputName = sc.nextLine();

		// 2-1) stdList�� ����ִ��� �˻�
		if( !stdList.isEmpty() ) {

			boolean flag = true; // �˻� ��� ���� ���ο� ���� ��ȣ
			
			// 2-2) �Է� ���� �л��� stdList�� �ִ� �˻�
			for(int i=0 ; i<stdList.size() ; i++) {
				
				// 3-1) ������ �ε��� + �л� ���� ���
				if(  inputName.equals(  stdList.get(i).getName()  )   ) {
					
					System.out.println("�ε��� ��ȣ : " + i);
					System.out.println("��ȸ �� ��� ��ȣ : " + (i + 1));
					System.out.println(stdList.get(i)); // �ڵ����� toString() �޼ҵ� ȣ��
					
					//break; // ���������� ���� �� ����
				
					flag = false;
				} 
			}
			
			// 3-2) ������ "�������� �ʴ� �л��Դϴ�"
			if(flag) { // for�� �ݺ� �Ŀ��� flag == true�� ��� == �˻� ��� X
				System.out.println("�������� �ʴ� �л��Դϴ�");
			}
			
		}else {
			System.out.println("�Էµ� �л� ������ �����ϴ�.");
		}
	}
	
	
	
	// 6. �̸�, ����, �г��� ��ġ�ϴ� �л� �ε��� ��ȸ
	private void selectIndex() {
		System.out.println("[�̸�, ����, �г��� ��ġ�ϴ� �л� �ε��� ��ȸ]");
		
		// 1) �̸�, ����, �г��� �Է� �ޱ�
		Student std = inputStudent();
		
		// 2) stdList���� ���� ��� ��ġ�ϴ� �л��� �ε����� ���
		boolean flag = true;
		
		for(int i=0 ; i<stdList.size() ; i++) {
			
			// ���� ������ stdList ���� ��ü�� s������ ����
			Student s = stdList.get(i);
			
			// �̸�, ����, �г��� ��ġ�ϴ� ���
			if( s.getName().equals( std.getName() )  &&  
				s.getAge() == std.getAge()  &&
				s.getGrade() == std.getGrade() ) {
				
				System.out.println("�ε��� ��ȣ : " + i);
				
				flag = false;
			}
		} // for end
		
		if(flag) {
			System.out.println("��ġ�ϴ� �л��� �������� �ʽ��ϴ�.");
		}
		
		
	}
	
	
	
	// 7. �̸�, ����, �г��� ��ġ�ϴ� �л� �ε��� ��ȸ version2
	private void selectIndex2() {
		System.out.println("[�̸�, ����, �г��� ��ġ�ϴ� �л� �ε��� ��ȸ version2]");
		
		// 1) �̸�, ����, �г� �Է�
		Student std = inputStudent();
		
		// 2) Object.equals() �޼ҵ� -> �������̵�
		
		// �׽�Ʈ
		//System.out.println( std.equals( new Student("ȫ�浿", 15, 2))  );
		
		
		// 3) int List.indexOf(Object o) �޼ҵ�
		// -> ����Ʈ���� �Ű����� o�� ���� ��ü�� �����ϴ� index�� ��ȯ , ������ -1 ��ȯ
		// ���� ��ü���� Ȯ���ϴ� equals() �������̵� �ʼ�!
		
		//System.out.println( stdList.indexOf(std) );
		// stdList�� std�� ���� ���� ���� ��ü�� �ε��� ���
		
		if( stdList.indexOf(std) != -1 ) {
			System.out.println("�ε��� ��ȣ : " + stdList.indexOf(std));
		}else {
			System.out.println("��ġ�ϴ� �л��� �������� �ʽ��ϴ�.");
		}
		
	}
	
	
	
	
	
	
	
}
