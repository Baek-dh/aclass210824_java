package edu.kh.control.loop.practice.service;

import java.util.Scanner;

public class LoopPracticeService {
	
	/* �ǽ����� 1
   ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
   ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. 
   ���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
   */
   public void practice1() {
      Scanner sc = new Scanner(System.in);
      System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
	  int input = sc.nextInt();
	
	  if (input >= 1) {
	     for (int i = 1; i <= input; i++) {
	        System.out.print(i + " ");
	     }
	     
	  } else {
	     System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
	  }
   }

	   
   	/* �ǽ����� 2
   	����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
   	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. 
   	 */
   	public void practice2() {
   		Scanner sc = new Scanner(System.in);
   		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
   		int input = sc.nextInt();

   		if (input >= 1) {
   			for (int i = input; i >= 1; i--) {
   				System.out.print(i + " ");
   			}
   		} else {
   			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
   		}
   	}
	   

	/* �ǽ�����3 
	 1���� ����ڿ��� �Է� ���� �������� �������� ���� for���� �̿��Ͽ� ����ϼ���. 
	 ex. 
	 ������ �ϳ� �Է��ϼ��� : 8 
	 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	 */
	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int input = sc.nextInt();

		int sum = 0; // �հ� ����� ����

		for (int i = 1; i <= input; i++) {
			sum += i;

			System.out.print(i); // ���� ���

			if (i == input) { // ������ �ݺ��� ���
				System.out.print(" = ");
			} else {
				System.out.print(" + ");
			}
		}

		System.out.print(sum);
	}

	 
	/* �ǽ����� 4
   ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
   ���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
   */
   public void practice4() {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("ù ��° ���� : ");
	   int num1 = sc.nextInt();
	   System.out.print("�� ��° ���� : ");
	   int num2 = sc.nextInt();
	   
	   if(num1 >= 1 && num2 >= 1) {
		   
		   int start;
		   int end;
         
		   if(num1 <= num2) {
			   start = num1;
			   end = num2;
		   }else {
			   end = num1;
			   start = num2;
		   }
		   
		   for(int i = start ; i <= end ; i++) {
			   System.out.print(i + " ");
		   }   
         
         
		   /* �� ����� ����!
     		if(num1 > num2) { // ù ��° �Է¹��� ���ڰ� �� ��° �Է¹��� ���ں��� Ŭ ���
            
            for(int i=num2 ; i<=num1 ; i++) {
               System.out.print(i + " ");
            }
         
         }else {
            
            for(int i=num1 ; i<=num2 ; i++) {
               System.out.print(i + " ");
            }
         }
         */
         
	   } else {
		   System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
	   }
   }
   
   
   /* �ǽ����� 5
    ����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
    */
   public void practice5() {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("���� : ");
	   int num = sc.nextInt();
      
	   System.out.printf("===== %d�� =====\n", num);
	   for(int i = 1; i < 10; i++) {         
		   System.out.printf("%d * %d = %d%n", num, i, (num * i));
	   }
   }
   
   	/* �ǽ����� 6
   	����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
   	��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
   	 */
   	public void practice6() {
   		Scanner sc = new Scanner(System.in);
   		System.out.print("���� : ");
   		int num = sc.nextInt();
      
   		if(num <= 9) {
   			for(int i = num; i < 10; i++) {         
   				System.out.println("===== " + i + "�� ===== ");
   				for(int j = 1; j <= 9; j++) {            
   					System.out.printf("%d * %d = %d%n", i, j, (i * j));
   				}
   				System.out.println();
   			}	         
   		} else {
   			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
   		}
   	}
   
   
  	/* �ǽ�����7
   	������ ���� ���� ������ �����ϼ���.
	
   	ex.
   	���� �Է� : 4
  	*
  	**
  	***
  	****
  	
  	*/
   	public void practice7() {
   		Scanner sc = new Scanner(System.in);
   		System.out.print("���� �Է� : ");
   		int num = sc.nextInt();
      
   		for(int i = 1; i <= num; i++) {
   			for(int j = 1; j <= i; j++) {            
   				System.out.print("*");
   			}
   			System.out.println();
   		}
   	}

	/*�ǽ�����8 
	 ������ ���� ���� ������ �����ϼ���. ex. ���� �Է� : 4
	 ****
	 ***
	 **
	 *
	 
	 */
	public void practice8() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();

		/*
		for(int i=input ; i >= 1 ; i--) {
		 
			for(int j=1 ; j<=i ; j++) { 
				System.out.print("*"); 
			} 
			System.out.println(); // �ٹٲ� 
		}
		*/

		for (int i = 1; i <= input; i++) { // 1 2 3 4

			for (int j = input; j >= i; j--) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

	/* �ǽ�����9 
	 1���� ����ڿ��� �Է� ���� ������ �߿��� 
	 1) 2�� 3�� ����� ��� ����ϰ�
	 2) 2�� 3�� ������� ������ ����ϼ���.
	 ����������� �� �̻��� ���� ������ ������ ������ � ���� �ش� ����� ������ �� ��� �������� 0�� ������ �� 
	 
	 ex. �ڿ��� �ϳ��� �Է��ϼ��� : 15
	 2 3 4 6 8 9 10 12 14 15 
	 count : 2
	 */

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int input = sc.nextInt();

		int count = 0; // ����� ������ ī��Ʈ�ϱ� ���� ����

		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				// 2�ǹ�� �Ǵ� 3�� ���
				System.out.print(i + " ");

				/*
				 * if( i % (2*3) == 0 ) { // 2�� 3�� �����
				 * 
				 * }
				 */

				if (i % 2 == 0 && i % 3 == 0) { // 2�� 3�� �����
					count++; // count 1 ����
				}
			}

		}
		// System.out.println();
		System.out.println("\ncount : " + count);

	}

	/* �ǽ�����10 
	 ������ ���� ���� ������ �����ϼ���. 
	 
	 ex. ���� �Է� : 4
	 *
	 **
	 ***
	 ****
	 
	 */

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {

			// ���� ���
			for (int k = 1; k <= input - i; k++) {
				// input == 4�ϰ��
				// input - 1 == 3
				// input - 2 == 2
				// input - 3 == 1
				// input - 4 == 0
				System.out.print(" ");
			}

			// �� ���
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

	public void practice10b() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {

			for (int j = 1; j <= input; j++) {

				if (j <= input - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	/*�ǽ�����11 
	 ������ ���� ���� ������ �����ϼ���. 
	 
	 ex. ���� �Է� : 3
	 *
	 **
	 ***
	 **
	 *
	 
	 */

	// ������
	public void practice11a() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int q = input; q >= 1; q--) {
			for (int w = 1; w <= q - 1; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	// ����ȣ
	public void practice11b() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int su = num * 2;

		for (int i = 1; i < su; i++) {
			if (i <= num) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int k = su - i; k >= 1; k--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	
	/* �ǽ����� 12
	������ ���� ���� ������ �����ϼ���.
	ex.
	���� �Է� : 4
	   *
	  ***
	 *****
	*******

	 */
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {

			// ���� ���
			for (int k = 1; k <= input - i; k++) {
				System.out.print(" ");
			}

			// �� ���
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}

			System.out.println();

		}
	}
	
	
	/* �ǽ�����3
	������ ���� ���� ������ �����ϼ���.
	ex.
	���� �Է� : 5
	*****
	*   *
	*   *
	*   *
	*****
	
	*/
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<=input ; row++) { // ��
			
			for(int col=1 ; col<=input ; col++) { // ��
				
				if(row == 1 || row == input  ||  col == 1  || col == input ) { 
					// ù �� || ������ �� * ���
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		// �̻��
		for (int row = 1; row <= input; row++) {
			
			for (int col = 1; col <= input; col++) {
				
				if ((col > 1 && col < input) && (row > 1 && row < input)) {
					
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
}
