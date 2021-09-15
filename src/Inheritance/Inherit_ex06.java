package Inheritance;

class MyPerson{
	void breath() {
		System.out.println("������");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("���ϱ�");
	}
}
class MyStudent extends MyPerson{
	void learn() {
		System.out.println("����");
	}
	void say() {
		System.out.println("������ �ȳ��ϼ���");
	}
}
class Leader extends MyStudent{
	void lead() {	
	}
	void say() {
		System.out.println("�����Բ� �λ�!");
		super.say();//"������ �ȳ��ϼ���"
	}
}
//super - ������
//super.�θ�޼ҵ��̸�
//�θ� ������ �޼ҵ带 �����ִ�.

class MyTeacher extends MyPerson{
	void teach() {
		System.out.println("����ġ��");
	}
}

public class Inherit_ex06 {
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.say();
	}
}
