package method;

import java.util.Scanner;

public class method_ex02 {

	public static void main(String[] args) {
		//Math.pow(2, 10);
		//power - 제곱메서드
		Scanner sc = new Scanner(System.in);
		System.out.print("곱할값과 횟수 입력:");
		int num=sc.nextInt();
		int count=sc.nextInt();
		int result=MyPow(num,count);
		System.out.printf("결과:%d\n", result);
		sc.close();
	}
	public static int MyPow(int n,int c) {
		int result=1;
		for(int i=1; i<=c; i++) {
			result=result*n;
		}
		return result;
	}
}
