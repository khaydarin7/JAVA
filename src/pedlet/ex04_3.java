package pedlet;

public class ex04_3 {
		private String name;
		private int num;
		private String sex;
		
		ex04_3(){
		}
		ex04_3(String name,int num,String sex){
			this.name=name;
			this.num=num;
			this.sex=sex;
		}
		public void showInfo() {
			System.out.printf("ÀÌ¸§ : %s, ³ªÀÌ : %d, ¼ºº° : %s\n",name,num,sex);
		}

		public static void main(String[] args) {
			ex04_3 stu[] = new ex04_3[20];
			stu[0]=new ex04_3("¸Û¸ÛÀÌ",9,"¼öÄÆ");
			stu[0].showInfo();
	}
}
