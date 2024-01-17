package kr.or.ddit.study06.sec02;

public class Student {
	/*
	 *  국어, 영어, 수학
	 *  총점, 평균, 등수
	 *  
	 *  이름
	 *  
	 */

	int math;
	int kor;
	int eng;
	
	
	int sum;
	double avg;
	
	int rank;
	
	String name;

	@Override
	public String toString() {
		return "학생 [math=" + math + ", kor=" + kor + ", eng=" + eng + ", sum=" + sum + ", avg=" + avg + ", rank="
				+ rank + ", name=" + name + "]";
	}
	
	//alt +shift +s
	
}
