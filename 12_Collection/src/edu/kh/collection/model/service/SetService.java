package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Student;

public class SetService {

	// Set(����)
	// - ������ �������� ���� (== �ε����� ����)
	// - �ߺ� ������(��ü) ���� �Ұ���. (null�� 1���� ���� ����)
	// -> �Ϲ����� Set���� �ߺ� ������ Ȯ���� ���� equals()�� �ݵ�� �������̵� �Ǿ��־�� �Ѵ�.
	
	
	public void example1() {
		
		// HashSet
		// - hash �Լ��� �̿��ؼ� �����͸� �����ϰ� ���� �˻��� ������ Set
		
		
		// * hash �Լ���?
		// -> �Էµ� �ܾ ������ ������ ���ڿ��� ��ȯ�ϴ� �Լ�
		
		// * hashCode() �޼ҵ�
		// -> �ؽ��Լ��� �̿��� �����Ͱ� �ٸ��� �ߺ����� �ʴ� ���ڸ� ����� �޼ҵ�.
		
		
		// *** HashSet ��� ��������!!! ***
		// 1) Set�� ����Ƿ��� ��ü�� equals() �������̵� �Ǿ��־�� �Ѵ�.
		// 2) + hashCode()�� �������̵� �Ǿ� �־�� �Ѵ�.
		
		
		// String�� �̿��� HashSet ����
		// -> �ڹ� ���� Ŭ�������� �⺻������ equals(), hashCode()���� �޼ҵ尡 
		//    �ۼ��Ǿ� �ִ� ��찡 ����
		
		Set<String> set = new HashSet<String>();
		
		set.add( "�Ｚ" );
		set.add(new String("Apple"));
		set.add(new String("���"));
		set.add(new String("�ٳ���"));
		set.add(new String("������"));
		set.add(new String("Apple"));
		
		System.out.println("����� ������ ���� : " + set.size());
		// -> 6���� �����͸� �߰������� 5���� ���� ���̴�!
		// ��? Set�� �ߺ� �����͸� ��� X
		
		
		System.out.println(  set.toString()   );
		// -> set�� ����� �����͸� ��� ���
		// -> ������ ������â == ������ �������� �ʴ´�.
		
		
		// ���� �ζ� ��ȣ ������
		Set<Integer> lotto = new HashSet<Integer>();
		// �÷����� ��ü�� ���� ����!!
		// int -> Integer
		
		// Set�� Ư¡�� �ߺ� ��� X�� �̿��Ͽ� �ߺ� ���� ���� ���� ����
		
		while(true) {
			
			int random =  (int)(Math.random() * 45 + 1); // 1 ~ 45 ���� ��
			
			lotto.add(random); // Set�� �߻��� ���� ���� �߰�
			// -> add() ���� �� �ߺ� ���� �߰��Ǵ� ��� �ڵ����� ���ŵ�.
			
			if(lotto.size() == 6) {
				// size() : ����� �������� ����
				break;
			}
		}
		
		System.out.println("������ ��ȣ : " + lotto);
		
		
		// Set���� ���� �ϳ��� �ݺ� �����ϴ� ���
		// �� �ʿ��ұ�? Set�� ���� ������ �ȵǱ� ������(index ���� X) 
		// 			 ���ϴ� �����͸� �ϳ��� ������ ���� �Ұ����ϴ�.
		
		// 1. Iterator (�ݺ���)
		// �÷��ǿ��� �����ϴ� 
		// �÷��� ��ü �ݺ� ������(������� �ϳ��� �ݺ� ����)
		
		Iterator<Integer> it = lotto.iterator();
		// lotto.iterator()
		// -> lotto ����(Set)�� ����� ������� �ϳ� �� ������ �� �ִ� ���·� ��ȯ��.
		
		while(it.hasNext()) {
			// hasNext() : ���� ������ ���� ������ true
			
			int num = it.next();  // Integer -> int (auto unboxing)
			// next() : ���� ���� ����.
			
			System.out.println("�߻��� ���� �� : " + num);
		}
		
		///////////////////////////////////////////
		
		// 2. ���� for�� 
		// for( �ϳ��� ������ ������ ����  : �÷��� �Ǵ� �迭��  )
		
		System.out.println("<���� for�� ���>");
		
		for( int num : lotto ) {
			System.out.println("�߻��� ���� �� : " + num);
		}
	}
	
	
	
	public void example2() {
		// HashSet ����� ���� �غ� ����
		// (�� �˾Ƶα�!) 
		// -> HashSet, HashMap, HashTable, LinkedHashSet, .....
		//   Hash��� �ܾ �� �÷��� ��ü�� ����ϴ� ���
		//   �����Ϸ��� ��ü�� �ݵ�� hashCode(), equals() �������̵��� �Ǿ� �־�� ��!
		
		// �л� ���� Set ����
		Set<Student> stdSet = new HashSet<Student>();
		
		stdSet.add( new Student("ȫ�浿", 15, 2) );
		stdSet.add( new Student("ȫ�浿", 15, 2) ); // �ߺ�
		// -> equals() �������̵� O, hashCode() �������̵� X  --> �ߺ� ���� �Ǿ����...
		// -> equals() �������̵� O, hashCode() �������̵� O  --> �ߺ� ���� X
		//  *** equals(),  hashCode() �������̵� �� Set ���!!!!!!!!@#$%^&*(
		
		System.out.println(stdSet);
		
	}
	
	
	public void example3() {
		
		// TreeSet : ���� Ʈ�� ������ �̿��� �����͸� �����ϴ� Set
		// - Set Ư¡ : ���� X, �ߺ� X
		// - Binary Tree Ư¡ : �������� �ڵ� ����
		
		Set<Integer> lotto = new TreeSet<Integer>();
		
		while(true) {
			
			// 1~45 ���� �߻�
			int random = (int)(Math.random() * 45 + 1);
			
			// �߻��� ���� lotto�� �߰�
			lotto.add(random);
			
			if(lotto.size() == 6) { // ��ȣ�� 6���� �Ǹ� ����
				break;
			}
		}
		
		System.out.println("�ڵ� ������ ��ȣ : " + lotto);
	}
	
	
	
	public void example4() {
		
		// õ�� ������ ���� �Է� �޾�
		// �Էµ� �ݾ� / 1000 �� Ƚ�� ��ŭ �ζ� ��ȣ�� �ڵ����� �����Ͽ� 
		// List�� ���� �� ����ϱ�
		// (List + Set)
		
		Scanner sc = new Scanner(System.in);
		
		// �ڵ� ������ ��ȣ���� ������ List ����
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		// -> Integer�� �����ϴ� Set�� �����ϴ� List ����
		
		System.out.print("�ݾ� �Է�(õ�� ����) : ");
		int price = sc.nextInt();
		
		for(int i=0 ; i < price/1000 ; i++) {
			
			// 1) �ζ� ��ȣ�� ����(Set)
			Set<Integer> lotto = new TreeSet<Integer>();
			
			while(true) {
				int random = (int)(Math.random() * 45 + 1); // 1~45 ���� �߻�
				
				lotto.add(random); // �߻��� ���� lotto�� �߰�
				
				if(lotto.size() == 6) { // ��ȣ�� 6���� �Ǹ� ����
					break;
				}
			}
			
			// 2) ������ �ζ� ��ȣ�� List�� �߰�
			list.add(lotto);
			
		}
		
		
		// 3) ���� for������ List�� ����� ������ ������� ���
		for( Set<Integer> lotto : list  ) {
			System.out.println(lotto);
		}
		
		
	}
	
	
	
	
	
	
	
	
}