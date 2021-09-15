import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		System.out.print("Á¤¼ö ÀÔ·Â:");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Â¦¼ö");
		}else {
			System.out.println("È¦¼ö");
		}
		sc.close();
	}
}
