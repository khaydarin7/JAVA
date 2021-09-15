package Random_Practice;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	private boolean isBought;
	private int totalPrice;
	private int gameCount;
	private int lottoArray[][];
	private Random rand;
	private Scanner sc;
	
	public Lotto() {
		isBought=false;
		totalPrice=0;
		gameCount=0;
		lottoArray=new int[11][7];
		rand=new Random();
		sc=new Scanner(System.in);
	}
	
	public void inputGameCount() {
		System.out.print("구매할 복권 갯수:");
		gameCount=sc.nextInt();
	}
	
	public void generateLottoNum() {
		int num=0;
		for(int i=1; i<=gameCount; i++) {//i : 게임 갯수
			for(int j=1; j<=6; j++) {//j : 1~6
				num=rand.nextInt(45)+1;
				lottoArray[i][j]=num;
			}
		}
	}
	public void printLottoNum() {
		for(int i=1; i<=gameCount; i++) {//i : 게임 갯수
			System.out.printf("%d번째 게임:",i);
			for(int j=1; j<=6; j++) {//j : 1~6
				System.out.printf("%d ",lottoArray[i][j]);
			}
			System.out.print("\n");
		}
	}
}
