package Inheritance;

//총 클래스
class Gun{
	public void Bang() {
		System.out.println("빵야!");
	}
}
//몽둥이 클래스
class Cudgel{
	public void swing() {
		System.out.println("삼단봉 휘두르기!");
	}
}
//상속은 기능을 물려주는것 외에도
//오버라이딩+다형성

//경찰
class Police{
	//Has-A관계
	private Gun g;//Gun을 포함시켰다.
	private Cudgel c;//Cudgel을 포함시켰다.
	public Police() {
		g=new Gun();//총 할당
		c=new Cudgel();//몽둥이 할당
	}
	public void Fire() {
		g.Bang();
	}
	public void Swing() {
		c.swing();
	}
}
//class Dog extends Animal
//class Student extends Person
//class SportsCar extends Car
//IS-A관계
//Dog is a Animal - 개는 동물이다.
//Student is a Person - 학생은 사람이다.
//SportsCar is a Car - 스포츠카는 차다.
//자식 is a 부모

//Police is a Gun
//기능은 물려줘야될꺼 같은데...? 그럼 상속해줘야 될꺼같은데...
//IS-A관계로 판별해보면 어색하다...
//이런 관계는 상속을해도 되긴하는데
//상속대신 포함관계로 처리한다.
public class Inherit_ex10 {
	public static void main(String[] args) {
		Police p = new Police();
		p.Fire();//총발사
		p.Swing();//몽둥이 휘두르기
	}
}
