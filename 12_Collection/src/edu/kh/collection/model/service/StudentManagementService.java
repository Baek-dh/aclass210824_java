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
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine(); // 개행문자 제거
			
				
				switch(sel) {
				case 1 : selectAll(); break;
				case 2 : addStudent(); break;
				case 3 : updateStudent(); break;
				//case 4 : deleteStudent(); break;
				//case 5 : searchStudentName();  break;
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
	private void updateStudent() {
		
		// + 인덱스 번호도 입력 받아야 되겠죠?
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
