package Inheritance_problem;

import java.util.Scanner;

public class Student_Main {

	public static void main(String[] args) {
		Student std[]=new Student[3];
		Scanner sc = new Scanner(System.in);
		String name="",id="",major="";
		int age=0,grade=0,point=0;
		double height=0;
		int choice=0;
		//�̸�,����,Ű,�й�,�г�,����,����
		for(int i=0; i<std.length; i++) {
			System.out.printf("%d��° �л� �����Է�\n",i+1);
			System.out.print("�̸� �Է�:");
			name=sc.next();
			System.out.print("���� �Է�:");
			age=sc.nextInt();
			System.out.print("Ű �Է�:");
			height=sc.nextDouble();
			System.out.print("�й� �Է�:");
			id=sc.next();
			System.out.print("�г� �Է�:");
			grade=sc.nextInt();
			System.out.print("���� �Է�:");
			major=sc.next();
			System.out.print("���� �Է�:");
			point=sc.nextInt();
			
			std[i]=new Student(name,age,height,id
					,grade,major,point);
		}
		
		while(true) {
			System.out.println("1.�л�������ȸ");
			System.out.println("2.�������� ���� �л� ��ȸ");
			choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
				ShowAllInfo(std);
				break;
			case 2:
				checkGraduate(std);
				break;
			}
		}
	}
	
	public static void ShowAllInfo(Student std[]) {
		for(int i=0; i<std.length; i++) {
			std[i].Introduce();
		}
	}
	public static void checkGraduate(Student std[]) {
		for(int i=0; i<std.length; i++) {
			std[i].CheckGraduate();
		}
	}
}

//���̽�,C,C++,JAVA,�ڷᱸ��,�˰���
//������,�ȵ���̵�,JSP,Spring,�����Ϸ�,��ǻ�ͱ���
//���丶Ÿ,��ġ�ؼ�,�������,���м���,���翵��
//����,ȭ��,����...
//�̰� ���� ���� �� �׾����״ϱ�
//���߿� �ϰ� ���ɰ��°�...��,��,����,��������,������ǻ��...

//���ʷ� ����Ʈ
//Ǯ����: ����Ʈ����+������+DB����
//���õ�� ���ܸ�:�丮�� ����̻� 30�����̻� �Ѵ�.

//����� ����Ʈ
//�� �鿣�� ��û ���Ѵ�.
//�˰��� ��û ���Ѵ�.
//�̿��� ����:�߽Ŀ丮�� 30���ߴ�.
//�ڹٸ� 10���ߴ�.
//C++�� 10���ߴ�.

