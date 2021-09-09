package edu.kh.poly.ex1.model.vo;

public class Spark extends Car{

	private double discountOffer; // «“¿Œ «˝≈√
	
	public Spark() {
		super();
	}

	public Spark(int wheel, String handle, String engine, double discountOffer) {
		super(wheel, handle, engine);
		this.discountOffer = discountOffer;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
	
	
	
	
}
