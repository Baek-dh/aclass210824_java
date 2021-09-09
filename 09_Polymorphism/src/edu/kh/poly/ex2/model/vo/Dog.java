package edu.kh.poly.ex2.model.vo;

public class Dog extends Animal{
	// The type Dog must implement the inherited 
	// abstract method Animal.hunt()
	
	private int loyalty; // 충의, 충성심
	
	// 생성자
	public Dog() {
		super();
	}
	
	public Dog(String type, String eatType, int loyalty) {
		super(type, eatType);
		this.loyalty = loyalty;
	}


	// 상속 받은 미완성 메소드 hunt 오버라이딩
	@Override
	public void hunt() {
		System.out.println("달려가서 앙 하고 쎄게 물음.");
	}


	public int getLoyalty() {
		return loyalty;
	}


	public void setLoyalty(int loyalty) {
		this.loyalty = loyalty;
	}
	
	
	
	
	
	
	
}
