
public class ex19 {

	public static void main(String[] args) {
		
		int num=10;
		
		int result = (num--)+5;
		//num-- : 후감소,나중감소,후위감소
		//후감소 (김씨)
		//선연산 후감소 (김철수씨)
		//더하기 연산 먼저하고 감소(--)나중에 한다.
		//9가 되기전에 10일때 5랑 더해서 15가 되고
		//그다음에 9가된다.
		
		System.out.printf("num:%d\n",num);//9
		System.out.printf("result:%d\n",result);//15
		
		//++num : 선증가 후연산
		//num++ : 선연산 후증가
		//--num : 선감소 후연산
		//num-- : 선연산 후감소
	}
}
