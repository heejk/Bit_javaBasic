package Ch06;

class Point {
	int x, y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	
	public boolean equals (Point p) { // Point 객체와 p 객체가 같은지 비교 
		if ( x == p.x && y == p.y)
			return true;
		else 
			return false;
	}
}

public class Ex {

	public static void main(String[] args) {
		// ToStringEx
		Point a = new Point(2, 3);
		System.out.println(a.toString());
		System.out.println(a); // a.toString() 으로 자동 변환 
		
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		// EqualsEx
		if (a == b)
			System.out.println("a == b");
		if (a.equals(b))
			System.out.println("a is equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");
	}

}
