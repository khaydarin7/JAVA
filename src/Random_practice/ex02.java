package Random_Practice;

import java.util.Random;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		//Random Ŭ����
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int num=0;
		int count=0;
		int dice[]=new int[7];//�ֻ��� �� ������ Ƚ��
		double dice_per[] = new double[7];//�ֻ��� ���� Ȯ��
		System.out.print("�ֻ��� ���?");
		count=sc.nextInt();
		//0~6 0��°�� �Ⱦ��� 1~6��°
		for(int i=1; i<=count; i++) {
			num=rand.nextInt(6)+1;//1~6
			dice[num]++;
		}
		//Ȯ�����
		for(int i=1; i<=6; i++) {
			dice_per[i]=((double)dice[i]/count)*100;
		}
		for(int i=1; i<=6; i++) {
			System.out.printf("%d�� ���� Ƚ��:%d\n",
					i,dice[i]);
		}
		System.out.printf("-----------------\n");
		for(int i=1; i<=6; i++) {
			System.out.printf("%d�� ���� Ȯ��:%.4f%%\n",
					i,dice_per[i]);
		}
		//����ǹ�Ģ, ū���ǹ�Ģ
		//�ֻ��� �� ������ ���� Ȯ�� 1/6 -> 16.6%
		//�ֻ��� ������ü 16.6%
		//6�� ������ 1,2,3,4,5,6
		//...
		//100�� ������,1000��������,10000�� ������...
		//16.6%�� ���� ������ ���� (�����Ѵ�.)
		//����� ��Ģ:�̷л��� Ȯ���� ����Ƚ���� �ø��� ���������.
		//ī���� : ���� (ī�����)
		//���Ըӽ� : �������...
		//���谰�� ī�������...
		//���࿡ �մ��� �������� �Ƿ��� ����?
		//�׷� ī���� ���ذ� �ƴѰ�?
		//������ �����ִ� ���,��������...
		//�̹� ������ �̱�Ȯ�� 55%...
		//10���ϸ� 7������...
		//10�����Ѵ�... 5��5õ��...�̱��...
		//������� ����...
		//������� ����,��ȣ���� �ؼ� ����Ȯ��...
		//0.5%... ������...
		//���� Ȯ���� �����Ҽ�����...
		//��� �׷��� �ϴٺ��� ������...�����ȴ�...
		
	}
}
