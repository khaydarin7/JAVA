package Random_practice;

import java.util.Random;

public class RockScissorPaper {
	private int record[];
	private double winPer;
	private Random rand;
	
	public RockScissorPaper() {
		record=new int[3];
		winPer = 0;
		rand = new Random();
	}
	
	public void choiceInfo(int userChoice, int comChoice) {
		
	}
	
	public void gameCount(int userChoice, int comChoice) {
		if(userChoice==comChoice) {
			System.out.println("���");
		}else {
			if(userChoice==1) {
				if(comChoice==2) {
					System.out.print("��ǻ�� �¸�!");
					record[2]++;
				}else if(comChoice==3) {
					System.out.print("����� �¸�!");
					record[0]++;
				}
			}else if(userChoice==3) {
				if(comChoice==1) {
					System.out.print("��ǻ�� �¸�!");
					record[2]++;
				}else if(comChoice==2) {
					System.out.print("����� �¸�!");
					record[0]++;
			}
		}
	}
}
}
