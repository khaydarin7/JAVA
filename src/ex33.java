import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name="";
		
		System.out.print("이름 입력:");
		name=sc.next();//scanf_s("%s",name,sizeof(name));
		
		System.out.printf("이름:%s\n", name);
		//정수 입력은 nextInt()
		//실수 입력은 nextDouble()
		//문자열 입력은 next() (공백이 들어간 문자열은 못받는다)
		//문자열 입력은 nextLine() (공백이 들어간 문자열도 받을수있음)
		
		//Scanner클래스 안에 메서드가 엄청많이 들어있다.
		
		
	}
}
