import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum=0;
		while(true)
		{//while���� ����
			System.out.print("���� �Է�:");
			num=sc.nextInt();//���� �Է�
			if(num==0) {
				break;//�ݺ��� Ż��
			}
			sum += num;//�տ� �Է¹��� ������ ���Ѵ�.
		}
		System.out.printf("��:%d\n", sum);
		sc.close();
	}
}
