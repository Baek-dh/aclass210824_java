package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionService2 {
	
	// switch��
	// - �� �ϳ��� ���� ����� ���� ó���� �� ����ϴ� ���ǹ�
	// - ���� ������� ��ġ�ϴ� case���� �����.
	
	/* switch(��){
	 * 
	 * case �����1: �����ڵ�1; break;
	 * case �����2: �����ڵ�2; break;
	 * case �����3: �����ڵ�3; break;
	 * ...
	 * default : case�� �������� ���� ����� �ڵ�;
	 * }
	 * */
	
	public void example1() {
		// Ű����� ������ �Է� �޾�
		// 3�� ��� : ������
		// 4�� ��� : �Ķ���
		// 5�� ��� : �����  ���
		// ������ ��� : ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		String color;
		
		switch( input ) {
		
		case 3 : color = "������"; break;
		case 4 : color = "�Ķ���"; break;
		case 5 : color = "�����"; break;
		default : color = "���";
		}
		
		System.out.println(color);
		
	}
	
	
	
	

}
