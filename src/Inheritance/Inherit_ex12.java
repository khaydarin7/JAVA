package Inheritance;

//class Child extends Parent
//Parent클래스가 Child클래스에게 상속해준다.
//Child클래스에는 Parent가 가지고 있던 멤버변수도 다 들어온다.
//그러면 Child가 Parent한테 받은 멤버변수도 초기화해야되는데...
//private이라서 접근안되니까.
//부모한테 상속받은 멤버변수는 부모 생성자로 처리한다.
//자식클래스에서 부모생성자를 부르는 법 super
//super(); - 부모의 디폴트 생성자
//super(name,age,height) - 부모의 String,int,double생성자

//오버라이딩
//override : 우선시하다
//메소드 오버라이딩 : method overriding
//메소드를 우선시하는것
//부모가 상속해준 메소드보다 자식이 재정의한 메서드가 우선시된다.
//메인 메서드에서 객체 생성해서 메소드를 호출하면
//자식이 재정의한 메소드가 호출된다.
//오버라이딩 vs 오버로딩
//우선시하는것 vs 과적하는것

//IS-A관계
//Person - Student,Employee,Police,FireFighter
//Car - Truck,SportsCar
//Computer - Desktop, NoteBook
//...
//Person is a Student - X - 사람은 학생이다.
//Student is a Person - O - 학생은 사람이다.

//HAS-A관계
//Police - Gun
//경찰이 총의 기능을 가져야 되니까
//상속을 해줘도 되긴한데...
//Police is a Gun - △ - 말은 좀 어색한데.
//다중상속이 안되니까 이렇게하면
//경찰이 총밖에 못가진다.

public class Inherit_ex12 {

	public static void main(String[] args) {

	}
}
