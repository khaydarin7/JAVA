package BookSearch;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BookMain {
	public static void main(String[] args) {
		Book BookList[] =new Book[100];
		initData(BookList);
		//printData(BookList);
		int choice=0;
		String bookTitle="";
		String startDate="";
		String endDate="";
				
		Scanner sc = new Scanner(System.in);
		while(true) {
			menu();
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1://���� �˻�
				System.out.print("å ���� �Է�:");
				bookTitle=sc.nextLine();
				searchBookByTitle(bookTitle,BookList);
				break;
			case 5://���� �����, �� �����
				System.out.println("�Է� ����(2009-01-01)");
				System.out.print("���� ����� �Է�:");
				startDate=sc.next();
				System.out.print("�� ����� �Է�:");
				endDate=sc.next();
				searchBookByDate(startDate,endDate,BookList);
				break;
			}
		}
	}
	
	private static void searchBookByDate(String startDate, String endDate, Book BookList[]) {
		String DB_BookYear="";
		StringTokenizer strtok=null;
		int start_Date[]=new int[3];
		int end_Date[]=new int[3];
		int j=0;
		strtok=new StringTokenizer(startDate,"-");
		j=0;
		while(strtok.hasMoreTokens()) {
			start_Date[j]=Integer.parseInt(strtok.nextToken());
			j++;
		}
		
		strtok=new StringTokenizer(endDate,"-");
		j=0;
		while(strtok.hasMoreTokens()) {
			end_Date[j]=Integer.parseInt(strtok.nextToken());
			j++;
		}
		System.out.print("���� �����:");
		for(int k=0; k<=2; k++) {
			System.out.printf("%d ", start_Date[k]);
		}
		System.out.print("�� �����:");
		for(int k=0; k<=2; k++) {
			System.out.printf("%d ", end_Date[k]);
		}
		
		
		int DB_Date[]=new int[3];
		for(int i=0; i<100; i++) {
			if(BookList[i]==null) {
				break;
			}else {
				DB_BookYear=BookList[i].getPublishingYear();
				strtok=new StringTokenizer(DB_BookYear,"-");
				j=0;
				while(strtok.hasMoreTokens()) {
					DB_Date[j]=Integer.parseInt(strtok.nextToken());
					j++;
				}
				
				//�Ǻ�
				
			}
		}
		
		//��ø if, ���� ������, ���� ������
		//�����ͺ��̽��� �ִ� å�� ��¥��
		//���� �Է��� ���۳�¥,����¥ ���̿� ������ �˻�
		//�װ� �´ٸ�?
		//å ���� ���
		
	}

	public static void searchBookByTitle(String title,Book BookList[]) {
		for(int i=0; i<100; i++) {
			if(BookList[i]==null) {
				break;
			}else {
				String DB_BookName=BookList[i].getBookName();
				if(DB_BookName.contains(title)==true) {
					//DB_BookName�� title�� �����ϰ� �ִٸ� ���
					BookList[i].showBookInfo();
				}	
			}
		}
	}

	public static void initData(Book BookList[]) {
		BookList[0]=new Book("��� ���ַ�", "������", "���Ǽ���", "2020-08-15", 344, "�뱸�����ø��߾ӵ�����", 1001, "�ι��ڷ��", 0, false);
		BookList[1]=new Book("�ڷγ� ���ǿ���", "����õ", "���÷翣��", "2020-06-10", 200, "�뱸�����ø��߾ӵ�����", 1002, "�ι��ڷ��", 0, false);
		BookList[2]=new Book("�̿���� ���1", "���� �Ĺ�Ÿ��", "���÷翣��", "2014-11-17", 336, "�뱸�����ø��߾ӵ�����", 1003, "�ι��ڷ��", 0, false);
		BookList[3]=new Book("���ζ� �����ΰ�", "�迵��", "��ũ�ν�", "2020-08-26", 272, "�뱸�����ø��߾ӵ�����", 1004, "�ι��ڷ��", 0, false);
		BookList[4]=new Book("�Ϸ� 10�� �ι���", "������", "������ö��", "2020-09-10", 376, "�뱸�����ø��߾ӵ�����", 1005, "�ι��ڷ��", 0, false);
		BookList[5]=new Book("�ſ� ������ �����" , "��ȫ��", "���׾Ƹ�", "2020-07-23", 388, "�뱸�����ø��߾ӵ�����", 1006, "�ι��ڷ��", 0, false);
		BookList[6]=new Book("�� ��° ��", "���̺�� ��轺", "��Ű", "2020-09-24", 600, "�뱸�����ø��߾ӵ�����", 1007, "�ι��ڷ��", 0, false);
		BookList[7]=new Book("���ǿ���", "���� �϶�", "�迵��", "2015-11-24", 636, "�뱸�����ø��߾ӵ�����", 1008, "�ι��ڷ��", 0, false);
		BookList[8]=new Book("���� ������ ������ �԰� �ڶ���", "�ڿ��", "����Ͻ�", "2020-07-20", 288, "�뱸�����ø��߾ӵ�����", 1009, "�ι��ڷ��", 0, false);
		BookList[9]=new Book("����� �Ǵ�", "������", "�س����ǻ�", "2018-10-10", 316, "�뱸�����ø��߾ӵ�����", 1010, "�ι��ڷ��", 0, false);
		BookList[10]=new Book("������ ��", "������", "����", "2016-08-10", 368, "�뱸�����ø��߾ӵ�����", 2001, "�ι��ڷ��", 0, false);
		BookList[11]=new Book("��,��,��", "������ ���̾Ƹ��", "���л���", "2005-12-19", 344, "�뱸�����ø��߾ӵ�����", 2002, "�ι��ڷ��", 0, false);
		BookList[12]=new Book("������� ����ó��", "������", "����", "2020-06-20", 368, "�뱸�����ø��߾ӵ�����", 2003, "�ι��ڷ��", 0, false);
		BookList[13]=new Book("���μ��� �������� �Ƿ�", "���μ�", "�����", "2016-07-20", 504, "�뱸�����ø��߾ӵ�����", 2004, "�ι��ڷ��", 0, false);
		BookList[14]=new Book("������ ����", "���¼�", "�ٻ��ʴ�", "2019-11-22", 296, "�뱸�����ø��߾ӵ�����", 2005, "�ι��ڷ��", 0, false);
		BookList[15]=new Book("30�� ���÷� �д� �����", "�� ������", "�ٻ�Ͻ�", "2020-07-06", 344, "�뱸�����ø��߾ӵ�����", 2006, "�ι��ڷ��", 0, false);
		BookList[16]=new Book("���� �����Ƿ�", "�� ��Ʈ ���Ϸ�", "�ϵ���", "2017-10-26", 320, "�뱸�����ø��߾ӵ�����", 2007, "�ι��ڷ��", 0, false);
		BookList[17]=new Book("�б⸸ �ϸ� ������ �Ǵ� 1������", "�ɿ�ȯ", "���̺�", "2020-06-17", 384, "�뱸�����ø��߾ӵ�����", 2008, "�ι��ڷ��", 0, false);
		BookList[18]=new Book("���̴Ͼ�", "�� Ȧ����", "å���Բ�", "2020-09-14", 856, "�뱸�����ø��߾ӵ�����", 2009, "�ι��ڷ��", 0, false);
		BookList[19]=new Book("���μ��� ���� �ѱ��� Ư��", "���μ�", "�޸�ť��", "2019-01-29", 433, "�뱸�����ø��߾ӵ�����", 2010, "�ι��ڷ��", 0, false);
		BookList[20]=new Book("�ڷγ� ���ǿ���", "����õ", "���÷翣��", "2020-06-10", 200, "�뱸�����ø��߾ӵ�����", 3002, "�ι��ڷ��", 0, false);
		BookList[21]=new Book("���̰� �Ϸ���", "�� �˰���", "����ȩ", "2020-08-18", 280, "�뱸�����ø��߾ӵ�����", 3003, "�ι��ڷ��", 0, false);
		BookList[22]=new Book("������ ��", "�� ����", "����", "2016-08-10", 368, "�뱸�����ø��߾ӵ�����", 3004, "�ι��ڷ��", 0, false);
		BookList[23]=new Book("��,��,��", "������ ���̾Ƹ��", "���л���", "2005-12-19", 751, "�뱸�����ø��߾ӵ�����", 3005, "�ι��ڷ��", 0, false);
		BookList[24]=new Book("������ ����������", "������", "â��", "2019-07-17", 244, "�뱸�����ø��߾ӵ�����", 3006, "�ι��ڷ��", 0, false);
		BookList[25]=new Book("��ƮǮ�Ͻ�", "�ѽ� �ν���", "�迵��", "2019-03-10", 474, "�뱸�����ø��߾ӵ�����", 3007, "�ι��ڷ��", 0, false);
		BookList[26]=new Book("���ú����� ����", "�����", "�޵�ġ�̵��", "2020-07-16", 232, "�뱸�����ø��߾ӵ�����", 3008, "�ι��ڷ��", 0, false);
		BookList[27]=new Book("���Ƕ� �����ΰ�", "����Ŭ ����", "�������", "2014-11-20", 443, "�뱸�����ø��߾ӵ�����", 3009, "�ι��ڷ��", 0, false);
		BookList[28]=new Book("���� ǳ��ο��� ������ �޶�����", "ȣ�� �ڷ�", "�迵��", "2020-09-04", 276, "�뱸�����ø��߾ӵ�����", 3010, "�ι��ڷ��", 0, false);
		BookList[29]=new Book("�ڽ���", "Į ���̰�", "���̾𽺺Ͻ�", "2006-12-20", 719, "�뱸�����ø��߾ӵ�����", 4001, "�����ڷ��", 0, false);
		BookList[30]=new Book("�̱��� ������", "��ó�� ��Ų��", "������ȭ��", "2018-10-20", 344, "�뱸�����ø��߾ӵ�����", 4002, "�����ڷ��", 0, false);
		BookList[31]=new Book("1�� ����", "�����", "������Ͽ콺", "2020-09-03", 344, "�뱸�����ø��߾ӵ�����", 4003, "�����ڷ��", 0, false);
		BookList[32]=new Book("����ؼ� ����� �������� �ñ��ߴ� �̾߱�", "�繰���� ��������", "�Ƹ���", "2020-09-16", 240, "�뱸�����ø��߾ӵ�����", 4004, "�����ڷ��", 0, false);
		BookList[33]=new Book("��ȭ�� ����", "���̺�� A ��", "��Ű", "2020-07-30", 624, "�뱸�����ø��߾ӵ�����", 4005, "�����ڷ��", 0, false);
		BookList[33]=new Book("���� ǳ��ο���, ������ �޶�����", "ȣ�� �ڷ�", "�迵��", "2020-09-04", 276, "�뱸�����ø��߾ӵ�����", 4006, "�����ڷ��", 0, false);
		BookList[34]=new Book("�ٽ�, ������ �ʿ��� ����", "�����", "���÷翣��", "2020-08-12", 448, "�뱸�����ø��߾ӵ�����", 4007, "�����ڷ��", 0, false);
		BookList[35]=new Book("������ �ʿ��� ����", "�����", "���÷翣��", "2018-08-03", 328, "�뱸�����ø��߾ӵ�����", 4008, "�����ڷ��", 0, false);
		BookList[36]=new Book("��鼭 ���� �غ��� ��ȭ", "�е��", "�Ѻ�����", "2020-06-19", 304, "�뱸�����ø��߾ӵ�����", 4009, "�����ڷ��", 0, false);
		BookList[37]=new Book("������� ���� �ܼ�Ʈ", "�����", "��ũ�ν�", "2020-07-07", 388, "�뱸�����ø��߾ӵ�����", 4010, "�����ڷ��", 0, false);
		BookList[38]=new Book("����� �� ����2 : ��", "�̼���", "�Ϸα����۴�", "2020-10-20", 400, "�뱸�����ø��߾ӵ�����", 5001, "�����ڷ��", 0, false);
		BookList[39]=new Book("����� �� ����2 : ��", "�̼���", "�Ϸα����۴�", "2020-10-20", 400, "�뱸�����ø��߾ӵ�����", 5002, "�����ڷ��", 0, false);
		BookList[40]=new Book("�汸�� �̼���", "������", "�����ǽ�", "2018-08-03", 344, "�뱸�����ø��߾ӵ�����", 5003, "�����ڷ��", 0, false);
		BookList[41]=new Book("����� �� 1", "�̼���", "�Ϸα����۴�", "2017-08-11", 408, "�뱸�����ø��߾ӵ�����", 5004, "�����ڷ��", 0, false);
		BookList[42]=new Book("����� �� 2", "�̼���", "�Ϸα����۴�", "2017-08-11", 400, "�뱸�����ø��߾ӵ�����", 5005, "�����ڷ��", 0, false);
		BookList[43]=new Book("������� ��ü �����", "�����", "���ȴ�", "2019-11-26", 392, "�뱸�����ø��߾ӵ�����", 5006, "�����ڷ��", 0, false);
		BookList[44]=new Book("��ȭ �� ���� ����", "��ī�� ��Ű��", "��ȣ�̵��", "2020-07-27", 304, "�뱸�����ø��߾ӵ�����", 5007, "�����ڷ��", 0, false);
		BookList[45]=new Book("�ÿ� �׸� ����", "������", "�Ϸα����۴�", "2020-09-14", 108, "�뱸�����ø��߾ӵ�����", 5008, "�����ڷ��", 0, false);
		BookList[46]=new Book("���������� ������ 2", "����", "ȣ���", "2020-08-27", 520, "�뱸�����ø��߾ӵ�����", 5009, "�����ڷ��", 0, false);
		BookList[47]=new Book("���� �̼���", "������Ʈ ���긮ġ", "����", "2003-07-10", 688, "�뱸�����ø��߾ӵ�����", 5010, "�����ڷ��", 0, false);
		BookList[48]=new Book("���㾲�� �θ���", "�޻���", "����", "2020-08-31", 128, "�뱸�����ø��߾ӵ�����", 6001 ,"�ι��ڷ��", 0, false);
		BookList[49]=new Book("���� �ʸ� �Ƴ��", "�����", "ťƼ��", "2020-09-15", 344,  "�뱸�����ø��߾ӵ�����", 6002 ,"�ι��ڷ��", 0, false);
		BookList[50]=new Book("���㾲�� ���Ѻ���", "�޻���", "����", "2020-06-26", 208, "�뱸�����ø��߾ӵ�����", 6003 ,"�ι��ڷ��", 0, false);
		BookList[51]=new Book("���̴Ͼ�", "�� Ȧ����", "å���Բ�", "2020-09-14", 856,  "�뱸�����ø��߾ӵ�����", 6004 ,"�ι��ڷ��", 0, false);
		BookList[52]=new Book("���λ�Ȱ : Ž���", "����� T. ������", "���ż����", "2020-08-25", 592, "�뱸�����ø��߾ӵ�����", 6005 ,"�ι��ڷ��", 0, false);
		BookList[53]=new Book("���λ�Ȱ 2 (���Ƿ�)", "����� T. ������", "���ż����", "2020-08-28", 328,  "�뱸�����ø��߾ӵ�����", 6006 ,"�ι��ڷ��", 0, false);
		BookList[54]=new Book("�ٽ� ���߱� �����Ҷ�����", "���� ���׸�", "IVP", "2020-06-29", 160,  "�뱸�����ø��߾ӵ�����", 6007 ,"�ι��ڷ��", 0, false);
		BookList[55]=new Book("���� ��ȥ���� ���� ��ſ���", "���� �ð�", "�����Ǹ�����", "2020-09-07", 296,  "�뱸�����ø��߾ӵ�����", 6008 ,"�ι��ڷ��", 0, false);
		BookList[56]=new Book("Ż����", "���� ��ī�̾�", "�ε��", "2001-03-05", 286,  "�뱸�����ø��߾ӵ�����", 6009 ,"�ι��ڷ��", 0, false);
		BookList[57]=new Book("�ߵ��� ������ �� ����", "�ɳ׽� E ���ϸ�", "�������÷���", "2016-03-24", 688,  "�뱸�����ø��߾ӵ�����", 6010 ,"�ι��ڷ��", 0, false);
	}

	public static void printData(Book BookList[]) {
		for(int i=0; i<100; i++) {
			if(BookList[i]==null) {
				break;
			}
			BookList[i].showBookInfo();
		}
	}
	public static void menu() {
		System.out.println("1.���� �˻�");
		System.out.println("2.���� �˻�");
		System.out.println("3.���ǻ� �˻�");
		System.out.println("4.����ó �˻�");
		System.out.println("5.���ǳ⵵ �˻�");
	}
}