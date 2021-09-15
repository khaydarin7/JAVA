package Inheritance;

class MyPerson{
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}
class MyStudent extends MyPerson{
	void learn() {
		System.out.println("배우기");
	}
	void say() {
		System.out.println("선생님 안녕하세요");
	}
}
class Leader extends MyStudent{
	void lead() {	
	}
	void say() {
		System.out.println("선생님께 인사!");
		super.say();//"선생님 안녕하세요"
	}
}
//super - 상위의
//super.부모메소드이름
//부모가 물려준 메소드를 쓸수있다.

class MyTeacher extends MyPerson{
	void teach() {
		System.out.println("가르치기");
	}
}

public class Inherit_ex06 {
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.say();
	}
}
