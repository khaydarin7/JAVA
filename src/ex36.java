import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum=0;
		while(true)
		{//while무한 루프
			System.out.print("정수 입력:");
			num=sc.nextInt();//정수 입력
			if(num==0) {
				break;//반복문 탈출
			}
			sum += num;//합에 입력받은 정수를 더한다.
		}
		System.out.printf("합:%d\n", sum);
		sc.close();
	}
}
