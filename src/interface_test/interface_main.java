package interface_test;

//�������̽��� �ش����� ������ �߻�Ŭ����
//�߻� Ŭ������ 1�� �̻��� �߻�޼��带 ������ �ǰ�
//�߻� Ŭ������ �߻�޼���+�Ϲݸ޼��� �̰� ����
//�������̽��� ������ �߻�޼��常 �־�� �ȴ�.
//�������̽��� �ٵ� �����ϴ� �Ϲݸ޼��尡 �����ϸ� �ȵȴ�.
interface RemoteController{
	public static final int volume=50;
	public abstract void TurnOn();
	public abstract void TurnOff();
}
//implement : �����ϴ�.
//�������̽� : ����
//Ŭ���� : ���赵
//��ü : �ǹ�
class TV implements RemoteController{
	@Override
	public void TurnOn() {
		System.out.println("TV�Ҵ�!");
	}
	@Override
	public void TurnOff() {
		System.out.println("TV����!");
	}
}
public class interface_main {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.TurnOn();
		tv.TurnOff();
	}
}
