import java.util.Scanner;

/*
 class Math{
 
 	public static int abs(int num){
 		....
 	}
 	
 	public static double sqrt(double num){
 		...
 	}
  }
*/
public class ex52 {

	public static void main(String[] args) {
		int result=Math.abs(-10);
		//Math클래스의 abs메서드 (절대값 구하는 메서드)
		System.out.printf("절대값:%d\n", result);
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
		//Math클래스의 내부 메서드들은
		//모두 static메서드라서
		//객체 생성안해도 사용가능
		
		//Scanner클래스의 내부 메서드들은
		//모두 non-static메서드라서
		//반드시 객체 생성 과정 거처야된다.
	}
}
