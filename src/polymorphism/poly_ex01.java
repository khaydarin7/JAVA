package polymorphism;

//polymorphism
//다형성
//poly : 많은
//polymer : 고분자
//polymer engineering : 고분자 공학
//polygon : 다각형
//
//많은 형태, 다양한 형태
//
class Animal{
	public void sound() {
		System.out.println("울음소리 모름!");
	}
}

class Dog extends Animal{//상속
	public void sound() {//메소드 오버라이딩
		System.out.println("멍멍!");
	}
}
class Cat extends Animal{//상속
	public void sound() {//메소드 오버라이딩
		System.out.println("야옹!");
	}
}
class Frog extends Animal{//상속
	public void sound() {//메소드 오버라이딩
		System.out.println("개굴!");
	}
}
public class poly_ex01 {
	public static void main(String[] args) {
		//Animal ani = null;
		
		//ani = new Dog();
		//ani.sound();//멍멍
		
		//ani = new Cat();
		//ani.sound();//야옹
		
		//ani = new Frog();
		//ani.sound();//개굴
		Animal ani[]=new Animal[3];
		//int arr[]=new int[3];
		ani[0]=new Dog();
		ani[1]=new Cat();
		ani[2]=new Frog();
		for(int i=0; i<ani.length; i++) {
			ani[i].sound();
		}
		
		//Dog  d= new Dog();
		//Cat c = new Cat();
		//Frog f = new Frog();
		//Tiger t = new Tiger();
		//Lion l = new Lion();
	}
}
//자식 타입 변수에 부모 객체를 담을수 없다.
//ex) Dog d = new Animal(); - X

//부모 타입 변수에 자식 객체를 담을수 있다.
//ex) Animal ani = new Dog(); - O

//다형성은
//다양한 형태를 지닌다.
//다양한 형태를 지닐수 있는 이유가
//부모 타입 변수에 자식 객체들을 모두 담을수있으니까.
//부모 타입 변수에 어떤 자식 객체를 넣느냐에 따라서
//다양한 형태로 사용할수있다.

//다형성의 장점
//부모 타입 변수로 자식 객체들을 모두 사용할수있다.
//다형성이 없다면
//각각에 맞는 변수를 다 만들어야된다.
//근데 부모타입 변수로 자식 객체를 다 담을수있기 때문에
//
