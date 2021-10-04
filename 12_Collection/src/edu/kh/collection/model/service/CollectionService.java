package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.kh.collection.model.vo.Person;
import edu.kh.collection.model.vo.Student;

public class CollectionService {
	
	public void example1() {
		
		ArrayService array = new ArrayService();
		
		// ctrl + alt + ȭ��ǥ �Ʒ�
		
		// �л� ��ü�� �߰�
		if(  array.add( new Student("ȫ�浿", 15, 2) )    ) {
			System.out.println("�л� ���� �߰� ����");
		}
		
		if(  array.add( new Student("���浿", 16, 3) )    ) {
			System.out.println("�л� ���� �߰� ����");
		}
		
		if(  array.add( new Student("����", 8, 1) )    ) {
			System.out.println("�л� ���� �߰� ����");
		}
		
		// 4��° �л� ���� �߰�
		// -> stdList ���̰� 3�̱� ������ �迭 ���� �ʰ� ���� �߻�
		// --> �迭 ���� ���� �ڵ� �߰�
		if(  array.add( new Student("�迵��", 17, 1) )    ) {
			System.out.println("�л� ���� �߰� ����");
		}
		
		
		// �߰��� �л� ���� ���
		System.out.println( array.toString()  );
		
	}
	
	
	// List ����
	public void example2() {
		
		// Collection�̶�? �ڹٿ��� �����ϴ� �ڷᱸ���� ����ϴ� �����ӿ�ũ
		
		// 1) ũ�� ������ ����
		// 2) �߰�, ����, ����, ���� ���� ����� ����Ǿ� ����.
		// 3) ���� ������ Ÿ�� ���� ����.
		
		
		// List (�������̽�)
		// ������ �����Ǹ� (index Ȱ��)
		// �ߺ� ������ ������ �����ϴ�. (���� ���Ƶ� index�� ���еǱ� ������)
		
		// ArrayList
		// - List�� �ļ� Ŭ����
		// - �迭�� ����� ������ ����Ʈ (���� �⺻���̰� ���� ����)
		
		ArrayList list = new ArrayList(); // �⺻ �����ڷ� ���� �� �ʱ� �뷮 10
		ArrayList stdList = new ArrayList(3); // �ʱ� �뷮 3 
		
		// 1. add(E e) : ����Ʈ�� �� ���� �߰�
		if(   stdList.add( new Student("ȫ�浿", 15, 2)  )   ) {
			System.out.println("�л� ���� �߰� ����(ArrayList)");
		}
		
		if(   stdList.add( new Student("���浿", 16, 3)  )   ) {
			System.out.println("�л� ���� �߰� ����(ArrayList)");
		}
		
		if(   stdList.add( new Student("����", 8, 1)  )   ) {
			System.out.println("�л� ���� �߰� ����(ArrayList)");
		}
		
		// �ڵ����� ArrayList ���̰� �����ϴ��� Ȯ��
		if(   stdList.add( new Student("�迵��", 17, 1)  )   ) {
			System.out.println("�л� ���� �߰� ����(ArrayList)");
		}
		
		
		// 2. toString() : ����Ʈ�� ����� ��� ��Ҹ� �� ���� ���ڿ��� ��ȯ
		System.out.println( stdList.toString() );
		
		
		// 3. add(int index, E e) : ������ index���� ����
		stdList.add( 1, new Student("��ö��", 13, 6)  );
		
		System.out.println("�߰� ���� Ȯ��");
		System.out.println(stdList); // ���� ������ �ۼ��ϴ� ��� �ڵ����� toString() �����
		
		
		// 4. size() : ����Ʈ�� ����� ������ ���� ��ȯ
		System.out.println("����� �л� �� : " + stdList.size() );
		
		
		// 5. get(int index) : ����Ʈ�� ����� index��° ��� ��ȯ
		System.out.println(stdList.get(0));
		System.out.println(stdList.get(1));
		System.out.println(stdList.get(2));
		System.out.println(stdList.get(3));
		System.out.println(stdList.get(4));
		
		
		// for��, get(), size() ���� ����ϱ�
		System.out.println("==================");
		
		for(int i=0 ; i<stdList.size() ; i++) {
			System.out.println( stdList.get(i)  );
		}
		
		System.out.println("==================");
		
		
		// 5. Object set(int index, E e) : ����Ʈ�� index��° ��Ҹ� e�� �����ϰ�
		//								   ������ �ִ� ���� ��ȯ							
		Object obj = stdList.set(0, new Student("�̹�ȣ", 18, 2) );
		System.out.println("��ȯ�� Object : " + obj);
		System.out.println(stdList);
		
		
		// 6. Object remove(int index) : ����Ʈ�� index��° ��Ҹ� �����ϰ�
		//							     ������ �ִ� ���� ��ȯ
		Object obj2 = stdList.remove(1);
		System.out.println("���ŵ� �л� ���� : " + obj2); // ��ö�� ����
		System.out.println(stdList); // ��ö�� ���� Ȯ��
		
		
		
		
		// * �ٸ� �ڷ��� �߰�
		stdList.add( "���ڿ��� ��ü��"  );
		//stdList.add( new Integer(100) );
		
		// �÷����� ��ü�� ���� �����ϴ�!
		stdList.add(100); // 100 (int) -- Auto Boxing  -->  100 (Integer)
		
		
		ArrayList list2 = new ArrayList();
		list2.add(  new Student("�谩��", 19, 3)  );
		list2.add(  new Student("����", 12, 5)  );
		
		stdList.add(list2);
		
		// stdList�� ����� ���� ��� ���
		for(int i=0 ; i<stdList.size(); i++) {
			System.out.println( stdList.get(i)  );
		}
		
		
		System.out.println("===================");
		
		System.out.println("stdList�� ����� Student ��ü�� �����ϴ� ��� �̸��� ����ϱ�");
		
		for(int i=0 ; i< stdList.size() ; i++) {
			
			if( stdList.get(i) instanceof Student ) {
				// stdList�� i��° ��Ұ� Student ��ü �Ǵ� Student�� ��� ���� ��ü�� ���
				
				// ArrayList�� ����Ǵ� ������ ������ Ÿ���� ��� Object Ÿ������ �νĵȴ�.
				// -> get(i)�� ���ؼ� ������ �������� Ÿ���� ��� Object
				
				System.out.println( ( (Student)stdList.get(i) ).getName()    );
				// Object -> Student �ٿ� ĳ����
		
			} else {
				
				System.out.println(stdList.get(i));
			}
			
		}
		
	}
	
	
	// ���� for�� (for each ��)
	// - �÷����̳� �迭�� ��� ��Ҹ� ó������ ������ ������� �����ϴ� �뵵�� for��
	public void example3() {
		
		ArrayList list = new ArrayList();
		list.add("���");
		list.add("���");
		list.add("������");
		list.add("�Ľ�Ÿ");
		
		// list�� ����� �����͸� ��� ���
		
		// 1) ���� for��
		for(int i=0 ; i<list.size(); i++){
			System.out.println(  list.get(i)  );
		}
		
		System.out.println("===========");
		
		// 2) ���� for��
		// for( �ϳ��� ������ ���� ���� ���� : �÷��� �Ǵ� �迭�� )
		
		for( Object obj  :  list ) {
			// for���� �ݺ��� �� ����
			// list�� ����� ��Ҹ� ó������ ������� �ϳ��� ����
			// obj ������ ����
			System.out.println(obj);
		}
		
	}
	
	
	public void example4() {
		
		// Generics(���׸�, ���׸���, ���׸���) : <E>
		// Ŭ����, �޼ҵ�, �÷��� ���ο� ���Ǵ� Ŭ���� Ÿ���� �� ������ �����ϴ� ���
		// -> Ÿ�� ����
		
		// ���׸��� ����
		// 1) �ϳ��� Ÿ������ ������ �Ǳ� ������ 
		//     instanceof ���� Ÿ�� �˻�, �ٿ�ĳ������ �۾��� �ʿ� ��������.
		//     -> �ڵ� Ȱ�� ����� ������
		//     == ������ �ܰ迡���� ������ Ÿ�� üũ
		
		// 2) �ϳ��� �ڵ�� ���� Ÿ�� ó���� �����ϴ�. (������)
		
		
		// ** �÷��� Ÿ�� ���� ����� ���׸� ���
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		// Student�� Ÿ���� ���ѵ� ArrayList ��ü ����
		// == ������ ArrayList���� Student�� ���� ����
		// == ����� �����ʹ� ��� Student�̴�
		
		// add(Student e)
		stdList.add( new Student("�谳��", 9, 2) );
		stdList.add( new Student("�轺��", 10, 3) );
		stdList.add( new Student("������", 11, 4) );
		stdList.add( new Student("���Ҹ���", 12, 5) );
		
		// ���� for������ ����� �̸��� ���
		for( Student std  : stdList   ) {
			// stdList�� Student�� Ÿ���� ���ѵǾ� �ֱ� ������
			// �ϳ��� ������� ������ �����ϴ� ������ Ÿ�Ե� Student Ÿ���� ����Ѵ�.
			// == instanceof �˻簡 �ʿ� ����
			
			System.out.println( std.getName()  );
			// std�� Student Ÿ���̱� ������ �ٿ�ĳ������ �ʿ� ����
		}
	}
	
	
	
	
	public void example5() {
		// �÷��ǰ� ������
		
		// - �������̶�?   �θ� Ÿ���� ���������� ��� ���迡 �ִ� �ڽ� ��ü�� �����ϴ� ��.
		// - �������̽��� Ư¡ : ��� ���� �ڽĿ��� ������ �̸��� ����� ���������� �������̵� ��Ŵ
		//					-> �ڽĵ��� ���°� ���������.
		//					+ ��ü ���� X, �θ� Ÿ�� ���� ���� ��� O
		
		
		// ArrayList : �迭 ����� List�� �˻��� ȿ������.
		// LinkedList : ��� �ϳ� �ϳ��� �ٷ� ����� ������� �߰�, ������ ȿ������.
		
		
		// 1) ������ ������
		LinkedList<String> list1 = new LinkedList<String>();
		
		// �߰�
		list1.add("AAA");
		list1.add("BBB");
		list1.add("CCC");
		list1.add("DDD");
		
		// ����
		list1.remove(0);
		list1.remove(0);
		list1.remove(0);
		
		ex5_1(list1); // �Ű������� ArrayList<String> ����
		
		list1 = ex5_2(); // ��ȯ������ ArrayList<String> ��ȯ
		
		// �߰� ������ ����ϹǷ� LinkedList�� �� ȿ������
		
	}

	// �Ű������� ArrayList<String>�� �޼ҵ�
	public void ex5_1(LinkedList<String> list ) {
		System.out.println(list);
	}
	
	// ��ȯ���� ArrayList<String>�� �޼ҵ�
	public LinkedList<String> ex5_2(){
		return new LinkedList<String>();
	}
	
	
	
	public void example6() {
		
		// 2) �÷��ǿ� ������ ����
		List<String> list2 = new LinkedList<String>();
		// �θ� Ÿ��(List) ���� ������ �ڽ� Ÿ�� ��ü(ArrayList) ����
		// -> LinkedList�� �ڽ� ��ü�� �����ذ� ������ �߻����� ����
		//  ��? 
		//  ���� 1. ArrayList, LinkedList �Ѵ� �θ��� List�� ��� �޾ұ� ������
		//        ����ϴ� �޼ҵ��� �̸��� ����.
		//  ���� 2. ex6_1(), ex6_2() �� �޼ҵ��� �Ű�����, ��ȯ���� 
		//   	  �θ� Ÿ������ �ۼ��Ǿ� �ֱ� ������ �����ϴ� �ڽ� ��ü�� ���ص� �������� �׻� ����� 
		
		// ***** �÷��ǿ� ������ ���� �� ���� *****
		// -> ���������� ���, ���뼺 ���
		
		// �߰�
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");
		list2.add("DDD");
		
		// ����
		list2.remove(0);
		list2.remove(0);
		list2.remove(0);
		list2.remove(0);
		
		ex6_1(list2);
		
		list2 = ex6_2();
		
	}
	
	// �Ű������� �θ�Ÿ���� List<String> == �Ű������� ������
	public void ex6_1( List<String> list ) {
		System.out.println(list);
	}
	
	// ��ȯ���� �θ�Ÿ���� List<String> == ��ȯ���� ������
	public List<String> ex6_2(){
		return new ArrayList<String>();
	}
	
	
	
	// ���׸��� ������ ����
	// -> �ϳ��� �ڵ�� ���� Ÿ�� ó���� �����ϴ�. (������)
	public void example7() {
		
		List<Person> list = new ArrayList<Person>();
		// ���׸��� �θ�Ÿ���� Person���� ���ѵ� ArrayList ��ü�� ����
		
		list.add( new Person('��', 180.5) ); // �θ� Ÿ�� ��ü �߰�
		list.add( new Student('��', 163.7, "����", 17, 1) ); // �ڽ� Ÿ�� ��ü �߰� -> ���� ����
		// -> ���׸��� �θ�Ÿ���� �����Ǹ� �θ� + �ڽ� ��ü�� ������ �� �ִ�.
		
		for(Person p : list) {
			System.out.println( p.toString()  );
								// -> ���� ���ε�
			// ���� �� �������̵��� �ڽ��� toString()�� ����� -> ���� ���ε�
			// - ���� ���ε��� ȿ�� : �ϳ��� �ڵ�� ���� Ÿ���� �ڵ带 ������ �� ����.
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}