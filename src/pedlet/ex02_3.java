package pedlet;

public class ex02_3 {
	private String name;
	private int num;
	private String sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	ex02_3(){
	}
	ex02_3(String name,int num,String sex){
		this.name=name;
		this.num=num;
		this.sex=sex;
	}
	public void showInfo() {
		System.out.printf("�̸� : %s, �й� : %d, ���� : %s\n",name,num,sex);
	}

	public static void main(String[] args) {
		ex02_3 stu[] = new ex02_3[20];
		stu[0]=new ex02_3("�̵���",2009,"��");
		stu[1]=new ex02_3("������",2007012034,"��");
		stu[0].showInfo();
		System.out.println("�̵��� �л� �й� ����");
		stu[0].setNum(2009038033);
		stu[0].showInfo();
		stu[1].showInfo();
	}
}
