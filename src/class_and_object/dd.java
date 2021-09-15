package class_and_object;
import java.util.Random;
import java.util.Scanner;

class lotto 
{
	private boolean lottobuy;
	private int price;
	private int count;
	public static int lotto[][];
	Scanner sc = new Scanner(System.in);
	public lotto(){
		lottobuy = true;
		price = 1000;
		count = 1;
		lotto = new int[10][6];
	}
	public lotto(boolean lottobuy,int count) {
		this.lottobuy = lottobuy;
		this.count=count;
		lotto = new int[count][6];
	}
	
	public void buy() {
		Random rand = new Random();
		if(lottobuy == true) {
		for(int j=0;j<count;j++) {
			for(int i=0;i<6;i++) {
				lotto[j][i] = rand.nextInt(45)+1;
			}
		}
		}
		else
			System.out.print("시스템 종료");
	}
	
	public void check() {
		for(int j=0;j<count;j++) {
			for(int i=0;i<6;i++) {
				System.out.printf("%d ", lotto[j][i]);
			}
			System.out.printf("\n");
		}
	}
}
public class dd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		while(true) {
			System.out.println("1.복권 구매 ");
			System.out.println("2.구매한 복권 확인 ");
			int num = sc.nextInt();
			lotto lt = new lotto(true,num);
			lt.buy();
			lt.check();
			
		}

	}

}
