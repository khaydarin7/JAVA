package class_and_object;

class Rectangle{
	//�������
	private double width;
	private double height;
	//������
	public Rectangle() {
		width=0;
		height=0;
	}
	public Rectangle(double width,double height) {
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
	//����޼���
	public double getRound() {
		return (width+height)*2;
	}
	public double getArea() {
		return (width*height);
	}
}
public class class_ex09 {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(3,4);
		double round=rect.getRound();
		double area = rect.getArea();
		System.out.printf("�ѷ���:%.1f\n", round);
		System.out.printf("���̴�:%.1f\n", area);
	}
}
