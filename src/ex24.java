
public class ex24 {

	public static void main(String[] args) {
		//if~else if~else
		//여러개의 조건을 사용하고 싶다면
		
		//성적
		int grade=88;
		
		if(grade==100) {
			System.out.println("A+");
		}else if(100>grade && grade>=90) {
			System.out.println("A");
		}else if(90>grade && grade>=80) {
			System.out.println("B");
		}else if(80>grade && grade>=70) {
			System.out.println("C");
		}else if(70>grade && grade>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
