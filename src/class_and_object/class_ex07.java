package class_and_object;

class BBB{
	private int num;
	public BBB() {
		num=0;
	}
	public BBB(int num) {
		this.num=num;
	}
	public void showNum() {
		System.out.printf("num:%d\n",num);
	}
	public static void staticMethod() {
		System.out.println("static!");
	}
}
//static�� ��ü�� �����Ǳ� ���� �̹� �޸𸮿� �����Ǿ�����
public class class_ex07 {
	public static void main(String[] args) {

		//� Ŭ���� ������ static�޼����
		//Ŭ�����̸�.�޼���
		BBB.showNum();
		//�Ϲݸ޼���� �ݵ�� ��ü ������ �ؾ� 
		//�޼��尡 �޸𸮿� �ε�Ǵϱ�
		//�׶����� �޼��带 ����Ҽ��ִ�.
		BBB.staticMethod();
		//static�޼���� ��ü �������ص� �̹� �޸𸮿� �ε�Ǿ��ִ�.
		//��ü �������ص� ��밡��
		//Ŭ�����̸�.�޼����̸�
		
		//showNum�� non-static�޼���
		//staticMethod�� static�޼���
		
		//��ǥ���� Ŭ���� 2��
		//non-static�޼���� ����� Ŭ����
		//ScannerŬ����
		//ScannerŬ������ �޼������ ��κ� non-static
		//�ݵ�� ��ü �����ؾ� �޼��� ��밡��
		
		//static�޼���� ����� Ŭ����
		//MathŬ����
		//MathŬ������ �޼������ ��κ� static
		//��ü �������ص� �ٷ� ��밡��
		//Ŭ�����̸�.�޼����̸�
		Math.abs(-10);
		//The static method staticMethod() 
		//from the type BBB should be accessed 
		//in a static way
		//static�޼���� static�޼��带 ���� ������� ���!
		//static�޼���� Ŭ�����̸�.�޼���
	}
}
