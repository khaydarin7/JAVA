import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		System.out.print("���� �Է�:");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		sc.close();
	}
}
