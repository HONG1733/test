package kr.or.ddit.homework.Home12;

public class Tv {
	String s;
	int i;
	double d;
	
	public Tv () {
		
	}
	
	public Tv (String s, int i, double d) {
		this.s= s;
		this.i= i;
		this.d= d;
	}

	@Override
	public String toString() {
		return "Tv [s=" + s + ", i=" + i + ", d=" + d + "]";
	}
	

}
