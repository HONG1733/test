package kr.or.ddit.study06.sec02;

public class BookExample {
	public static void main(String[] args) {
		// 책 클래스 2개 만들고 각각 데이터 입력 및 출력 해보기.
		Book b1 = new Book();
		b1.name = "만화로 배우는 멸종과 진화";
		b1.writer = "김도윤";
		b1.date = "2024.01.01";
		b1.content = "재미와 지식의 완벽한 균형!";
		System.out.println(b1);
	}

}
