package class_and_object;

class Triangle{
	//�������
	private double width;
	private double height;
	//�޼ҵ� �����ε� (method overloading)
	//�����ڵ� �����ε��ȴ�.
	
	//������
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
	
	//��� �޼���
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
		System.out.printf("�ѷ���:%.1f\n", round);
		System.out.printf("���̴�:%.1f\n", area);
		
		tri.setWidth(10);
		//tri.width=10;
		area=tri.getArea();
		System.out.printf("���̴�:%.1f\n", area);
	}
}