package edu.kh.array.ex.service;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayService1 {

	/* �迭(Array)
	 * - ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��.
	 * - ������ ������ �ϳ��� �迭������ �θ���, ������ index�� �̿���(index �� 0���� ����)
	 * 
	 * */
	
	public void example1() {
		
		// 1. �迭 ����
		
		// Stack �޸� ������ int[] �ڷ��� ���� arr1�� ����.
		// -> Heap ������ �ִ� int[]�� ������ �� �ִ� ���� arr1�� ����
		// --> ������ ���� == �ּҸ� �����Ͽ� �ش� �ּҿ� �ִ� ���� �����Ͽ� ���
		//    (������ ������ ������ �ּҸ��� �����Ѵ�!!!!!!!!!!!!!!!)
		int[] arr1;
		
		int arr2[];
		
		int num;
		
		// [] : �迭 ��ȣ
		
		
		// 2. �迭 �Ҵ�( �Ҵ� : �޸𸮻� ������ ���� ������ Ȯ���ϴ� �� )
		
		arr1 = new int[3];
		// new int[3];
		// 1) new : Heap �޸� ������ ���ο� ������ �Ҵ� �ϰڴ�.
		// 2) int[3] : int �ڷ��� ���� 3���� �����ִ� int[] �迭.
		
		// 1) + 2) : Heap �޸� ������ int �ڷ��� ���� 3�� �����ִ� int[]�� ���Ӱ� �Ҵ�.
		// --> �Ҵ��� ��ġ�� �ּҰ� ����.
		
		
		// arr1 = new int[3];
		
		// arr1�� �ڷ��� : int[]
		// new int[3]���� ������� �迭�� �ڷ��� : int[]
		// -> ���� �ڷ����� �����Ƿ� ���� ������ �����ϴ�
		
		// new int[3] ������ ���� �Ҵ�� �޸� ������ �ּҸ�
		// arr1 ������ ����
		
		
		//arr1 = 1; // arr1�� �ڷ����� int[],   1�� �ڷ����� int --> ���� �Ұ�
		
		// 3. �迭 �ʱ�ȭ (����)
		arr1[0] = 1; // arr1�� �����ϴ� �迭�� 0�� �ε����� 1�� ����
		arr1[1] = 100;
		arr1[2] = 9000;
		
		// 4. �迭 ���
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		
		
		//System.out.println("arr1[3] : " + arr1[3]);
		// arr1 ������ �����ϴ� �迭���� 3�� �ε����� ����
		// java.lang.ArrayIndexOutOfBoundsException: 3
		// -> �迭 �ε��� ���� �ʰ� ���� �߻�
		
		// 5. �迭 + for�� ���� ���
		for(int i=0 ; i<=2 ; i++) {
			// for������ i == index
			
			System.out.println( arr1[i]  );
		}
		
	}
	
	
	public void example2() {
		
		// �迭 ���� ����
		
		int[] arr = new int[3];
		// 1) Stack ������ int[] ������ ���� arr�� �����ϰ�
		
		// 2) Heap ������ int 3ĭ¥�� int[]�� ���Ӱ� �Ҵ� �ϰ�
		//	  �Ҵ�� �迭�� ���� �ּҸ�
		
		// 3) int[] ������ ���� arr�� ����
		
		// * Heap ������ �Ҵ�� ������ ��� ���� �� ����!
		// -> �ڷ��� �⺻������ �����Ϸ��� ���ؼ� �ʱ�ȭ �Ǿ�����.
		System.out.println("�����Ϸ��� ���� �ʱ�ȭ Ȯ��");
		
		for(int i=0 ; i<=2 ; i++) {
			System.out.print(arr[i] + " ");
			
			// arr�� �����ϰ��ִ� �迭�� �� �ε��� ���� ������� ���
		}
		
		
		// �迭�� �� �ε����� �� ���� (�迭 �ʱ�ȭ)
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		System.out.println();
		System.out.println("�迭 �ʱ�ȭ");
		
		// �迭��.length : ������ ����(ĭ ��)
		// arr.length == 3
		for(int i=0 ; i<arr.length ; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("�迭 ���� : " + arr.length);
		
	}
	
	
	public void example3() {
		// �迭 �ʱ�ȭ
		
		// int[] ������ ���� arr�� ������ ��
		// arr�� ���Ӱ� ������ int 5ĭ¥�� �迭�� ���� �ּҸ� �����ϰ�
		// �迭�� �� �ε��� ��ҿ� 2,4,6,8,10 �� ����
		
		int[] arr = new int[5];
		
		// 1) �ε����� �̿��� ���� �ʱ�ȭ
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		
		
		int[] arr2 = new int[5];
		
		// 2) for���� �̿��� �ʱ�ȭ
		for(int i=0 ; i<arr2.length ; i++) {
			// i = 0 1 2 3 4
			// �� = 2 4 6 8 10
			arr2[i] = i * 2 + 2;  // (i+1) * 2
		}
		
		
		// 3) �迭 ����� ���ÿ� �ʱ�ȭ
		
		int[] arr3 = {2,4,6,8,10};
		// int[] ������ ���� arr3��
		// ���Ӱ� �Ҵ�� int 5ĭ¥�� int[]�迭�� ���� �ּҸ� �����ϰ�
		// �� �ε����� 2,4,6,8,10 ���� �ʱ�ȭ
		
		
		// 1), 2), 3) �ʱ�ȭ ��� �ѹ��� ����ϱ�
		/*for(int i=0 ; i<arr.length ; i++) { // 1�� �ʱ�ȭ ��� ���
			System.out.print(arr[i] +  " ");
		}*/
		
		// �ڹ��� Arrays Ŭ���� : �ڹٿ��� �迭�� ���õ� ������ ����� �����ϴ� Ŭ����
		
		// Arrays.toString(�迭��) : �ش� �迭�� ����� ��� ��Ұ� ������� ���
		System.out.println( "arr �ʱ�ȭ Ȯ�� : "  +  Arrays.toString(arr)    );
		System.out.println( "arr2 �ʱ�ȭ Ȯ�� : "  +  Arrays.toString(arr2)    );
		System.out.println( "arr3 �ʱ�ȭ Ȯ�� : "  +  Arrays.toString(arr3)    );
		
	}
	
	
	public void example4() {
		
		// int �ڷ��� �迭 5ĭ¥���� ���� �� �Ҵ��� ��
		// �� �迭 �ε��� ��ҿ� �Է� ���� ������ �����ϰ�
		// �Է��� �Ϸ�� �� �� ���� ����ϱ�
		
		// ex)
		// �Է� 0 : 10
		// �Է� 1 : 5
		// �Է� 2 : 17
		// �Է� 3 : 30
		// �Է� 4 : 100
		
		// �Էµ� ������ : [10, 5, 17, 30, 100]
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputArr = new int[5];
		
		for(int i=0 ; i<inputArr.length ; i++) {
			
			System.out.print("�Է� " + i + " : ");
			inputArr[i] = sc.nextInt(); // �Է� ���� ������ �迭 ��ҿ� ����
		}
		
		System.out.println();
		System.out.println("�Էµ� ������ : " + Arrays.toString(inputArr) );
		
	}
	
	
	public void example5() {
		
		// 5���� Ű(cm)�� �Է� �޾� �迭�� �� �ε����� �ʱ�ȭ �ϰ�
		// 5���� Ű, ��� Ű ���
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5]; // �ڷ���[] -> �ش� �ڷ��� �迭
		
		
		for(int i=0 ; i<arr.length ; i++) {
			// index�� 0���� 1�� �����ϴ� ���� == int �ڷ������� ���� ����
			
			System.out.print( (i+1) + "�� Ű �Է� : ");
			arr[i] = sc.nextDouble();
		}
		
		System.out.println("�Է� ���� Ű : " + Arrays.toString(arr));
		
		// ��� == �հ� / �հ迡 ������ ���� ����
		double sum = 0;
		for(int i=0; i<arr.length ; i++) {
			sum += arr[i]; // �迭�� ����� Ű�� ���� sum�� ����
		}
		
		System.out.println("��� Ű : "  +   ( sum  /  arr.length )   );
												// ���� ������ ����� ����
												// ���� ���� ���� �ʰ�
												// ������ �Ǵ�
												// ���� ���� �� �ִ� �ڵ� �ۼ�
		
	}
	
	
	public void example6() {
		
		// ���� 5���� ���� ������ ������
		// �Է� ���� Ű�� ��� ����� ��
		// �Է� ���� �������� ����ϱ�
		
		/*
		1�� Ű �Է� : 170.5
		2�� Ű �Է� : 165.7
		3�� Ű �Է� : 184.3
		4�� Ű �Է� : 190.2
		5�� Ű �Է� : 174.4
		�Է� ���� Ű : [174.4, 190.2, 184.3, 165.7, 170.5]   (����)
		��� Ű : 177.02
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		
		// �Է� 
		for(int i=0; i<arr.length ; i++) {
			System.out.print( (i+1) + "�� Ű �Է� : ");
			arr[i] = sc.nextDouble();
		}
		
		// ���
		System.out.print("�Է� ���� Ű : [");
		
		// ���� ����� ���� for�� + �հ�
		double sum = 0;
		for(int i=arr.length-1 ; i>=0 ; i--) {
			
			System.out.print(arr[i]);
			sum += arr[i]; // �հ� ����
			
			
			if(i > 0) { // �ݺ����� �������� �ƴ� ���
				System.out.print(", ");
			}
			
		}
		
		System.out.println("]");
		System.out.println("��� Ű : " + (sum / arr.length));
	}
	
	
	public void example7() {
		
		// 5���� Ű�� �Է� �޾� �迭�� ������ ��
		// �����, �ִܽ��� ã�� ���
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		
		// �Է�
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print( (i+1) + "�� �Է� : "  );
			arr[i] = sc.nextDouble();
		}
		
		
		// * �ִ밪, �ּҰ� ã��
		// 10  20  15  27  35  14  20  30
		
		//double max = 0.0; // �ִ밪�� �����ϱ� ���� ����
		//double min = Double.MAX_VALUE; // �ּҰ��� �����ϱ� ���� ����
		
		// �ִ�/�ּ� ã�� ��� 1  ( max, min ������ ���� �Է� �ޱ� ���� �غ� )
		// * �ִ밪�� �����ϱ� ���� �������� ���� ���������� �ʱ�ȭ
		// * �ּҰ��� �����ϱ� ���� �������� ���� ū������ �ʱ�ȭ
		
		
		double max = arr[0];
		double min = arr[0];
		// �ִ�/�ּ� ã�� ��� 2 ( max, min ������ ���� �Է� ���� �� �غ� )
		// * �ִ�, �ּҸ� �����ϱ� ���� ������ �迭�� ù ��° ��� ���� ����
		
		
		for(int i=0 ; i<arr.length ; i++) {
			
			// �ִ밪 ã��
			if( arr[i] > max ) {
				// ���� ������ �迭 �ε����� ����   
				// max ������ ����� ������ ū ���
				max = arr[i];
			}
			
			// �ּҰ� ã��
			if( arr[i] <  min ) {
				// ���� ������ �迭 �ε����� ����   
				// min ������ ����� ������ ���� ���
				min = arr[i];
			}
		}
		
		// ����� ã��
		System.out.println("����� : " + max);
		
		// �ִܽ� ã��
		System.out.println("�ִܽ� : " + min);
		
	}
	
	
	
	public void example8() {
		
		// �Է� ���� ���� ��ŭ�� ũ�⸦ ���� int �迭�� ���� �� �Ҵ� �ϰ�
		// �迭�� �� �ε����� 5�� ������� �ϳ��� �ʱ�ȭ
		
		// ex)
		// �迭 ũ�� �Է� : 4
		// [5, 10, 15, 20]
		
		
		// �迭 ũ�� �Է� : 6
		// [5, 10, 15, 20, 25, 30]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ũ�� �Է� : ");
		int size = sc.nextInt();
		
		// int�� �迭 ���� �� �Ҵ�
		// ** �ڵ� ���� �� ���ϴ� ũ�⿡ �迭�� ���� �� �ִ�!!!
		int[] arr = new int[size];
		
		// �Ҵ�� �迭�� �� �ε��� ��ҿ� 5�� ��� �ʱ�ȭ
		for(int i=0; i<arr.length ; i++) {
					  /*size�� ����*/
			
			arr[i] = (i+1) * 5;
		}
		
		// ��� ���
		System.out.println( Arrays.toString(arr) );
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
