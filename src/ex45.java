import java.util.Scanner;

public class ex45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp[]=new double[3];
		//3번의 온도를 저장
		double sum=0;//합
		double avg=0;//평균
		for(int i=0; i<temp.length; i++)
		{
			System.out.printf("%d번째 온도 입력:",i+1);
			temp[i]=sc.nextDouble();
			sum += temp[i];
		}
		avg=sum/3;//평균
		System.out.printf("평균:%f\n",avg);
	}
}
