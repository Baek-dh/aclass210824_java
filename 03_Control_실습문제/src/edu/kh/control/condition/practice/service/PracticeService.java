package edu.kh.control.condition.practice.service;

import java.util.Scanner;

public class PracticeService {
	
	/* �ǽ�����1
	�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������  "OO�޴��Դϴ�"��,
	���� ��ȣ�� ������ "���α׷��� ����˴ϴ�."�� ����ϼ���. (OO�� �ش� �޴���)

	[���� ȭ��]
	1. �Է�
	2. ����
	3. ��ȸ
	4. ����
	7. ����
	�޴� ��ȣ�� �Է��ϼ��� : 3
	��ȸ �޴��Դϴ�.
	*/
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		
		int input = sc.nextInt();
		
		
		switch (input) {
		case 1: System.out.println("�Է� �޴��Դϴ�."); break;
		case 2: System.out.println("���� �޴��Դϴ�."); break;
		case 3: System.out.println("��ȸ �޴��Դϴ�."); break;
		case 4: System.out.println("���� �޴��Դϴ�."); break;
		case 7: System.out.println("���α׷��� �����մϴ�."); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); 
		}
		
	}
	
	
	/* �ǽ�����2
	Ű����� �Է� ���� ������ ����̸鼭 ¦���� ���� "¦���Դϴ�."�� ����ϰ�
	¦���� �ƴϸ� "Ȧ���Դϴ�."�� ����ϼ���.
	����� �ƴϸ� "����� �Է����ּ���."�� ����ϼ���.

	[���� ȭ�� 1]
	���ڸ� �� �� �Է��ϼ��� : 8
	¦���Դϴ�.

	[���� ȭ�� 2]
	���ڸ� �� �� �Է��ϼ��� : 17
	Ȧ���Դϴ�.
	
	[���� ȭ�� 3]
	���ڸ� �� �� �Է��ϼ��� : -3
	����� �Է����ּ���.
	 */
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		String result;
		if(input > 0) {
			if(input % 2 == 0) {
				result = "¦���Դϴ�.";
			}else {
				result = "Ȧ���Դϴ�.";
			}
			
		}else {
			result = "����� �Է����ּ���.";
		}
		
		System.out.println(result);
		
	}

	/* �ǽ�����3
	����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
	�հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
	(�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)

	�հ� ���� ��� ���� �� ������ �հ�, ���, "�����մϴ�, �հ��Դϴ�!"�� ����ϰ�
	���հ��� ��쿡�� "���հ��Դϴ�."�� ����ϼ���.

	[����ȭ�� 1]		[����ȭ�� 2]
	�������� : 88		�������� : 88
	�������� : 50		�������� : 50
	�������� : 40		�������� : 45
	���հ��Դϴ�.		���� : 88
					���� : 50
					���� : 45
					�հ� : 183
					��� : 61.0
					�����մϴ�, �հ��Դϴ�!

	 */
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		
		System.out.print("�������� : ");
		int math = sc.nextInt();
		
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(kor < 40 || math < 40 || eng < 40 || avg < 60.0){
			System.out.println("���հ��Դϴ�.");
		}else {
			System.out.println("���� : " + kor );
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + sum);
			System.out.printf("��� : %.1f\n�����մϴ�, �հ��Դϴ�!\n", avg );
			
		}
		
	}
	
	/* �ǽ�����4
	1~12 ������ ���� �Է� �޾� �ش� ���� �ϼ��� ����ϼ���.(2�� ������ �������� �ʽ��ϴ�.)
	�߸� �Է��� ��� "OO���� �߸� �Էµ� ���Դϴ�."�� ����ϼ���. (switch�� ���)
	
	[����ȭ�� 1]
	1~12 ������ ���� �Է� : 8
	8���� 31�ϱ��� �ֽ��ϴ�.
	
	[����ȭ�� 2] 
	1~12 ������ ���� �Է� : 99
	99���� �߸� �Էµ� ���Դϴ�.
	*/
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 2 :
			System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�.");
			break;
		default : System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
		
	}
	
	/* �ǽ�����5
	Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ���� 
	��ü��/����ü��/��ü��/���� ����ϼ���.

	BMI = ������ / (Ű(m) * Ű(m))
	BMI�� 18.5�̸��� ��� ��ü��  /  18.5�̻� 23�̸��� ��� ����ü��
	BMI�� 23�̻� 25�̸��� ��� ��ü��  /  25�̻� 30�̸��� ��� ��
	BMI�� 30�̻��� ��� �� ��

	[���� ȭ��]
	Ű(m)�� �Է��� �ּ��� : 1.65
	������(kg)�� �Է��� �ּ��� : 58.4
	BMI ���� : 21.45087235996327
	����ü��
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		if(bmi < 18.5) {
			result = "��ü��";
		}else if(bmi < 23) {
			result = "����ü��";
		}else if(bmi < 25) {
			result = "����";
		}else if(bmi < 30) {
			result = "��";
		}else {
			result = "����";
		}
		
		System.out.println("BMI���� : " + bmi);
		System.out.println(result);
		
		
	}
	
	/* �ǽ�����6
	�߰����, �⸻���, ��������, �⼮Ƚ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϼ���.
	�� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ�
	�� ��, �⼮ Ƚ���� �� ���� Ƚ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ����ϼ���. 
	70�� �̻��� ��� Pass, 70�� �̸��̰ų� ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���.

	[���� ȭ�� 1]
	�߰� ��� ���� : 80
	�⸻ ��� ���� : 30
	����  ���� : 60
	�⼮ Ƚ�� : 18
	================= ��� =================
	�߰� ��� ����(20) : 16.0
	�⸻ ��� ����(30) : 9.0
	���� ����       (30) : 18.0
	�⼮ ����       (20) : 18.0
	���� : 61.0
	Fail [���� �̴�]

	[���� ȭ�� 2]
	�߰� ��� ���� : 80
	�⸻ ��� ���� : 90
	����  ���� : 50
	�⼮ Ƚ�� : 15
	================= ��� =================
	�߰� ��� ����(20) : 16.0
	�⸻ ��� ����(30) : 27.0
	���� ����       (30) : 15.0
	�⼮ ����       (20) : 15.0
	���� : 73.0
	PASS
	
	[���� ȭ�� 3]
	�߰� ��� ���� : 100
	�⸻ ��� ���� : 80
	����  ���� : 40
	�⼮ Ƚ�� : 10
	================= ��� =================
	Fail [�⼮ Ƚ�� ���� (10/20)]
	*/
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		double midTermExam = sc.nextInt() * 0.2;
		
		System.out.print("�⸻ ��� ���� : ");
		double finalExam = sc.nextInt() * 0.3;
		
		System.out.print("���� ���� : ");
		double homework = sc.nextInt() * 0.3;
		
		System.out.print("�⼮ Ƚ�� : ");
		double attendance = sc.nextInt(); // �ڵ� ����ȯ
		
		// �⼮ Ƚ���� 14ȸ ����(�Ἦ 6ȸ �̻�)�� ��� 
		if( attendance <= 20 - (20 * 0.3) ) {
			System.out.println("Fail [�⼮ Ƚ�� ���� (" + (int)attendance  + "/20)]");
		
		}else {
			
			// �հ�
			double sum = midTermExam + finalExam + homework + attendance;
			
			System.out.printf("�߰� ��� ����(20) : %.1f\n", midTermExam);
			System.out.printf("�⸻ ��� ����(30) : %.1f\n", finalExam);
			System.out.printf("���� ����(30) : %.1f\n", homework);
			System.out.printf("�⼮ ����(20) : %.1f\n", attendance);
			System.out.printf("���� : %.1f\n", sum);
			
			if(sum >= 70.0) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [���� �̴�]");
			}
		}

	}
	
	/* �ǽ�����7
	Ű����� �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���.

	��, �� ���� ���� ��� 0���� ũ�ų� ���� ���� �۵��ϸ� 
	������ ���Ե� ��� "�ǿ����ڴ� 0���� ũ�ų� ���� ���� �Է����ּ���." ���
	�߸��� ���� ��ȣ�� �Է� ���� �� "�߸� �Է��ϼ̽��ϴ�." ���
	�ǿ�����1�� 0���� ���� ���(/ �Ǵ� %) "0���� ���� �� �����ϴ� ��£�

	[���� ȭ�� 1]
	�ǿ�����1 �Է� : 15
	������ �Է�(+,-,*,/,%) : /
	�ǿ�����2 �Է� : 4
	15 / 4 = 3.750000
	
	[���� ȭ�� 2]
	�ǿ�����1 �Է� : 15
	������ �Է�(+,-,*,/,%) : !
	�߸� �Է��ϼ̽��ϴ�.

	[���� ȭ�� 3]
	�ǿ�����1 �Է� : 0
	������ �Է�(+,-,*,/,%) : / 
	0�� ���� �� �����ϴ�.
	 */
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("������ �Է�(+,-,*,/,%) : ");
		char op = sc.next().charAt(0);
		
		// �ǿ����ڰ� 0 �̸鼭 �����ڰ� /�� ���
		if(num1 == 0  &&  op == '/') {
			System.out.println("0�� ���� �� �����ϴ�.");
		
		}else {
			
			double result = 0.0;
			
			int flag = 1; // flag�� boolean�� �ƴ� int�� �����Ͽ�
			// true/false �� ������ ǥ���� �� �ִ� ��ȣ��
			// 1,2,3 ... ���� ���ڷ� �� ���� ǥ���� �� �ֵ��� ��
			
			int num2 = 0;
			
			// �����ڰ� �߸� �ԷµǾ����� Ȯ��
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				
				System.out.print("�ǿ�����2 : ");
				num2 = sc.nextInt();
				
				// �ǿ����ڰ� ������ ���
				if(num1 < 0 || num2 < 0) {
					// "�ǿ����ڴ� 0���� ũ�ų� ���� ���� �Է����ּ���." 
					// flag == 4
					flag = 4;
					
				}else {
					switch(op) { // �����ڿ� ���� ��� ���
					case '+' : result = num1 + num2; break;
					case '-' : result = num1 - num2; break;
					case '*' : result = num1 * num2; break;
					case '/' : 
						if(num2 != 0) {
							result = num1 / num2; 
						}else {
							flag = 2;
						}
						break;
						
					case '%' : 
						if(num2 != 0) {
							result = num1 % num2; 
						}else {
							flag = 2;
						}
						break;
					} // switch end
					
				} // else end
				
			} else { //�����ڸ� �߸� �Է��� ���
				flag = 3;
			}
			
			
			if(flag == 2) {
				System.out.println("0���� ���� �� �����ϴ�");
				
			}else if(flag == 3) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				
			}else if(flag == 4) {
				System.out.println("�ǿ����ڴ� 0���� ũ�ų� ���� ���� �Է����ּ���.");
				
			}else {
				System.out.printf("%d %c %d = %f\n",num1, op, num2, result);
			}
		}
	}
}
