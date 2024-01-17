package kr.or.ddit.study11;

import java.io.File;

public class StringLang {
	public static void main(String[] args) {
		StringLang s1 = new StringLang();
//		s1.method1();
//		s1.method2();
//		s1.method3();
//		s1.method4();
//		s1.method5();
//		s1.method6();
//		s1.method7();
		s1.method8();
	}
	
	public void method8() {
		String test ="스플릿 테스트, test1, test2, test3, test4";
		System.out.println(test);
		String tokens[] = test.split(",");
		for(String s : tokens) {
			System.out.println(s.trim());
		}
	}
	
	public void method7() {
		String str = null;
		if(str == null || str.isEmpty()) {
			System.out.println("해당 문자열은 비어있습니다.");
		}
	}

	
	public void method6() {
		String test = "가나다라마 phone";
		
		test = test.replace("원본 문자열", "바뀔 문자열");
		test = test.replace("phone","핸드폰");
		System.out.println(test);
		
		// 정규식을 통해 바꿈.
//		test.replaceAll(regex, replacement)
	}

	
	public void method5() {
		String test ="문자 테스트           \n  \r";
		System.out.println(test);
		System.out.println("---------");
		test = test.trim();
		System.out.println(test);
		System.out.println("---------");
	}

	
	public void method4() {
		String test = "소문자 aBcD";
		
		System.out.println(test);
		test = test.toUpperCase();
		if(test.contains("ABCD")) {
			System.out.println("포함");
		}
		System.out.println(test);
		
		System.out.println("----------------");
		test ="대문자 ABCD";
		System.out.println(test);
		test = test.toLowerCase();
		System.out.println(test);
	}
	
	public void method3() {
		String test ="문자열 text 입니다.";

		String start = "문자열";
		if(test.startsWith(start)) {
			System.out.println(start+"로 시작합니다.");
		}
		String end = "입니다.";
		if(test.endsWith(end)) {
			System.out.println(end+"로 끝납니다.");
		}
		
		//2024년으로 시작하는 엑셀파일 개수를 구하시오.
		
		int cnt =0;
		File dir =new File("원하는 폴더 경로");
		//디렉토리(폴더)에 있는 몯느 파일 이름을 가져온다.
		for(String s : dir.list()) {
			if(!s.startsWith("2024")) continue;
			if(s.endsWith(".xls") || s.endsWith(".xlsx")) {
				cnt++;
			}
		}
		
	}
	
	public void method2() {
		String test = "문자열 test 입니다.";
		String search = "test";
	
		if(test.contains(search)) {
			System.out.println(search+ "값이 포함되어 있습니다.");
			
			search = test;
			if(test.equals(search)) {
				System.out.println(search+": 값이 동일 합니다.");
			}
		}
	}
	
	public void method1() {
		String test = "문자열 test입니다. ";
		
		for(int i=0; i<test.length(); i++) {
			System.out.println(test.charAt(i));
		}
		for(char c : test.toCharArray()) {
			System.out.println(c);
		}
	}

}
