package Fruit;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20,0);
		FruitBuyer buyer = new FruitBuyer(50000,0);
		Scanner sc = new Scanner(System.in);
		int choice=0;
		int num=0;
		while(true) {
			menu();
			choice=sc.nextInt();
			if(choice==3) {
				break;
			}
			switch(choice) {
			case 1:
				System.out.print("������ ��� ����:");
				num=sc.nextInt();
				buyer.buyApple(seller, num*1000);
				break;
			case 2:
				seller.showSaleResult();
				buyer.showBuyResult();
				break;
			}
		}	
	}
	public static void menu() {
		System.out.println("1.��� ����");
		System.out.println("2.��Ȳ");
		System.out.println("3.����");
	}
}
