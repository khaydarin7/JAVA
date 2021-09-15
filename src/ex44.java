import java.util.Scanner;

public class ex44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan=0;
		int arr[]=new int[9];
		System.out.print("╢э ют╥б:");
		dan=sc.nextInt();
		
		for(int i=0; i<=8; i++) {
			arr[i]=dan*(i+1);
		}
		for(int i=0; i<=8; i++) {
			System.out.printf("%dx%d=%d\n", dan,i+1,arr[i]);
		}
	}
}
