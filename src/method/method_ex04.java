package method;

public class method_ex04 {

	public static void main(String[] args) {
		//메소드 오버로딩
		//method overloading
		//method = 클래스 내부의 함수
		//overloading = overload + ing
		//over + load : 과적하다, 초과적재하다, 너무 많이 실었다.
		//overloading : 과적하는것~
		//method overloading : 메소드를 과적하는것
		add();//입력이 없는 덧셈 메서드
		add(2,3);//두수의 덧셈 메서드 호출
		add(2,3,4);//세수의 덧셈 메서드 호출
	}
	public static void add() {
		System.out.printf("덧셈:%d?\n", 0);
	}
	public static void add(int n1,int n2) {
		System.out.printf("두수의 덧셈:%d\n", n1+n2);
	}
	public static void add(int n1,int n2,int n3) {
		System.out.printf("세수의 덧셈:%d\n", n1+n2+n3);
	}
}
