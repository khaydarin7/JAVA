import java.util.Scanner;

/*
 class Math{
 
 	public static int abs(int num){
 		....
 	}
 	
 	public static double sqrt(double num){
 		...
 	}
  }
*/
public class ex52 {

	public static void main(String[] args) {
		int result=Math.abs(-10);
		//MathŬ������ abs�޼��� (���밪 ���ϴ� �޼���)
		System.out.printf("���밪:%d\n", result);
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
		//MathŬ������ ���� �޼������
		//��� static�޼����
		//��ü �������ص� ��밡��
		
		//ScannerŬ������ ���� �޼������
		//��� non-static�޼����
		//�ݵ�� ��ü ���� ���� ��ó�ߵȴ�.
	}
}
