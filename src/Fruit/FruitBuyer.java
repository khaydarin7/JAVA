package Fruit;

class FruitBuyer{
	private int myMoney;
	private int numOfApple;
	
	public FruitBuyer()
	{
		myMoney=5000;
		numOfApple=0;
	}
	public FruitBuyer(int myMoney,int numOfApple)
	{
		this.myMoney=myMoney;
		this.numOfApple=numOfApple;
	}
						
	public void buyApple(FruitSeller seller, int money)
	{
		if(money>myMoney) {
			//���űݾ��� ���� ���������� ũ��...
			System.out.println("���� �����մϴ�!");
			return;
		}
		//�Ǹ����� ��������� üũ�Ͽ� �ǸŰ�������...
		if(seller.checkApple(money)==true) {
			//���Ű���
			numOfApple += seller.saleApple(money);
			myMoney -= money;
			System.out.printf("�Ǹ��ڿ��� %d��ġ ����� �����ߴ�!\n",money);
		}else {
			System.out.println("�Ǹ��� ����� �����մϴ�!");
			return;
		}
	}

	public void showBuyResult()
	{
		System.out.println("***������ ��Ȳ***");
		System.out.println("���� �ܾ�:"+myMoney);
		System.out.println("��� ����:"+numOfApple);
	}
}