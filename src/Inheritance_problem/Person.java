package Inheritance_problem;

class Person {
	private String name;
	private int age;
	private double height;
	
	public Person() {
		
	}
	public Person(String name,int age,double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	public void Introduce() {
		System.out.printf("�̸�:%s\n", name);
		System.out.printf("����:%d\n", age);
		System.out.printf("Ű:%.1f\n", height);
	}
}
