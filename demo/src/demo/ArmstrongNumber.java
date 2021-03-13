package demo;

import java.util.Scanner;

public class ArmstrongNumber {
	static int count  = 0,temp = 0;
	static void digitCount(int number) {
		while(number > 0) {
			number = number / 10;
			count++;
		}
	}
	static void armstrongNumber(int number) {
		int div,temp1 = number;
		while(number > 0) {
			int sum = 1;
			   div = number % 10;
			   
//			   for(int j = 0; j < count ; j++) {
//				   sum = sum * div; 
//			   }
			   sum = (int) Math.pow(div, count);
			   temp += sum;
			   number = number / 10;
		}
		if(temp == temp1) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		digitCount(number);
		armstrongNumber(number);
	}
}
