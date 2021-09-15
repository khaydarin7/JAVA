package Random_Practice;

import java.util.Random;

public class Simple_Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		//RandomŬ������ ���� ����(���� �� ����)
		int num=0;
		int lotto[]=new int[6];
		boolean isDuplicate=false;//�ߺ��� �־����� ����
		//�ߺ��� ���ٰ� �����ϰ� ����...
		for(int i=0; i<=5; i++) {
			//i�� ��ȣ�� ���� ��ģ��
			num=random.nextInt(45)+1;
			//�ֱ� ���� 0��°���� i������ Ž��
			//i��° �տ� �ߺ��� �ִ� �˻�
			for(int j=0; j<i; j++) {
				if(num==lotto[j]) {
					isDuplicate=true;//�ߺ�������
					break;
				}
			}
			//�ߺ��� ������? �׳� ������ǰ�
			//�ߺ��� �ִ�? �׷��� ������ �ٽ� �̾Ƽ� �ٽ� �˻�
			if(isDuplicate==true) {
				i=i-1;
			}else if(isDuplicate==false) {
				lotto[i]=num;
			}
			isDuplicate=false;//������� ����
		}
		for(int i=0; i<=5; i++) {
			System.out.printf("%d ", lotto[i]);
		}
	}
}
