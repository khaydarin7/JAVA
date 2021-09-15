package abstract_class;

//추상 클래스는
//1개 이상의 추상메서드를 가지는 클래스
abstract class Animal{
	public abstract void sound();
	//추상 메서드에 { }를 붙여서 기능을 만드려고하면...
	//Abstract methods do not specify a body
	//추상 메서드는 바디를 구체화하면 안된다.
	//추상 메서드는 기능을 만들면 안된다.
	//추상 메서드
	//실체가 없는 메서드
	//body가 없는 메서드
	public void hello() {
		System.out.println("안녕!");
	}
}
class Lion extends Animal{
	//추상 클래스에게 물려받은 추상메서드는
	//그걸 물려받은 클래스가 반드시 오버라이딩 해야한다.
	@Override
	public void sound() {
		System.out.println("어흥!");
	}
	//The type Lion must implement 
	//the inherited abstract method Animal.sound()	
}

public class abstract_test01 {
	public static void main(String[] args) {

	}
}
