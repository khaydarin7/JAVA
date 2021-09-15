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
		System.out.printf("이름:%s\n", name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("키:%.1f\n", height);
	}
}
