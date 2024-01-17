package kr.or.ddit.study06.sec06;

public class Prod {
	/*
	 * 상품 가격, 이름, 내용
	 * 
	 * getter setter 만들어서 사용 해볼것.
	 */
	private int Price;
	private String name;
	private String Content;
	
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	

}
