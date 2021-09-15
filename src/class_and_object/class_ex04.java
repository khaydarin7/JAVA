package class_and_object;

import java.util.Scanner;

class Account{
	private String accNum;//���¹�ȣ
	private String accPW;//���º�й�ȣ
	private int balance;//�ܾ�
	
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
		System.out.printf("%d�� �Ա�!\n", input);
		balance += input;
	}
	public void withdraw(int input) {
		if(input>balance) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;//�׳� return�� �޼�������
		}
		System.out.printf("%d�� ���!\n", input);
		balance -= input;
	}
	public void showBalance() {
		System.out.printf("�ܾ���ȸ:%d��\n", balance);
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
		//����:Account acc
		//�������� acc, ��ü ���� acc
		//acc���� ��ü�� �ּҰ� ����.
		
		//������:new Account("110-268",0);
		//new �� �޸� ���� ������
		//new Account - AccountŬ������ �޸� �����϶�
		//Account��ü ����
		//new Account("110-268",0);
		//Account��ü�� �����ϸ鼭
		//�Է����� ���ڿ�,������ �������ִ� ������ ȣ��
		//acc.deposit(5000);//5000�� �Ա�
		//acc.showBalance();//�ܾ���ȸ 5000��
		//acc.withdraw(2000);//2000�� ���
		//acc.showBalance();//�ܾ���ȸ 3000��
		//acc.withdraw(5000);//�ܾ��̺����մϴ�.
		//�ܾ�(balance)�� 3000���ִµ�
		//5000�� ����Ϸ��ϴϱ� ����...�ܾ׺���...
		//Scanner�� �Ἥ ����� �Է����� �ް�
		//�Ա��Ұ���...����Ұ���...�ܾ���ȸ�Ұ���...
		//�޴� ����... 
		//while + switch~case + Scanner
		//1.�Ա�
		//2.���
		//3.�ܾ���ȸ
		//4.����
		//4�� �����ϱ� ������ ��� ��� ����...
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
				System.out.print("�Ա� �ݾ� �Է�:");
				input=sc.nextInt();
				acc.deposit(input);
				break;
			case 2:
				
				System.out.print("���� ��ȣ �Է�:");
				acc_id=sc.next();
				System.out.print("���� ��й�ȣ �Է�:");
				acc_pw=sc.next();
				
				if( acc.check_ID_PW(acc_id,acc_pw)==true) {
					System.out.print("��� �ݾ� �Է�:");
					input=sc.nextInt();
					acc.withdraw(input);
				}else {
					System.out.print("��� ����!\n");
				}
				break;
			case 3:
				acc.showBalance();
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("1.�Ա�");
		System.out.println("2.���");
		System.out.println("3.�ܾ���ȸ");
		System.out.println("4.����");
	}
}

/*
c��� �Լ�
�Լ��� �� �����?
�Լ��� �ȸ����... 
�Լ��� �ȸ����...�ڵ尡 �������...
�����Լ� 1000�ٵȴ�....2000�� �ǰ�...
������, ������������ ������.
���� ���������ִµ�...�ű��...
�п�ǰ,��,ȭ��ǰ,��ȭ,����,�޴��� ������...
�ѹڽ��ȿ� �� ������ ã�Ⱑ �����...
�����Լ� 1000�� -> �Լ� 10���� 100�پ�...
�Լ��� ������...�Լ� 30��...
c��� -> c++ (��ü����)
*/
