package polymorphism;

//polymorphism
//������
//poly : ����
//polymer : �����
//polymer engineering : ����� ����
//polygon : �ٰ���
//
//���� ����, �پ��� ����
//
class Animal{
	public void sound() {
		System.out.println("�����Ҹ� ��!");
	}
}

class Dog extends Animal{//���
	public void sound() {//�޼ҵ� �������̵�
		System.out.println("�۸�!");
	}
}
class Cat extends Animal{//���
	public void sound() {//�޼ҵ� �������̵�
		System.out.println("�߿�!");
	}
}
class Frog extends Animal{//���
	public void sound() {//�޼ҵ� �������̵�
		System.out.println("����!");
	}
}
public class poly_ex01 {
	public static void main(String[] args) {
		//Animal ani = null;
		
		//ani = new Dog();
		//ani.sound();//�۸�
		
		//ani = new Cat();
		//ani.sound();//�߿�
		
		//ani = new Frog();
		//ani.sound();//����
		Animal ani[]=new Animal[3];
		//int arr[]=new int[3];
		ani[0]=new Dog();
		ani[1]=new Cat();
		ani[2]=new Frog();
		for(int i=0; i<ani.length; i++) {
			ani[i].sound();
		}
		
		//Dog  d= new Dog();
		//Cat c = new Cat();
		//Frog f = new Frog();
		//Tiger t = new Tiger();
		//Lion l = new Lion();
	}
}
//�ڽ� Ÿ�� ������ �θ� ��ü�� ������ ����.
//ex) Dog d = new Animal(); - X

//�θ� Ÿ�� ������ �ڽ� ��ü�� ������ �ִ�.
//ex) Animal ani = new Dog(); - O

//��������
//�پ��� ���¸� ���Ѵ�.
//�پ��� ���¸� ���Ҽ� �ִ� ������
//�θ� Ÿ�� ������ �ڽ� ��ü���� ��� �����������ϱ�.
//�θ� Ÿ�� ������ � �ڽ� ��ü�� �ִ��Ŀ� ����
//�پ��� ���·� ����Ҽ��ִ�.

//�������� ����
//�θ� Ÿ�� ������ �ڽ� ��ü���� ��� ����Ҽ��ִ�.
//�������� ���ٸ�
//������ �´� ������ �� �����ߵȴ�.
//�ٵ� �θ�Ÿ�� ������ �ڽ� ��ü�� �� �������ֱ� ������
//
