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
		major="자율전공";
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
		System.out.printf("학번:%s\n", id);
		System.out.printf("학년:%d\n", grade);
		System.out.printf("전공:%s\n", major);
		System.out.printf("학점:%d\n", point);
		System.out.printf("-----------\n");
	}
	public void CheckGraduate() {
		System.out.printf("학번:%s\n",id);
		if(grade==4 && point>=150) {
			System.out.println("졸업요건 충족!");
		}else {
			System.out.println("졸업요건 미충족!");
		}
		System.out.printf("-----------\n");
	}
}
