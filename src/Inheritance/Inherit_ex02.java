package Inheritance;

//��Ӱ��迡��
//�θ� Ŭ����, �ڽ� Ŭ����
//Parents (�θ�) , Children (�ڽ�)
//Super(����), Sub(����)
//Base (�⺻,����), Derrived (�Ļ���)

//IS-A����
//~�̴�.
//����� �л����� �����ش�.
//����� ���������� �����ش�.
//������ ������ �����ش�.
//���� �����̴�. - O - Dog is a Animal
//������ ����. - X - Animal is a Dog

//Animal�� Dog,Cat,Frog���� ������ش�.
//Preson�� Student,Employee,Police���� ������ش�.
//Car�� SportsCar,Truck���� ������ش�.
//Computer�� Desktop,NoteBook���� ������ش�.
//RemoteController�� TvRemote,AirRemote���� ������ش�.
//...�������� �����ش�.

class Animal{
	public String name;
	public void Sound() {
		System.out.println("�����Ҹ�");
	}
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}
public class Inherit_ex02 {

	public static void main(String[] args) {

	}
}
