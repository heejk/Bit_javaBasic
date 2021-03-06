package Ch05;

class Points {
	private int x, y;
	
	Points() {
		this.x = this.y = 0;
	}
	
	Points (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoints extends Points {
	private String color;
	
	ColorPoints (int x, int y, String color) {
		super (x, y);
		this.color = color;
	}
	
	void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class SuperEx {

	public static void main(String[] args) {
		ColorPoints cp = new ColorPoints(5, 6, "blue");
		cp.showColorPoint();
	}

}
