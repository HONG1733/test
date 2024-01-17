package kr.or.ddit.homework;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class HomeWork15 {
	Scanner sc = new Scanner(System.in);

	// 메서드 == 값(value)과 동작(method)를 가진 무언가
	public static void main(String[] args) {
		/*
		 * 계산기 만들기.
		 * 
		 */
		cal(12, "%", 4);
		cal(10, Oper.GOP, 5);
	}
public static double cal(int a,Oper oper, int b) {
	if (oper==Oper.PLUS) return plus(a, b);
	 else if (oper==Oper.MINUS) return minus(a, b);
	 else if (oper==Oper.GOP) return multiply(a, b);
	 else if (oper==Oper.NANUGI) return devide(a, b);
	 else if (oper==Oper.PER) return per(a, b);
	
//	 else {
//		System.out.println("잘못된 입력");
//	}
	return 0.0;
}
	
}
//		System.out.println(cal(12, "-", 5));

		HomeWork15 hw = new HomeWork15();
		
		int a = hw.plus(1,4);
		hw.plus2(2, 4);
		
//		System.out.println(a);
		
//		System.out.println(cal("12+4"));
//		System.out.println(cal("12*4"));
//		System.out.println(cal("12-4"));
		System.out.println(cal("12/4"));
		System.out.println(cal("12?4"));

	}

	public static double cal(int a, String oper, int b) {
		HomeWork15 hw = new HomeWork15();

		if (oper.equals("+")) {
			return hw.plus(a, b);
		} else if (oper.equals("-")) {
			return hw.minus(a, b);
		} else if (oper.equals("*")) {
			return hw.multiply(a, b);
		} else if (oper.equals("/")) {
			return hw.devide(a, b);
		} else {
			System.out.println("잘못된 입력");
		}
		return 0.0;
	}

	public int plus(int a, int b) {
		return a + b;
	}
	
	public void plus2(int a, int b) {
		System.out.println("동작");
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int devide(int a, int b) {
		return a / b;
	}

	// 3*4.5 숫자 2 연산자 1개
	public static double cal(String s) {

		HomeWork15 hw = new HomeWork15();

		String[] str;
		for(int i=0; i<oper.length; i++) {
			if(s.contains(oper[i])) {
				String[] nums = s.split("\\"+oper[i]);
				int a = Integer.parseInt(nums[0]);
				int b = Integer.parseInt(nums[1]);
				return cal(a, oper[i], b);
			}

		// "4+5";
		// +기준으로 쪼개야 함
		// 쪼개면 4 5 str {"4","5"}

		// String str = "이홍석A";
		// str.replace("석","A");
		// 결과 "이홍AA"
		
		if (s.contains("+")) {
			str = s.split("\\+"); // "12+4"
			// str = {"12" ,"4"}
			return hw.plus(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		} else if (s.contains("*")) {
			str = s.split("\\*"); // "12+4"
			// str = {"12" ,"4"}
			return hw.multiply(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		} else if (s.contains("-")) {
			str = s.split("-"); // "12+4"
			// str = {"12" ,"4"}
			return hw.minus(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		} else if (s.contains("/")) {
			str = s.split("/"); // "12+4"
			// str = {"12" ,"4"}
			return hw.devide(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		}
		
		else {
			return 0.0;
		}

	}

	// 3*4.5+4 연산자n 숫자 n+1개
	public static double cal2(String s) {

		return 0;

	}

}
