package class_and_object;

class AAA{
	private static int num;//static멤버변수
	//클래스 변수
	//AAA클래스로 객체 생성한 모든 객체들이 공유하는 변수
	public AAA() {
		num++;
	}
	public void showNum() {
		System.out.printf("num:%d\n", num);
	}
}
public class class_ex06 {
	public static void main(String[] args) {
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		AAA a3 = new AAA();
		a1.showNum();
		a2.showNum();
		a3.showNum();
	}
}
//static 멤버변수는 클래스들이 공유하는 변수
//non-static 멤버변수는 특정객체만 가지고 있는 변수

