
public class ex16 {

	public static void main(String[] args) {

		int num1=9;
		int num2=5;
		int num3=2;
		
		boolean result = (num1>=num2)&&(num2>=num3);
		//boolean result = (num1>=num2)&&(num2>=num3);
		//boolean result = true &&(num2>=num3);
		//boolean result = true && true;
		//boolean result = true && true; - true �� AND true
		//boolean result = true; - true �� AND true
		System.out.println(result);//true
		
		result = (num1>=num2)&&(num2<=num3);
		//result = true &&(num2<=num3);
		//result = true && false;
		//result = false;
		System.out.println(result);//false
		
		//���� �����ڴ� �����ʿ��� ���� ����������
		//��κ��� �ٸ� �����ڵ��� ��κ� ���ʿ��� ������
		
		//3+4
		//3���ϱ�4 - O
		//4���ϱ�3 - X
		//��κ��� �����ڵ��� ���ʿ��� ������
		//(��� �ü� ���´��)
	}
}
