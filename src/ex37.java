
public class ex37 {

	public static void main(String[] args) {

		//1,2,3,4
		//2,3,4
		//2,3,4
		//...
		for(int dan=2; dan<=9; dan++)//�� (�ܺ� for)
		{
			if(dan%2==0) {
				for(int i=1; i<=9; i++)//1~9 (���� for)
				{
					System.out.printf("%dx%d=%d\n", dan,i,dan*i);
				}
				System.out.printf("\n");
			}
		}
		//for�� ��ø 
		//2�� for��
		//dan:2, i:1~9
		//dan:3, i:1~9
		//dan:4, i:1~9
		//dan:5, i:1~9
		//...
		//dan:9, i:1~9
		

	}
}
