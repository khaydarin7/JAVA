
public class ex17 {

	public static void main(String[] args) {
		//복합 대입 연산자
		// = : 대입 연산자
		// 복합 대입연산자: 대입연산자 앞에 뭔가 복합적으로 붙었다.
		
		// += , -= , *= , /= , %=
		
		int num=10;
		
		num+=20;//num=num+20;
		//+= : 복합 대입 연산자 중에하난데...
		//num=num+20;
		//= : 대입연산자 오른쪽에서 왼쪽...
		//오른쪽의 값을 왼쪽의 공간에 넣는다.
		//대입 연산자의 오른쪽은 값으로 해석되고
		//대입 연산자의 왼쪽은 공간으로 해석된다.
		
		//num=num+20;
		//오른쪽:num값 더하기 20
		//을
		//왼쪽:num변수에 넣겠다.
		
		//num값에 20을 더해서 num변수에 넣겠다.
		
		//num += 20;
		//num=num+20;
		//num=10+20;
		//num=30;
		System.out.printf("num:%d\n", num);
		
		//num += 20 
		//num = num+20
		
		//num -= 20
		//num = num-20
		
		//num *= 20
		//num = num*20
		
		//num /= 20
		//num = num/20
		
		
	}
}
