import java.util.Scanner;

public class ex45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp[]=new double[3];
		//3���� �µ��� ����
		double sum=0;//��
		double avg=0;//���
		for(int i=0; i<temp.length; i++)
		{
			System.out.printf("%d��° �µ� �Է�:",i+1);
			temp[i]=sc.nextDouble();
			sum += temp[i];
		}
		avg=sum/3;//���
		System.out.printf("���:%f\n",avg);
	}
}
