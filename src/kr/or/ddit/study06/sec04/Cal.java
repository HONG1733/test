package kr.or.ddit.study06.sec04;

public class Cal {
	public static void main(String[] args) {
		Cal cal = new Cal();
		int add = cal.add(10, 10);
		int a=10;
		int b=9;
		System.out.println(add);
		System.out.println(cal.minus(a, b));
		System.out.println(cal.div(a, b));
		System.out.println(cal.mul(a, b));
		System.out.println(cal.per(a, b));
		
	}
	public int add(int a, int b) {
		return a+b;	
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public double div(int a, int b) {
		return (double)a/b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int per(int a, int b) {
		return a%b;
	}	

}
