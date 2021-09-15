package method;

import java.util.Scanner;

public class method_ex01 {

	public static void main(String[] args) {
		//Math.abs(-10)
		//absolute number
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=sc.nextInt();//정수입력
		int result=MyAbs(num);
		System.out.printf("절대값:%d\n", result);
		sc.close();
	}
	
	public static int MyAbs(int num) {
		if(num>=0) {
			return num;
		} else {
			return -num;
		}
	}
}
