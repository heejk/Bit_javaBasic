package Ch02;

public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14; // 변경 불가
		double radius =10.2;
		double circleArea = radius * radius * PI;
		
		System.out.println("반지름: " + radius + ",");
		System.out.println("원의 면적: " + circleArea);
	}

}