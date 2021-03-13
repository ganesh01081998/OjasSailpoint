package demo;

import java.util.Scanner;

public class SumOfDigitsOfDecimalPoint {
	static String concateSumOfDigits(double inputNumber) {
		String sum = "";
		int temp = 0;
		String hai = String.valueOf(inputNumber);
		String arr[] = hai.split("\\.");
		
			
				sum = sum + arr[0].charAt(0)+ arr[0].charAt(1);
				
			
			
				
				temp = temp + arr[1].charAt(0) + arr[1].charAt(1);
			int sum1 = Integer.parseInt(sum);
		
		return "" + sum1 + ":" + temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a double number to find sum of decimalpoint");
		double inputNumber = sc.nextDouble();
		System.out.println(concateSumOfDigits(inputNumber));
	}
}
