package phone_practice;

class SmartPhone {
	private String name;
	private String company;
	private int price;
	private String provider;
	private int weight;
	private String color;

	SmartPhone() {
		
	}
	SmartPhone(String name, String company, int price, String provider, 
			int weight, String color){
		this.name = name;
		this.company = company;
		this.price = price;
		this.provider = provider;
		this.weight = weight;
		this.color = color;
	}
	public void SmartPhoneInfo() {
		System.out.printf("��ǰ��:%s\n",name);
		System.out.printf("����ȸ��:%s\n",company);
		System.out.printf("����:%s\n",price);
		System.out.printf("��Ż�:%s\n",provider);
		System.out.printf("����:%d\n",weight);
		System.out.printf("����:%s\n",color);
		System.out.printf("---------------------\n");
	}
	public void findname(String name) {
		
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	
	
}

		

