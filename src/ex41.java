
public class ex41 {

	public static void main(String[] args) {
		double arr[]=new double[3];
		//길이가 3인 double형 1차원 배열
		arr[0]=1.1;
		arr[1]=2.2;
		arr[2]=3.3;

		//3차원-입체
		//2차원-평면
		//1차원-선
		//점-선-면-입체
		//변수-1차원배열-2차원배열-3차원배열
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("%.1f ", arr[i]);
		}
	}
}
