import java.util.Scanner;

public class ex46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[]=new int[5];
		//국영수 총점 평균
		for(int i=0; i<=2; i++)
		{
			if(i==0) {
				System.out.print("국어 성적 입력:");
			}else if(i==1) {
				System.out.print("영어 성적 입력:");
			}else if(i==2) {
				System.out.print("수학 성적 입력:");
			}
			score[i]=sc.nextInt();
			score[3] += score[i];//총점
		}
		score[4]=score[3]/3;
		System.out.printf("총점:%d\n",score[3]);
		System.out.printf("평균:%d\n",score[4]);
	}
}
