package palindrome;

import java.util.Scanner;

public class palin_test {

	public static void main(String[] args) {
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�:");
		str=sc.next();
		//ȸ���Ǻ�
		int len=str.length();//6
		//0 1 2 3 4 5 - 6
		//(6)/2 = 3

		//0 1 2 3 4 - 5
		//(5)/2 = 2
		boolean isDiff=false;//�ٸ��� �־�����
		for(int i=0; i<len/2; i++){
			
			System.out.printf("%d��° ����:%s\n", 
					i,str.charAt(i));
			System.out.printf("%d��° ����:%s\n", 
					len-1-i,str.charAt(len-1-i));
		
			if(str.charAt(i)==str.indexOf(len-1-i)) {
				//�ϳ� ���Ҵٰ� ȸ���� �ƴϴ�.	
			}	
			else {
				//�ٷ� ȸ���ƴ�
				isDiff=true;
				break;
			}
		}

		if(isDiff==false) {
			System.out.println("ȸ�� ����!");
		}else if(isDiff==true) {
			System.out.println("ȸ�� �ƴ�!");
		}		
	}
}
