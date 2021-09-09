package edu.kh.poly.ex2.model.service;

// extends : 클래스간의 상속,  인터페이스 간의 상속
// implements : 인터페이스 - 클래스 상속 관계  (구현하다)

// 클래스간의 다중 상속은 불가능
// 인터페이스 - 클래스 간의 다중 상속은 가능

public class MyCalculator implements Calculator, Marker {

	@Override
	public int plus(int num1, int num2) {
		return 0;
	}

	@Override
	public int minus(int num1, int num2) {
		return 0;
	}

	@Override
	public int multiple(int num1, int num2) {
		return 0;
	}

	@Override
	public int divide(int num1, int num2) {
		return 0;
	}
	

}
