
public class ex37 {

	public static void main(String[] args) {

		//1,2,3,4
		//2,3,4
		//2,3,4
		//...
		for(int dan=2; dan<=9; dan++)//단 (외부 for)
		{
			if(dan%2==0) {
				for(int i=1; i<=9; i++)//1~9 (내부 for)
				{
					System.out.printf("%dx%d=%d\n", dan,i,dan*i);
				}
				System.out.printf("\n");
			}
		}
		//for문 중첩 
		//2중 for문
		//dan:2, i:1~9
		//dan:3, i:1~9
		//dan:4, i:1~9
		//dan:5, i:1~9
		//...
		//dan:9, i:1~9
		

	}
}
