package pedlet;

import java.util.Scanner;

public class ex02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		switch(year%12) {
		case 0:
			System.out.print("�����̶� �Դϴ�.");
			break;
		case 1:
			System.out.print("�߶� �Դϴ�.");
			break;
		case 2:
			System.out.print("���� �Դϴ�.");
			break;
		case 3:
			System.out.print("������ �Դϴ�.");
			break;
		case 4:
			System.out.print("��� �Դϴ�.");
			break;
		case 5:
			System.out.print("�Ҷ� �Դϴ�.");
			break;
		case 6:
			System.out.print("ȣ���̶� �Դϴ�.");
			break;
		case 7:
			System.out.print("�䳢�� �Դϴ�.");
			break;
		case 8:
			System.out.print("��� �Դϴ�.");
			break;
		case 9:
			System.out.print("��� �Դϴ�.");
			break;
		case 10:
			System.out.print("���� �Դϴ�.");
			break;
		case 11:
			System.out.print("��� �Դϴ�.");
			break;
		}
	}
}
