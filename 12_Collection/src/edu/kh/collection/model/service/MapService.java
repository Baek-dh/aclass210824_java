package edu.kh.collection.model.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.model.vo.Student;

public class MapService {
	
	// Map : Key�� Value �� ���� �����Ͱ� �Ǿ� �̸� ��Ƶ� ��ü
	
	// - Key�� �ߺ��� ������� �ʰ�, ������ ��� (== Set Ư¡)
	//   Map ���ο� ���׹������� �����
	
	// - Value�� Key�� ���ؼ� ���� ���еǱ� ������ �ߺ��� �����ϴ�
	//	 (== List Ư¡)
	
	
	public void example1() {
		
		// HashMap<K, V> : Java Map�� ���� ���ʵǴ� Map
		// -> Key�� �ش��ϴ� ��ü��
		//    �ݵ�� equals(), hashCode()�� �������̵� �Ǿ� �־�� ��.
		
		Map<String, Student> map = new HashMap<String, Student>();
		// Key�� String,  Value�� Student�� ���ѵ� Map ����
		
		
		// put(Key , Value) : Map�� ������ �߰�
		map.put("S001", new Student("ȫ�浿", 15, 2) );
		map.put("S002", new Student("��̿�", 19, 3) );
		map.put("S003", new Student("ȫ�浿", 15, 2) ); // Value �ߺ� (O)
		
		map.put("S002", new Student("�����", 19, 3) ); // Key �ߺ� (X)
		// -> ������ value�� ���ο� value�� �����Ѵ�
		
		System.out.println(map); // map.toString()
		
	}
	
	
	
	public void example2() {
		
		// Map���� ������ �ϳ��� �����ϴ� ���
		Map<Integer, String> map = new HashMap<>();
											// == Ÿ�� �߷�
		
		map.put( 1, "���߹ٻ��" );
		map.put( 2, "�Ѹ�Ŭ" );
		map.put( 3, "����޺�" );
		map.put( 4, "�����˸���" );
		map.put( 5, "Ȳ�ݿø���" );
		map.put( 6, "�ڸ���ī ��ٸ�" );
		
		
		// get(key) : �Ű������� �ۼ��� key�� ���εǴ� value�� ��ȯ
		System.out.println(  map.get(3)  ); // ����޺�
		System.out.println(  map.get(5)  ); // Ȳ�ݿø���
		
		
		// ��� ��� �ݺ� �����ϱ� 
		
		// 1. Iterator ���
		
		// 1) map���� key�� ��Ƶ� ����(Set)�� ������ �޼ҵ��� keySet() ȣ��
		Set<Integer> set =  map.keySet();
		
		// 2) ���� set�� �ݺ� �����ϱ� ���� Iterator�� ����
		Iterator<Integer> it = set.iterator();
		
		// 3) while���� �̿��ؼ� �ݺ� ����
		while(it.hasNext()) {
			
			// 4) ���� ������ key�� ���� ������ ����
			int key = it.next();
			
			// 5) get(key) �޼ҵ带 �̿��ؼ� value�� ���� ���
			System.out.printf("key : %d , value : %s \n", key , map.get(key) );
		}
		
		
		
		// 2. ���� for�� ���
		
		System.out.println("-------------------------------");
		
		// 1) keySet() �޼ҵ带 �̿��Ͽ� key�� �̾Ƴ���
		Set<Integer> set2 = map.keySet();
		
		// 2) ���� for������ �ݺ� ����
		for( int key : set2  ) {
			
			// 3) get(key)�� value ������
			System.out.printf("key : %d , value : %s \n", key , map.get(key));
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}