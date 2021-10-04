package edu.kh.review.model.vo;

public class Student {
	private int studentId; // 학번
	private String studentName; // 이름
	private int grade; // 학년
	private int classRoom; // 반
	private char gender; // 성별
	
	public Student() {	}

	public Student(int studentId, String studentName, int grade, int classRoom, char gender) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		this.classRoom = classRoom;
		this.gender = gender;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return studentId + " / " + studentName + " / " + grade + " / " + classRoom + " / " + gender;
	}
	
	
	
}
