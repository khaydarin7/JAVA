import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		
		int start=0;
		int end=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("����,�� ���� �Է�:");
		start=sc.nextInt();
		end=sc.nextInt();
		
		int i=start;
		int evenSum=0;
		int oddSum=0;
		while(i<=end)
		{
			if(i%2==0) {
				evenSum += i;//evenSum=evenSum+i;
			}else {
				oddSum += i;//oddSum=oddSum+i;
			}
			i++;
		}
		System.out.printf("¦������:%d\n", evenSum);
		System.out.printf("Ȧ������:%d\n", oddSum);
	}
}
