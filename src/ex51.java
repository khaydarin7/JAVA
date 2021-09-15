
public class ex51 {

	public static void main(String[] args) {
		int result=MyAbs(-10);
		System.out.printf("절대값:%d\n", result);
	}
	//static붙이면 객체 생성안해도 사용가능
	public static int MyAbs(int num) {
		if(num>=0) {
			return num;
		}else {
			return -num;
		}
	}
}
