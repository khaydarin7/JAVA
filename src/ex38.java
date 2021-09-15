import java.util.Scanner;

public class ex38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		System.out.print("정수 2개 입력:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		for(int dan=num1; dan<=num2; dan++)//단 (외부 for)
		{
			for(int i=1; i<=9; i++)//1~9 (내부 for)
			{
				System.out.printf("%dx%d=%d\n", dan,i,dan*i);
			}
			System.out.printf("\n");
		}
		sc.close();//스캐너 객체 소멸
		//스캐너 닫기
	}

}
