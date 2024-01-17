package kr.or.ddit.study03;

public class TrinomialOperator {
	public static void main(String[] args) {
		/*
		 * 3항 연산자 : 3개의 피연산자를 필요로하는 연산.
		 * 			3항연산자는 ? 앞의 조건식의 결과에 따라 콜론 앞뒤의 피연산자가 선택조건 연산식이라고도 함
		 * 
		 *  (조건식) ? (값 또는 연산식):(값 또는 연산식)
		 *  				참			거짓
		 *  
		 */
		
//		boolean flag = true ? true : false;
//		System.out.println(flag);
		
//		int age = 20;
//		String str = age>=18?"성년":"미성년"; // 조건식이 거짓이면 뒤의 값이 출력
//		System.out.println(str);
		
		int a = 10;
		int b = 10;
		/*
		 * a 값이 짝수라면 a*b  홀수라면 a+b 4%2 짝 3%2 홀
		 */
		int result = a%2==0 ? a*b : a+b;
		System.out.println(result);
	}

}
