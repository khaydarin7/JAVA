package method;

public class method_ex04 {

	public static void main(String[] args) {
		//�޼ҵ� �����ε�
		//method overloading
		//method = Ŭ���� ������ �Լ�
		//overloading = overload + ing
		//over + load : �����ϴ�, �ʰ������ϴ�, �ʹ� ���� �Ǿ���.
		//overloading : �����ϴ°�~
		//method overloading : �޼ҵ带 �����ϴ°�
		add();//�Է��� ���� ���� �޼���
		add(2,3);//�μ��� ���� �޼��� ȣ��
		add(2,3,4);//������ ���� �޼��� ȣ��
	}
	public static void add() {
		System.out.printf("����:%d?\n", 0);
	}
	public static void add(int n1,int n2) {
		System.out.printf("�μ��� ����:%d\n", n1+n2);
	}
	public static void add(int n1,int n2,int n3) {
		System.out.printf("������ ����:%d\n", n1+n2+n3);
	}
}
