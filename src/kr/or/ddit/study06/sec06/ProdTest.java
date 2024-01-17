package kr.or.ddit.study06.sec06;

public class ProdTest {
	public static void main(String[] args) {
		Prod p1 = new Prod();
		p1.setPrice(10000);
		p1.setName("피자");
		p1.setContent("냉동 피자");
		
		System.out.println(p1.getName()+","+p1.getContent()+","+p1.getPrice());
	}

}
