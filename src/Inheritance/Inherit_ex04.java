package Inheritance;

//�ڹٴ� ���߻���� �Ұ����ϴ�.
//class Test extends B, extends C{
//}
//finalŬ������ ������ټ� ����.
final class myFinal{
	public int num;
	public void Func() {
		System.out.println("myFinal");
	}
}
class myChild extends myFinal{
	//The type myChild cannot subclass 
	//the final class myFinal
	//myChild�� myFinal�� ����Ŭ������ �ɼ�����.
	//->myFinalŬ������ finalŬ�����ϱ� ������ټ�����.
}

public class Inherit_ex04 {
	public static void main(String[] args) {

	}
}
