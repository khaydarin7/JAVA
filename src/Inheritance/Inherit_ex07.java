package Inheritance;

class myAAA{
	private int A_num;
	public myAAA() {
		A_num=0;
	}
	public myAAA(int A_num) {
		this.A_num=A_num;
	}
	public void AAA_Func() {
		System.out.printf("A_num:%d\n",A_num);
	}
}
class myBBB extends myAAA{
	//myBBB�� myAAA�� private��������� ��ӹ޾Ҵ�.
	private int B_num;
	public myBBB() {
		//�θ� ������ ��������� �θ� �����ڷ� ó���Ѵ�.
		super();//�θ��� ����Ʈ ������ ȣ��
		//A_num=0;
		//super�� ���� �θ��� ������ ȣ��
		//super.�޼����̸� �θ��� �޼ҵ� ȣ��
		B_num=0;
	}
	public myBBB(int A_num,int B_num) {
		//this.A_num=A_num;
		super(A_num);
		//�θ��� int�� �Ѱ� �޴� ������ ȣ��
		this.B_num=B_num;
		//�θ����� ���� ��������� �θ�����ڷ� ó���ϰ�
		//���� ������ ���� �׳� �ϴ���� �ϸ�ȴ�.
	}
	public void BBB_Func() {
		//super.AAA_Func();
		AAA_Func();//�̸��� �ٸ��ϱ� super�� �� �Ƚᵵ ������.
		System.out.printf("B_num:%d\n",B_num);
	}
}
public class Inherit_ex07 {
	public static void main(String[] args) {
		myBBB bbb = new myBBB(10,20);
		bbb.BBB_Func();
	}
}
