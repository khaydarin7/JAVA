package class_and_object;

class Student
{
	//������� (�ν��Ͻ� ����)
	private String name;
	private int grade;
	private double score;
	//private�� ��ü ���ο����� ���ٰ���
	//private - ��������,������
	
	//������
	Student(){
		System.out.println("����Ʈ ������");
		this.name="�⺻�̸�";
		this.grade=1;
		this.score=50;
	}
	Student(String name,int grade,double score){
		System.out.println("�Է��� String,int,double������");
		this.name=name;
		this.grade=grade;
		this.score=score;
	}
	
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	
	void setGrade(int grade) {
		this.grade=grade;
	}
	int getGrade() {
		return grade;
	}
	
	//��� �޼���
	void showInfo() {
		System.out.printf("�̸�:%s\n", name);
		System.out.printf("�г�:%d\n", grade);
		System.out.printf("����:%.1f\n", score);
	}
}

public class class_ex03 {

	public static void main(String[] args) {
		Student s1 = new Student("�̹�ȣ",4,95);
		//��ü �����ϸ鼭 ������(String,int,double) ȣ�� 
		Student s2 = new Student("��ä��",2,94);
		//��ü �����ϸ鼭 ������(String,int,double) ȣ�� 
		//s1.name="dfdf";
		//������� name�� �������� �����ڰ� private�̸� ������.
		//The field Student.name is not visible
		//StudentŬ������ �ʵ� name�� ������ �ʴ´�.
		//private�̸� ��ü �������ٸ� ����
		//private�ε� ��ü �ܺο��� �����Ϸ� �߱� ������ ����
		
		s1.showInfo();
		s2.showInfo();
		
		s2.setGrade(3);//s2.grade=3;
		s2.showInfo();
		//setter,getter
		//setter - �����ϴ¾� , ���� �����ϴ� �޼���
		//getter - �������¾� , ���� ��ȯ�ϴ� �޼���
		
	}
}
