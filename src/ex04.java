
public class ex04 {

	public static void main(String[] args) {
		
		//서식문자
		//%d,%f,%c,%s를 쓰려면
		//printf
		//print + formatted
		//format:형식
		//formatted:형식이 지정된
		//printf
		//형식이 지정된 출력을 하는 함수
		//형식을 지정하는 서식문자(%d,%f,%c,%s)를 쓸수있다.
		System.out.printf("이름:%s\n","김철수");
		System.out.printf("나이:%d살\n",20);
		System.out.printf("키:%.1fcm\n",178.67);
		System.out.printf("몸무게:%.1fkg\n",67.52);
		System.out.printf("혈액형:%c형\n",'A');
		//%f 
		//%.1f - 소수점 2째자리에서 반올림해서 1째자리까지
	}
}
