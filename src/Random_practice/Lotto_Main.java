package Random_Practice;

public class Lotto_Main {
	//Lotto_Main클래스는 메인메소드를 가지고있고
	//Lotto클래스를 불러와서 사용하는곳
	public static void main(String[] args) {
		Lotto lt = new Lotto();
		lt.inputGameCount();
		lt.generateLottoNum();
		lt.printLottoNum();
	}
}
