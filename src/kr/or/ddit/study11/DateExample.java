package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExample {
	static boolean deb = false;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		DateExample de =new DateExample();
//		de.method1();
//		de.method2();
//		de.method3();
//		de.method4();
//		de.method5();
//		de.method6();
		de.method7();
	}
	
	private void method7() {
		Calendar cal = Calendar.getInstance();//캘린더는 싱글톤으로 이루어져있다.
		
//		cal.set(Calendar.YEAR, 2022);
//		cal.set(Calendar.MONTH, 1);
//		cal.set(Calendar.HOUR, 9);
		
		cal.add(Calendar.DATE, -100);
		
		Date d = cal.getTime();
		System.out.println(d);
		
	}
	
	private void method6() {
		/*
		 *  오늘 날짜로 부터 스캐너를 통해 입력 받은 날짜 만큼 더하기.
		 *  ex) 10 -> 2024.01.27
		 */
		
		Date d = new Date();
		System.out.println("더할 날짜를 입력 해주세요.");
		long time = 86400*1000*sc.nextLong();
		Date d2 = new Date(d.getTime()+time);
		System.out.println(d);
		System.out.println(d2);
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(d2));
	}
	
	private void method5() {
		
		
		System.out.println("날짜(ex : 2024.01.17) : ");
		String str = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
	    try {
			Date d = sdf.parse(str);
			System.out.println(d);
			
			Date cur = new Date();
			
			long time = d.getTime() - cur.getTime();
			double day = (double)time/86400/1000;
			System.out.println(day);
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	private void method4() {
		String dateStr = "2024.01.17";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		Date d;
		try {
			d = sdf.parse(dateStr);
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	private void method3() {
		/*
		 * SimpleDateFormat
		 * String -> Date
		 * Date -> String
		 * 
		 * Date 객체를 원하는 포맷으로 변경하는 클래스
		 * 
		 * 2024/01/17
		 * 2024.01.17
		 * 2024-01-17
		 * 
		 */
		//소문자 m 분을 의미
		//대문자 M 달을 의미
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String result = sdf.format(d);
		
		
		System.out.println(result);
	}
	
	private void method2() {
		/*
		 *  1970년으로 부터 얼마나 지났는지
		 *  년 일 시 분 초로 표시해 보세요. 
		 */
		
		Date d =new Date();
		System.out.println(d);
		long time = d.getTime()/1000;
		
		int min = 60;
		int hour = min*60;
		int day = hour*24;
		int year = day*365;
		
		int years = (int)(time/year);
		System.out.println(years);
		time %=year;
		
		int days = (int)(time/day);
		System.out.println(days);
		time %=day;
		
		int hours = (int)(time/hour);
		System.out.println(hours);
		time %=hour;
		
		int mins = (int)(time/min);
		System.out.println(mins);
		time %=min;
		System.out.println(time);
		
		System.out.println(years+"년"+days+"일"+hours+"시간"
		                   + mins+"분"+time+"초");
	}
	
	private void method1() {
		
		Date d1 = new Date();
		System.out.println(d1);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Date d2 = new Date();
		System.out.println(d2);
		
		long time =d2.getTime() - d1.getTime();
		//d2 와 d1의 시간 차이 단위 ms
		System.out.println(time/1000);
		
		System.out.println(d2.getTime());
		System.out.println(d1.getTime());
		
		
		
		
	}
}
