import java.util.Scanner;

public class ex43 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int arr[][]=new int[2][3];
				//0행  11  22  33
				//1행  44  55  66
				//    0열  1열  2열
				for(int i=0; i<=1; i++){//외부for (행)
					for(int j=0; j<=2; j++) {//내부for (열)
						System.out.printf("%d행%d열 입력:", i,j);
						arr[i][j]=sc.nextInt();
					}
				}
				for(int i=0; i<=1; i++){//외부for (행)
					for(int j=0; j<=2; j++) {//내부for (열)
						System.out.printf("%d ", arr[i][j]);
					}
					System.out.println("");
				}
				sc.close();
	}
}
