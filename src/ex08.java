
public class ex08 {

	public static void main(String[] args) {
	//심볼릭 상수
	//c언어 상수 const
	//자바 상수 final
	//상수 - 변하지 않는값
	//변경되면 안되는 값을 상수에 넣어놓고 안정적으로 관리
	//파이 3.14
	//파이값을 누가바꿔서 3.3이 된다.
	//원의 둘레,넓이 완전 제대로 안나오니까
	final double pi=3.14;
	//처음 초기화할때만 값을 줄 수 있고, 그다음 부턴 값을 변경할수 없다.
	pi=3.3;
	//The final local variable pi cannot be assigned.
	//파이널 지역변수 pi는 할당될수없다.
	//It must be blank and not using a compound assignment
	//final을 쓰면안된다.
	//final은 변수를 상수화 하는 키워드
	}
}
