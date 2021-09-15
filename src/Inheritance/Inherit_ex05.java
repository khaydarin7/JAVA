package Inheritance;

//오버로딩
//메소드 오버로딩:method overloading
//overload : 과적하다.
//메소드 과적하는것
//매개변수 타입이나 갯수만 다른 메서드를 여러개 정의 가능하다.

//오버라이딩 (overriding)
//메소드 오버라이딩 : method overriding
//override : ~보다 우선시하다.
//메소드 오버라이딩 : method overriding
//부모가 물려준 메소드를 자식이 재정의 했을때
//자식이 재정의한 메서드가 우선시된다.
//부모의 원래 메서드는 가려진다.

//부모 클래스가 물려준 메서드를, 자식 클래스가 재정의하는것
//오버라이딩은 반드시 상속이 있어야만 가능한 문법
//밥을 차렸다->밥을 먹는다
//상속->오버라이딩
//상속이 안되있으면 오버라이딩이란것 자체가 없다.
//왜냐면 부모,자식 관계가 설정되어야 오버라이딩이 가능하니까
class MyAnimal{
	public void sound() {
		System.out.println("울음소리 모름!");
	}
}
class MyDog extends MyAnimal{
	//부모에게 이미 sound메서드를 물려받았는데,
	//그대로 쓰면 안되니까...
	//내가 sound메서드를 재정의 했다.
	@Override //annotation
	public void sound() {
		System.out.println("멍멍!");
	}
}
class MyCat extends MyAnimal{
	@Override
	public void sound() {
		System.out.println("야옹!");
	}
}
public class Inherit_ex05 {
	public static void main(String[] args) {
		MyDog dog = new MyDog();
		dog.sound();
		MyCat cat = new MyCat();
		cat.sound();
	}
}
