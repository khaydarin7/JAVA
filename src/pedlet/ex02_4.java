package pedlet;

import java.util.Scanner;

public class ex02_4 {
	public char pw(char a) {
		switch(a) {
		case 'a':
			return '��';
		case 'b':
			return '��';
		case 'c':
			return '��';
		case 'd':
			return '��';
		case 'e':
			return '��';
		case 'f':
			return '��';
		case 'g':
			return '��';
		case 'h':
			return '��';
		case 'i':
			return '��';
		case 'j':
			return '��';
		case 'k':
			return '��';
		case 'l':
			return '��';
		case 'm':
			return '��';
		case 'n':
			return '��';
		case 'o':
			return '��';
		case 'p':
			return '��';
		case 'q':
			return '��';
		case 'r':
			return '��';
		case 's':
			return '��';
		case 't':
			return '��';
		case 'u':
			return '��';
		case 'v':
			return '��';
		case 'w':
			return '��';
		case 'x':
			return '��';
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex02_4 pp = new ex02_4();
		String pw = sc.next();
		for(int i=0;i<pw.length();i++) {
			System.out.printf("%c", pp.pw(pw.charAt(i)));
		}
	}
}
