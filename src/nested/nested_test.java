package nested;
//��øŬ����
//���� �ִ� Ŭ������ ��øŬ������ �������ִ�.
class Outer{
	private int out_num;
	public void OutFunc() {
		System.out.println("OutFunc");
	}
	class Inner{
		private int in_num;
		public void InFunc() {
			System.out.println("InFunc");
		}
	}
}
public class nested_test {
	public static void main(String[] args) {
		Outer out = new Outer();//�ܺ� Ŭ���� ��ü ����
		Outer.Inner in = out.new Inner();
		//����Ŭ���� ��ü ����
		
		//OuterŬ���� ������ InnerŬ����
		//���� Ŭ���� ��ü ����
		out.OutFunc();
		in.InFunc();
	}
}
