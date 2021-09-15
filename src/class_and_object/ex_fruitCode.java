package class_and_object;
//사과를 사고 파는 시뮬레이션을 객체지향으로 만든것
//사과를 판매하는 클래스인 FruitSeller
//사과를 구매하는 클래스인 FruitBuyer
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
		System.out.println("***판매자 현황***");
		System.out.println("남은 사과:"+numOfApple);
		System.out.println("판매 수익:"+myMoney);
	}
}

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
						//첫번째 매개변수에 구매자 객체의 주소가 저장...
	public void buyApple(FruitSeller seller, int money)
	{//구매자가 구매메서드를 실행하면, 내부에서 판매자의 판매 메서드가 자동실행
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//판매자 클래스의 buyApple메서드 내부로
	//구매자 객체를 끌고들어와서
	//구매자 객체의 saleApple메서드를 사용한것
	//
	//내가 구매하면,판매자는 판매가된다.
	
	public void showBuyResult()
	{
		System.out.println("***구매자 현황***");
		System.out.println("현재 잔액:"+myMoney);
		System.out.println("사과 개수:"+numOfApple);
	}
}


public class ex_fruitCode {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20,0);
		FruitBuyer buyer = new FruitBuyer(5000,0);
		
		System.out.println("---판매전---");
		seller.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller, 3000);
		System.out.printf("판매자에게 %d원치 사과를 구매했다!\n",3000);
		
		System.out.println("---판매후---");
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
