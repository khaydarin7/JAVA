
public class ex50 {

	public static void main(String[] args) {
		//메서드
		//클래스와 객체,상속,오버라이딩,다형성
		//JAVA+DB연동 : 웹
		//회원관리:로그인,회원가입,회원탈퇴,회원정보수정
		//CRUD
		//로그인 버튼을 누르면...어떤 메서드가 실행되서
		//DBMS에서 회원정보를 가져와서 입력창에 입력한값과 비교해서
		//성공! 실패!
		//Java+DB+JSP+Spring
		//C#+DB연동 : 시스템
		
		//자바에서는 함수라고 안하고 메서드라고 하는데
		//클래스 내부에 있는 함수를 메서드...
		int result=add(3,4);//7
		System.out.printf("%d\n", result);//7
		//add메서드 호출
		//add메서드를 호출하면서 입력으로 3과 4를 준다.
	}
	//원래 자바에서는 메서드를 사용하려면
	//객체 생성을 반드시 해야되는데 ( ~new )
	//static을 붙인 메서드는 객체 생성 안해도된다.
	
	//메서드의 정의 (기능이 있는것)
						 //입력부분
						 //입력부분의 변수:매개변수
						 //매개변수:매개체 변수
	public static int add(int n1,int n2) {
	//접근제어 지시자 (접근 허용 범위)
		   //메모리에 가장먼저 생성
				  //반환형태 (리턴타입)
		return n1+n2;//return 7;
		//return:반환하다.
		//7을 반환해라
		//메서드가 종료되고 남기는 값
		//메서드가 호출된 자리에 남는 값
	}
}
