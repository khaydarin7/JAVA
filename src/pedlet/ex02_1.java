package pedlet;

class ex02_1 {
	private double rad = 0;
	private final double PI = 3.14;
	
	public void setRad(double rad) {
		this.rad = rad;
	}
	
	public ex02_1(double r) {
		setRad(r);
	}
	public ex02_1() {
	}

	public double getArea() {
		if(rad>0)
			return (rad*rad)*PI;
		else
			return 0;
	}
	public static void main(String[] args) {
		ex02_1 cc = new ex02_1();
		cc.setRad(3.56);
		System.out.printf("%f", cc.getArea());
	}
}
