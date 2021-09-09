package edu.kh.poly.ex1.model.vo;

public class Car {
	private int wheel; // 바퀴 개수
	private String handle; // 운전대
	private String engine; // 엔진
	
	public Car() {
		super();
	}

	// 매개변수 있는 생성자 자동 완성
	// alt [+shift] + s -> o
	public Car(int wheel, String handle, String engine) {
		super();
		this.wheel = wheel;
		this.handle = handle;
		this.engine = engine;
	}

	// getter / setter 자동 완성
	// alt [+shift] + s -> r
	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	
	// 객체의 필드 정보를 하나의 문자열로 반환하는 용도의 메소드
	// Object.toString() 오버라이딩
	@Override
	public String toString() {
		return wheel + " / " + handle + " / " + engine;
	}
	
	
	
	
	
	
}
