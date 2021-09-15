package Random_Practice;

import java.util.Random;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		//Random 클래스
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int num=0;
		int count=0;
		int dice[]=new int[7];//주사위 각 눈금의 횟수
		double dice_per[] = new double[7];//주사위 눈금 확률
		System.out.print("주사위 몇번?");
		count=sc.nextInt();
		//0~6 0번째는 안쓰고 1~6번째
		for(int i=1; i<=count; i++) {
			num=rand.nextInt(6)+1;//1~6
			dice[num]++;
		}
		//확률계산
		for(int i=1; i<=6; i++) {
			dice_per[i]=((double)dice[i]/count)*100;
		}
		for(int i=1; i<=6; i++) {
			System.out.printf("%d의 눈금 횟수:%d\n",
					i,dice[i]);
		}
		System.out.printf("-----------------\n");
		for(int i=1; i<=6; i++) {
			System.out.printf("%d의 눈금 확률:%.4f%%\n",
					i,dice_per[i]);
		}
		//대수의법칙, 큰수의법칙
		//주사위 각 눈금이 나올 확률 1/6 -> 16.6%
		//주사위 정육면체 16.6%
		//6번 던지면 1,2,3,4,5,6
		//...
		//100번 던지면,1000번던지면,10000번 던지면...
		//16.6%에 점점 가깝게 간다 (수렴한다.)
		//대수의 법칙:이론상의 확률은 시행횟수를 늘리면 가까워진다.
		//카지노 : 블랙잭 (카드게임)
		//슬롯머신 : 기계조작...
		//블랙잭같은 카드게임은...
		//만약에 손님이 딜러보다 실력이 좋다?
		//그럼 카지노 손해가 아닌가?
		//딜러가 나눠주는 방식,선공여부...
		//이미 딜러가 이길확률 55%...
		//10번하면 7번진다...
		//10만번한다... 5만5천번...이긴다...
		//오토바이 과속...
		//오토바이 과속,신호위반 해서 죽을확률...
		//0.5%... 언젠간...
		//낮은 확률도 무시할수없다...
		//계속 그렇게 하다보면 언젠간...발현된다...
		
	}
}
