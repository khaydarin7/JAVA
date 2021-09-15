package Inheritance;

class Shape{
	private double width;
	private double height;
	
	public Shape() {
		width=0;
		height=0;
	}
	public Shape(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void area() {
		System.out.println("³ÐÀÌ´Â??\n");
	}
}

class Triangle extends Shape{
	public Triangle() {
		super();
	}
	public Triangle(double width,double height) {
		super(width,height);
	}
	public void area() {
		double area = (getWidth()*getHeight())/2;
		System.out.printf("³ÐÀÌ´Â %.1f\n",area);
	}	
}
class Rectangle extends Shape{
	public Rectangle() {
		super();
	}
	public Rectangle(double width,double height) {
		super(width,height);
	}
	public void area() {
		double area = (getWidth()*getHeight());
		System.out.printf("³ÐÀÌ´Â %.1f\n",area);
	}	
}
public class Inherit_ex09 {
	public static void main(String[] args) {
		Triangle tri = new Triangle(3,4);
		tri.area();
		Rectangle rect = new Rectangle(3,4);
		rect.area();
	}
}
