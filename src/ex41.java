
public class ex41 {

	public static void main(String[] args) {
		double arr[]=new double[3];
		//���̰� 3�� double�� 1���� �迭
		arr[0]=1.1;
		arr[1]=2.2;
		arr[2]=3.3;

		//3����-��ü
		//2����-���
		//1����-��
		//��-��-��-��ü
		//����-1�����迭-2�����迭-3�����迭
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("%.1f ", arr[i]);
		}
	}
}
