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
				continue;//�������
			}else if(isContinue.equals("N")==true) {
				break;//��Ӿ��ϴϱ� �ݺ��� Ż��
			}
		}	
	}
}
