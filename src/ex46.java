import java.util.Scanner;

public class ex46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[]=new int[5];
		//������ ���� ���
		for(int i=0; i<=2; i++)
		{
			if(i==0) {
				System.out.print("���� ���� �Է�:");
			}else if(i==1) {
				System.out.print("���� ���� �Է�:");
			}else if(i==2) {
				System.out.print("���� ���� �Է�:");
			}
			score[i]=sc.nextInt();
			score[3] += score[i];//����
		}
		score[4]=score[3]/3;
		System.out.printf("����:%d\n",score[3]);
		System.out.printf("���:%d\n",score[4]);
	}
}
