package edu.kh.oop.field.model.service;

import edu.kh.oop.field.model.vo.Korean;

public class FieldService {

	public void example1() {
		
		// 예약어 static 테스트 하기
		
		// 한국인 객체 2개 생성
		Korean k1 = new Korean();
		Korean k2 = new Korean();
		
		System.out.printf("%s / %s / %d\n", k1.getName(), k1.getId(), k1.getNationalCode());
		System.out.printf("%s / %s / %d\n", k2.getName(), k2.getId(), k2.getNationalCode());
		
		
		
		// 각 객체에 이름, 주민등록번호 세팅
		k1.setName("박철수");
		k1.setId("990102-1234567");
		
		k2.setName("김영희");
		k2.setId("990304-2345678");
		
		
		// 각 객체가 가지고있는 필드 정보 출력
		System.out.printf("%s / %s / %d\n", k1.getName(), k1.getId(), k1.getNationalCode());
		System.out.printf("%s / %s / %d\n", k2.getName(), k2.getId(), k2.getNationalCode());
		
		
		// 만약 Korean 객체가 5천만개가 있다고 가정
		// 한국의 국가 코드가 82 -> 1 로변경
		// 이미 만들어진 Korean객체의 nationalCode 값을 1로 수정
		
		//k1.setNationalCode(1);
		//k2.setNationalCode(2);
		// ... 너무 비효율적 --> static을 활용하자!
		
		
		Korean.nationalCode = 1;
		// The field Korean.nationalCode is not visible
		// -> static으로 선언되어 모든 Korean 객체가
		//   nationalCode를 공유하지만
		//   접근 제한자가 private이면 
		//   Korean.nationalCode로 static에 직접 접근할 수 없음
		// --> 이럴 경우 캡슐화 원칙을 무시하고 public으로 작성
		
		System.out.printf("%s / %s / %d\n", k1.getName(), k1.getId(), k1.getNationalCode());
		System.out.printf("%s / %s / %d\n", k2.getName(), k2.getId(), k2.getNationalCode());
		
		
		
		
		
		
	}
}
