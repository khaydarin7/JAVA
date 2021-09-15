
public class ex49 {

	public static void main(String[] args) {
		//continue
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				continue;
				//짝수면 다 위로 올려보낸다.
			}
			System.out.printf("%d ", i);
			//printf는 홀수만 된다.
		}	
	}
}
