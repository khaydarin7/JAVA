package Inheritance_problem;

class Student extends Person {
	private String id;
	private int grade;
	private String major;
	private int point;
	
	public Student() {
		super();
		id="1234";
		grade=1;
		major="��������";
		point=0;
	}
	public Student(String name,int age,double height,
			String id,int grade,String major,int point) 
	{
		super(name,age,height);
		this.id=id;
		this.grade=grade;
		this.major=major;
		this.point=point;
	}
	public void Introduce() {
		super.Introduce();
		System.out.printf("�й�:%s\n", id);
		System.out.printf("�г�:%d\n", grade);
		System.out.printf("����:%s\n", major);
		System.out.printf("����:%d\n", point);
		System.out.printf("-----------\n");
	}
	public void CheckGraduate() {
		System.out.printf("�й�:%s\n",id);
		if(grade==4 && point>=150) {
			System.out.println("������� ����!");
		}else {
			System.out.println("������� ������!");
		}
		System.out.printf("-----------\n");
	}
}
