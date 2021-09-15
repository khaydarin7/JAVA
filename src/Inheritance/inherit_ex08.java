package Inheritance;

class YourPerson{
	private String name;
	private int age;
	private double height;
	
	public YourPerson() {
		name="�⺻�̸�";
		age=20;
		height=176.4;
	}
	public YourPerson(String name,int age,
			double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	public void Introduce() {
		System.out.printf("�̸�:%s\n", name);
		System.out.printf("����:%d\n", age);
		System.out.printf("Ű:%.1f\n", height);
	}
}

class YourStudent extends YourPerson{
	private int grade;//�г�
	private int score;//����
	
	public YourStudent() {
		super();//�θ��� ����Ʈ ������ ȣ��
		grade=1;
		score=80;
	}
	public YourStudent(String name,int age,double height,
			int grade,int score) {
		super(name,age,height);
		//String,int,double�����޴� �θ� ������ ȣ��
		this.grade=grade;//���� �������
		this.score=score;//���� �������
		//�θ� ��������� �θ�����ڷ� ó���ϰ�
		//���� ���� ��������� ���� �����ش�.
	}
	public void Introduce() {
		super.Introduce();//�θ��� Introduce�޼ҵ� ȣ��
		//�̸�,����,Ű �Ұ�
		System.out.printf("�г�:%d\n", grade);
		System.out.printf("����:%d\n", score);
	}
}
class YourEmployee extends YourPerson{
	private String position;
	private int salary;
	
	public YourEmployee() {
		super();//�θ��� ����Ʈ ������ ȣ��
		position="���";
		salary=3000;
	}
	public YourEmployee(String name,int age,double height,
			String position,int salary) {
		super(name,age,height);
		//�θ��� String,int,double ������ ȣ��
		this.position=position;
		this.salary=salary;
	}
	public void Introduce() {
		super.Introduce();//�θ��� Introduce�޼ҵ� ȣ��
		//�̸�,����,Ű �Ұ�
		System.out.printf("����:%s\n", position);
		System.out.printf("����:%d\n", salary);
	}
}
class YourPolice extends YourPerson{
	
}
public class inherit_ex08 {
	public static void main(String[] args) {
		YourStudent student = 
				new YourStudent("�̹�ȣ", 20, 178.5, 2, 95);
		student.Introduce();
		
		YourEmployee employee =
				new YourEmployee("���߱�",21,176.4, "�븮",3200);
		employee.Introduce();
	}
}
