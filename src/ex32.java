import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner��ü ����
		int num1=0;
		int num2=0;
		System.out.print("���� 2�� �Է�:");
		num1=sc.nextInt();//���� �Է� (Ű����)
		num2=sc.nextInt();//���� �Է� (Ű����)
		//�������� ������ �����ϰ�,���ͷ� �Է¿Ϸ�
		System.out.printf("%d %d\n", num1,num2);
		System.out.printf("%d\n", num1+num2);
		sc.close();
		
	}
}
