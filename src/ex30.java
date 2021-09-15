import java.util.Scanner;
//java패키지 안의 uitl패키지 안에 Scanner클래스를 가져오겠다.
//일종의 라이브러리 관련 기능을 가져온다.
class Person{
	private String name;
	
	public void showInfo() {
		
	}
}

public class ex30 {

	public static void main(String[] args) {
		//Java에서 키보드입력? 어떻게?
		
		//Scanner클래스를 가져와서
		//Scanner클래스로 객체 생성하고,
		//Scanner클래스의 내장메서드를 쓰면된다.
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		num=sc.nextInt();//scanf_s("%d",&num);
		System.out.printf("num:%d\n",num);
		
		//sc가 가리키는 곳의 nextInt메서드 호출
		//클래스내부에 있는 함수를 메서드라고한다.
		
		//int num=10;
		
		//전체를 쉽게 생각하면
		//Scanner클래스로 객체 생성한다.
		
		//클래스는 변수와 함수가 들어있는 곳
		//객체는 클래스가 메모리에 생성된 것
		
		//Scanner sc
		//객체의 주소가 저장되는 변수
		//참조변수,객체변수
		
		//new는 메모리 생성 연산자
		//new Scanner <-- Scanner클래스로 메모리 생성한다.
		//Scanner객체 생성
		//Scanner클래스를 메모리에 실체화한다.
		
		//System.in - 키보드 입력
		
		
	}
}
