
public class ex51 {

	public static void main(String[] args) {
		int result=MyAbs(-10);
		System.out.printf("���밪:%d\n", result);
	}
	//static���̸� ��ü �������ص� ��밡��
	public static int MyAbs(int num) {
		if(num>=0) {
			return num;
		}else {
			return -num;
		}
	}
}
