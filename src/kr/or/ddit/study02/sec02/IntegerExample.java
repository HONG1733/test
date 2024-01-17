package kr.or.ddit.study02.sec02;

public class IntegerExample {
	public static void main(String[] args) {
		/*
		 * 정수형
		 * 1. byte  : 1byte(-128~127)
		 * 2. short : 2byte(-32768~32767)
		 * 3. int   : 4byte(-2^31~2^31-1) 정수타입 기본형
		 * 4. long  : 8byte(-2^63~2^63-1)
		 */
		byte b1 = 127;
		System.out.println("b1=" +b1);
		
		//byte b2 = 128; 용량 초과
		short s1 = 128;
		System.out.println("s1="+s1);
		
		short s2 = (short)(s1+10);//int로 인식 되기 때문에 타입변환 해줘야함
		
		int i1 = 100;
		int i2 = i1+10;
		
		long l1 =1000;
		long l2 =1000000000000000L;//int로 인식 되기 때문에 L
		long l3 =i1+10;
		
		
	}

}
