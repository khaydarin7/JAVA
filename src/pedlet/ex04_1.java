package pedlet;

public class ex04_1 {
	
	public static int tot() {
		int total=0;
		for(int i=1;i<=100;i++) {
			total+=i;
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.printf("%d", tot());
	}

}
