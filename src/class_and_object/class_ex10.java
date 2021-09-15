package class_and_object;

class MyStudent
{
	private String name;
	private int grade;
	private double score[];
	
	public MyStudent() {
		name="�⺻�л�";
		grade=1;
		score=new double[5];
	}
	public MyStudent(String name,int grade,
			double KOR,double ENG,double MATH) {
		this.name=name;
		this.grade=grade;
		score=new double[5];
		score[0]=KOR;
		score[1]=ENG;
		score[2]=MATH;
	}
	public void calcScore() {
		//���� ���
		for(int i=0; i<=2; i++) {
			score[3] += score[i];
		}
		//��հ��
		score[4]=score[3]/3;
	}
	public void showInfo() {
		System.out.printf("����:%.1f\n",score[0]);
		System.out.printf("����:%.1f\n",score[1]);
		System.out.printf("����:%.1f\n",score[2]);
		System.out.printf("����:%.1f\n",score[3]);
		System.out.printf("���:%.1f\n",score[4]);
	}
}
public class class_ex10 {
	public static void main(String[] args) {
		MyStudent std = new MyStudent("�̹�ȣ",2,90,80,70);
		std.calcScore();//���� ��� ���
		std.showInfo();//���� ���� ���
	}
}
