package edu.kh.poly.ex1.model.servie;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.RollsRoyce;
import edu.kh.poly.ex1.model.vo.Spark;
import edu.kh.poly.ex1.model.vo.TeslaCar;

public class PolymorphismService {

	public void exampl1() {
		
		// 컴퓨터 연산 규칙:  같은 자료형 끼리만 연산이 가능하다
		
		Car c = new Car(4, "원형핸들", "경유엔진");
		// 부모 타입 참조변수 = 부모 타입 객체
		// -> 객체와 참조변수의 타입이 같으므로 대입 연산 가능!
		
		TeslaCar t = new TeslaCar(4, "원형핸들", "전기모터", 50000);
		// 자식 타입 참조변수 = 자식 타입 객체
		
		
		// 다형성 (업 캐스팅) : 부모 타입 참조 변수로 자식 타입 객체를 참조
		// (상속 기반의 기술)
		
		Car c2 = new TeslaCar(6, "원형핸들", "전기모터", 100000);
		// 부모 타입 참조변수  =  자식 타입 객체
		// -> 참조 변수와 객체의 타입이 불일치하나 대입 연산이 가능한 상태
		
		
		// 각 객체의 필드 정보 출력 (toString 출력)
		System.out.println("c : " + c.toString());
		System.out.println("t : " + t.toString());
		
		// 다형성이 적용된 c2 참조변수를 이용하여 필드 정보를 출력
		System.out.println(c2.getWheel());
		System.out.println(c2.getHandle());
		System.out.println(c2.getEngine());
		
		//System.out.println(c2.getBatteryCapacity());
		// -> 부모 타입의 참조 변수로는
		//   자식 객체만의 멤버를 참조할 수 없으므로 에러 발생.
	}
	
	
	
	public void example2() {
		
		// 다형성 업캐스팅 활용
		
		// 1) 객체 배열  
		//  -> 서로 다른 자식 타입의 객체를
		//     하나의 부모 타입 객체 배열로 모두 다룰 수 있다.
		
		TeslaCar tesla = new TeslaCar(4, "원형", "전기모터", 5000);
		RollsRoyce royce = new RollsRoyce(4, "원형", "경유엔진", "검정");
		Spark spark = new Spark(4, "원형", "휘발유 엔진", 0.5);
		
		// 각 객체의 엔진 정보 출력
		System.out.println( tesla.getEngine()  );
		System.out.println( royce.getEngine()  );
		System.out.println( spark.getEngine()  );
		
		// TeslaCar, RollsRoyce, Spark는 Car의 자식이라는 공통점이 있다.
		// 부모 - 자식 관계에서 
		// 부모 참조 변수로 자식 객체를 참조하는 다형성이 적용된다.
		
		Car[] arr = new Car[3]; // 부모 타입 참조 변수 배열
								// 배열의 각 요소가 Car 타입의 참조 변수
		
		//arr[0] = new TeslaCar();
		// 부모       // 자식 객체
		arr[0] = tesla;
		// tesla == TeslaCar 객체 주소가 저장됨
		
		arr[1] = royce; // RollsRoyce 타입 객체 참조 주소
		// Car 타입 참조 변수
		
		arr[2] = spark;
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println( arr[i].getEngine() );
		}
		
		
		System.out.println("---------------------------------");
		
		// 2) 다형성 업캐스팅을 매개변수에 적용
		printEngine(tesla);
		printEngine(royce);
		printEngine(spark);
		
		// 3) 다형성의 업캐스팅을 리턴타입(반환형)에 적용
		System.out.println( updateEngine(tesla).getEngine()   );
		
		Car c2 = createCar(1);
		
	}

	
	public Car updateEngine ( Car c ) { // 매개변수로 얻어온 Car의 엔진 업그레이드
		String newEngine =  c.getEngine() + "(개량형)"; // 전기모터(개량형)
		
		c.setEngine(newEngine);
		
		return c;
	}
	
	// 정수를 하나 전달 받아 
	// 1이면 TeslaCar, 2이면 RollsRoyce, 3이면 Spark 객체를 생성하여 반환
	public Car createCar(int num) {
		
		Car c = null;
		
		switch(num) {
		case 1 : c = new TeslaCar(); break; // 다형성 (업캐스팅)
		case 2 : c = new RollsRoyce(); break;
		case 3 : c = new Spark(); break;
		}
		
		return c;
	}
	

	
	// 매개변수 다형성 적용
	public void printEngine( Car c ) {
		System.out.println( c.getEngine() );
	}
	
	
	// 매개변수 다형성 미적용
	/*public void printEngine( TeslaCar t ) {
		System.out.println( t.getEngine() );
	}
	
	public void printEngine( RollsRoyce r ) { // 오버로딩 적용
		System.out.println( r.getEngine() );
	}
	
	public void printEngine( Spark s ) {
		System.out.println( s.getEngine() );
	}*/
	

	
	public void example3() {
		
		// 다운 캐스팅 
		
		Car c = new Spark();
		// c.getDicountOffer()  -> 부모 타입의 참조변수로는 부모 부분만 참조 가능
		
		( (Spark)c ).getDiscountOffer();
		// -> 부모 타입 참조변수를 자식 타입으로 형변환하여
		//    자식 부분을 참조 가능하게 함. == 다운 캐스팅
		
		
		TeslaCar t = new TeslaCar();
		// t instanceof TeslaCar == true
		
		
		// ** instanceof 연산자
		
		//  Car c = new Spark();
		//  ex)   c   instanceof   Car
		//     참조변수             타입
		// -> 참조변수 c가 참조하고 있는 객체가 Car 타입인가? 맞으면 true 아니면 false
		// == c가 참조하고 있는 객체에 Car 객체가 포함되어 있는가?
		// == c가 참조하고 있는 Spark 객체와 Car 객체는 상속 관계인가?
		
		System.out.println( c instanceof Car  );
		System.out.println( c instanceof Spark  );
		
		
		Car[] carArr = { new Car(8, "큰 원형 핸들", "v8 디젤 엔진"),
						 new TeslaCar(4, "기능 많은 핸들", "전기 모터", 50000),
						 new RollsRoyce(6, "금붙이 핸들", "디젤 엔진", "갈색우산"),
						 new Spark(4, "조금한 원형 핸들", "가솔린 엔진", 0.5)
						};
		
		// for문을 이용하여 배열요소 하나씩 접근
		// 1) TeslaCar 자료형이면 -> 배터리 용량 출력
		// 2) RollsRoyce 자료형이면 -> 우산 색을 출력
		// 3) Spark 자료형이면 -> 할인 혜택 비율을 출력
		// 4) Car 자료형이면 -> toString()을 출력
		
		for(int i=0 ; i<carArr.length ; i++) {
			
			// 현재 배열 요소가 참조하는 객체의 타입을 확인
			// -> 참조되는 모든 객체가 Car 객체를 포함하고 있기 때문에
			//    Car를 검사하는 조건문은 마지막에 작성
			if( carArr[i] instanceof TeslaCar  ) {
				System.out.println(  ( (TeslaCar)carArr[i] ).getBatteryCapacity()    );
				
			} else if(  carArr[i] instanceof RollsRoyce ) {
				System.out.println(  ( (RollsRoyce)carArr[i] ).getUmbrellaColor()    );
				
			} else if(  carArr[i] instanceof Spark ) {
				System.out.println(  ( (Spark)carArr[i] ).getDiscountOffer()   );
				
			} else { // Car 자료형인 경우
				System.out.println( carArr[i].toString()  );
				
			}
		}
		
		// 업캐스팅을 이용하여 여러 자식 객체를
		// 하나의 객체 배열로 다루다가
		
		// 각 배열 요소의 자료형에 따라
		// 자료형에 맞는 고유한 기능을 수행하기 위해
		
		// instanceof로 자료형을 검사하고
		// 다운 캐스팅으로 형변환하여 고유 기능 수행
		
	}
	
	
	public void example4() {
		
		// 바인딩 : 실제 실행할 메소드 코드와 메소드 호출부를 연결하는 것
		
		// ex) ex1();  // 메소드 호출
		//   ->  public void ex1() { ... } // 메소드 실행
		
		// 1. 정적 바인딩
		// - 프로그램 실행 전 컴파일 단계에서 
		//   메소드 코드와 메소드 호출부를 연결
		
		Car c = new Spark(4, "원형 핸들", "가솔린 엔진", 0.5);
		
		System.out.println(  c.toString()   );
		// toString() : String - Car
		
		// 프로그램 실행 전 c.toString()은 
		// Car 클래스에 있는 toString() 메소드와 연결되어 있다.
		// == 정적 바인딩
		// 실행 시 출력 모양 예상 : 4 / 원형 핸들 / 가솔린 엔진
		
		// 실제 출력 모양 		: 4 / 원형 핸들 / 가솔린 엔진 / 0.5
		// -> Spark에 오버라이딩된 toString() 반환값
		
		// -> 프로그램 실행 중 
		//    정적 바인딩된 메소드가 아닌
		//    실행할 당시의 객체 타입의 오버라이딩된 메소드로 바인딩
		//    == 동적 바인딩
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
