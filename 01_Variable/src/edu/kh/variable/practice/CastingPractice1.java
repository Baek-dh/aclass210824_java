package edu.kh.variable.practice;

public class CastingPractice1 {
	public static void main(String[] args) {
		
		// ���� : �޸𸮿� ���� ����ϱ� ���� ����
		// ���� ���� : �޸� ���� ����ϱ� ���� ������ �Ҵ�
		// �⺻ �ڷ��� 8���� : 
		// boolean,  byte, short, int, long,  float, double,   char
		// ����               ������               �Ǽ���         ������
		
		// ������ : String(���ڿ�)
		
		// ���� ��� ��Ģ :
		// 1. ī��ǥ��� : ù ���ڴ� �ҹ���, ����Ǵ� �ܾ��� ù ���ڴ� �빮��
		// 2. ��/�ҹ��� ����
		// 3. $,_ Ư�� ��ȣ ����
		// 4. ���ڷ� ���� �Ұ�
		// 5. ����� ��� X
		
		// + �ѱ۷� ������ ���� ���� (������ ��� ����)
		// int ���� = 10;
		
		// ��� : �޸𸮿� �ѹ��� ���� ����� �� �ִ� ����
		
		// ���ͷ� : �� ��ü
		// -> �ڷ������� ������ ǥ��� ����
		// 10(int + byte, short),  123L(long)
		// 3.14f(float), 1.23(double),  'A' (char),  "abc"(String)
		// true/false(boolean)
		
		// ��ǻ���� �� ó�� ��Ģ
		// -> ���� �� ���� �ڷ��� ������ ����, ����� ���� �ڷ���
		// ex) 10 + 20 =30
		//    int + int = int
		
		// �ڵ� ����ȯ
		// ���� ������ ū �ڷ����� ���� ���� �ڷ����� ���� ����� ��
		// �����Ϸ��� �ڵ����� ���� �ڷ����� ū �ڷ������� ����ȯ
		
		// 1 + 0.5 = 1.5
		// int + double = double
		// -> double + double = double
		
		// ���� ����ȯ
		// ���� ������ ū �ڷ����� ���� �ڷ������� ��ȯ
		// ��ȯ �� ������ �ս��� �߻��� �� ����.
		// double -> int      long -> int
		//  (int)3.14          (int)100L
		
		// ������ �����÷ο�
		// -> ���� �� ���� ������ �ʰ�
		// �ִ밪 �ʰ� �� �ּҰ� ���� �ٽ� ����
		
		
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A'; 
		
		System.out.println( iNum1 / iNum2 ); // 2
						//  10   /  4    = 2.5 -(int)-> 2
						// (int) / (int) =  (int)
		
		
		System.out.println( (int)dNum ); // 2
		
		
		System.out.println( iNum2 * dNum ); // 10.0
		//  double * double
		//  4.0 *  2.5 = 10.0
		
		
		System.out.println( (double)iNum1 ); // 10.0
		// ���� ����ȯ�� ���� ������ ���� �ڷ��� -> ū �ڷ������� ���� ����
		
		
		System.out.println( (double)iNum1 / iNum2 ); // 2.5
		// 10.0 / 4.0 = 2.5
		
		System.out.println( dNum ); // 2.5
		
		
		System.out.println( (int)fNum ); // 3
		// 3.0f -> 3 
		
		
		System.out.println( iNum1/(int)fNum ); // 3
		//           10 / 3.0f
		//  (int)(iNum1 / fNum)
		
		//   iNum1/(int)fNum
		//     10 / 3 = 3    

		System.out.println( iNum1 / fNum );// 3.3333333
		
		System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335
		
		// float, double ������
		// 1. ���� ���� ����(byte ũ�Ⱑ �ٸ�)
		// 2. ���е��� ����
		// (����) 2�����δ� �Ҽ��� ǥ���ϴµ� �Ѱ谡 ����
		// -> ���� �Ҽ��� ǥ���Ǵ� 2������ 
		//    ��� �� ������ 10������ ǥ���� 
		//  -> ���������δ� �Ұ����ϱ� ������ �ٻ�ġ�� ���
		
		// �Ҽ��� �Ʒ��� ���� ���� ǥ���Ҽ��� ���е��� ����
		// float : �Ҽ��� �Ʒ��� 7 ~ 8
		// double : �Ҽ��� �Ʒ��� 15 ~ 16
		
		
		System.out.println( ch ); // 'A'
		
		System.out.println( (int)ch ); // 65
		
		
		System.out.println( ch + iNum1 ); // 75
		//				   int + int
		
		
		System.out.println( (char)(ch + iNum1) ); // 'K'

	}
}
