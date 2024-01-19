package kr.or.ddit.study07.sec01.pen;

public class FoutainPen {
	/*
	 * 남은양
	 * 칼라
	 * 
	 * 메소드로 리필기능 만들기.
	 */
	
	public void refill(int add) {
		setAmount(getAmount()+add);
	}

}
