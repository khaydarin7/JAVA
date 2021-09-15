
public class ex40 {

	public static void main(String[] args) {
		
		//배열
		//자바의 배열은 객체다. (저장공간+내장메서드)
		//c언어의 배열은 그냥 단순 저장공간
		
		int arr1[]=new int[3];
		//길이가 3인 int형 1차원 배열 arr선언
		//new - 메모리 생성 연산자
		//new가 들어간다? 객체 생성이다!
		//int 3개 저장할수 있는 메모리 공간 생성
		//그게 int 3개 저장할수있는 1차원 배열이다.
		
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		//c언어:int arr1[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.printf("%d ",arr1[i]);
		}
		
		int arr2[]= {40,50,60};
		//배열 선언과 동시에 초기화
		//배열을 만들면서 값을 바로준다.
	}
}
