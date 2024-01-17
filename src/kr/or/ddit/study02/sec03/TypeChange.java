package kr.or.ddit.study02.sec03;

public class TypeChange {
	public static void main(String[] args) {
		//byte<short<int<long<float<double
		
		//자동 타입 변환 
		//작은 범위 -> 큰범위
		int i = 10;
		long l = i;
		System.out.println("롱 타입입니다."+l);
		
		//강제 타입 변환
		//큰 범위 -> 작은 범위
		//type 변수명 = (type)변수명;
		long l2 = 100000; //int 범위 내에서는 L 생략가능
		int i2 = (int)l2;
		System.out.println("int 타입입니다."+i2);
		
		/*
 		 * double -> int 타입 변환 해보기 
		 */
		double d = 10.4;
		int i3 = (int)d;
		System.out.println("int 타입입니다."+i3);
		
		/*
		 * int -> double 타입 변환 해보기 
		 */
		int i4 = 100;
		double d2 = i4;
		System.out.println("double 타입입니다."+d2);
		
		/*
		 * char -> int 타입 변환 해보기 
		 */
		char ch6 = '6'; //char 타입은 작은따옴표 써줘야함
		int i5 = ch6;
		System.out.println("char->int 타입변환"+ch6+","+i5);
		
		/*
		 * int -> char 타입 변환 해보기 
		 */
		int i6 =99;
		char c2 = (char)i6;
		System.out.println("char 타입입니다."+c2);
		
		/*
		 * 소문자 a를 대문자 A로 변환
		 */
		char c8 ='a';
		System.out.println((int)'a'+","+(int)('A'));
		
		char c8_1 =(char)(c8-32); //타입이 int가 더 크기 때문에 int로 바뀜. 따라서 char 타입으로 변환 해줘야함.
		System.out.println("소문자 -> 대문자 타입 변환"+c8+","+c8_1);
		
		/*
		 * 대문자 D를 소문자 d로 변환
		 */
		char c9 ='D';
		System.out.println((int)'D'+","+(int)('d'));
		
		char c9_1 =(char)(c9+32); //int 로 인식되기때문에 char 로 변환
		System.out.println("대문자 -> 소문자 타입 변환"+c9+","+c9_1);
		
		/*
		 * int -> String 변환
		 */
		int i10 = 7;
		double d10 =7.5;
		String s10 = ""+i10+d10;//이 방법 많이 사용, ""가  뒤로 가면 숫자끼리 덧셈이 되어버림
		s10 = String.valueOf(i10)+String.valueOf(d10); //번거로움
		
		
		
	}

}
