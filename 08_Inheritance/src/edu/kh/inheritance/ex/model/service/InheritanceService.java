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
	
	
	public void example3() {
		// ��� : �θ� Ŭ������ ���(�ʵ�, �޼ҵ�)�� 
		//       �ڽ��� ���� �޾� �ڽ��� ��ó�� ����ϴ� ��
		
		// ��� Ű���� : extends (Ȯ���ϴ�)
		// -> �ڽ��� ����� �θ��� ����� �߰��Ǿ� �ڽ��� ���� Ȯ��Ǵ� ���� ǥ�� (�޸� ���� ����)

		// - Ŭ�������� ���� ��� �Ұ�
		
		// - ��� Ŭ������ Object Ŭ������ �ļ�
		//   * Object Ŭ���� : �ڹٿ��� ��� ��ü���� ��������
		// 				     �������� ����� �߻�ȭ�� ���� �����Ͽ� ��Ƶ� �ֻ��� Ŭ����
		
		// - ��� �� �θ��� private ����� ��ӵǳ� �ڽ��� ���� ������ �� ����.
		//   -> ���� ���� ��� ��� : �θ��� setter/getter, super() ������
		
		// - ��� �� �θ��� ������, �ʱ�ȭ ����� ��ӵ��� �ʴ´�.
		//  -> ��, �ڽ� ������ ���ο��� �θ� �����ڸ� ȣ���ϴ� super() ������ ��� ����
		//     super() �����ڴ� �ݵ�� �ڽ� ������ ���� ���� �ۼ��Ǿ�� ��.
		
		
		// �������̵�(Overriding) 
		// - �ڽ� Ŭ������ ��� ���� �θ� Ŭ������ �޼ҵ带 ������ �ϴ� ��
		// - �޼ҵ尡 �������̵��� ��� 
		//   �ڽ�, �θ� �� Ŭ���� ���� �̸��� �޼ҵ尡 �����ϰ� �Ǵµ�
		//   �������̵� �� �ڽ��� �޼ҵ尡 ȣ�� �� �켱���� ����
		
		// �������̵� ���� ����
		// - �޼ҵ� �̸� ����
		// - �Ű������� ����, Ÿ��, ���� ����
		// - ��ȯ�� ����
		// - �θ��� private �޼ҵ�� �������̵� �� �� ����
		// - ���������ڴ� ���ų� �� ���� ����
		// - ����ó���� ���ų� �� ��ü������
		
		Student s1 = new Student();
		
		System.out.println( s1.overridingTest() );
		// �������̵��� �ڽ��� �޼ҵ尡 ����ȴ�.
		
		
		// *** �������̵�, �����ε� ������ �� �˾Ƶα�!
		
		// �����ε�(OverLoading)
		// - ���� Ŭ���� ������ ���� �̸��� �޼ҵ带 ���� �� �����ϴ� ��
		
		// �����ε� ���� ����
		// - �޼ҵ�� ����
		// - �Ű����� ����, Ÿ��, ���� �� �ϳ��� �޶�� �Ѵ�.
		// - ����������, ����ó��, ��ȯ���� ���� ����. (�ƹ��ų� ����)
		// -> Student Ŭ������ �����ε� ���� �ۼ�
		
		System.out.println(  s1.sum(10,20)   );
		System.out.println(  s1.sum(3.14, 2.12)  );
		// -> �޼��� ȣ�� �� ���ϴ� ����� ������
		//    �Ű������� Ÿ��, ����, ������ ���� ����Ǵ� �ڵ尡 �޶����� �� ��
		//    �����ε��� ����Ѵ�.
		
		// System.out.print();
		
	}
	
}









