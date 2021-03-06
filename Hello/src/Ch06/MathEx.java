package Ch06;

public class MathEx {

	public static void main(String[] args) {
		System.out.println(Math.abs(-3.14)); // 절대값
		System.out.println(Math.sqrt(9.0)); // 제곱근
		System.out.println(Math.exp(2)); // e^2
		System.out.println(Math.round(3.14)); // 반올림
		
		// 랜덤 로또 번호 
		for (int i = 0; i < 6; i++)
			System.out.print((int) (Math.random() * 45 + 1) + " ");		 
	}

}
