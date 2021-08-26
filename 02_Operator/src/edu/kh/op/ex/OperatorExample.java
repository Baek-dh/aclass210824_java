package edu.kh.op.ex;

import java.util.Scanner;

// ��� ������ Ŭ����
public class OperatorExample {

	// ��� == �ൿ == �޼ҵ�
	// ��ɺ��� �޼ҵ� �ϳ��� �����ϸ� �ȴ�!
	
	public void example1() {
		// ���� ������ -> �� ���� ���� (!)
		// �� ���� �ݴ�� �����ϴ� ������
		
		boolean isTrue = true;
		
		System.out.println("isTrue : " + isTrue); // true
		System.out.println("!isTrue : " + !isTrue); // false
		
	}
	
	
	public void example2() {
		// ���� ������(++, --)
		// - �ǿ����ڸ� 1 ������Ű�ų� ���ҽ�Ű�� ������
		
		// ���� ����
		// - ���� 1�� ���� �Ǵ� ���ҽ�Ű�� ���� �ٸ� ������ ����
		int num1 = 10; 
		
		int num2 = ++num1; 
		// -> num2 ���� ������ �̷������ ����
		//    num1�� 1 ����(10 -> 11) ��Ŵ
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		
		// ���� ����
		// - �ٸ� ������ ���� ������ �� �������� 1 ���� �Ǵ� ����
		int num3 = 10;
		int num4 = num3++;
		// -> num4�� num3(10)�� ���� ������ ��
		//    num3�� 1 ����(10 -> 11) ��Ŵ
		
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		//      3++ + --5
		//      3 + 4
		//  c = 7  
		
		// ���������� a,b,c �� ���� ���ΰ�?
		// a == 4
		// b == 4
		// c == 7
		System.out.println(a + " / " + b + " / " + c);
							// 4 / 4 / 7
		
	}
	
	
	public void example3() {
		// ��� ������ (+ - * / %)
		// - �켱 ���� 
		// �� : * / %
		// �� : + -
		
		// "/" : ������ �� ���� ���ϴ� ������
		// "%" : ������ �� �������� ���ϴ� ������
		
		int num = 5;
		System.out.printf("%d / %d = %d\n", num, 3, num/3);
		System.out.printf("%d %% %d = %d\n", num, 3, num%3);
		// %%�� ���� ���� : %d, %f, %s %�� �̿��ؼ� ������ �����ϱ� ������
		// %���ڸ� �ܵ� ����� �� ����. -> %% �ۼ��ؾ� '%'�� �νĵ�
		
		
		// ������ �������� == ������ �� �������� 0�̴�
		// ex) 3���� ������ �������� ��
		// 3 6 9 12 15 ... (3�� ���)
		
		System.out.println(  5 % 3 == 0  );
		// 5�� 3���� ������ �� �������� 0�ΰ�?
		// == 5�� 3�� ����ΰ�? false
		
		System.out.println(  273 % 3 == 0  );
		// 273�� 3���� ������ �� �������� 0�ΰ�?
		// == 273�� 3�� ����ΰ�? true
	}
	
	
	public void example4() {
		// �� ������( ==, !=, >, <, >=, <= )
		// - ���� ��ȣ�� �ΰ� ���޾� �ۼ��Ǵ� ������ ���
		//   "=" ��ȣ�� �׻� ������
		
		// - �� �������� ���� ����� ������ true / false (����) �̴�.
		
		int a = 10;
		int b = 20;
		
		System.out.println( a == b ); // false
		System.out.println( a != b ); // true
		System.out.println( !(a == b) ); // true
		System.out.println( (a == b) == false ); // true
		
		System.out.println("------------------------------");
		
		int c = 4;
		int d = 5;
		
		System.out.println( c < d  ); // true
		System.out.println( c+1 < d  ); // false
		System.out.println( c+1 <= d  ); // true
		
		System.out.println( (++c != d) == (--c != d)  );
						//    5 != 5        4  != 5
						//    false    ==    true   -> false
		
		
		System.out.println("---------------------------------");
		
		int num = 123;
		
		System.out.println("num�� ¦���ΰ�? " +  (num % 2 == 0)  );
		System.out.println("num�� ¦���ΰ�? " +  (num % 2 != 1)  );
		
		System.out.println("num�� Ȧ���ΰ�? " +  (num % 2 == 1)  );
		System.out.println("num�� Ȧ���ΰ�? " +  (num % 2 != 0)  );
	}
	
	
	public void example5() {
		// �� ������ (&&, ||)
		
		// &&(AND) : �Ѵ� true �϶��� true, �������� false
		// -> �׸���( ~�̰�), ~�鼭, ~�̸鼭, ~���� ~����, ~����
		
		
		// ||(OR) : �Ѵ� false �϶��� false, �������� true
		// -> �Ǵ�, ~�ų�, ~�̰ų�
		
		int a = 100;
		
		// a�� 100 �̻��̸鼭 ¦���ΰ�?
		System.out.println(  (a >= 100)  &&  (a % 2 == 0)    );

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		// �Է� ���� ������ 1 �̻� 100 �����ΰ�?
		// == input�� 1���� 100 ���� �����ΰ�?
		
		boolean result =  input >= 1  &&  input <= 100;
		
		System.out.println("�Է� ���� ���� 1 �̻�, 100 �����ΰ�? " + result);
		
		
		// �Է� ���� ���� 1 �̸� �̰ų� 100 �ʰ��ΰ�?
		boolean result2 = input < 1   ||  input > 100;
		System.out.println("�Է� ���� ���� 1 �̸� �̰ų�, 100 �ʰ��ΰ�?" + result2);
		
	}
	
	
	public void example6() {
		
		// ���� ���� ������( +=, -=, *=, /=, %= )
		// - �ǿ����ڰ� �ڽŰ� ���� �� ����� �ٽ� �ڽſ��� ����
		// - ���� �����ڴ� 1�� ����, ����
		//   ���� ���� �����ڴ� ���ϴ� ��ŭ ����, ����, ��, ������ ����
		
		int a = 10;
		
		a += 5; // a = 10 + 5; == 15
		System.out.println(a); // 15
		
		a -= 10; // a = 15 - 10 == 5
		System.out.println(a); // 5
		
		a *= 4; // a = 5 * 4 == 20
		System.out.println(a); // 20
		
		a /= 3; // a = 20 / 3 == 6
		System.out.println(a); // 6
		
		a %= 5; // a = 6 % 5 == 1
		System.out.println(a); // 1
	}
	
	
	public void example7() {
		// ���� ������  (  ���ǽ� ? ��1 : ��2  )
		
		// - ���ǽ� : ���� ����� true/false�� ��
		//			(��, ��, �� ���� �����ڰ� ���Ե� ��)
		
		// - ���ǽ� ����� true�� ��  : ��1 ����
		// - ���ǽ� ����� false�� �� : ��2 ����
		
		// �Է� ���� ���� Ȧ������, ¦������ �˻�
		// Ȧ���̸� "Ȧ�� �Դϴ�"
		// ¦���̸� "¦�� �Դϴ�"
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		String result = input % 2 == 1 ? "Ȧ��" : "¦��";
		// ���ǽ� ����� ���� result ������ "Ȧ��" �Ǵ� "¦��" ���ڿ��� ����
		
		System.out.println( result + " �Դϴ�");
		
	}
	
	
	public void example8() {
		
		// ������ �ϳ� �Է� �޾� �������, �������� �Ǻ�
		
		// ���ȭ��)
		// ���� �ϳ� �Է� : 3
		// 3��/�� ����Դϴ�.
		
		// ���ȭ��)
		// ���� �ϳ� �Է� : -5
		// -5��/�� �����Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		String result = input >= 0 ? "���" : "����";
		
		System.out.println(input + "��/�� " + result + "�Դϴ�.");
		
	}
	
	
	public void example9() {
		// ���� 8������ �߻��� �̽����� : 0�� ���? ����? �ذ��ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		// ���� �������� ��ø ���
		String result = input > 0 ? "���" : ( input == 0 ? "0" : "����" );
		
		System.out.println(input + "��/�� " + result + "�Դϴ�.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
