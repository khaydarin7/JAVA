package destructor;

//�̹� ��� Ŭ������ ObjectŬ�������� ��ӹ޾Ҵ�.
//ObjectŬ������ ��� Ŭ������ ����
class AAA{//class AAA extends Object
	private int num;
	public void showInfo() {
		System.out.printf("num:%d\n", num);
	}
	//�Ҹ���
	//�Ҹ��ڴ� �������� �ݴ�
	//������:��ü�� �����ɶ� ȣ��Ǵ°�
	//�Ҹ���:��ü�� �Ҹ�ɶ� ȣ��Ǵ°�
	public void finalize() {
		System.out.println("�Ҹ��� ȣ��!");
		try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class destructor_ex01 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa=null;//aaa�� ��ü�� �ּҰ��־��µ�
		//�ΰ�(��������)�� �־ ��ü�� ������ ������.
		//�� ��ü�� �����������. �ֳĸ�
		//�� ��ü�� �����ϴ� �������������ϱ� �����������
		
		System.gc();//������ �÷��� ȣ��
		//�ý��� Ŭ���� ������ gc�޼���
		//gc - garbage collector
		//�������� ȣ��
		//������ �÷��Ͱ� ��ü�� �Ҹ�ɶ� ȣ��Ǵ� �Ҹ���
		//��,finalize�޼ҵ带 �ڵ�ȣ���ߴ�.
	}
}
