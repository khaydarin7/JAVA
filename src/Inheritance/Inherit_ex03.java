package Inheritance;
//�θ� Ŭ���� Person
class Person{
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
//�ڽ� Ŭ���� Student�� PersonŬ�������� ��ӹ޴´�.
class Student extends Person{
	void learn() {
		System.out.println("����");
	}
}
//�ڽ� Ŭ���� Teacher�� PersonŬ�������� ��ӹ޴´�.
class Teacher extends Person{
	void teach() {
		System.out.println("����ġ��");
	}
}
public class Inherit_ex03 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.breath();//�θ𿡰� �������� �޼���
		s1.learn();//���� ����
		
		Teacher t1 = new Teacher();
		t1.eat();//�θ𿡰� �������� �޼���
		t1.teach();//���� ����
	}
}
