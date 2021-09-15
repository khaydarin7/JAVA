package test;

class Myperson{
	private int age;
	
	public Myperson(){
		age=0;
	}
	public Myperson(int age){
		this.age=age;
	}
	public void MypersonInfo(){
		System.out.printf("나이:%d\n",age);	
	}
}

class Mystudent extends Myperson{
	private int grade;
	private int score;
	
	public Mystudent(){
		super();
		grade=0;
		score=0;
	}
	
	public Mystudent(int age, int grade, int score){
		super(age);
		this.grade=grade;
		this.score=score;
	}
	public void MystudentInfo(){
		MypersonInfo();
		System.out.printf("학년 : %d, 점수 : %d", grade, score );
	
	
		
	}
}
public class test {

	public static void main(String[] args) {
		Mystudent bbb = new Mystudent(20, 100, 3);
		bbb.MystudentInfo();

	}

}
