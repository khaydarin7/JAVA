package class_and_object;

class MyStudent
{
	private String name;
	private int grade;
	private double score[];
	
	public MyStudent() {
		name="±âº»ÇÐ»ý";
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
		//ÃÑÁ¡ °è»ê
		for(int i=0; i<=2; i++) {
			score[3] += score[i];
		}
		//Æò±Õ°è»ê
		score[4]=score[3]/3;
	}
	public void showInfo() {
		System.out.printf("±¹¾î:%.1f\n",score[0]);
		System.out.printf("¿µ¾î:%.1f\n",score[1]);
		System.out.printf("¼öÇÐ:%.1f\n",score[2]);
		System.out.printf("ÃÑÁ¡:%.1f\n",score[3]);
		System.out.printf("Æò±Õ:%.1f\n",score[4]);
	}
}
public class class_ex10 {
	public static void main(String[] args) {
		MyStudent std = new MyStudent("ÀÌ¹ÎÈ£",2,90,80,70);
		std.calcScore();//ÃÑÁ¡ Æò±Õ °è»ê
		std.showInfo();//ÇöÀç »óÅÂ Ãâ·Â
	}
}
