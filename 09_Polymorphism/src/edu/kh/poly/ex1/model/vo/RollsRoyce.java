package edu.kh.poly.ex1.model.vo;

public class RollsRoyce extends Car{

	private String umbrellaColor; // ¿ì»ê »ö
	
	public RollsRoyce() {
		super();
	}

	public RollsRoyce(int wheel, String handle, String engine, String umbrellaColor) {
		super(wheel, handle, engine);
		this.umbrellaColor = umbrellaColor;
	}

	public String getUmbrellaColor() {
		return umbrellaColor;
	}

	public void setUmbrellaColor(String umbrellaColor) {
		this.umbrellaColor = umbrellaColor;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + umbrellaColor;
	}
	
	
	
	
	
}
