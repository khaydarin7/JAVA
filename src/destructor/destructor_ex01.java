package destructor;

//이미 모든 클래스는 Object클래스에게 상속받았다.
//Object클래스는 모든 클래스의 조상
class AAA{//class AAA extends Object
	private int num;
	public void showInfo() {
		System.out.printf("num:%d\n", num);
	}
	//소멸자
	//소멸자는 생성자의 반대
	//생성자:객체가 생성될때 호출되는것
	//소멸자:객체가 소멸될때 호출되는것
	public void finalize() {
		System.out.println("소멸자 호출!");
		try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class destructor_ex01 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa=null;//aaa에 객체의 주소가있었는데
		//널값(널포인터)을 넣어서 객체와 연결을 끊었다.
		//그 객체가 쓸모없어졌다. 왜냐면
		//그 객체를 참조하는 변수가없어지니까 쓸모없어진것
		
		System.gc();//가비지 컬렉터 호출
		//시스템 클래스 내부의 gc메서드
		//gc - garbage collector
		//쓰레기차 호출
		//가비지 컬렉터가 객체가 소멸될때 호출되는 소멸자
		//즉,finalize메소드를 자동호출했다.
	}
}
