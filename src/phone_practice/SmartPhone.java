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
		System.out.printf("제품명:%s\n",name);
		System.out.printf("제조회사:%s\n",company);
		System.out.printf("가격:%s\n",price);
		System.out.printf("통신사:%s\n",provider);
		System.out.printf("무게:%d\n",weight);
		System.out.printf("색상:%s\n",color);
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

		

