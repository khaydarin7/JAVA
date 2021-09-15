package pedlet;

import java.util.Scanner;

public class ex02_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		for(int i=0;i<name.length();i++) {
			int cnt = 0;
			for(int j=i;j<name.length();j++) {
				if(name.charAt(j)==name.charAt(i))
					cnt++;
			}
			if(i==name.indexOf(name.charAt(i)))
				System.out.printf("%c는 %d글자 입니다.\n", name.charAt(i),cnt);
		}
	}
}
