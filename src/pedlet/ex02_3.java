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
		System.out.printf("이름 : %s, 학번 : %d, 성별 : %s\n",name,num,sex);
	}

	public static void main(String[] args) {
		ex02_3 stu[] = new ex02_3[20];
		stu[0]=new ex02_3("이동준",2009,"남");
		stu[1]=new ex02_3("이제영",2007012034,"여");
		stu[0].showInfo();
		System.out.println("이동준 학생 학번 변경");
		stu[0].setNum(2009038033);
		stu[0].showInfo();
		stu[1].showInfo();
	}
}
