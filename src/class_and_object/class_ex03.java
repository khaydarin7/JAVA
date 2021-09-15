package class_and_object;

class Student
{
	//멤버변수 (인스턴스 변수)
	private String name;
	private int grade;
	private double score;
	//private은 객체 내부에서만 접근가능
	//private - 개인적인,사적인
	
	//생성자
	Student(){
		System.out.println("디폴트 생성자");
		this.name="기본이름";
		this.grade=1;
		this.score=50;
	}
	Student(String name,int grade,double score){
		System.out.println("입력이 String,int,double생성자");
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
	
	//멤버 메서드
	void showInfo() {
		System.out.printf("이름:%s\n", name);
		System.out.printf("학년:%d\n", grade);
		System.out.printf("성적:%.1f\n", score);
	}
}

public class class_ex03 {

	public static void main(String[] args) {
		Student s1 = new Student("이민호",4,95);
		//객체 생성하면서 생성자(String,int,double) 호출 
		Student s2 = new Student("정채연",2,94);
		//객체 생성하면서 생성자(String,int,double) 호출 
		//s1.name="dfdf";
		//멤버변수 name의 접근제어 지시자가 private이면 오류다.
		//The field Student.name is not visible
		//Student클래스의 필드 name이 보이지 않는다.
		//private이면 객체 내부접근만 가능
		//private인데 객체 외부에서 접근하려 했기 때문에 오류
		
		s1.showInfo();
		s2.showInfo();
		
		s2.setGrade(3);//s2.grade=3;
		s2.showInfo();
		//setter,getter
		//setter - 세팅하는애 , 값을 세팅하는 메서드
		//getter - 가져오는애 , 값을 반환하는 메서드
		
	}
}
