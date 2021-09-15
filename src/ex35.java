import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		
		int start=0;
		int end=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("시작,끝 정수 입력:");
		start=sc.nextInt();
		end=sc.nextInt();
		
		int i=start;
		int evenSum=0;
		int oddSum=0;
		while(i<=end)
		{
			if(i%2==0) {
				evenSum += i;//evenSum=evenSum+i;
			}else {
				oddSum += i;//oddSum=oddSum+i;
			}
			i++;
		}
		System.out.printf("짝수의합:%d\n", evenSum);
		System.out.printf("홀수의합:%d\n", oddSum);
	}
}
