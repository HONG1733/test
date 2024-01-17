package kr.or.ddit.study02.sec01;

public class VarExample02 {
	static int a1 = 10; //a1은 사라지지 않는다. 계속 사용가능
	public static void main(String[] args) {
		int a2 = 10;
		System.out.println(a1);
		System.out.println(a2); //a2 는 이 블럭이 끝나면 사용 종료
		
		VarExample02 ve = new VarExample02();
		ve.method1();
	}
	
	public void method1() {
		int a3 =12;
		System.out.println(a1); //계속 사용중
		System.out.println(a3);
		{
			int a4 = 13;
			System.out.println(a4); //a1,a3 사용가능
		}
		int a4 =15; //새로만들어진 a4
		System.out.println(a4);
	}
}
