package edu.kh.eh.model.vo;

import java.io.EOFException;
import java.io.IOException;

public class Child extends Parent  {

	// ��� ���� methodA �������̵�
	@Override
	public void methodA() throws EOFException{
						 // IOException���� �� ��ü���̱� ������ ������
		
		// - throws Exception�� ��� 
		// Exception Exception is not compatible with 
		// throws clause in Parent.methodA()
		
		// �������̵� �� ����ó�� ������ ���� ������
		// ���ų� �� ��ü���̿��� �Ѵ�.
		
	}
	
}
