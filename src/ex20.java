
public class ex20 {

	public static void main(String[] args) {
		//���α׷� ���� �ʱ����������� �Ӽ����� ����
		//������ر��� �ǰ�
		//�״����� �� �Ƿ��� �ø�����...������Ʈ�غ���...����....����...
		//������,���ۺ�����...�ڸ�������...
		
		//���ڰ���,������ ����X
		//���� ���ؾߵǴ°� ����
		//�뺣�̽�...X
		
		//�ڵ��� ��ƴ�...
		//���뿡�� �׳��� �� �����ϰ� �ڵ�...
		//6����...�ʱ�...
		//1��,2��...������...
		
		//��Ʈ ������...
		//��Ʈ ���� �����ϴ� ������...
		//&, | , ^, ~, <<, >>
		// & - ��Ʈ AND
		// | - ��Ʈ OR
		// ^ - ��Ʈ XOR
		// ~ - ��Ʈ ����
		// << - ��Ʈ �����̵�
		// >> - ��Ʈ �������̵�
		
		//2����...
		//��ǻ�Ͱ� ���� ���� ü�� 2����
		
		//10����...
		//����� ���� ���� ü�� 10����
		
		//1234
		//õ�̹��ʻ�
		//1X1000
		//2X100
		//3X10
		//4X1
		//1000+200+30+4
		//�������� �������� ������...
		//10�� �������ϱ�...
		
		//�������� ������ 10�� ��������...
		//�ڸ��� �����ִ� ���� 0~9
		
		//1001
		//1X8
		//0X4
		//0X2
		//1X1
		//9
		//2������ ������ 2�� ��������...
		//�ڸ��� �����ִ� ���� 0~1
		
		//10���� 2����
		//0     0
		//1     1   - 1X1
		//2     10  - 1X2 
		//3     11  - 1X2 + 1X1
		//4     100 - 1X4
		//5     101 - 1X4 + 1X1
		//6     110
		//7     111
		//8     1000
		//9     1001
		//10    1010
		//11    1011
		//12    1100 = 1011+1 = 1012 = 1020 = 1100
		//13    1101
		//...
		
		int num1=5;
		//int�� 4����Ʈ ���� (32��Ʈ ����)
		//00000000 00000000 00000000 00000101
		//���� 5�� ��ü
		
		int num2=3;
		//00000000 00000000 00000000 00000011
		
		int result = num1&num2;
		//num1�� num2�� ��Ʈ�� AND�Ѵ�.
		//00000000 00000000 00000000 00000101
		//00000000 00000000 00000000 00000011 &
		//00000000 00000000 00000000 00000001 ���
		System.out.printf("��Ʈ and���:%d\n",result);//1
		
		
		result = num1 | num2;
		//num1�� num2�� ��Ʈ�� OR�Ѵ�.
		//00000000 00000000 00000000 00000101
		//00000000 00000000 00000000 00000011 |
		//00000000 00000000 00000000 00000111 ���
		System.out.printf("��Ʈ or���:%d\n",result);//7
		
		result = num1 ^ num2;
		//num1�� num2�� ��Ʈ�� XOR�Ѵ�.
		//xor : exclusive or : ��Ÿ���� or
		//include <-> exclude
		//�����ϴ� <-> �����ϴ�
		//exclusive : ��Ÿ����
		//
		//���� �ٸ��� 1�̴�.
		//��Ʈ xor�� ����ǥ
		
		//��Ʈ xor
		// 0 ^ 0 -> 0
		// 0 ^ 1 -> 1
		// 1 ^ 0 -> 1 
		// 1 ^ 1 -> 0
		//�Է��� �ٸ����� ����� 1�̴�.
		//��Ÿ���� or
		
		//��Ʈ or
		// 0 | 0 -> 0
		// 0 | 1 -> 1
		// 1 | 0 -> 1 
		// 1 | 1 -> 1
		
		result = num1 ^ num2;
		//num1�� num2�� ��Ʈ�� xor�Ѵ�.
		//00000000 00000000 00000000 00000101
		//00000000 00000000 00000000 00000011 ^
		//00000000 00000000 00000000 00000110 ���
		//6
		System.out.printf("��Ʈ or���:%d\n",result);//6
		
		//��Ʈ �����ڴ� ���� �׷��� �߿��Ѱ� �ƴϰ�...
		//��Ʈ��ũ ���� ���α׷��̸�...�̰� �� ����...
		
		//������ �߿��Ѱ�
		//����,��Ģ
		//����,����
		
	}
}