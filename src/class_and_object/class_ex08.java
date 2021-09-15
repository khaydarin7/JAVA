package class_and_object;

class Triangle{
	//멤버변수
	private double width;
	private double height;
	//메소드 오버로딩 (method overloading)
	//생성자도 오버로딩된다.
	
	//생성자
	public Triangle() {
		width=0;
		height=0;
	}
	public Triangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	//setter,getter
	public void setWidth(double width) {
		this.width=width;
	}
	public double getWidth() {
		return width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	
	//멤버 메서드
	public double getRound() {
		return (width+height)*2;
	}
	public double getArea() {
		return (width*height)/2;
	}
}
public class class_ex08 {
	public static void main(String[] args) {
		Triangle tri = new Triangle(3,4);
		double round=tri.getRound();
		double area=tri.getArea();
		System.out.printf("둘레는:%.1f\n", round);
		System.out.printf("넓이는:%.1f\n", area);
		
		tri.setWidth(10);
		//tri.width=10;
		area=tri.getArea();
		System.out.printf("넓이는:%.1f\n", area);
	}
}