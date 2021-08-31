package edu.kh.control.branch.ex.service;

import java.util.Scanner;

public class BranchService {

	// �б⹮ break;
	// - �ݺ���(for, while)�� ���� ��Ű�� ����

	public void example1() {

		// 0�� �Էµ� �� ���� ������ �Է� �ް�
		// 0�� �ԷµǸ� �Էµ� ��� ������ ���� ����ϰ� ����

		Scanner sc = new Scanner(System.in);

		int sum = 0; // �հ� ����� ����
		while (true) { // ���� ����

			System.out.print("���� �Է� : ");
			int input = sc.nextInt();

			if (input == 0) { // �Է� �� ������ 0�� ���
				break; // break; ������ ����Ǹ� �ݺ����� ������ �̵��ϰ� �����.
						// --> break ���� �ڿ��ִ� �ڵ带 ��� �ǳ� �ڴ�.
			}

			sum += input; // �Էµ� ���� ����
		}

		System.out.println("�հ� : " + sum);
		// Unreachable code : ������ �� ���� �ڵ�

	}

	public void example2() {

		// ������ ������ ����ϱ�
		// 2x1= 2 2x2= 4 ...
		// 3x1= 3 3x2= 6 ...
		// ��, break�� �̿��Ͽ� 2�� x2 ����, 3�� x3, ... 9�� x9 ���� ���

		for (int dan = 2; dan <= 9; dan++) {

			for (int su = 1; su <= 9; su++) {

				System.out.printf("%dx%d=%2d ", dan, su, dan * su);

				if (dan == su) {
					break; // �б⹮�� ��ø�Ǿ��ִ� �ݺ��� �ȿ���
							// ���� ����� �ݺ����� �ۿ��Ѵ�.
				}
			}

			System.out.println();// �ٹٲ�

		}
	}

	public void example3() {

		// ���ڿ��� ��� �Է� �޾� ���� �ϳ��� ����
		// ��, "!exit" �ܾ �Էµ� ��� �Է��� �����ϰ�
		// �����ߴ� ��� ���ڿ� ���

		Scanner sc = new Scanner(System.in);

		String str = ""; // ���ڿ� ǥ������� �ۼ������ϱ� ���ڿ��ε� ������ ����
							// �� ���ڿ�

		System.out.println("���ڿ� �Է� (���� �� !exit)");
		while (true) {

			String input = sc.nextLine(); // sc.next();
			// ���� // �ܾ�

			if (input.equals("!exit")) {
				// �Էµ� ���� "!exit"�� ������ true, �ƴϸ� false

				// �񱳿����� ( == )�� ���ڿ��� ���� �� ���� ����� �� ����
				// ��ſ� String.equals("���� ���ڿ�") �� ���
				// -> ���� �⺻ �ڷ��� �� �� ==
				// �⺻ �ڷ����� ������ ������ �񱳽� .equals() ���
				break;
			}

			str += input + "\n"; // �Է� ���� ���� ���� + �ٹٲ�
		}

		System.out.println(str);
	}

	// (����) do ~ while��
	public void example4() {

		Scanner sc = new Scanner(System.in);

		System.out.println("���ڿ� �Է� (���� �� !exit)");

		String str = ""; // ���ڿ� ���� ����� ����
		String input = "!exit"; // �Է� �޴� �뵵�� ����

		// ó�� ���ۺ��� input ���� "!exit"�� ��� while���� ������� ����
		do {
			// input�� ����� ���� "!exit"�� ���� ���� ��쿡�� �ݺ�

			input = sc.nextLine();

			if (!input.equals("!exit")) {
				str += input + "\n";
			}

		} while (!input.equals("!exit"));

		// do ~ while��
		// �ϴ��� do ���ο� �ִ� ������ �ּ� �ѹ��� �����ϰ�
		// �������� �ݺ� ������ ������ ����

		/*
		 * do{ // �ּ� �ѹ��� ������ �ڵ� } while(���ǽ�) ;
		 * 
		 */

		System.out.println(str);
	}

	public void example5() {

		// continue : �ݺ��� �������� ��� �����ϸ�
		// ���� �ݺ����� �ǳʶٴ� ���

		// - for������ continue : ������ �κ����� �̵��Ͽ� ���� �� ���ǽ��� ����

		// - while������ continue : ���ǽ����� �̵�

		// 1~10 ���̿� �ִ� 3�� ����� �� ���ϱ�
		// 3 + 6 + 9 == 18

		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 3 != 0) {
				continue;
			}

			sum += i;

		}

		System.out.println("�հ� : " + sum);

	}

	public void example6() {

		// 1 ~ 100 ���� 1�� �����ϸ� ��� ��� �ݺ�������
		// 5�� ����� �ǳʶٰ�
		// 40�� �� ���� (�б⹮ ���)

		for (int i = 1; i <= 100; i++) {

			if (i == 40) {
				break;
			}

			if (i % 5 == 0) {
				continue;
			}

			System.out.println(i);
		}

	}

	public void example7() {

		// ����ڷ� ���� �Է� ���� ������ �Ҽ����� �Ǻ��ϴ� ���α׷� ����
		// ��, �Է� ���� ���� 2���� ���� ��� "�߸� �Է��ϼ̽��ϴ�." ���

		// ex)
		// �Է� : 5
		// �Ҽ��Դϴ�.

		// �Է� : 4
		// �Ҽ��� �ƴմϴ�.

		// �Է� : 1
		// �߸� �Է��ϼ̽��ϴ�.

		Scanner sc = new Scanner(System.in);

		System.out.print("�Է� : ");
		int input = sc.nextInt();

		if (input < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {

			boolean flag = true; // �Ҽ� �Ǻ��� ����

			// �Ҽ� �Ǻ�
			for (int i = 2; i < input; i++) {
				// �ݺ������� i�� �ϴ� ���� : �Էµ� ���� ������ ����
				// --> i�� ������ �� �������� 0�� ����
				// == 1�� �ڱ� �ڽ��� ������ ���� ���� �� �ִ�
				// == �Ҽ��� �ƴϴ�

				if (input % i == 0) { // ������ ������ == �Ҽ� �ƴ�

					flag = false; // �Ҽ��� �ƴ��� ����
					break;
					// �� �� �̶� ������ ������ ���
					// �Ҽ��� �ƴ� ���� �� �� �����Ƿ�
					// ���� ���� ������ ���� �� �ʿ� ���� �ݺ��� ����
				}
			}

			// for���� �������� �ѹ��� if���� ������� ���� == �Ҽ�
			if (flag) { // �Ҽ��� ���
				System.out.println("�Ҽ� �Դϴ�.");

			} else { // �Ҽ��� �ƴ� ���
				System.out.println("�Ҽ��� �ƴմϴ�.");

			}
		}
	}

	public void example8() {

		// ���� 7���� �ڵ忡��
		// �߸� �Է��� ���
		// ���α׷��� �����ϴ� ���� �ƴ�
		// �ٽ� �Է��� ���� �� �ְ� �����ϱ�
		// (���� �Է� �� �ѹ� �˻��ϰ� ����)

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("�Է� : ");
			int input = sc.nextInt();

			if (input < 2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");

			} else {
				boolean flag = true;
				for (int i = 2; i < input; i++) {
					if (input % i == 0) { // �Ҽ��� �ƴ� ���
						flag = false;
						break;
					}
				}

				if (flag) {
					System.out.println("�Ҽ� �Դϴ�.");
				} else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				}

				break;
			}
		}

	}

	/*
	 * 3, 6, 9 ���� �����
	 * 
	 * - ����1 : 10 ~ 99 ���� ���ڰ� �Է� �Ǿ��� ���� ���� ���� - ����2 : 10 ~ 99 ���̰� �ƴ� ��� "�ٽ� �Է����ּ���"
	 * ��� �� ���� ���Է� - ����3 : ���ڰ� 3, 6, 9�� ���ԵǾ� ���� ��� "¦", �ƴϸ� �ش� ���� - ����4 : 33, 36,
	 * 39, 63, 66, 69, 93, 96, 99 "¦¦"
	 *
	 * ��� ȭ�� �Է� : 40 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ 14 15 ¦ 17 18 ¦ 20 21 22 ¦ 24 25 ¦
	 * 27 18 ¦ ¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ 40
	 * 
	 * 
	 * 
	 * 
	 */
	public void example9() {

		for (int i = 1; i < 100; i++) {

			// ���� �ڸ� �Ǵ� ���� �ڸ��� 3,6,9 �϶� "¦"

			// 1) ���� �ڸ� / ���� �ڸ� �и�
			// ex) 23 -> 2 , 3
			int ten = i / 10;
			int one = i % 10;

			// 2) 3, 6, 9 �����ϱ�
			if (ten % 3 == 0 && ten != 0) { // ���� �ڸ��� 3, 6, 9 �� ���

			}

			if (one % 3 == 0 && one != 0) { // ���� �ڸ��� 3, 6, 9 �� ���

			}

		}

	}

	
	
	
	public void example9b() {

		Scanner sc = new Scanner(System.in);
		System.out.println("============[3,6,9 ����]============");

		while (true) {
			System.out.print("�Է�(10~99) : ");
			int input = sc.nextInt();

			if (input < 10 || input >= 100) {
				System.out.println("10~99 ���� ������ �Է����ּ���.");
				System.out.println();
			} else {
				for (int i = 1; i <= input; i++) {

					int ten = i / 10; // 10�� �ڸ� �и�
					int one = i % 10; // 1�� �ڸ� �и�

					// for���� �ݺ� �� ������ �� ���ڿ��� �ʱ�ȭ
					String str = "";

					if (one != 0 && one % 3 == 0) { // 1�� �ڸ��� 3,6,9�� ���
						str += "¦";

						if (ten != 0 && ten % 3 == 0) { // 1�� �ڸ��� 3,6,9 �̸鼭 10�� �ڸ��� 3,6,9�� ���
							str += "¦";
						}

					} else if (ten != 0 && ten % 3 == 0) { // 10�� �ڸ��� 3,6,9�� ���
						str += "¦";

					} else { // 1, 10�� �ڸ� ��� 3,6,9�� �ƴ� ���
						str += i + "";
					}

					// str�� ����� ���� �Ǵ� "¦" �Ǵ� "¦¦"�� ���
					System.out.printf("%3s ", str);

					if (i % 10 == 0) { // 10���� ��µ� ��� �ٹٲ�
						System.out.println();
					}

				} // for end

				break; // while�� ����

			} 

		}// while end
	}

}
