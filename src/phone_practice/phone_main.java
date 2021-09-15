package phone_practice;

import java.util.Scanner;

public class phone_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmartPhone phone[]=new SmartPhone[20];
		init(phone);
		while(true)
		{
			System.out.println("1.��� ��ȸ");
			System.out.println("2.�𵨸� ��ȸ");
			System.out.println("3.������ ��ȸ");
			System.out.println("4.���� ��ȸ");
			System.out.println("5.����");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				ALLprint(phone);
				break;
			case 2:
				String name = sc.next();
				SearchByName(name,phone);
				break;
			case 3:
				String company = sc.next();
				SearchByCompany(company,phone);
				break;
			}
		}
	
	}
	
	public static void init(SmartPhone phone[]) {
		phone[0]=new SmartPhone("������ 7","�Ｚ",320000,"SKT",600,"ȭ��Ʈ");
		phone[1]=new SmartPhone("������ 7","�Ｚ",300000,"LG U+",600,"���");
		phone[2]=new SmartPhone("������ 7","�Ｚ",310000,"KT",600,"��");
		phone[3]=new SmartPhone("������ 8","�Ｚ",400000,"SKT",500,"���");
		phone[4]=new SmartPhone("������ 8","�Ｚ",410000,"SKT",600,"ȭ��Ʈ");
		phone[5]=new SmartPhone("������ 8","�Ｚ",420000,"SKT",500,"���");
		phone[6]=new SmartPhone("G7","LG",250000,"LG U+",650,"ȭ��Ʈ");
		phone[7]=new SmartPhone("G7","LG",240000,"KT",650,"���");
		phone[8]=new SmartPhone("G8","LG",300000,"LG U+",600,"�ǹ�");
		phone[9]=new SmartPhone("G8","LG",310000,"SKT",600,"���");
		phone[10]=new SmartPhone("������12 Pro","Apple",1350000,"SKT",600,"�ǹ�");
		phone[11]=new SmartPhone("������12","Apple",950000,"SKT",600,"����");
	}
	
	public static void ALLprint(SmartPhone phone[]) {
		for(int i=0;i<phone.length;i++)
		{
		if(phone[i]==null)
			break;
		else
			phone[i].SmartPhoneInfo();
		}
	}
	
	public static void SearchByName(String name,SmartPhone phone[]) {
		for(int i = 0;i<20;i++) {
			if(phone[i]==null) {
				break;
			}else {
				String DB_Name=phone[i].getName();
				if(DB_Name.contains(name)==true) {
					phone[i].SmartPhoneInfo();
				}
			}
		}
	}
	
	public static void SearchByCompany(String company,SmartPhone phone[]) {
		for(int i = 0;i<20;i++) {
			if(phone[i]==null) {
				break;
			}else {
				String DB_Name=phone[i].getCompany();
				if(DB_Name.contains(company)==true) {
					phone[i].SmartPhoneInfo();
				}
			}
		}
	}

}
