package Fight;

public class FightMain {

	public static void main(String[] args) {
		Warrior war = new Warrior("��������",200,10);
		Monster mon = new Monster("���",100,5);
		
		while(true) {
			war.Attack(mon);//���簡 ���͸� ����
			if(mon.getHP()<=0) {
				System.out.println("���� �¸�!");
				break;
			}
			
			mon.Attack(war);//���Ͱ� ���縦 ����
			if(war.getHP() <= 0) {
				System.out.println("���� �¸�!");
				break;
			}
		}
	}
}
