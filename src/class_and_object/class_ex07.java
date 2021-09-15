package class_and_object;

class BBB{
	private int num;
	public BBB() {
		num=0;
	}
	public BBB(int num) {
		this.num=num;
	}
	public void showNum() {
		System.out.printf("num:%d\n",num);
	}
	public static void staticMethod() {
		System.out.println("static!");
	}
}
//static은 객체가 생성되기 전에 이미 메모리에 생성되어있음
public class class_ex07 {
	public static void main(String[] args) {

		//어떤 클래스 내부의 static메서드는
		//클래스이름.메서드
		BBB.showNum();
		//일반메서드는 반드시 객체 생성을 해야 
		//메서드가 메모리에 로드되니까
		//그때부터 메서드를 사용할수있다.
		BBB.staticMethod();
		//static메서드는 객체 생성안해도 이미 메모리에 로드되어있다.
		//객체 생성안해도 사용가능
		//클래스이름.메서드이름
		
		//showNum은 non-static메서드
		//staticMethod는 static메서드
		
		//대표적인 클래스 2개
		//non-static메서드로 도배된 클래스
		//Scanner클래스
		//Scanner클래스의 메서드들은 대부분 non-static
		//반드시 객체 생성해야 메서드 사용가능
		
		//static메서드로 도배된 클래스
		//Math클래스
		//Math클래스의 메서드들은 대부분 static
		//객체 생성안해도 바로 사용가능
		//클래스이름.메서드이름
		Math.abs(-10);
		//The static method staticMethod() 
		//from the type BBB should be accessed 
		//in a static way
		//static메서드는 static메서드를 쓰는 방법으로 써라!
		//static메서드는 클래스이름.메서드
	}
}
