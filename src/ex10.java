
public class ex10 {

	public static void main(String[] args) {
		
		int num1=9;
		int num2=2;
		
		double result = (double)num1/num2;
		//(double)num1 : num1을 double로 형변환하라
		//num1을 double로 강제 형변환시킨다.
		//num1을 double로 명시적 형변환한다.
		//double result = (double)num1/num2;
		//double result = 9.0000/2;
		//double result = 9.0000/2; <---피 연산자 불일치
		//피 연산자 불일치때 자동형변환 발생
		//정수가 실수로 자동형변환
		//double result = 9.0000/2.0000;
		//하나만 실수로 바꿔서, 불일치 되는 상황을 만들어주면
		//나머지도 자동으로 바뀐다.......
		//double result = 4.50000;
		
		//double result = 9/2;
		//double result = 4;
		//정수4가 double 변수에 대입될때는
		//자동형변환이 발생해서 4.0000이 들어간다.
		
		// / <---나누기 연산자
		// num1/num2 : num1나누기 num2
		// 9/2 : 9나누기2 -> ??
		//원래 수학에선 9나누기2는 4.5인데...
		//여기서는 9나누기2를 4가 나온다...
		
		System.out.printf("%f\n", result);//4
		//정수 나누기 정수는 무조건 결과 정수
		//
	}
}
