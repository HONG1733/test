package kr.or.ddit.study02.sec03;

import java.util.Scanner;

public class TypeChange3 {
	Scanner sc = new Scanner(System.in); //시스템 입력.데이터를 컴퓨터에 입력해줌
	public static void main(String[] args) {
		TypeChange3 obj = new TypeChange3(); //메소드 사용하는 법
//		obj.method1(); //활성화 해야 method1이 실행 된다
		obj.method2(); 
//		obj.method3(); 
	}
	public void method3() {
		System.out.println("숫자를 입력하세요.");
		String num = sc.next();
		int i = Integer.parseInt(num)+5;
		System.out.println(i);
		
	}
	
	public void method2() {
		/*
		 * 국어 영어 수학 점수 입력 받은 후 
		 * 
		 * 총점과, 평균을 구하시오  -- int로 타입변환 해야함
		 * 
		 */
		System.out.println("국어 점수 :");
		String kor = sc.next();	//콘솔창에 입력한데이터
		int i1 = Integer.valueOf(kor);
		
		System.out.println("영어 점수 :");
		String eng = sc.next();
		int i2 = Integer.valueOf(eng);
		
		System.out.println("수학 점수 :");
		String math = sc.next();
		int i3 = Integer.valueOf(math); //parseInt 로도 사용 가능
		
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		int sum = i1+i2+i3;
		double avg = (double)sum/3; // int인 sum이 double로 타입변환. 소숫점 표시되기 위함.
					//sum/3.0  -- 2번째 방법
		
		System.out.println("총점: "+sum+"\t평균: "+avg);
		
	}
	
	public void method1() {
		/*
		 * 국어 영어 수학 점수 입력 받기.
		 */
		System.out.println("국어 점수 :");
		String kor = sc.next();	//콘솔창에 입력한데이터
		
		System.out.println("영어 점수 :");
		String eng = sc.next();
		
		System.out.println("수학 점수 :");
		String math = sc.next();
		
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		
	}

}
