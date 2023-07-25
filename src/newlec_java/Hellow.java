package newlec_java;

public class Hellow {

	public static void main(String[] args) {
		
		/*
		 * 작성일 : 2023년 7월 25일
		 * 작성자 : BMJ SEO
		 */
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		// 주석처리 - 성적 계산
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1 + kor2 + kor3;
		avg = total / 3;
		
		// 성적 출력
		System.out.printf("total is %d\n", /* 정수값 */ total);   //사이에 쓸 수 있다.
		System.out.printf("avg is %f\n", avg);
				
	}

}
