package Random_Practice;

import java.util.Random;
//java��Ű���ȿ� util��Ű�� �ȿ� RandomŬ����
public class ex01 {
	public static void main(String[] args)
	{
		//Random Ŭ����
		Random rand = new Random();
		int num=0;
		for(int i=1; i<5; i++) {
			num=rand.nextInt(3)+1;
			System.out.printf("%d ", num);
		}
	}
}
