package test;

//접근제어 지시자 : 접근을 어디까지 허용할것인가?

//접근제어 지시자가 default인 test_default클래스
class test_default {
	private int num;//멤버변수

	//생성자:객체가 생성될때 호출되는 요소
	//생성자 (constructor)
	
	//디폴트 생성자 (입력이 없는 생성자)
	public test_default() {
		num=0;
	}
	//입력이 있는 생성자
	public test_default(int num) {
		this.num=num;
		//this에는 현재 객체의 주소
	}
	//멤버메서드
	public void showNum() {
		System.out.printf("num:%d\n", num);
	}
}
