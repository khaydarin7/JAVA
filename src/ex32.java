import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner객체 생성
		int num1=0;
		int num2=0;
		System.out.print("정수 2개 입력:");
		num1=sc.nextInt();//정수 입력 (키보드)
		num2=sc.nextInt();//정수 입력 (키보드)
		//공백으로 데이터 구분하고,엔터로 입력완료
		System.out.printf("%d %d\n", num1,num2);
		System.out.printf("%d\n", num1+num2);
		sc.close();
		
	}
}
