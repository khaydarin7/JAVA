package method;

import java.util.Scanner;
import class_and_object.MyGreat;

public class method_ex03 {

	public static void main(String[] args) {
		MyGreat my = new MyGreat();
		
		//최대 공약수
		//GCD = Greatest Common Divisor
		int num1=0;
		int num2=0;
		int result=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		result=GCD(num1,num2);
		System.out.printf("최대공약수는:%d\n", result);
		sc.close();
	}
	//6 9 
	public static int GCD(int n1,int n2) {
		int gcd=0;
		for(int i=1; i<=n1; i++) {
			if(n1%i==0 && n2%i==0) {
				//i가 n1,n2를 둘다 나눠떨어지게 한다.
				gcd=i;
			}
		}
		return gcd;
	}
}
