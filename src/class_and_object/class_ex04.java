package class_and_object;

import java.util.Scanner;

class Account{
	private String accNum;//계좌번호
	private String accPW;//계좌비밀번호
	private int balance;//잔액
	
	public Account() {
		accNum="1234";
		accPW="4321";
		balance=0;
	}
	public Account(String accNum,String accPW,int balance) {
		this.accNum=accNum;
		this.accPW=accPW;
		this.balance=balance;
	}
	public void deposit(int input) {
		System.out.printf("%d원 입금!\n", input);
		balance += input;
	}
	public void withdraw(int input) {
		if(input>balance) {
			System.out.println("잔액이 부족합니다.");
			return;//그냥 return은 메서드종료
		}
		System.out.printf("%d원 출금!\n", input);
		balance -= input;
	}
	public void showBalance() {
		System.out.printf("잔액조회:%d원\n", balance);
	}
	public boolean check_ID_PW(String acc_id, String acc_pw) {
		
		if(acc_id.equals(accNum)==true) {
			if(acc_pw.equals(accPW)==true) {
				return true;
			}
		}
		return false;
	}
}

public class class_ex04 {

	public static void main(String[] args) {
		Account acc = new Account("110-268","1234",0);
		//왼쪽:Account acc
		//참조변수 acc, 객체 변수 acc
		//acc에는 객체의 주소가 들어간다.
		
		//오른쪽:new Account("110-268",0);
		//new 가 메모리 생성 연산자
		//new Account - Account클래스로 메모리 생성하라
		//Account객체 생성
		//new Account("110-268",0);
		//Account객체를 생성하면서
		//입력으로 문자열,정수를 받을수있는 생성자 호출
		//acc.deposit(5000);//5000원 입금
		//acc.showBalance();//잔액조회 5000원
		//acc.withdraw(2000);//2000원 출금
		//acc.showBalance();//잔액조회 3000원
		//acc.withdraw(5000);//잔액이부족합니다.
		//잔액(balance)는 3000원있는데
		//5000원 출금하려하니까 부족...잔액부족...
		//Scanner를 써서 사용자 입력으로 받고
		//입금할건지...출금할건지...잔액조회할건지...
		//메뉴 선택... 
		//while + switch~case + Scanner
		//1.입금
		//2.출금
		//3.잔액조회
		//4.종료
		//4번 종료하기 전까지 기능 계속 실행...
		int choice=0;
		int input=0;
		String acc_id="";
		String acc_pw="";
		
		Scanner sc = new Scanner(System.in);
		while(true){
			menu();
			choice=sc.nextInt();
			if(choice==4) {
				break;
			}
			
			switch(choice) {
			case 1:
				System.out.print("입금 금액 입력:");
				input=sc.nextInt();
				acc.deposit(input);
				break;
			case 2:
				
				System.out.print("계좌 번호 입력:");
				acc_id=sc.next();
				System.out.print("계좌 비밀번호 입력:");
				acc_pw=sc.next();
				
				if( acc.check_ID_PW(acc_id,acc_pw)==true) {
					System.out.print("출금 금액 입력:");
					input=sc.nextInt();
					acc.withdraw(input);
				}else {
					System.out.print("출금 실패!\n");
				}
				break;
			case 3:
				acc.showBalance();
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("1.입금");
		System.out.println("2.출금");
		System.out.println("3.잔액조회");
		System.out.println("4.종료");
	}
}

/*
c언어 함수
함수를 왜 만들까?
함수를 안만들면... 
함수를 안만들고...코드가 길어지면...
메인함수 1000줄된다....2000줄 되고...
가독성, 유지보수성이 안좋다.
집에 정리함이있는데...거기다...
학용품,옷,화장품,잡화,지갑,휴대폰 충전기...
한박스안에 다 넣으면 찾기가 힘들다...
메인함수 1000줄 -> 함수 10개로 100줄씩...
함수를 나눠도...함수 30개...
c언어 -> c++ (객체지향)
*/
