import java.util.Scanner;

public class ex43 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int arr[][]=new int[2][3];
				//0��  11  22  33
				//1��  44  55  66
				//    0��  1��  2��
				for(int i=0; i<=1; i++){//�ܺ�for (��)
					for(int j=0; j<=2; j++) {//����for (��)
						System.out.printf("%d��%d�� �Է�:", i,j);
						arr[i][j]=sc.nextInt();
					}
				}
				for(int i=0; i<=1; i++){//�ܺ�for (��)
					for(int j=0; j<=2; j++) {//����for (��)
						System.out.printf("%d ", arr[i][j]);
					}
					System.out.println("");
				}
				sc.close();
	}
}
