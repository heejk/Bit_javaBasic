package Ch02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 사칙 연산을 입력받아 실행해주는 프로그램을 작성하시오. 
		// 피연산자는 모두 실수이다.
		
		double result = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("식을 입력하세요: ");
		double num1 = s.nextDouble();
		String operator = s.next();
		double num2 = s.nextDouble();
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("Error");
		}	
			
		System.out.println("결과: " + result);
		
		s.close();
	}

}
