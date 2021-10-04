package edu.kh.collection.model.vo;

public class Student extends Person{
	// class��? ��ü�� ����� ���� ���赵 �ʵ�, �޼ҵ�(+������)�� �̷����
	
	// ���� ������
	// + public : ���� ������Ʈ ���� ��𼭵�
	// # protected : ���� ��Ű�� + ��� ����
	// ~ (default) : ���� ��Ű��
	// - private  : ���� ��ü �������� ���� ���� 
	
	private String name;
	private int age;
	private int grade;
	// -> ĸ��ȭ ��Ģ�� ���ؼ� private���� ����
	
	
	// ������ : ��ü ���� �� ȣ��Ǵ� ������ �޼ҵ�
	//        ��ü ���� + �ʱ�ȭ �뵵�� ���
	
	public Student() { } // �⺻ ������
	
	// �Ű� ���� �ִ� ������
	// �Ű� ���� : ���� ���� ���� �����ϴ� ����
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		
		// this ���� ���� : ���� ��ü�� �����ּҸ� �����ϴ� ���� ����
		// == ��ü �ڽ��� ������.
	}
	
	
	
	public Student(char gender, double height, String name, int age, int grade) {
		super(gender, height);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	

	// getter / setter : ĸ��ȭ�� ���� ���� ������ ���ܵ� �ʵ忡 ���� ���� ���� ���
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	
	// �������̵� : ��� ���� �޼ҵ带 �ڽ� Ŭ�������� ������ 
	// �����ε� : ���� �̸��� �޼ҵ带 ���� �� �ۼ��ϴ� ���
	
	// toString() : Object Ŭ������ �޼ҵ�� �ʵ� ������ �ϳ��� ���ڿ��� ��ȯ�ϴ� �뵵��
	//				�������̵� �Ͽ� ����ϴ� �޼ҵ�
	
	@Override
	public String toString() {
		return   name + " / " + age + " / " + grade  + " / " + super.toString();
 	}													//  gender + " / " + height;
	
	
	
	
	
	
	
}