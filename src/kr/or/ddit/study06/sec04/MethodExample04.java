package kr.or.ddit.study06.sec04;

public class MethodExample04 {
	public static void main(String[] args) {
		MethodExample04 me = new MethodExample04();
		me.method(3,4);
		me.method();
		me.method("테스트");
		me.method(10);
	}

	public void method() {
		System.out.println("1");
    }

	public void method(int a) {
		System.out.println("2");
    }
	
	public void method(String s) {
		System.out.println("3");
	}
	
	public void method(int a, int b) {
		System.out.println("4");
	}

	@Override
	public String toString() {
		return "MethodExample04 []";
	}

}