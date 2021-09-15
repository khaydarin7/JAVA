
public class ex25 {

	public static void main(String[] args) {
		//조건 연산자 (삼항 연산자)
		//A? B:C
		//A가 참이라면 B가 반환
		//A가 거짓이라면 C가 반환
		
		int num= -10;
		
		int result = num>0? num : -num;
		//절대값을 구하는 기능을 하는 삼항연산자
		//10의 절대값 10
		//-10의 절대값 10
		//음수를 뗄수가 없으니까...
		//음수를 양수로 만들고싶다 하면
		//음수에 마이너스를 한번더 곱해서 양수로
		//-(-10) -> 10
		System.out.println(result);//10
	}
}
