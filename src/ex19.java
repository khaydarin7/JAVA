
public class ex19 {

	public static void main(String[] args) {
		
		int num=10;
		
		int result = (num--)+5;
		//num-- : �İ���,���߰���,��������
		//�İ��� (�达)
		//������ �İ��� (��ö����)
		//���ϱ� ���� �����ϰ� ����(--)���߿� �Ѵ�.
		//9�� �Ǳ����� 10�϶� 5�� ���ؼ� 15�� �ǰ�
		//�״����� 9���ȴ�.
		
		System.out.printf("num:%d\n",num);//9
		System.out.printf("result:%d\n",result);//15
		
		//++num : ������ �Ŀ���
		//num++ : ������ ������
		//--num : ������ �Ŀ���
		//num-- : ������ �İ���
	}
}
