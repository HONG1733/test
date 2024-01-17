package kr.or.ddit.homework.Home12;

public class Grade {
	int kor;
	int eng;
	int math;
	
	public int sum() {
		return kor+eng+math;
	
  }
	public double avg() {
		return (kor+eng+math)/3.0;
	}
	
	public Grade() {
	}
	
	public Grade(int kor, int eng, int math) {
		
		this.kor =kor;
		this.eng =eng;
		this.math =math;
	}
	// △오버로딩 , 오버라이드는 머리에서 지워요

}
