package Random_Practice;

import java.util.Random;
import java.util.Scanner;

public class RockCissorPaper {
	private int record[];//승,무,패 횟수
	private double winPer;//승률
	private int count;//게임 총 횟수
	private Random rand;//랜덤객체 저장을 위한 참조변수
	private Scanner sc;//입력을 위한 참조변수
	
	public RockCissorPaper() {
		record=new int[3];
		winPer=0;
		rand = new Random();
		sc = new Scanner(System.in);
	}
	
	public int makeUserChoice() {
		System.out.print("사용자 입력\n");
		System.out.print("1.가위, 2.바위, 3.보, 4.기록정보\n");
		int choice=sc.nextInt();
		return choice;
	}
	public int makeComputerChoice() {
		int choice=rand.nextInt(3)+1;//1~3
		return choice;
	}
	
	public void choiceInfo(int userChoice,int comChoice) {
		if(userChoice==1) {
			System.out.printf("사용자의 선택:%s\n", "가위");
		}else if(userChoice==2) {
			System.out.printf("사용자의 선택:%s\n", "바위");
		}else if(userChoice==3) {
			System.out.printf("사용자의 선택:%s\n", "보");
		}
		
		if(comChoice==1) {
			System.out.printf("컴퓨터의 선택:%s\n", "가위");
		}else if(comChoice==2) {
			System.out.printf("컴퓨터의 선택:%s\n", "바위");
		}else if(comChoice==3) {
			System.out.printf("컴퓨터의 선택:%s\n", "보");
		}
	}
	
	public void gameCount(int userChoice,int comChoice) {
		choiceInfo(userChoice,comChoice);
		count++;//게임 횟수 증가
		if(userChoice==comChoice) {
			//사용자 입력과 컴퓨터 입력이 같다?
			System.out.print("비김\n");
			record[1]++;//비긴 횟수 증가
		}else {
			if(userChoice==1) {//사용자:가위
				if(comChoice==2) {//컴퓨터:바위
					System.out.print("컴퓨터 승리!\n");
					record[2]++;//패배 횟수 증가
				}else if(comChoice==3) {//컴퓨터:보
					System.out.print("사용자 승리!\n");
					record[0]++;//승리 회숫 증가
				}
			}else if(userChoice==2) {//사용자:바위
				if(comChoice==1) {//컴퓨터:가위
					System.out.print("사용자 승리!\n");
					record[0]++;//승리 회숫 증가
				}else if(comChoice==3) {//컴퓨터:보
					System.out.print("컴퓨터 승리!\n");
					record[2]++;//패배 횟수 증가
				}
			}else if(userChoice==3) {//사용자:보
				if(comChoice==1) {//컴퓨터:가위
					System.out.print("컴퓨터 승리!\n");
					record[2]++;//패배 횟수 증가
				}else if(comChoice==2) {//컴퓨터:바위
					System.out.print("사용자 승리!\n");
					record[0]++;//승리 횟수 증가
				}
			}
		}
		
		winPer=((double)record[0]/count)*100;//승률 계산
	}
				//camel back:캐멀 백 (낙타등)
	public void showGameRecordInfo() {
		System.out.printf("승:%d회\n", record[0]);
		System.out.printf("무:%d회\n", record[1]);
		System.out.printf("패:%d회\n", record[2]);
		System.out.printf("승률:%.1f%%\n", winPer);
	}

	public String gameContinue() {
		System.out.print("계속 하시겠습니까?(Y/N)");
		String str=sc.next();
		return str;
	}
}
