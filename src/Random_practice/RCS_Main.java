package Random_Practice;

public class RCS_Main {

	public static void main(String[] args) {
		RockCissorPaper rcs = new RockCissorPaper();
		int userChoice=0;
		int comChoice=0;
		String isContinue="";
		while(true) {
			userChoice=rcs.makeUserChoice();
			comChoice=rcs.makeComputerChoice();
			rcs.gameCount(userChoice, comChoice);
			rcs.showGameRecordInfo();
			isContinue=rcs.gameContinue();
			if(isContinue.equals("Y")==true) {
				continue;//계속진행
			}else if(isContinue.equals("N")==true) {
				break;//계속안하니까 반복문 탈출
			}
		}	
	}
}
