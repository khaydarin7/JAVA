import java.util.Scanner;

public class ex31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num=0;
		
		System.out.print("실수 입력:");
		num=sc.nextDouble();//scanf_s("%lf",&num);
		System.out.printf("num:%f\n",num);
	}
}
