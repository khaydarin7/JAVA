package Inheritance;

class Car{
	private String name;
	private String provider;
	private int price;
	
	public Car() {
		
	}
	public Car(String name,String provider,int price) {
		this.name=name;
		this.provider=provider;
		this.price=price;
	}
	public void showInfo() {
		System.out.printf("������:%s\n",name);
		System.out.printf("������:%s\n",provider);
		System.out.printf("��:%s\n",price);
	}
}
public class Inherit_ex11 {
	public static void main(String[] args) {
		//CarŸ�� ��ü 3�� ����
		//int arr[]=new int[3]; - int�� 3������
		//���� �迭,��ü �迭
		//CarŸ�� �迭
		//Car��ü�� �ּҰ� ����Ǵ� �迭
		Car carArray[]=new Car[3]; 
		carArray[0]=new Car("�ҳ�Ÿ","����",3000);
		carArray[1]=new Car("�ƹݶ�","����",2500);
		carArray[2]=new Car("����","����",3500);
		
		for(int i=0; i<carArray.length; i++) {
			carArray[i].showInfo();
		}	
	}
}
