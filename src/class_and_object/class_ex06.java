package class_and_object;

class AAA{
	private static int num;//static�������
	//Ŭ���� ����
	//AAAŬ������ ��ü ������ ��� ��ü���� �����ϴ� ����
	public AAA() {
		num++;
	}
	public void showNum() {
		System.out.printf("num:%d\n", num);
	}
}
public class class_ex06 {
	public static void main(String[] args) {
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		AAA a3 = new AAA();
		a1.showNum();
		a2.showNum();
		a3.showNum();
	}
}
//static ��������� Ŭ�������� �����ϴ� ����
//non-static ��������� Ư����ü�� ������ �ִ� ����

