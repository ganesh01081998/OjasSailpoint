package demo;

import java.util.Scanner;

public class SumOfDigits {
	public static String concate(double st) {
		String str = String.valueOf(st);
		String res = " ";
		int sum1 = 0, sum2 = 0;
		String s1[] = str.split("\\.");

		String a = s1[0];
		for (int j = 0; j < a.length(); j++) {
			char ab = a.charAt(j);
			String A = String.valueOf(ab);
			int B = Integer.parseInt(A);
			sum1 = sum1 +B;

		}

		String b = s1[1];
		for (int k = 0; k < b.length(); k++) {
			sum2 = sum2 + Character.getNumericValue(b.charAt(k));
		}

		res = sum1 + ":" + sum2;
		return res;

	}

	public static void main(String[] args) {
		System.out.println("Enter the double value");
		Scanner sc = new Scanner(System.in);
		double str1 = sc.nextDouble();
		System.out.println(concate(str1));

	}

}