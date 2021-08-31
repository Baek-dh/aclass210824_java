package edu.kh.control.loop.practice.service;

import java.util.Scanner;

public class LoopPracticeService {
	
	/* 실습문제 1
   사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
   단, 입력한 수는 1보다 크거나 같아야 합니다. 
   만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
   */
   public void practice1() {
      Scanner sc = new Scanner(System.in);
      System.out.print("1이상의 숫자를 입력하세요 : ");
	  int input = sc.nextInt();
	
	  if (input >= 1) {
	     for (int i = 1; i <= input; i++) {
	        System.out.print(i + " ");
	     }
	     
	  } else {
	     System.out.println("1 이상의 숫자를 입력해주세요.");
	  }
   }

	   
   	/* 실습문제 2
   	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
   	단, 입력한 수는 1보다 크거나 같아야 합니다. 
   	 */
   	public void practice2() {
   		Scanner sc = new Scanner(System.in);
   		System.out.print("1이상의 숫자를 입력하세요 : ");
   		int input = sc.nextInt();

   		if (input >= 1) {
   			for (int i = input; i >= 1; i--) {
   				System.out.print(i + " ");
   			}
   		} else {
   			System.out.println("1 이상의 숫자를 입력해주세요.");
   		}
   	}
	   

	/* 실습문제3 
	 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요. 
	 ex. 
	 정수를 하나 입력하세요 : 8 
	 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	 */
	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();

		int sum = 0; // 합계 저장용 변수

		for (int i = 1; i <= input; i++) {
			sum += i;

			System.out.print(i); // 숫자 출력

			if (i == input) { // 마지막 반복일 경우
				System.out.print(" = ");
			} else {
				System.out.print(" + ");
			}
		}

		System.out.print(sum);
	}

	 
	/* 실습문제 4
   사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
   만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
   */
   public void practice4() {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("첫 번째 숫자 : ");
	   int num1 = sc.nextInt();
	   System.out.print("두 번째 숫자 : ");
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
         
         
		   /* 이 방법도 가능!
     		if(num1 > num2) { // 첫 번째 입력받은 숫자가 두 번째 입력받은 숫자보다 클 경우
            
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
		   System.out.println("1 이상의 숫자를 입력해주세요.");
	   }
   }
   
   
   /* 실습문제 5
    사용자로부터 입력 받은 숫자의 단을 출력하세요.
    */
   public void practice5() {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("숫자 : ");
	   int num = sc.nextInt();
      
	   System.out.printf("===== %d단 =====\n", num);
	   for(int i = 1; i < 10; i++) {         
		   System.out.printf("%d * %d = %d%n", num, i, (num * i));
	   }
   }
   
   	/* 실습문제 6
   	사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
   	단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
   	 */
   	public void practice6() {
   		Scanner sc = new Scanner(System.in);
   		System.out.print("숫자 : ");
   		int num = sc.nextInt();
      
   		if(num <= 9) {
   			for(int i = num; i < 10; i++) {         
   				System.out.println("===== " + i + "단 ===== ");
   				for(int j = 1; j <= 9; j++) {            
   					System.out.printf("%d * %d = %d%n", i, j, (i * j));
   				}
   				System.out.println();
   			}	         
   		} else {
   			System.out.println("9 이하의 숫자만 입력해주세요.");
   		}
   	}
   
   
  	/* 실습문제7
   	다음과 같은 실행 예제를 구현하세요.
	
   	ex.
   	정수 입력 : 4
  	*
  	**
  	***
  	****
  	
  	*/
   	public void practice7() {
   		Scanner sc = new Scanner(System.in);
   		System.out.print("정수 입력 : ");
   		int num = sc.nextInt();
      
   		for(int i = 1; i <= num; i++) {
   			for(int j = 1; j <= i; j++) {            
   				System.out.print("*");
   			}
   			System.out.println();
   		}
   	}

	/*실습문제8 
	 다음과 같은 실행 예제를 구현하세요. ex. 정수 입력 : 4
	 ****
	 ***
	 **
	 *
	 
	 */
	public void practice8() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		/*
		for(int i=input ; i >= 1 ; i--) {
		 
			for(int j=1 ; j<=i ; j++) { 
				System.out.print("*"); 
			} 
			System.out.println(); // 줄바꿈 
		}
		*/

		for (int i = 1; i <= input; i++) { // 1 2 3 4

			for (int j = input; j >= i; j--) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

	/* 실습문제9 
	 1부터 사용자에게 입력 받은 수까지 중에서 
	 1) 2와 3의 배수를 모두 출력하고
	 2) 2와 3의 공배수의 개수를 출력하세요.
	 ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때 모두 나머지가 0이 나오는 수 
	 
	 ex. 자연수 하나를 입력하세요 : 15
	 2 3 4 6 8 9 10 12 14 15 
	 count : 2
	 */

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();

		int count = 0; // 공배수 개수를 카운트하기 위한 변수

		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				// 2의배수 또는 3의 배수
				System.out.print(i + " ");

				/*
				 * if( i % (2*3) == 0 ) { // 2와 3의 공배수
				 * 
				 * }
				 */

				if (i % 2 == 0 && i % 3 == 0) { // 2와 3의 공배수
					count++; // count 1 증가
				}
			}

		}
		// System.out.println();
		System.out.println("\ncount : " + count);

	}

	/* 실습문제10 
	 다음과 같은 실행 예제를 구현하세요. 
	 
	 ex. 정수 입력 : 4
	 *
	 **
	 ***
	 ****
	 
	 */

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {

			// 공백 출력
			for (int k = 1; k <= input - i; k++) {
				// input == 4일경우
				// input - 1 == 3
				// input - 2 == 2
				// input - 3 == 1
				// input - 4 == 0
				System.out.print(" ");
			}

			// 별 출력
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

	public void practice10b() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
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

	/*실습문제11 
	 다음과 같은 실행 예제를 구현하세요. 
	 
	 ex. 정수 입력 : 3
	 *
	 **
	 ***
	 **
	 *
	 
	 */

	// 조용진
	public void practice11a() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
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

	
	// 윤관호
	public void practice11b() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
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

	
	/* 실습문제 12
	다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 4
	   *
	  ***
	 *****
	*******

	 */
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {

			// 공백 출력
			for (int k = 1; k <= input - i; k++) {
				System.out.print(" ");
			}

			// 별 출력
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}

			System.out.println();

		}
	}
	
	
	/* 실습문제3
	다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 5
	*****
	*   *
	*   *
	*   *
	*****
	
	*/
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<=input ; row++) { // 행
			
			for(int col=1 ; col<=input ; col++) { // 열
				
				if(row == 1 || row == input  ||  col == 1  || col == input ) { 
					// 첫 행 || 마지막 행 * 출력
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 이상원
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
