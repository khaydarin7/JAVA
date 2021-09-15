package pedlet;

import java.util.Scanner;

public class ex04_4 {

	public static void main(String[] args) {
		System.out.print("Input Total Second? ");
		Scanner sc = new Scanner(System.in);
		int sec=sc.nextInt();
		int min = 0;
		if(sec>=60) {
			min = sec/60;
			sec = sec%60;
		}
		System.out.printf("%dmin %dsec", min,sec);
	}
}
