package Inheritance;

class YourPerson{
	private String name;
	private int age;
	private double height;
	
	public YourPerson() {
		name="기본이름";
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
		System.out.printf("이름:%s\n", name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("키:%.1f\n", height);
	}
}

class YourStudent extends YourPerson{
	private int grade;//학년
	private int score;//점수
	
	public YourStudent() {
		super();//부모의 디폴트 생성자 호출
		grade=1;
		score=80;
	}
	public YourStudent(String name,int age,double height,
			int grade,int score) {
		super(name,age,height);
		//String,int,double값을받는 부모 생성자 호출
		this.grade=grade;//나의 멤버변수
		this.score=score;//나의 멤버변수
		//부모 멤버변수는 부모생성자로 처리하고
		//원래 나의 멤버변수는 내가 값을준다.
	}
	public void Introduce() {
		super.Introduce();//부모의 Introduce메소드 호출
		//이름,나이,키 소개
		System.out.printf("학년:%d\n", grade);
		System.out.printf("점수:%d\n", score);
	}
}
class YourEmployee extends YourPerson{
	private String position;
	private int salary;
	
	public YourEmployee() {
		super();//부모의 디폴트 생성자 호출
		position="사원";
		salary=3000;
	}
	public YourEmployee(String name,int age,double height,
			String position,int salary) {
		super(name,age,height);
		//부모의 String,int,double 생성자 호출
		this.position=position;
		this.salary=salary;
	}
	public void Introduce() {
		super.Introduce();//부모의 Introduce메소드 호출
		//이름,나이,키 소개
		System.out.printf("직급:%s\n", position);
		System.out.printf("연봉:%d\n", salary);
	}
}
class YourPolice extends YourPerson{
	
}
public class inherit_ex08 {
	public static void main(String[] args) {
		YourStudent student = 
				new YourStudent("이민호", 20, 178.5, 2, 95);
		student.Introduce();
		
		YourEmployee employee =
				new YourEmployee("송중기",21,176.4, "대리",3200);
		employee.Introduce();
	}
}
