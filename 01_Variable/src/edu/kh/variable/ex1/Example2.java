package edu.kh.variable.ex1;

public class Example2 {

	public static void main(String[] args) {
		
		// ���� ���� : �޸�(RAM)�� �����͸� ������ �� �ִ� ������ �Ҵ� �ϴ� ��.
		// -> ����� ������ �ڷ����� ���� 
		//  ������ �� �ִ� �������� ������ ũ�Ⱑ �޶�����.
		
		// �⺻ �ڷ��� (8����)
		// ���� : boolean(1byte)
		// ������ : byte(1byte), short(2byte), int(4byte), long(8byte) 
		// �Ǽ��� : float(4byte), double(8byte)
		// ������ : char(2byte)
		
		boolean isTrue; // is true -> isTure (���� ��� ��Ģ -> ī��ǥ���)
		
		byte byteNumber;
		short shortNumber;
		int intNumber; // �޸𸮿� ������ ������ �� �ִ� ���� 4����Ʈ�� �Ҵ��ϰ�
					   // �� ������ intNumber��� �θ��ڴ�.
		long longNumber;
		
		
		float floatNumber;
		double doubleNumber;
		// �޸𸮿� �Ǽ��� �����Ҽ� �ִ� ���� 8����Ʈ�� �Ҵ��ϰ�
		// �� ������ doubleNumber��� �θ��ڴ�.
		
		char ch;
		
		
		// �� ���� : ������ ���� �����ϴ� ��
		// ���ͷ� : ������ ���ԵǴ� �� ��ü�� �ǹ�
		//      -> �ڷ��� ���� ���ͷ� �ۼ� ����� �ٸ�
		
		// boolean�� ���ͷ� : true / false
		isTrue = true;  // ��
		isTrue = false; // ����
		
		// int�� ���ͷ� : 1, 2, 0, -1 (�ܼ� ���� �Է�)
		byteNumber = 1;
		shortNumber = 2;
		intNumber = 4; // int�� �ڹ� ���� �⺻��
		
		// * byte, short�� ������ ���ͷ� ǥ������ ������ ���� ����.
		// ��? byte, short �ڷ�����
		// ���� ���� ���α׷� �Ǵ� �ٸ� ���� ����� ���� ����.
		// �ӽ÷� ���Ǳ� ������ ���� ���ͷ� ǥ������ �������� �ʰ�
		// int�� ���ͷ� ǥ������ ������ ����.
		
		// long ���ͷ� : ���� �ڿ� l, L ����
		longNumber = 8l; // L �ҹ���
		longNumber = 80000L; // L �빮��
		
		
		// float ���ͷ� : �Ǽ� �ڿ� f, F ����
		floatNumber = 3.14f;
		floatNumber = 123456.789f;
		
		// double ���ͷ� : 3.14, 2.56 (�Ϲ� �Ǽ�)
		doubleNumber = 3.141592;
		
		
		// char ���ͷ� : 'A', '��' (Ȭ ����ǥ ���� ���� �ϳ�)
		ch = 'A';
		ch = '��';
		ch = '9'; // ���� 9 ����� ����
		
		
		// ���ڿ� ���� ����, ����
		// String ���ͷ� : "Hello", "�ȳ�" (�� ����ǥ ���� ���ڿ�)
		String str;
		str = "���� ������?";
		
		
		System.out.println(isTrue);
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(ch);
		System.out.println(str);
		
		
		
		// ���� �ʱ�ȭ : ����� ������ ó������ ���� �����ϴ� ��
		int age;
		age = 100; // ó�� �� ���� == �ʱ�ȭ
		
		// ���� ����� ���ÿ� �ʱ�ȭ
		int count = 10000;
		double pi = 3.14;
		
		System.out.println( "age : " + age   );
						//  age : 100
		
		System.out.println( "count : " + count );
		System.out.println( "pi : " + pi );
		
		
		
		// ��� : �޸𸮻� ���� �� ���� ������ �� �ִ� ����
		// ��� ��� �� final �̶�� Ű���带 �ڷ��� �տ� ����.
		// + ������� ��� �빮�ڷ� �ۼ�!!
		final double PI = 3.1415926535;
		// PI = 1.23; // �����߻�!
		// The final local variable PI cannot be assigned. 
		// It must be blank and not using a compound assignment
		
		
	}
	
}





