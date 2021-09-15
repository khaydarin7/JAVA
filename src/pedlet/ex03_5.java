package pedlet;

import java.util.Scanner;

public class ex03_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		if(month<=2||month==12) {
			System.out.print("겨울");
		}
		else if(month<=5&&month>=3) {
			System.out.print("봄");
		}
		else if(month<=8&&month>=6) {
			System.out.print("여름");
		}
		else if(month<=11&&month>=9) {
			System.out.print("가을");
		}
	}
}
