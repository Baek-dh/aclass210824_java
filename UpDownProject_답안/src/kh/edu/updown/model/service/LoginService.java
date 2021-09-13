package kh.edu.updown.model.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import kh.edu.updown.model.vo.Member;

public class LoginService {
	
	private Scanner sc = new Scanner(System.in);

	// ���ٿ� ���� ����
	// 1 ~ 100 ���� ���� �� �����ϰ� �� ���ڸ� �����ϰ� ��/�ٿ� ������ ����
	// ���� Ƚ���� ���� �α����� ȸ���� ���� �Ǵ� �ְ� ����� ��� ȸ���� highScore �ʵ� ���� ����
	public void startGame(Member loginMember) {
		
		System.out.println("[Game Start...]");
		
		// 1~ 100 ���� ���� �߻�
		int random = (int)(Math.random() * 100 + 1);
		
		int count = 0; // �Է� �õ� Ƚ�� ī��Ʈ
		
		try {
			while(true) {
				
				count++; // while���� �ݺ��� �� �� ���� count�� 1�� ������Ŵ
				
				System.out.print( count + "��° �Է� : ");
				int input = sc.nextInt();
				sc.nextLine();
				
				if(random == input) { // �Էµ� ���� �߻��� ������ ���ٸ�
					System.out.println("����!!");
					System.out.println("�Է� �õ� Ƚ�� : " + count);
					
					// �Է� �õ� Ƚ���� ���� �Ǵ� �ְ� ����� ���
					if(loginMember.getHighScore() == 0 || loginMember.getHighScore() > count) {
						System.out.println("*** �ְ� ��� �޼� ***");
						
						// �Ű������� ���� ���� loginMember�� highScore �ʵ忡 �õ� Ƚ�� ����
						loginMember.setHighScore(count); 
					}
					
					
					break; // while�� ����
					
				}else { // �Էµ� ���� �߻��� ������ ���� �ʴٸ�
					
					if(random < input) {
						System.out.println("-- DOWN --");
					}else {
						System.out.println("-- UP --");
					}
				}
				
				
			}
			
		}catch (InputMismatchException e) {
			System.out.println("1~100 ���� ������ �Է����ּ���.");
			sc.nextLine();
		}
	}

	
	// �� ���� ��ȸ
	// �α����� ����� ���� �� ��й�ȣ�� ������ ������ ������ ȭ�鿡 ���
	public void selectMyInfo(Member loginMember) {
		
		System.out.println("[�� ���� ��ȸ]");
		System.out.println("���̵� : " + loginMember.getMemberId());
		System.out.println("�̸� : " + loginMember.getMemberName());
		System.out.println("�ְ����� : " + loginMember.getHighScore() + "ȸ");
		
	}

	// ��ü ȸ�� ��ȸ
	// ��ü ȸ���� ���̵�, �ְ������� �ⷰ
	public void selectAllMember(Member[] members) {
		
		System.out.println("[��ü ȸ�� ��ȸ]");
		
		System.out.printf("%6s %7s\n", "[���̵�]", "[�ְ�����]");
		for(int i=0 ; i<members.length ; i++) {
			
			if(members[i] != null) { // members �迭 ��ҿ� ����� ȸ�� ������ �ִ� ���
				System.out.printf("%7s %7d\n", members[i].getMemberId(), members[i].getHighScore());
			}
		}
		
	}

	// ��й�ȣ ����
	// ���� ��й�ȣ�� �Է� �޾� 
	// ���� ��쿡�� �� ��й�ȣ�� �Է� �޾� ��й�ȣ ����
	public void updatePassword(Member loginMember) {
		
		System.out.println("[��й�ȣ ����]");
		
		System.out.print("���� ��й�ȣ �Է� : ");
		String currentPw = sc.next();
		
		if(currentPw.equals(loginMember.getMemberPw())) {
			System.out.print("�� ��й�ȣ : ");
			String newPw = sc.next();
			
			loginMember.setMemberPw(newPw);
			
			System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
			
		}else {
			System.out.println("���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		
		
	}

	
	
}
