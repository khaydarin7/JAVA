
public class ex14 {

	public static void main(String[] args) {
		// == , !=
		// == : 같은가?
		// != : 다른가? (같지 않은가?)
		
		int num1=9;
		int num2=2;
		
		boolean result = (num1==num2);
		//num1==num2
		//num1과 num2가 같은가?
		//같은가? 하면 같아야 참,다르면 거짓
		//같은가가 거짓이다...
		System.out.println(result);//false
		
		result = (num1 != num2);
		//num1 != num2
		//num1과 num2가 다른가?
		//다른가? 달라야 참... 같으면 거짓...
		System.out.println(result);//true
	}
}
