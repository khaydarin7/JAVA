import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int sum=0;//����� ��
		System.out.print("���� �Է�:");
		num=sc.nextInt();//6
		//6:1,2,3,6
		//����� ���? 
		//�� ���� ������������ �ϴ� ��
		//6%1==0
		//6%2==0
		//6%3==0
		//6%4==2
		//6%5==1
		//6%6==0
		for(int i=1; i<num; i++)
		{//1~5 (6-1)
			if(num%i==0)//num�� i�� ���� �������� 0�̶��
			{//num�� ���� ���������ϴ� i��
			 //num�� ��� i
				sum+=i; //sum = sum+i;
			}
		}
		
		if(sum==num) {
			System.out.println("������ ����!");
		}else {
			System.out.println("������ �ƴ�!");
		}
	}
}
