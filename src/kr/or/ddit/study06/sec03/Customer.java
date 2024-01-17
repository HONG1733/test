package kr.or.ddit.study06.sec03;

public class Customer {
	/*
	 * 이름 국가 나이
	 */
	String nation;
	String name;
	int age;
	
	// 기본 생성자.
	public Customer() {
		
	}
	
	public Customer(String name, int age) {
		this.nation = "한국";
		this.name = name;
		this.age = age;
		
	}
	
	public Customer(String nation, String name, int age) {
		this.nation = nation;
		this.name = name;
		this.age = age;
		
	}

	@Override
	public String toString() {
		return "Customer [nation=" + nation + ", name=" + name + ", age=" + age + "]";
	}
	

}
