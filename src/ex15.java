
public class ex15 {

	public static void main(String[] args) {
		//논리 연산자
		//&& ,  || , !
		//논리 AND - &&
		//논리 OR - ||
		//논리 NOT - !
		
		//논리 연산자는 진리표 (truth table)
		//논리 연산자
		//논리 가지고 연산한다.
		//논리 - true,false
		//논리 가지고 연산하는 연산자:논리 연산자
		//true,false 가지고 연산하는 연산자:논리 연산자
		
		//논리 AND 진리표
		//논리 곱,그리고,결합
		//둘다 참이어야, 결과도 참이다.
		// true는  내부적으로 1값
		// false는 내부적으로 0
		
		// false &&  false -> false
		// false &&  true  -> false
		// true  &&  false -> false
		// true  &&  true  -> true
		System.out.println("논리 AND의 진리표");
		System.out.println(false && false);//false
		System.out.println(false && true);//false
		System.out.println(true && false);//false
		System.out.println(true && true);//true
		
		//논리 OR
		//논리 합,또는,선택
		
		//논리 OR의 진리표 (truth table)
		// false ||  false -> false
		// false ||  true  -> true
		// true  ||  false -> true
		// true  ||  true  -> true
		//2도 참이고...
		//0만 거짓이고...나머진 다 참....
		System.out.println("논리 OR의 진리표");
		System.out.println(false || false);//false
		System.out.println(false || true);//true
		System.out.println(true || false);//true
		System.out.println(true || true);//true
		
		//! - 논리 NOT
		//NOT : 부정, ~아니다
		//!false -> true
		//!true -> false
		//논리에는 참과,거짓 밖에 없다.
		//!false : 거짓이 아니다 -> 참이다.
		//!true : 참이 아니다 -> 거짓이다.
		
		System.out.println("논리 NOT의 진리표");
		System.out.println(!false);//true
		System.out.println(!true);//false
	}
}
