package Fruit;

class FruitSeller{
	private final int APPLE_PRICE=1000;
	private int numOfApple;
	private int myMoney;
	
	public FruitSeller() {
		numOfApple=10;
		myMoney=0;
	}
	
	public FruitSeller(int numOfApple,int myMoney) {
		this.numOfApple=numOfApple;
		this.myMoney=myMoney;
	}
	
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult()
	{
		System.out.println("***�Ǹ��� ��Ȳ***");
		System.out.println("���� ���:"+numOfApple);
		System.out.println("�Ǹ� ����:"+myMoney);
	}

	public boolean checkApple(int money) {
		//�Ű������� ���� �ݾ׸�ŭ ��� �ǸŰ� �������� üũ
		//money�� ��� ���?
		int num=money/APPLE_PRICE;
		if(num>numOfApple) {
		//�����ڰ� �����Ϸ��� ���������, 
		//�Ǹ��ڰ� �Ǹ��Ҽ��ִ� ��� �������� �����ϱ� �Ǹ� �Ұ���
			return false;
		}
		//�װ� �ƴϸ� ���Ű���
		return true;
	}
}