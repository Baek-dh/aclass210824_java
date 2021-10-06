package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.vo.Student;

public class StudentManagementService {

	private Scanner sc = new Scanner(System.in);
	
	private List<Student> stdList = new ArrayList<Student>();
	
	
	public void displayMenu() {
		
		int sel = 0;
		
		do {
			
			System.out.println("======== 학생 관리 프로그램 ========");
			System.out.println("1. 학생 전체 조회");
			System.out.println("2. 학생 정보 추가"); // 이름, 나이, 학년
			System.out.println("3. 학생 정보 수정"); // 이름, 나이, 학년
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름 검색");
			System.out.println("6. 이름, 나이, 학년이 일치하는 학생 인덱스 조회");
			System.out.println("7. 이름, 나이, 학년이 일치하는 학생 인덱스 조회 version2");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine(); // 개행문자 제거
			
				
				switch(sel) {
				case 1 : selectAll(); break;
				case 2 : addStudent(); break;
				case 3 : updateStudent(); break;
				case 4 : deleteStudent(); break;
				case 5 : searchStudentName();  break;
				
				case 6 : selectIndex(); break;
				case 7 : selectIndex2(); break;
				
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴에 있는 번호만 입력해주세요.");
				
				}
				
			}catch (InputMismatchException e) {
				System.out.println("정수만 입력해주세요.");
				sel = -1; // 맨 처음 sel == 0 인경우 바로 종료되는 것을 방지
				sc.nextLine(); // 입력버퍼에 남아있는 잘못 입력한 내용 제거
			}
			
		}while(sel != 0);
		
	}
	
	
	// 1. 학생 전체 조회
	private void selectAll() {
		System.out.println("[학생 전체 조회]");
		
		// 학생 정보가 있을 경우
		// 1번 이름 나이 학년
		// 2번 이름 나이 학년
		// 3번 이름 나이 학년
		
		// 학생 정보가 없을 경우
		// "입력된 학생 정보가 없습니다."
		
		// **  boolean isEmpty() 메소드 **
		// -> 컬렉션이 비어있으면 true, 아니면 false 반환
		
		// if(stdList == null)  (X)
		// --> JAVA에서 null은 참조하는 주소가 없음을 의미. (비어 있다 X)
		
		if( stdList.isEmpty() ) { // stdList가 비어있다면
			System.out.println("입력된 학생 정보가 없습니다.");
		
		} else { // stdList가 비어있지 않다면
			
			// 일반 for문 사용
			for(int i=0 ; i<stdList.size() ; i++ ) {
				
				// stdList의 i번째 인덱스 요소를 얻어와 Student 참조변수 s에 대입
				Student s = stdList.get(i);
				
				System.out.printf("%d번 %s %d세 %d학년 \n", i+1, s.getName(), s.getAge(), s.getGrade());   
				
			}
			
		}
	}
	
	
	// 2,3번 메뉴용 학생 정보 입력 메소드
	private Student inputStudent() throws InputMismatchException {
		// 메소드 수행 중 예외 발생 시
		// 별도의 처리 구문(try-catch)가 없을 경우
		// 호출한 메소드로 예외를 던진다. (throws)
		
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		// 입력 받은 값을 이용해 Student 객체를 생성 및 초기화한 후 해당 객체의 주소를 반환
		return new Student(name, age, grade);
		
	}
	

	
	// 2. 학생 정보 추가
	private void addStudent() throws InputMismatchException {
		System.out.println("[학생 정보 추가]");
		
		// 이름, 나이, 학년을 입력 받아 stdList에 추가
		
		// 입력 받은 값으로 생성한 학생 객체를 반환 받아 stdList에 추가
		stdList.add( inputStudent() );
	}
	
	
	// 3. 학생 정보 수정
	// 이름, 나이, 학년을 입력 받아 특정 index에 있는 학생 정보를 수정
	private void updateStudent() throws InputMismatchException {
		
		// 1) 인덱스 번호 입력 받기
		System.out.print("수정할 학생의 인덱스 번호 입력 : ");
		int inputIndex = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에서 개행 문자 제거
		// 2) 해당 인덱스가 stdList에 있는지 검사
		
		// 2-1) 비어있는지 확인
		if( stdList.isEmpty()  ) {
			System.out.println("입력된 학생 정보가 없습니다.");
		}else {
			
			// 2-2) 음수 입력 확인
			if(inputIndex < 0) {
				System.out.println("음수는 입력할 수 없습니다.");
			}else {
				
				// 2-3) 입력된 인덱스가 stdList 범위 내에 있는지 확인
				if( inputIndex < stdList.size() ) {
					
					// 3-1) 인덱스가 있을 경우 학생 정보를 입력 받아 수정
					stdList.set(inputIndex,  inputStudent());
												// -> Student 객체 주소 반환
					
				}else {
					
					// 3-2) 인덱스가 없을 경우 "index가 존재하지 않음" 구문 출력
					System.out.println("index가 존재하지 않음");
				}
			}
		}	
	}
	
	
	
	// 4. 학생 정보 제거
	private void deleteStudent() {
		System.out.println("[학생 정보 제거]");
		
		// 인덱스 번호를 입력 받아 해당 인덱스 학생 정보를 삭제
		System.out.print("삭제할 학생 인덱스 번호 입력 : ");
		int inputIndex = sc.nextInt();
		sc.nextLine();
		
		if( !stdList.isEmpty() ) { // stdList 비어있지 않다면
			
			if( inputIndex >= 0 ) { // 입력 받은 index가 0 또는 양수
				
				if(inputIndex < stdList.size() ) { // 존재하는 index인 경우
					stdList.remove(inputIndex);
					System.out.println("삭제되었습니다.");
					
				}else { // 존재하지 않는 인덱스
					System.out.println("index가 존재하지 않음");
				}
				
			}else { // 음수
				System.out.println("음수는 입력할 수 없습니다.");
			}
			
		}else {// stdList 비어있다면
			System.out.println("입력된 학생 정보가 없습니다.");
		}
		
	}
	
	
	// 학생 이름 검색
	private void searchStudentName() {
		
		// 이름을 입력 받아 일치하는 학생의 인덱스 번호와 학생 정보를 출력
		// 없으면 "존재하지 않는 학생입니다" 출력
		
		// 1) 이름 입력
		System.out.print("검색할 학생 이름 입력 : ");
		String inputName = sc.nextLine();

		// 2-1) stdList가 비어있는지 검사
		if( !stdList.isEmpty() ) {

			boolean flag = true; // 검색 결과 존재 여부에 대한 신호
			
			// 2-2) 입력 받은 학생이 stdList에 있는 검사
			for(int i=0 ; i<stdList.size() ; i++) {
				
				// 3-1) 있으면 인덱스 + 학생 정보 출력
				if(  inputName.equals(  stdList.get(i).getName()  )   ) {
					
					System.out.println("인덱스 번호 : " + i);
					System.out.println("조회 시 출력 번호 : " + (i + 1));
					System.out.println(stdList.get(i)); // 자동으로 toString() 메소드 호출
					
					//break; // 동명이인이 있을 수 있음
				
					flag = false;
				} 
			}
			
			// 3-2) 없으면 "존재하지 않는 학생입니다"
			if(flag) { // for문 반복 후에도 flag == true인 경우 == 검색 결과 X
				System.out.println("존재하지 않는 학생입니다");
			}
			
		}else {
			System.out.println("입력된 학생 정보가 없습니다.");
		}
	}
	
	
	
	// 6. 이름, 나이, 학년이 일치하는 학생 인덱스 조회
	private void selectIndex() {
		System.out.println("[이름, 나이, 학년이 일치하는 학생 인덱스 조회]");
		
		// 1) 이름, 나이, 학년을 입력 받기
		Student std = inputStudent();
		
		// 2) stdList에서 세개 모두 일치하는 학생의 인덱스를 출력
		boolean flag = true;
		
		for(int i=0 ; i<stdList.size() ; i++) {
			
			// 현재 접근한 stdList 내부 객체를 s변수로 참조
			Student s = stdList.get(i);
			
			// 이름, 나이, 학년이 일치하는 경우
			if( s.getName().equals( std.getName() )  &&  
				s.getAge() == std.getAge()  &&
				s.getGrade() == std.getGrade() ) {
				
				System.out.println("인덱스 번호 : " + i);
				
				flag = false;
			}
		} // for end
		
		if(flag) {
			System.out.println("일치하는 학생이 존재하지 않습니다.");
		}
		
		
	}
	
	
	
	// 7. 이름, 나이, 학년이 일치하는 학생 인덱스 조회 version2
	private void selectIndex2() {
		System.out.println("[이름, 나이, 학년이 일치하는 학생 인덱스 조회 version2]");
		
		// 1) 이름, 나이, 학년 입력
		Student std = inputStudent();
		
		// 2) Object.equals() 메소드 -> 오버라이딩
		
		// 테스트
		//System.out.println( std.equals( new Student("홍길동", 15, 2))  );
		
		
		// 3) int List.indexOf(Object o) 메소드
		// -> 리스트에서 매개변수 o와 같은 객체가 존재하는 index를 반환 , 없으면 -1 반환
		// 같은 객체임을 확인하는 equals() 오버라이딩 필수!
		
		//System.out.println( stdList.indexOf(std) );
		// stdList에 std와 같은 값을 가진 객체의 인덱스 출력
		
		if( stdList.indexOf(std) != -1 ) {
			System.out.println("인덱스 번호 : " + stdList.indexOf(std));
		}else {
			System.out.println("일치하는 학생이 존재하지 않습니다.");
		}
		
	}
	
	
	
	
	
	
	
}
