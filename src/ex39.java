import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int sum=0;//약수의 합
		System.out.print("정수 입력:");
		num=sc.nextInt();//6
		//6:1,2,3,6
		//어떤수의 약수? 
		//그 수를 나눠떨어지게 하는 수
		//6%1==0
		//6%2==0
		//6%3==0
		//6%4==2
		//6%5==1
		//6%6==0
		for(int i=1; i<num; i++)
		{//1~5 (6-1)
			if(num%i==0)//num을 i로 나눈 나머지가 0이라면
			{//num을 나눠 떨어지게하는 i값
			 //num의 약수 i
				sum+=i; //sum = sum+i;
			}
		}
		
		if(sum==num) {
			System.out.println("완전수 맞음!");
		}else {
			System.out.println("완전수 아님!");
		}
	}
}
