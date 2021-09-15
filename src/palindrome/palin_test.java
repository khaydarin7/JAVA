package palindrome;

import java.util.Scanner;

public class palin_test {

	public static void main(String[] args) {
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력:");
		str=sc.next();
		//회문판별
		int len=str.length();//6
		//0 1 2 3 4 5 - 6
		//(6)/2 = 3

		//0 1 2 3 4 - 5
		//(5)/2 = 2
		boolean isDiff=false;//다른게 있었는지
		for(int i=0; i<len/2; i++){
			
			System.out.printf("%d번째 문자:%s\n", 
					i,str.charAt(i));
			System.out.printf("%d번째 문자:%s\n", 
					len-1-i,str.charAt(len-1-i));
		
			if(str.charAt(i)==str.indexOf(len-1-i)) {
				//하나 같았다고 회문은 아니다.	
			}	
			else {
				//바로 회문아님
				isDiff=true;
				break;
			}
		}

		if(isDiff==false) {
			System.out.println("회문 맞음!");
		}else if(isDiff==true) {
			System.out.println("회문 아님!");
		}		
	}
}
