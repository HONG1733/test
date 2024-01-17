package kr.or.ddit.study02.sec03;

public class TypeChange2 {
	public static void main(String[] args) {
		String s1 = "10"; //String 은 기본타입이 아님 클래스임.
		int i = Integer.valueOf(s1); //그래서 변환해줄때 WrapperClass 선언해줘야함
		
		/*
		 * 기본 -> WrapperClass
		 * 
		 * byte ->Byte
		 * short -> Short
		 * int -> Integer**
		 * long -> Long
		 * 
		 * 
		 * float -> Float
		 * double -> Double
		 * 
		 * boolean -> Boolean
		 * 
		 */
		
		int i1 = Integer.valueOf(s1)+1; //2가지 방법이 있음
		int i2 = Integer.parseInt(s1)+2;
		System.out.println(i1+","+i2);//문자열에서 숫자로 바뀌었기 때문에 연산이 되어 출력
		
		//String -> byte
		String s2 ="10";
		byte b2 = Byte.parseByte(s2);
		System.out.println("String -> byte :"+s2+","+b2);
		
		//String -> Short
		String s3 ="10";
		short sh3 = Short.parseShort(s3);
		System.out.println("String -> short :"+s3+","+sh3);
		
		//String -> long
		String s4 ="10"; //long(정수형) 타입은 실수형이 아니기때문에 10.1  이런식으로 값이 들어가면 에러남
		long l4 = Long.parseLong(s4);
		System.out.println("String -> long :"+s4+","+l4);
		
		//String -> float
		String s5 ="10.5";
		float f5 = Float.parseFloat(s5);
		System.out.println("String -> float :"+s5+","+f5);
		
		//String -> double
		String s6 ="10"; // double은 정수를 포함
		double d6 = Double.parseDouble(s6);
		System.out.println("String -> double :"+s6+","+d6);
		
	}

}
