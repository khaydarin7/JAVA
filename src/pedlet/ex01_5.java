package pedlet;

import java.util.Scanner;

public class ex01_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for(int i = 0; i < name.length(); i++) {
			if(i==name.indexOf(name.charAt(i))) {
				System.out.printf("%c�� %d��°���� ó�� �����մϴ�.\n", name.charAt(i),i+1);
			}
		}
	}
}