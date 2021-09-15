package Inheritance;

//�����ε�
//�޼ҵ� �����ε�:method overloading
//overload : �����ϴ�.
//�޼ҵ� �����ϴ°�
//�Ű����� Ÿ���̳� ������ �ٸ� �޼��带 ������ ���� �����ϴ�.

//�������̵� (overriding)
//�޼ҵ� �������̵� : method overriding
//override : ~���� �켱���ϴ�.
//�޼ҵ� �������̵� : method overriding
//�θ� ������ �޼ҵ带 �ڽ��� ������ ������
//�ڽ��� �������� �޼��尡 �켱�õȴ�.
//�θ��� ���� �޼���� ��������.

//�θ� Ŭ������ ������ �޼��带, �ڽ� Ŭ������ �������ϴ°�
//�������̵��� �ݵ�� ����� �־�߸� ������ ����
//���� ���ȴ�->���� �Դ´�
//���->�������̵�
//����� �ȵ������� �������̵��̶��� ��ü�� ����.
//�ֳĸ� �θ�,�ڽ� ���谡 �����Ǿ�� �������̵��� �����ϴϱ�
class MyAnimal{
	public void sound() {
		System.out.println("�����Ҹ� ��!");
	}
}
class MyDog extends MyAnimal{
	//�θ𿡰� �̹� sound�޼��带 �����޾Ҵµ�,
	//�״�� ���� �ȵǴϱ�...
	//���� sound�޼��带 ������ �ߴ�.
	@Override //annotation
	public void sound() {
		System.out.println("�۸�!");
	}
}
class MyCat extends MyAnimal{
	@Override
	public void sound() {
		System.out.println("�߿�!");
	}
}
public class Inherit_ex05 {
	public static void main(String[] args) {
		MyDog dog = new MyDog();
		dog.sound();
		MyCat cat = new MyCat();
		cat.sound();
	}
}
