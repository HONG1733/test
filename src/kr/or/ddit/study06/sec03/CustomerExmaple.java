package kr.or.ddit.study06.sec03;

public class CustomerExmaple {
	public static void main(String[] args) {
		/*
		 * Customer 클래스 3개 만들고 데이터 넣어보기
		 */
		Customer c1 = new Customer();
		c1.age = 10;
		c1.nation = "한국";
		c1.name = "이홍석";
		
		Customer c2 = new Customer("한국", "이홍석2", 30);
		System.out.println(c2);
		
		Customer c3 = new Customer("이홍석3", 25);
		System.out.println(c3);
	
	}

}
