package question;
class A{
	public void methodA() {
		System.out.println("AAA");
	}
}
class B extends A{
	public void methodB() {
		System.out.println("BBB");
	}
}
public class test {
	public static void main(String[] args) {
		A obj=new B();
		((B) obj).methodB();
	}
}
