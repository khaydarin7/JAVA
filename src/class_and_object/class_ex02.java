package class_and_object;

//접근제어 지시자
//접근 허용 범위 결정...
//public,default,protected,private
//public class - 같은 패키지,다른 패키지 다 가능
//class - 같은 패키지까지가능
class Car{
	String name;
	int price;
	String provider;
	//생성자 (Constructor)
	//객체가 생성될때 호출되는게 생성자
	//생성자는 클래스와 이름이 같다.
	//생성자는 반환형자체가 그냥 없다.
	//생성자가 메서드(함수)는 아니다.
	
	//생성자도 오버로딩 된다.
	//입력이 다른 생성자를 여러개 만들수있다.
	Car(){
		//디폴트 생성자 (입력이 없는 생성자)
		System.out.println("디폴트 생성자 호출!");
		this.name="기본차량";
		this.price=1000;
		this.provider="기본제공자";
	}
	Car(String name){
		System.out.println("String생성자 호출!");
		this.name=name;
		this.price=1000;
		this.provider="기본제공자";
	}
	Car(String name,int price,String provider){
		System.out.println("String,int,String생성자 호출!");
		//String,int,String생성자
		this.name=name;
		this.price=price;
		this.provider=provider;
	}
	//생성자는 객체가 생성될때 자동으로 호출이된다.
	//객체가 생성될때 하면 좋은걸 생성자에서 하자
	//객체가 생성될때 하면 좋은게 뭔가?
	//객체 내부의 멤버변수의 값을 초기화하는것
	
	void InitMembers(String name,int price,String provider)
	{
		this.name=name;
		this.price=price;
		this.provider=provider;
	}
	
	void ShowCarInfo() {
		System.out.printf("차량명:%s\n", name);
		System.out.printf("가격:%d\n", price);
		System.out.printf("제조사:%s\n", provider);
	}
}

public class class_ex02 {

	public static void main(String[] args) {
		Car c1 = new Car(); // - Java
		//Car* c1 = new Car(); - C++
		//c1.InitMembers("소나타", 2500, "현대");
		//c1.name="소나타";
		//c1.price=2500;
		//c1.provider="현대";
		Car c2 = new Car();
		//c2.InitMembers("아반떼", 2000, "현대");
		//c2.name="아반떼";
		//c2.price=2000;
		//c2.provider="현대";
		Car c3 = new Car("아우디",3000,"폭스바겐");
		c1.ShowCarInfo();//첫번째 차량 정보 출력
		c2.ShowCarInfo();//두번째 차량 정보 출력
		c3.ShowCarInfo();//세번째 차량 정보 출력
		//절차지향 언어:C
		//객체지향 언어:C++,JAVA,Python,C#
		//메모리 자동할당 언어:Java,C#,Python
		//메모리 수동할당 가능언어:C,C++
	}
}
