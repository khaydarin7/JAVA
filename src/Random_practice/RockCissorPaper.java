package Random_Practice;

import java.util.Random;
import java.util.Scanner;

public class RockCissorPaper {
	private int record[];//��,��,�� Ƚ��
	private double winPer;//�·�
	private int count;//���� �� Ƚ��
	private Random rand;//������ü ������ ���� ��������
	private Scanner sc;//�Է��� ���� ��������
	
	public RockCissorPaper() {
		record=new int[3];
		winPer=0;
		rand = new Random();
		sc = new Scanner(System.in);
	}
	
	public int makeUserChoice() {
		System.out.print("����� �Է�\n");
		System.out.print("1.����, 2.����, 3.��, 4.�������\n");
		int choice=sc.nextInt();
		return choice;
	}
	public int makeComputerChoice() {
		int choice=rand.nextInt(3)+1;//1~3
		return choice;
	}
	
	public void choiceInfo(int userChoice,int comChoice) {
		if(userChoice==1) {
			System.out.printf("������� ����:%s\n", "����");
		}else if(userChoice==2) {
			System.out.printf("������� ����:%s\n", "����");
		}else if(userChoice==3) {
			System.out.printf("������� ����:%s\n", "��");
		}
		
		if(comChoice==1) {
			System.out.printf("��ǻ���� ����:%s\n", "����");
		}else if(comChoice==2) {
			System.out.printf("��ǻ���� ����:%s\n", "����");
		}else if(comChoice==3) {
			System.out.printf("��ǻ���� ����:%s\n", "��");
		}
	}
	
	public void gameCount(int userChoice,int comChoice) {
		choiceInfo(userChoice,comChoice);
		count++;//���� Ƚ�� ����
		if(userChoice==comChoice) {
			//����� �Է°� ��ǻ�� �Է��� ����?
			System.out.print("���\n");
			record[1]++;//��� Ƚ�� ����
		}else {
			if(userChoice==1) {//�����:����
				if(comChoice==2) {//��ǻ��:����
					System.out.print("��ǻ�� �¸�!\n");
					record[2]++;//�й� Ƚ�� ����
				}else if(comChoice==3) {//��ǻ��:��
					System.out.print("����� �¸�!\n");
					record[0]++;//�¸� ȸ�� ����
				}
			}else if(userChoice==2) {//�����:����
				if(comChoice==1) {//��ǻ��:����
					System.out.print("����� �¸�!\n");
					record[0]++;//�¸� ȸ�� ����
				}else if(comChoice==3) {//��ǻ��:��
					System.out.print("��ǻ�� �¸�!\n");
					record[2]++;//�й� Ƚ�� ����
				}
			}else if(userChoice==3) {//�����:��
				if(comChoice==1) {//��ǻ��:����
					System.out.print("��ǻ�� �¸�!\n");
					record[2]++;//�й� Ƚ�� ����
				}else if(comChoice==2) {//��ǻ��:����
					System.out.print("����� �¸�!\n");
					record[0]++;//�¸� Ƚ�� ����
				}
			}
		}
		
		winPer=((double)record[0]/count)*100;//�·� ���
	}
				//camel back:ĳ�� �� (��Ÿ��)
	public void showGameRecordInfo() {
		System.out.printf("��:%dȸ\n", record[0]);
		System.out.printf("��:%dȸ\n", record[1]);
		System.out.printf("��:%dȸ\n", record[2]);
		System.out.printf("�·�:%.1f%%\n", winPer);
	}

	public String gameContinue() {
		System.out.print("��� �Ͻðڽ��ϱ�?(Y/N)");
		String str=sc.next();
		return str;
	}
}
