package Random_Practice;

import java.util.Random;

public class Simple_Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		//Random클래스로 난수 생성(랜덤 값 생성)
		int num=0;
		int lotto[]=new int[6];
		boolean isDuplicate=false;//중복이 있었는지 여부
		//중복이 없다고 가정하고 시작...
		for(int i=0; i<=5; i++) {
			//i가 번호를 넣을 위친데
			num=random.nextInt(45)+1;
			//넣기 전에 0번째부터 i전까지 탐색
			//i번째 앞에 중복이 있는 검사
			for(int j=0; j<i; j++) {
				if(num==lotto[j]) {
					isDuplicate=true;//중복이있음
					break;
				}
			}
			//중복이 없으면? 그냥 넣으면되고
			//중복이 있다? 그러면 랜덤값 다시 뽑아서 다시 검사
			if(isDuplicate==true) {
				i=i-1;
			}else if(isDuplicate==false) {
				lotto[i]=num;
			}
			isDuplicate=false;//원래대로 돌림
		}
		for(int i=0; i<=5; i++) {
			System.out.printf("%d ", lotto[i]);
		}
	}
}
