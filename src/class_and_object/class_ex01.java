package class_and_object;
//Ŭ������ ��ü
//Ŭ������ ���赵
//��ü�� Ŭ������ ��üȭ�Ȱ� (�޸𸮿� �����Ȱ�)
class Person{//PersonŬ����
	//Ŭ�����ȿ���
	//���������,����޼��带 ����...
	String name;
	int age;
	double height;
	
	void Introduce() {
		System.out.printf("�̸�:%s\n", name);
		System.out.printf("����:%d\n", age);
		System.out.printf("Ű:%.1f\n", height);
	}
}

public class class_ex01 {

	public static void main(String[] args) {
		Person p = new Person();
		p.name="�̹�ȣ";//p�� ����Ű�� ���� name�� "�̹�ȣ"
		p.age=20;
		p.height=178.3;
		p.Introduce();
		//Person p : ��ü ����, ��������
		//��ü�� �ּҸ� �����ϴ� ����
		
		//new Person()
		//new - �޸� ���� ������
		//PersonŬ������ ��ü �����Ѵ�.
		//��ü �����ϰ� ���� �� ��ü�� �ּҸ� ��ȯ
		
	}
}
