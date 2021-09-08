package edu.kh.inheritance.ex.model.service;

import edu.kh.inheritance.ex.model.vo.Person;
import edu.kh.inheritance.ex.model.vo.Student;

public class InheritanceService {

	public void example1() {
		// Person, Student ��� Ȯ��
		
		// 1) Person ��ü ����
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setAge(20);
		p1.setNationality("���ѹα�");
		
		// 2) Student ��ü ����
		Student s1 = new Student();
		
		// * s1. �Է� �� ��� ���� �θ��� setter/getter�� �ڵ� �ϼ� ������ ���ԵǾ� �ִ��� Ȯ��
		s1.setName("�츣�̿´�");  	// ��ӹ��� �޼���
		s1.setAge(15); 				// ��ӹ��� �޼���
		s1.setNationality("����"); 	// ��ӹ��� �޼���
		s1.setGrade(2);
		s1.setClassRoom(3);
		
		System.out.println( s1.getName() ); 		// ��ӹ��� �޼���
		System.out.println( s1.getAge() ); 			// ��ӹ��� �޼���
		System.out.println( s1.getNationality() ); 	// ��ӹ��� �޼���
		System.out.println( s1.getGrade() );
		System.out.println( s1.getClassRoom() );
		
		
		// Object�� ��� Ŭ������ �ֻ��� �θ�(����)�̴�.
		// == ��� Ŭ������ Object Ŭ������ �ļ��̴�.
		
		p1.hashCode(); 
		// Person���� hashCode()�� �ۼ����� �ʾ����� ����� �� �ִ�
		// == ��� ���� Object�� hashCode()�� ����� �� �ִ�.
		
		s1.hashCode();
		// Object -> Person -> Student ��� ���� �޾� ����� �� ����
		
		
		Student s2 = new Student(3, 10, "��浿", 16, "���ѹα�");
		
		System.out.println("===== super() ������ Ȯ�� =====");
		System.out.println( s2.getName()  );
		System.out.println( s2.getAge()  );
		System.out.println( s2.getNationality()  );
		
		
		System.out.println("===== super �������� Ȯ�� =====");
		System.out.println(s2.information());
		
	}
	
	public void example2() {
		// �������̵� , �����ε� ����
		
		// 1. Object�� toString()�� �������̵� �ϱ� �� 
		// edu.kh.inheritance.ex.model.vo.Person@139a55
		
		// 2. Object�� toString()�� �������̵� �� 
		// ȫ�浿 / 20 / ���ѹα�
		
		Person p1 = new Person("ȫ�浿", 20, "���ѹα�");
		
		System.out.println(  p1  );
		// print ���� ���� ���� ���������� �ۼ��ϸ� �ش� ��ü�� toString()�� �����
		
		Student s1 = new Student( 3, 3, "������������", 19, "�̱�");
		System.out.println( s1.toString() );
		System.out.println( s1 );
	}
	
	
	
	
	
	
}
