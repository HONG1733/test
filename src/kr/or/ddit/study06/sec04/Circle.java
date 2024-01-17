package kr.or.ddit.study06.sec04;

public class Circle {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("원의 넓이 : "+c.getArea(10));
		System.out.println("원의 둘레 : "+c.circumference(10));
	}
	
	// 넓이 구하는 메소드.
	// 파라미터 r
	// 넓이는 3.14* r*r
	
	public double getArea(int r) {
		return 3.14*r*r;
	}
	
	public double getArea(double r) {
		return 3.14*r*r;
	}
	
	// 길이 구하는 메소드
	// 파라미터 r
	// 길이 3.14*2*r
	
	public double circumference(int r) {
		return 3.14*2*r;
	}
	
	public double circumference(double r) {
		return 3.14*2*r;
	}

}
