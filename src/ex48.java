
public class ex48 {

	public static void main(String[] args) {
		//break, continue
		//반복문 내부
		//break : 반복문 탈출
		//continue : 반복문의 처음으로
		//break는 반복문탈출이나
		//switch~case탈출시에 사용 가능
		int i=1;
		while(true) {
			System.out.printf("%d\n", i);
			if(i==10) {
				break;
			}
			i++;
		}
	}
}
