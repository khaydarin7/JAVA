package test;

//�������� ������ : ������ ������ ����Ұ��ΰ�?

//�������� �����ڰ� default�� test_defaultŬ����
class test_default {
	private int num;//�������

	//������:��ü�� �����ɶ� ȣ��Ǵ� ���
	//������ (constructor)
	
	//����Ʈ ������ (�Է��� ���� ������)
	public test_default() {
		num=0;
	}
	//�Է��� �ִ� ������
	public test_default(int num) {
		this.num=num;
		//this���� ���� ��ü�� �ּ�
	}
	//����޼���
	public void showNum() {
		System.out.printf("num:%d\n", num);
	}
}
