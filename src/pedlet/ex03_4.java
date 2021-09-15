package pedlet;

public class ex03_4 {
	
	public static int tot() {
		int total = 0;
		for(int i=1;i<=100;i++) {
			if(i%3!=0) {
				total+=i;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.printf("%d", tot());
	}
}
