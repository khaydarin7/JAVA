
public class ex15 {

	public static void main(String[] args) {
		//�� ������
		//&& ,  || , !
		//�� AND - &&
		//�� OR - ||
		//�� NOT - !
		
		//�� �����ڴ� ����ǥ (truth table)
		//�� ������
		//�� ������ �����Ѵ�.
		//�� - true,false
		//�� ������ �����ϴ� ������:�� ������
		//true,false ������ �����ϴ� ������:�� ������
		
		//�� AND ����ǥ
		//�� ��,�׸���,����
		//�Ѵ� ���̾��, ����� ���̴�.
		// true��  ���������� 1��
		// false�� ���������� 0
		
		// false &&  false -> false
		// false &&  true  -> false
		// true  &&  false -> false
		// true  &&  true  -> true
		System.out.println("�� AND�� ����ǥ");
		System.out.println(false && false);//false
		System.out.println(false && true);//false
		System.out.println(true && false);//false
		System.out.println(true && true);//true
		
		//�� OR
		//�� ��,�Ǵ�,����
		
		//�� OR�� ����ǥ (truth table)
		// false ||  false -> false
		// false ||  true  -> true
		// true  ||  false -> true
		// true  ||  true  -> true
		//2�� ���̰�...
		//0�� �����̰�...������ �� ��....
		System.out.println("�� OR�� ����ǥ");
		System.out.println(false || false);//false
		System.out.println(false || true);//true
		System.out.println(true || false);//true
		System.out.println(true || true);//true
		
		//! - �� NOT
		//NOT : ����, ~�ƴϴ�
		//!false -> true
		//!true -> false
		//������ ����,���� �ۿ� ����.
		//!false : ������ �ƴϴ� -> ���̴�.
		//!true : ���� �ƴϴ� -> �����̴�.
		
		System.out.println("�� NOT�� ����ǥ");
		System.out.println(!false);//true
		System.out.println(!true);//false
	}
}
