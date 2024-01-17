package kr.or.ddit.study02.sec02;

public class CharExample {
	public static void main(String[] args) {
		// char : 부호없는 2 byte 정수 0~65535
		
		// 작음 따옴표 사용.
		char c1 ='D';
		System.out.println("c1="+c1);
		
//		char c2 = 'a';
		char c2 = 75;
		System.out.println("c2="+c2);
		
		char c3='가';//44032번
		System.out.println("c3="+c3);
		int i3 = c3;
		System.out.println(i3);
		
	}

}
