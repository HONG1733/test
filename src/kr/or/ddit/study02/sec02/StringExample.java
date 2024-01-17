package kr.or.ddit.study02.sec02;

public class StringExample {
	public static void main(String[] args) {
		/*
		 * 문자와 문자열
		 * 문자(char) : 한글자로 ''로 묶어서 선언
		 * 문자열(string) : 복수개의 글자로 구성된 자료(기본타입x)
		 * 				  "" 묶어서 선언
		 */
		
		String name2 = new String("305호");
		String name ="김선경";
		
		System.out.println(name2+","+name);
		
		/*
		 *\n : 개행 스크린 커서 위치를 다음 탭으로 옮김.
		 *\t : 수평탭 스크린 커서를 다음 탭으로 옮김.
		 *\r : 캐리지 리턴 스크린 커서의 위치를 현재줄의 처음으로 옮김.
		 *\\ : 역 슬래시 문자를 출력할때 사용.
		 *\" : 큰 따옴표를 출력할때 사용.
		 *\' : 작은 따옴표를 출력할때 사용.
		 */
		
		String nameEnter = name2+"\n"+name;
		System.out.println(nameEnter);
		
		String nameTab = name2+"\t"+name;
		System.out.println(nameTab);
		
		String nameTTa = "\""+name2+"\t"+name+"\"";
		System.out.println(nameTTa);
		
		String nameSlash = name2+"\\\t\\"+name;
		System.out.println(nameSlash);
		
		String year = 20+23+"";
		String year2 = ""+20+23; //20이 문자 
		System.out.println(year);
		System.out.println(year2);
		
	}

}
