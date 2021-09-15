
public class ex18 {

	public static void main(String[] args) {
		// ++ , --
		//증가, 감소 연산자
		// ++ : 증가 연산자 (1증가)
		// -- : 감소 연산자 (1감소)
		
		//++num : 선증가 연산자 (전위증가,먼저증가)
		//num++ : 후증가 연산자 (후위증가,나중증가)
		//둘다 1증가하는데...
		//선증가:우선순위가 젤 높고
		//후증가:우선순위가 나중
		
		int num1=10;
		System.out.println(num1);//10
		System.out.println(num1++);//10 (나중증가)
		System.out.println(num1);//11
		
		int num2=10;
		System.out.println(num2);//10
		System.out.println(++num2);//11 (먼저증가)
		System.out.println(num2);//11
		//증가가 되면 그 변수값 자체가 바뀌니까...
	}
}
