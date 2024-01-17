package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	
	static boolean deb = false;
	
	public static void main(String[] args) {
		DateExample de =new DateExample();
//		de.method1();
		de.method2();
		de.method3();
		de.method4();
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
