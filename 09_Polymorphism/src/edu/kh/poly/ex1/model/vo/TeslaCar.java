package edu.kh.poly.ex1.model.vo;

public class TeslaCar extends Car{

	private int batteryCapacity; // 배터리 용량
	
	public TeslaCar() {
		super();
	}
	
	public TeslaCar( int wheel, String handle, String engine, int batteryCapacity ) {
		// this.wheel // 상속 받은 부모의 private 멤버는 직접 접근 불가
		
		super(wheel, handle, engine);
		this.batteryCapacity = batteryCapacity;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
	public String toString() {
		return super.toString()  + " / " + batteryCapacity;
		//  "4 / 동그라미 / 전기모터 / 5000"
	}
	
	
	
	
	
	
	
}
