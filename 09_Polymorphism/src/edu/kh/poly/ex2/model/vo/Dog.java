package edu.kh.poly.ex2.model.vo;

public class Dog extends Animal{
	// The type Dog must implement the inherited 
	// abstract method Animal.hunt()
	
	private int loyalty; // ����, �漺��
	
	// ������
	public Dog() {
		super();
	}
	
	public Dog(String type, String eatType, int loyalty) {
		super(type, eatType);
		this.loyalty = loyalty;
	}


	// ��� ���� �̿ϼ� �޼ҵ� hunt �������̵�
	@Override
	public void hunt() {
		System.out.println("�޷����� �� �ϰ� ��� ����.");
	}


	public int getLoyalty() {
		return loyalty;
	}


	public void setLoyalty(int loyalty) {
		this.loyalty = loyalty;
	}
	
	
	
	
	
	
	
}