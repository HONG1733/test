package kr.or.ddit.homework;

public class HomeWork11 {
	public static void main(String[] args) {
		/*
		 * 생성자를 통해 x, y, 높이, 너비를 입력 받고
		 * area 값은 자동으로 계산 하도록 하자.
		 * area 넓이 값은 높이*너비
		 */
		Rectangle r1 = new Rectangle(10, 10, 10, 10);
		System.out.println(r1);
		
		/*
		 * 2. 생성자를 통해 Point, 높이, 너비를 입력 받고
		 *    point 클래스에서 꺼낸 x, y 값을 통해
		 *    1번 문제에 생성자를 호출 해보도록 하자.
		 */
		point p1 = new point(10, 10);
		Rectangle r2 = new Rectangle(p1,10,10);
		System.out.println(r2);
		/*
		 * 1, 2번 결과 출력.
		 */
		
	}

}
class Rectangle{
	int area;
	int x;
	int y;
	int height;
	int width;
	
	
	@Override
	public String toString() {
		return "Rectangle [area=" + area + ", x=" + x + ", y=" + y + ", height=" + height + ", width=" + width + "]";
	}


	public Rectangle  (int x2, int y2, int height2, int width2){
		this.x =x2;
		this.y =y2;
		this.height =height2;
		this.width =width2;
	    this.area = (height2*width2);
	
	}
	public Rectangle (point p, int x3, int y3){
		this(p.x, p.y ,10, 10);
	}
}

class point{
	int x;
	int y;
	point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
