import java.util.Scanner;

public class ex38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		System.out.print("���� 2�� �Է�:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		for(int dan=num1; dan<=num2; dan++)//�� (�ܺ� for)
		{
			for(int i=1; i<=9; i++)//1~9 (���� for)
			{
				System.out.printf("%dx%d=%d\n", dan,i,dan*i);
			}
			System.out.printf("\n");
		}
		sc.close();//��ĳ�� ��ü �Ҹ�
		//��ĳ�� �ݱ�
	}

}
