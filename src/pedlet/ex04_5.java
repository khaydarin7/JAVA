package pedlet;

import java.util.Scanner;

public class ex04_5 {

	public static void main(String[] args) {
		int num[]=new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			num[i] = sc.nextInt();
		}
		int max = num[0],min = num[0];
		for(int i=0;i<5;i++) {
			if(max<num[i]) {
				max = num[i];
			}
			if(min>num[i]) {
				min = num[i];
			}
		}
		System.out.printf("최대: %d, 최소: %d", max,min);
	}
}
