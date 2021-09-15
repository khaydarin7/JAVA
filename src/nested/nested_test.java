package nested;
//중첩클래스
//관련 있는 클래스를 중첩클래스로 묶을수있다.
class Outer{
	private int out_num;
	public void OutFunc() {
		System.out.println("OutFunc");
	}
	class Inner{
		private int in_num;
		public void InFunc() {
			System.out.println("InFunc");
		}
	}
}
public class nested_test {
	public static void main(String[] args) {
		Outer out = new Outer();//외부 클래스 객체 생성
		Outer.Inner in = out.new Inner();
		//내부클래스 객체 생성
		
		//Outer클래스 내부의 Inner클래스
		//내부 클래스 객체 생성
		out.OutFunc();
		in.InFunc();
	}
}
