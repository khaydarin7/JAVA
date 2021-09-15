
public class ex13 {

	public static void main(String[] args) {
		//관계 연산자 (비교 연산자)
		//관계를 판별하는 연산자...
		//물어보는것...
		//누가 누구보다 크냐? 작냐?
		// >= , <= , > , < , ==, !=
		//
		//num1 >= num2
		//num1이 num2 이상인가?
		//참이라면 전체가 true (c언어에서는 1)
		//거짓이라면 전체가 false (c언에서는 0)
		
		int num1=9;
		int num2=2;
		
		boolean result = (num1>=num2);
		//num1이 num2이상인가? 참이니까
		//num1>=num2 전체가 true가 된다.
		//boolean result = true;
		System.out.println(result);//true
		result = (num1<=num2);
		System.out.println(result);//false
		//num1<=num2 : num1이 num2이 이하인가?
		//거짓이니까... 전체가 false가 된다.
		//result = false;
		//대입연산자 나오면...무조건 오른쪽부터....
		//오른쪽 다되면 그 값이...왼쪽에 들어간다...
	}
}
