package pedlet;

import java.util.Scanner;

public class ex02_4 {
	public char pw(char a) {
		switch(a) {
		case 'a':
			return 'ぁ';
		case 'b':
			return 'い';
		case 'c':
			return 'ぇ';
		case 'd':
			return 'ぉ';
		case 'e':
			return 'け';
		case 'f':
			return 'げ';
		case 'g':
			return 'さ';
		case 'h':
			return 'し';
		case 'i':
			return 'じ';
		case 'j':
			return 'ず';
		case 'k':
			return 'せ';
		case 'l':
			return 'ぜ';
		case 'm':
			return 'そ';
		case 'n':
			return 'ぞ';
		case 'o':
			return 'た';
		case 'p':
			return 'ち';
		case 'q':
			return 'っ';
		case 'r':
			return 'づ';
		case 's':
			return 'で';
		case 't':
			return 'に';
		case 'u':
			return 'ぬ';
		case 'v':
			return 'ば';
		case 'w':
			return 'ぱ';
		case 'x':
			return 'び';
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
