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
		//이름,나이,키,학번,학년,전공,학점
		for(int i=0; i<std.length; i++) {
			System.out.printf("%d번째 학생 정보입력\n",i+1);
			System.out.print("이름 입력:");
			name=sc.next();
			System.out.print("나이 입력:");
			age=sc.nextInt();
			System.out.print("키 입력:");
			height=sc.nextDouble();
			System.out.print("학번 입력:");
			id=sc.next();
			System.out.print("학년 입력:");
			grade=sc.nextInt();
			System.out.print("전공 입력:");
			major=sc.next();
			System.out.print("학점 입력:");
			point=sc.nextInt();
			
			std[i]=new Student(name,age,height,id
					,grade,major,point);
		}
		
		while(true) {
			System.out.println("1.학생정보조회");
			System.out.println("2.졸업조건 충족 학생 조회");
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

//파이썬,C,C++,JAVA,자료구조,알고리즘
//리눅스,안드로이드,JSP,Spring,컴파일러,컴퓨터구조
//오토마타,수치해석,선형대수,공학수학,교양영어
//물리,화학,생물...
//이것 저것 바탕 다 쌓아줄테니까
//나중에 니가 관심가는거...웹,앱,게임,가상현실,비전컴퓨팅...

//제너럴 리스트
//풀스택: 프론트조금+백조금+DB조금
//김밥천국 아줌마:요리를 평균이상 30가지이상 한다.

//스페셜 리스트
//웹 백엔드 엄청 잘한다.
//알고리즘 엄청 잘한다.
//이연복 쉐프:중식요리만 30년했다.
//자바만 10년했다.
//C++만 10년했다.

