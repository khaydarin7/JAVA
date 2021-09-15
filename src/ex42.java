
public class ex42 {

	public static void main(String[] args) {
		//2차원 배열
		//
		int arr[][]=new int[2][3];
		//2행 3열의 int형 2차원 배열 arr
		arr[0][0]=10;//0행0열 위치에 10을 넣겠다.
		arr[0][1]=20;//0행1열 위치에 20을 넣겠다.
		arr[0][2]=30;//0행1열 위치에 30을 넣겠다.
		
		arr[1][0]=40;//1행0열 위치에 40을 넣겠다.
		arr[1][1]=50;//1행1열 위치에 50을 넣겠다.
		arr[1][2]=60;//1행1열 위치에 60을 넣겠다.
		//행 - 가로줄
		//열 - 세로줄
		
		//0행  10  20  30
		//1행  40  50  60
		//    0열  1열  2열
		for(int i=0; i<=1; i++){//외부for (행)
			for(int j=0; j<=2; j++) {//내부for (열)
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println("");
		}
		//0행: 0열~2열
		//1행: 0열~2열
		
	}

}
