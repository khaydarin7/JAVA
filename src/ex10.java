
public class ex10 {

	public static void main(String[] args) {
		
		int num1=9;
		int num2=2;
		
		double result = (double)num1/num2;
		//(double)num1 : num1�� double�� ����ȯ�϶�
		//num1�� double�� ���� ����ȯ��Ų��.
		//num1�� double�� ����� ����ȯ�Ѵ�.
		//double result = (double)num1/num2;
		//double result = 9.0000/2;
		//double result = 9.0000/2; <---�� ������ ����ġ
		//�� ������ ����ġ�� �ڵ�����ȯ �߻�
		//������ �Ǽ��� �ڵ�����ȯ
		//double result = 9.0000/2.0000;
		//�ϳ��� �Ǽ��� �ٲ㼭, ����ġ �Ǵ� ��Ȳ�� ������ָ�
		//�������� �ڵ����� �ٲ��.......
		//double result = 4.50000;
		
		//double result = 9/2;
		//double result = 4;
		//����4�� double ������ ���Եɶ���
		//�ڵ�����ȯ�� �߻��ؼ� 4.0000�� ����.
		
		// / <---������ ������
		// num1/num2 : num1������ num2
		// 9/2 : 9������2 -> ??
		//���� ���п��� 9������2�� 4.5�ε�...
		//���⼭�� 9������2�� 4�� ���´�...
		
		System.out.printf("%f\n", result);//4
		//���� ������ ������ ������ ��� ����
		//
	}
}
