package class_and_object;
//클래스와 객체
//클래스는 설계도
//객체는 클래스가 실체화된것 (메모리에 생성된것)
class Person{//Person클래스
	//클래스안에는
	//멤버변수와,멤버메서드를 포함...
	String name;
	int age;
	double height;
	
	void Introduce() {
		System.out.printf("이름:%s\n", name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("키:%.1f\n", height);
	}
}

public class class_ex01 {

	public static void main(String[] args) {
		Person p = new Person();
		p.name="이민호";//p가 가리키는 곳의 name에 "이민호"
		p.age=20;
		p.height=178.3;
		p.Introduce();
		//Person p : 객체 변수, 참조변수
		//객체의 주소를 저장하는 변수
		
		//new Person()
		//new - 메모리 생성 연산자
		//Person클래스로 객체 생성한다.
		//객체 생성하고 나서 그 객체의 주소를 반환
		
	}
}
