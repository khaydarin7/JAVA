package Inheritance;

//상속관계에서
//부모 클래스, 자식 클래스
//Parents (부모) , Children (자식)
//Super(상위), Sub(하위)
//Base (기본,기초), Derrived (파생된)

//IS-A관계
//~이다.
//사람을 학생에게 물려준다.
//사람을 경찰관에게 물려준다.
//동물을 개에게 물려준다.
//개는 동물이다. - O - Dog is a Animal
//동물은 개다. - X - Animal is a Dog

//Animal을 Dog,Cat,Frog에게 상속해준다.
//Preson을 Student,Employee,Police에게 상속해준다.
//Car를 SportsCar,Truck에게 상속해준다.
//Computer를 Desktop,NoteBook에게 상속해준다.
//RemoteController을 TvRemote,AirRemote에게 상속해준다.
//...공통기능을 물려준다.

class Animal{
	public String name;
	public void Sound() {
		System.out.println("울음소리");
	}
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}
public class Inherit_ex02 {

	public static void main(String[] args) {

	}
}
