package Fight;

public class FightMain {

	public static void main(String[] args) {
		Warrior war = new Warrior("강한전사",200,10);
		Monster mon = new Monster("고블린",100,5);
		
		while(true) {
			war.Attack(mon);//전사가 몬스터를 공격
			if(mon.getHP()<=0) {
				System.out.println("전사 승리!");
				break;
			}
			
			mon.Attack(war);//몬스터가 전사를 공격
			if(war.getHP() <= 0) {
				System.out.println("몬스터 승리!");
				break;
			}
		}
	}
}
