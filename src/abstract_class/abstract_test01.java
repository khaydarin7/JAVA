package abstract_class;

//�߻� Ŭ������
//1�� �̻��� �߻�޼��带 ������ Ŭ����
abstract class Animal{
	public abstract void sound();
	//�߻� �޼��忡 { }�� �ٿ��� ����� ��������ϸ�...
	//Abstract methods do not specify a body
	//�߻� �޼���� �ٵ� ��üȭ�ϸ� �ȵȴ�.
	//�߻� �޼���� ����� ����� �ȵȴ�.
	//�߻� �޼���
	//��ü�� ���� �޼���
	//body�� ���� �޼���
	public void hello() {
		System.out.println("�ȳ�!");
	}
}
class Lion extends Animal{
	//�߻� Ŭ�������� �������� �߻�޼����
	//�װ� �������� Ŭ������ �ݵ�� �������̵� �ؾ��Ѵ�.
	@Override
	public void sound() {
		System.out.println("����!");
	}
	//The type Lion must implement 
	//the inherited abstract method Animal.sound()	
}

public class abstract_test01 {
	public static void main(String[] args) {

	}
}
