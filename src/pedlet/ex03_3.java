package pedlet;

public class ex03_3 {
	private String name;
	private int num;
	private String sex;
	
	ex03_3(){
	}
	ex03_3(String name,int num,String sex){
		this.name=name;
		this.num=num;
		this.sex=sex;
	}
	public void showInfo() {
		System.out.printf("�̸� : %s, �й� : %d, ���� : %s\n",name,num,sex);
	}

	public static void main(String[] args) {
		ex03_3 stu[] = new ex03_3[20];
		stu[0]=new ex03_3("�̵���",2009038033,"��");
		stu[0].showInfo();
}
}
