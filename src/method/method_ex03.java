package method;

import java.util.Scanner;
import class_and_object.MyGreat;

public class method_ex03 {

	public static void main(String[] args) {
		MyGreat my = new MyGreat();
		
		//�ִ� �����
		//GCD = Greatest Common Divisor
		int num1=0;
		int num2=0;
		int result=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2�� �Է�:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		result=GCD(num1,num2);
		System.out.printf("�ִ�������:%d\n", result);
		sc.close();
	}
	//6 9 
	public static int GCD(int n1,int n2) {
		int gcd=0;
		for(int i=1; i<=n1; i++) {
			if(n1%i==0 && n2%i==0) {
				//i�� n1,n2�� �Ѵ� ������������ �Ѵ�.
				gcd=i;
			}
		}
		return gcd;
	}
}
