package pedlet;

import java.util.Scanner;

public class ex01_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력:");
		int age = sc.nextInt();
		System.out.println("키 입력:");
		double height = sc.nextDouble();
		System.out.printf("나이: %d\n",age);
		System.out.printf("키: %f\n",height);
		System.out.println("다음에 뵙겠습니다.");
	}
}
