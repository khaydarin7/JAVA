package Inheritance;

//�� Ŭ����
class Gun{
	public void Bang() {
		System.out.println("����!");
	}
}
//������ Ŭ����
class Cudgel{
	public void swing() {
		System.out.println("��ܺ� �ֵθ���!");
	}
}
//����� ����� �����ִ°� �ܿ���
//�������̵�+������

//����
class Police{
	//Has-A����
	private Gun g;//Gun�� ���Խ��״�.
	private Cudgel c;//Cudgel�� ���Խ��״�.
	public Police() {
		g=new Gun();//�� �Ҵ�
		c=new Cudgel();//������ �Ҵ�
	}
	public void Fire() {
		g.Bang();
	}
	public void Swing() {
		c.swing();
	}
}
//class Dog extends Animal
//class Student extends Person
//class SportsCar extends Car
//IS-A����
//Dog is a Animal - ���� �����̴�.
//Student is a Person - �л��� ����̴�.
//SportsCar is a Car - ������ī�� ����.
//�ڽ� is a �θ�

//Police is a Gun
//����� ������ߵɲ� ������...? �׷� �������� �ɲ�������...
//IS-A����� �Ǻ��غ��� ����ϴ�...
//�̷� ����� ������ص� �Ǳ��ϴµ�
//��Ӵ�� ���԰���� ó���Ѵ�.
public class Inherit_ex10 {
	public static void main(String[] args) {
		Police p = new Police();
		p.Fire();//�ѹ߻�
		p.Swing();//������ �ֵθ���
	}
}
