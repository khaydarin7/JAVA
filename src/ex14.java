
public class ex14 {

	public static void main(String[] args) {
		// == , !=
		// == : ������?
		// != : �ٸ���? (���� ������?)
		
		int num1=9;
		int num2=2;
		
		boolean result = (num1==num2);
		//num1==num2
		//num1�� num2�� ������?
		//������? �ϸ� ���ƾ� ��,�ٸ��� ����
		//�������� �����̴�...
		System.out.println(result);//false
		
		result = (num1 != num2);
		//num1 != num2
		//num1�� num2�� �ٸ���?
		//�ٸ���? �޶�� ��... ������ ����...
		System.out.println(result);//true
	}
}
