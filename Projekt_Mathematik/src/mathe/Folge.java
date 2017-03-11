package mathe;

import java.math.BigInteger;

public class Folge {

	private static BigInteger n = new BigInteger("0");

	public static void zweierpotenz(int i) {
		
		n = n.add(new BigInteger("1"));
		System.out.print(0 + ".");
		System.out.println(n);
		for (int j = 1; j < i; j++) {
			n = n.add(n);
			System.out.print(j + ".");
			System.out.println(n);
		}
	};

	static BigInteger fibonacci(long k) {
		BigInteger answer = null;
		boolean negative = k < 0;
			answer = new BigInteger("0");
			System.out.println(answer);
			answer = new BigInteger("1");
			System.out.println(answer);
			System.out.println(answer);
		
			BigInteger k_minus_one = new BigInteger("1");
			BigInteger k_minus_two = new BigInteger("1");
			for (int i = 3; i <= Math.abs(k); i++) {
				answer = k_minus_one.add(k_minus_two);
				k_minus_two = k_minus_one;
				k_minus_one = answer;
				System.out.println(negative ? answer.multiply(new BigInteger("-1")) : answer);
			}
		
		return negative ? answer.multiply(new BigInteger("-1")) : answer;
	}

	public static void main(String[] args) {
		//zweierpotenz(50);
		fibonacci(50);
	}

}
