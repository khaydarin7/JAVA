
public class ex16 {

	public static void main(String[] args) {

		int num1=9;
		int num2=5;
		int num3=2;
		
		boolean result = (num1>=num2)&&(num2>=num3);
		//boolean result = (num1>=num2)&&(num2>=num3);
		//boolean result = true &&(num2>=num3);
		//boolean result = true && true;
		//boolean result = true && true; - true 논리 AND true
		//boolean result = true; - true 논리 AND true
		System.out.println(result);//true
		
		result = (num1>=num2)&&(num2<=num3);
		//result = true &&(num2<=num3);
		//result = true && false;
		//result = false;
		System.out.println(result);//false
		
		//대입 연산자는 오른쪽에서 왼쪽 방향이지만
		//대부분의 다른 연산자들은 대부분 왼쪽에서 오른쪽
		
		//3+4
		//3더하기4 - O
		//4더하기3 - X
		//대부분의 연산자들은 왼쪽에서 오른쪽
		//(사람 시선 가는대로)
	}
}
