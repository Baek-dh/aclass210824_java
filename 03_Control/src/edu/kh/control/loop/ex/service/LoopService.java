package edu.kh.control.loop.ex.service;

import java.util.Scanner;

public class LoopService {

	/*	for��
	 * 
	 * 	for(�ʱ�� ; ���ǽ� ; ������){
	 * 		// �ݺ� ���� �ڵ�
	 * 	}
	 * 
	 * - �ʱ�� : for�� ���ο��� ����� ����. ���� for���� �ݺ� ��� ���� �����.
	 * 
	 * - ���ǽ� : for���� �ݺ� ���θ� �����ϴ� ��.
	 * 			 ���� �ʱ�Ŀ� ����� ������ �̿��Ͽ� ���ǽ��� �ۼ���.
	 * 
	 * - ������ : �ʱ�Ŀ� ���� ������ for���� ������ �� ���� ���� �Ǵ� ���ҽ���
	 * 		     ���ǽ��� ����� ��ȭ�ϰ���.
	 * 
	 * */
	
	public void example1() {
		// for�� ���� ����1
		// 1~10 ���� 1�� �����ϸ� �ݺ��ؼ� ��� 
		
		// i�� 10�� �� ������ �ݺ�
		// == i�� 1���� �����ؼ� 10�� �ɶ� ���� ���ǽ��� true �̿��� �Ѵ�
		for(int i=1 ; i <= 10  ;  i++ ) {
			// �������� �ܼ��� �ʱ�� 1 ����/���ҷ� �ۼ��� ���
			// ����, ���� ������ �������� ����.(�Ȱ���)
			
			System.out.println(i + "���");
		}
	}
	
	
	public void example2() {
		// for�� ���� ����2
		// 5���� 15���� 1�� �����ϸ� ���
		for(int i=5 ; i <= 15 ; ++i) {
			 System.out.println( i + "���");
		}
	}
	
	public void example3() {
		// for�� ���� ����3
		// 1���� 20���� 2�� �����ϸ� ���
		for(int i=1 ; i <= 20 ; i += 2 ) {
			
			// ���� ���� ������ (+=)
			// -> ���� ������ ���� ���ο� ���� �������� ����
			System.out.println(i);
			
		}
	}
	
	public void example4() {
		// for�� ���� �����1
		
		// 10���� 1���� 1�� �����ϸ� ���
		for(int i=10 ; i <= 1 ; i--) {
			System.out.println(i);
			
			// ���� 1 : ���ǽ� �ε�ȣ ������ �߸� �ۼ��� ���
			// -> �� ���� ������� �ʰų�, ������ �����
		}
		
	}
	
	public void example5() {
		// for�� ���� �����2
		// 1.0 ���� 5.0 ���� 0.5�� ����
		for(double i = 1.0 ; i <= 5.0 ; i += 0.5 ) {
			// 1.0 1.5 2.0 2.5 3.0 3.5 4.0 4.5 5.0
			System.out.println(i);
		}
	}
	
	public void example6() {
		// for�� ���� �����3
		// 'A' ~ 'Z' ������� ���ĺ� ��� ����ϱ�
		// char == ������ == �����δ� ������ ����
		//  -> ����� �������� �´� ���� ����� �����ڵ�ǥ���� ã�� ���
		
		// ��� 1
		/*for(int i=65 ; i<=90 ; i++) {
			System.out.println( (char)i );
		}*/
		
		// ���2
		for(char i = 'A' ; i <= 'Z' ; i++) {
			System.out.println(i);
		}
	}


	public void example7() {
		// for�� ����1
		// ������ 5���� �Է� �޾� �հ� ���
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �ݺ��Ǿ� �ԷµǴ� ���� ������ ���� sum ����
					 // 0���� �ʱ�ȭ
		// 0���� �ʱ�ȭ �ϴ� ���� : ������ ���� ���� ����� ��Ȯ�� �����ϱ� ���ؼ�
		
		for(int i=1 ; i<=5 ; i++) {
			// Ư�� Ƚ����ŭ �ݺ��ؾߵǴ� ���
			// -> �ʱ���� ���� ���� �Ǵ��İ� �ƴ�
			//    �ʱ���� ���ϴ� ���� ������ �� �����ΰ�
			// -> ���ϴ� ���� �� == �ݺ� Ƚ��
			System.out.print(i + "�� �Է� : ");
			int input = sc.nextInt();
			
			sum += input; // ����
			
		}
		
		System.out.println("�հ� : " + sum);
		
	}
	
	
	public void example8() {
		// for�� ���� 2 (for + if)
		
		// 1~20���� 1�� �����ϸ� ���
		// ��, 5�� ����� ����� ���� (5), (10) ó�� ��ȣ�� �ٿ��� ���
		// ex)  1 2 3 4 (5) 6 7 8 9 (10)....
		
		for(int i=1 ; i<=20 ; i++) {
			
			if(  i % 5 == 0  ) {// i�� 5�� ����� ��� == 5�� ������ �� �������� 0
				System.out.print( "(" + i + ") "  );
				
			}else {
				System.out.print( i + " " );
				
			}
		}
	}
	
	
	public void example9() {
		// for�� ���� 3
		// 2 ~ 9 ���� ������ �Է� �޾�
		// �ش� ������ �������� ����Ͻÿ�.
		// ��, 2 ~ 9 ���� ���ڰ� �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�." ���
		// 2 x 1 =  2
		// 2 x 2 =  4
		// ...
		// 2 x 5 = 10
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // 2 ~ 9 ���̸� �Է� ���� ���
			
			for(int i=1 ; i<=9 ; i++) {
				
				// 2 x 1 =  2
				// 2 x 9 = 18
				System.out.printf("%d x %d = %2d\n", dan, i, dan*i );
				// %2d : 2ĭ Ȯ�� �� ������ ���ķ� ���
				
			}
			
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	
	public void example10() {
		
		// for�� ���빮��
		// ������ �ΰ� �Է� �޾�
		// �� ���� ������ ��� ������ �հ踦 ����
		// ��, �հ迡�� 3�� ����� ����
		
		// ex) ���� 1 : ����1�� ����2���� ���� ���
		// ���� �Է�1 : 1
		// ���� �Է�2 : 10
		// 3�� ����� ������ �հ� :  37
		
		// ����1 ���� �� �߰� ����
		// -> ����1�� ���� 2���� Ŭ ��쵵 �������� ���
		// ���� �Է�1 : 10
		// ���� �Է�2 : 1
		// 3�� ����� ������ �հ� :  37
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("���� �Է�2 : ");
		int input2 = sc.nextInt();
		
		int sum = 0; // �հ踦 ������ ���� sum ����
		
		/*
		if( input1 <= input2 ) { // �Է�1�� �Է� 2���� �۰ų� ���� ��
			for(int i=input1 ; i<=input2 ; i++) {
				if(i % 3 != 0) { // 3�� ����� �ƴ� ���
					sum += i;
				}
			}
		
		}else { // �Է�2�� �Է� 1���� ���� ��
			for(int i=input2 ; i<=input1 ; i++) {
				if(i % 3 != 0) { // 3�� ����� �ƴ� ���
					sum += i;
				}
			}
		}
		*/
		
		int num1; // �׻� ���� ���� �����ϴ� ����
		int num2; // �׻� ū ���� �����ϴ� ����
		
		if(input1 < input2) {
			num1 = input1;
			num2 = input2;
		}else {
			num1 = input2;
			num2 = input1;
		}
		
		for(int i = num1 ; i<= num2 ; i++) {
					// 1      // 5
					// i = 1 2 3 4 5
			
			if(i % 3 != 0) { // 3�� ����� �ƴ� ���
				sum += i;
			}
		}
		
		System.out.println("3�� ����� ������ �հ� : " + sum);
	}
	
	
	/////////////////////////////////////////////////////////////////////////
	
	// ��ø �ݺ���
	// - �ݺ��� ���� �����ڵ忡 �ݺ����� �ۼ��Ǵ� �ڵ�
	
	// �ð� -> 0 ~ 59�� �ݺ��ϴٰ� 60�ʰ� �Ǹ� 1�� ����
	
	public void example11() {
		// 0�� 0�ʺ��� 59�� 59�ʱ��� ���
		for(int min=0 ; min < 60 ; min++) {
			
			// 1�� == 60��
			for(int sec=0 ; sec < 60 ; sec++) {
				
				System.out.printf("%02d�� %02d��\n", min, sec);
				// %02d : 2ĭ Ȯ���Ͽ� ������ ����, ��ĭ�� 0 �߰�
				// -> 01 02 03
			}
		}
	}
	
	
	public void example12() {
		// ��ø �ݺ��� ����1
		// ������ 2~9�� ��� ����ϱ�
		// �� ���� ���� �� �� �ֵ��� ��ĭ ���
		
		// 2 x 9 = 18
		//
		// 3 x 1 = 3
		
		for(int dan=2 ; dan<=9 ; dan++) { // �� �ݺ�
			
			for(int su=1 ; su<=9 ; su++) { // �������� �� �ݺ�
				System.out.printf("%d x %d = %2d\n", dan, su, dan*su);
			}
			
			System.out.println(); // ��ĭ ���
		}
	}
	
	
	public void example13() {
		// ��ø �ݺ��� ����2
		// ������ 2~9�� ��� ����ϱ�
		// �� �ٿ� �� �ܾ� ����ϱ�
		
		// ex)
		// 2x1= 2 2x2= 4 ... 2x9=18
		// 3x1= 3 3x2= 6 ... 3x9=27
		// ..
		// 9x1= 9 9x2=18 ... 9x9=81 
		
		for(int dan=2 ; dan<=9 ; dan++) {
			
			for(int su=1 ; su<=9 ; su++) {
				System.out.printf("%dx%d=%2d ", dan, su, dan*su);
			}
			System.out.println();
		}
	}
	
	
	public void example14() {
		// ��ø �ݺ��� ����1
		
		// 2�� for���� �̿��Ͽ� ���� ����� ����Ͻÿ�.
		
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int i=1 ; i<=5 ; i++) { // ��(��)�� �����ϴ� �ݺ���
			
			for(int j=1 ; j<=5 ; j++) { // ĭ(��)�� �����ϴ� �ݺ���
				System.out.print(j);
			}
			System.out.println(); // �ٹٲ�
			
		}
		
	}
	
	
	public void example15() {
		// ��ø �ݺ��� ����2
		
		// 2�� for���� �̿��Ͽ� ���� ����� ����Ͻÿ�.
		
		// 54321
		// 54321
		// 54321
		// 54321
		
		// 4ȸ�� �ݺ��ϴ� for��
		for(int i=1 ; i<=4 ; i++) {
			
			// 5ȸ �ݺ� �� 4->1���� �پ��� for��
			for(int j=5 ; j>=1 ; j--) {
				System.out.print(j); // 4321 ������� ���
			}
			
			System.out.println(); // �ٹٲ�
		}
	}
	
	
	public void example16() {
		// ��ø �ݺ��� ����3
		
		// 9 ~ 2�ܱ��� �Ųٷ� ���
		// �� �� ���̿� ���� �߰�
		
		// === 9�� ===
		// 9 x 9 = 81
		// 9 x 8 = 72
		// ...
		
		// === 2�� ===
		// 2 x 9 = 18
		// ...
		// 2 x 2 = 2
		
		for(int dan=9 ; dan >= 2 ; dan--) {
			
			System.out.println("=== " + dan + "�� ==="); // �� ���� �� �� ������ ���
			
			for(int su=9 ; su >= 1 ; su--) {
				System.out.printf("%d x %d = %d\n", dan, su, dan * su);
			}
			
			System.out.println(); // ���� ���� �� ���� �� �ٲ�
		}
	}
	
	
	public void example17() {
		// ��ø �ݺ��� ���� 4
		
		// 2�� for���� �̿��Ͽ� �Ʒ� ����� ���
		
		// 1
		// 12
		// 123
		// 1234
		
		for(int i=1 ; i<=4 ; i++) { // 1~4�� ���� �ݺ�
			
			// i=1 �϶� 1
			// i=2 �϶� 12
			// i=3 �϶� 123
			// i=4 �϶� 1234
			
			for(int j=1 ; j<=i ; j++) { // �ݺ� �Ǵ� ���� ���� ���� ��µǴ� Ƚ���� �����
				System.out.print(j);
			}
			System.out.println(); // �ٹٲ�
		}
	}
	
	
	public void example18() {
		// ��ø �ݺ��� ���� 5
		
		// 2�� for���� �̿��Ͽ� �Ʒ� ����� ���
		
		// 1234
		// 123
		// 12
		// 1
		
		for(int i=4 ; i>=1 ; i--) {
			
			for(int j=1 ; j <= i ; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	
	public void example19() {
		// ��ø �ݺ��� ���� 6
		
		//  1  2  3  4
		//  5  6  7  8
		//  9 10 11 12
		
		int count = 1; // 1 ~ 12���� �����ϴ� ��
		
		for(int i=1 ; i<=3 ; i++) { // 3��(��)
			
			for(int j=1 ; j<=4 ; j++) { // 4ĭ(��)
				System.out.printf("%3d", count);
				
				count++;
				// 1��� -> 1���� -> count=2
				// 2��� -> 1���� -> count=3
				// 3��� -> 1���� -> count=4
				// 4��� -> 1���� -> count=5
			}
			
			System.out.println(); // �ٹٲ�
			
		}
	}
	
	
	///////////////////////////////////////////////////////////////////////////////
	
	
	// while��
	
	/* ������ �ʱ��, �������� �������� �ʰ�
	 * �ݺ� ���� ������ �����Ӱ� �����ϴ� �ݺ���
	 * --> ���� �������� ������ �����ϴ� ������ ����.
	 * 
	 * while( ���ǽ� ){
	 * 	���ǽ��� true�� ��� ������ ����
	 * }
	 * 
	 * 
	 * */
	
	public void example20() {
		
		// �Էµ� ��� ������ �� ���ϱ�
		// ��, 0�� �ԷµǸ� ��� ��� �� ����
		
		Scanner sc = new Scanner(System.in);
		
		
		int input = -1; // �ʱⰪ�� 0�ϰ�� while���� ������ �� �����Ƿ�
						// 0 �̿��� �ƹ� ���̳� ����
		
		int sum = 0;
		
		while(input != 0) {
			// while���� ���ǽ��� true�� �� ���� O
			// <-> while���� ���ǽ��� false�� �� ���� X
			System.out.print("���� �Է� : ");
			input = sc.nextInt();
			
			sum += input; // ����
		}
		
		System.out.println("�հ� : " + sum);
		
	}
	
	
	public void example21() {
		
		// while���� for�� ó�� ����ϱ�
		
		
		// for(�ʱ�� ; ���ǽ� ; ������) 
		
		// while(���ǽ�) + �ʱ�� + ������
		
		// while���� �̿��Ͽ� 1 ~ 10���� ���
		
		int i=1; // �ʱ��
		while(i <= 10) { // ���ǽ�
			System.out.println(i); // ���
			
			i++; // ������
		}
		
	}
	
	
	
	
	
}




