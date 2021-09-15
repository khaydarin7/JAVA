package pedlet;

public class ex01_4 {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.setName("≥…¿Ã");
	}
}
class Cat{
	String name;
	int age;
	String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}