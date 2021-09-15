package pedlet;

import java.util.Scanner;

public class ex02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		switch(year%12) {
		case 0:
			System.out.print("ø¯º˛¿Ã∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 1:
			System.out.print("¥ﬂ∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 2:
			System.out.print("∞≥∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 3:
			System.out.print("µ≈¡ˆ∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 4:
			System.out.print("¡„∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 5:
			System.out.print("º“∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 6:
			System.out.print("»£∂˚¿Ã∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 7:
			System.out.print("≈‰≥¢∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 8:
			System.out.print("øÎ∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 9:
			System.out.print("πÏ∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 10:
			System.out.print("∏ª∂Ï ¿‘¥œ¥Ÿ.");
			break;
		case 11:
			System.out.print("æÁ∂Ï ¿‘¥œ¥Ÿ.");
			break;
		}
	}
}
