package class_and_object;

//�������� ������
//���� ��� ���� ����...
//public,default,protected,private
//public class - ���� ��Ű��,�ٸ� ��Ű�� �� ����
//class - ���� ��Ű����������
class Car{
	String name;
	int price;
	String provider;
	//������ (Constructor)
	//��ü�� �����ɶ� ȣ��Ǵ°� ������
	//�����ڴ� Ŭ������ �̸��� ����.
	//�����ڴ� ��ȯ����ü�� �׳� ����.
	//�����ڰ� �޼���(�Լ�)�� �ƴϴ�.
	
	//�����ڵ� �����ε� �ȴ�.
	//�Է��� �ٸ� �����ڸ� ������ ������ִ�.
	Car(){
		//����Ʈ ������ (�Է��� ���� ������)
		System.out.println("����Ʈ ������ ȣ��!");
		this.name="�⺻����";
		this.price=1000;
		this.provider="�⺻������";
	}
	Car(String name){
		System.out.println("String������ ȣ��!");
		this.name=name;
		this.price=1000;
		this.provider="�⺻������";
	}
	Car(String name,int price,String provider){
		System.out.println("String,int,String������ ȣ��!");
		//String,int,String������
		this.name=name;
		this.price=price;
		this.provider=provider;
	}
	//�����ڴ� ��ü�� �����ɶ� �ڵ����� ȣ���̵ȴ�.
	//��ü�� �����ɶ� �ϸ� ������ �����ڿ��� ����
	//��ü�� �����ɶ� �ϸ� ������ ����?
	//��ü ������ ��������� ���� �ʱ�ȭ�ϴ°�
	
	void InitMembers(String name,int price,String provider)
	{
		this.name=name;
		this.price=price;
		this.provider=provider;
	}
	
	void ShowCarInfo() {
		System.out.printf("������:%s\n", name);
		System.out.printf("����:%d\n", price);
		System.out.printf("������:%s\n", provider);
	}
}

public class class_ex02 {

	public static void main(String[] args) {
		Car c1 = new Car(); // - Java
		//Car* c1 = new Car(); - C++
		//c1.InitMembers("�ҳ�Ÿ", 2500, "����");
		//c1.name="�ҳ�Ÿ";
		//c1.price=2500;
		//c1.provider="����";
		Car c2 = new Car();
		//c2.InitMembers("�ƹݶ�", 2000, "����");
		//c2.name="�ƹݶ�";
		//c2.price=2000;
		//c2.provider="����";
		Car c3 = new Car("�ƿ��",3000,"�����ٰ�");
		c1.ShowCarInfo();//ù��° ���� ���� ���
		c2.ShowCarInfo();//�ι�° ���� ���� ���
		c3.ShowCarInfo();//����° ���� ���� ���
		//�������� ���:C
		//��ü���� ���:C++,JAVA,Python,C#
		//�޸� �ڵ��Ҵ� ���:Java,C#,Python
		//�޸� �����Ҵ� ���ɾ��:C,C++
	}
}
