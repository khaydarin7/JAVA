package Inheritance;

//자바는 다중상속이 불가능하다.
//class Test extends B, extends C{
//}
//final클래스는 상속해줄수 없다.
final class myFinal{
	public int num;
	public void Func() {
		System.out.println("myFinal");
	}
}
class myChild extends myFinal{
	//The type myChild cannot subclass 
	//the final class myFinal
	//myChild는 myFinal의 서브클래스가 될수없다.
	//->myFinal클래스는 final클래스니까 상속해줄수없다.
}

public class Inherit_ex04 {
	public static void main(String[] args) {

	}
}
