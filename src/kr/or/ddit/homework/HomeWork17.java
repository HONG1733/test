package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork17 obj = new HomeWork17();
		obj.process();
	}

	public void process() {
		Calendar cal = Calendar.getInstance(); //Calendar는 싱글톤으로 이루어져있다.
		// 월 마지막 일

		while (true) {
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			
			int lastDay = cal.getActualMaximum(Calendar.DATE); // 31
			cal.set(Calendar.DATE, 1);
			System.out.println("                      " + year + "." + month);
			System.out.println("---------------------------------------------------");
			System.out.println("    <이전달                                                                          다음달>");
			System.out.println("---------------------------------------------------");
			System.out.println(" 일\t 월\t 화\t 수\t 목\t 금\t 토");
			System.out.println("---------------------------------------------------");

			// 일주일중 현재 요일
			// 일 1 월 2 화 .... 토 7
			int day = cal.get(Calendar.DAY_OF_WEEK); // 2

			for (int i = 0; i < day - 1; i++) {
				System.out.print("\t");
			}
			for (int i = 1; i <= lastDay; i++) {
				System.out.print(i + "\t");
				
				
				if ((i + day - 1) % 7 == 0)
					System.out.println();
				/*
				 * 2024.01 --------------- 이전달< >다음달 --------------- 일 월 화 수 목 금 토 1 2 3 4 5 6 7
				 * 8 9 10 ....
				 * 
				 * 31
				 */
			}
			System.out.println("이동");
			String s = sc.next();
			if (s.equals("<")) {
				cal.add(Calendar.MONTH, -1);

			}
			if (s.equals(">")) {
				cal.add(Calendar.MONTH, 1);

			}

		}
	}
}
