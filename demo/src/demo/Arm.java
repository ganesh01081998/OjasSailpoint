package demo;

import java.util.Scanner;

public class Arm {
	static int count = 0,temp = 0; 
	public static void digit(int number) {
		while(number >  0) {
			number = number / 10;
			count++;
		}
	}
	public static void arm(int number) {
		int i,temp1 = number;
		while(number > 0) {
			int sum = 1;
			i = number % 10;
			for(int j = 0; j < count; j++) {
				sum = sum * i;
			}
			temp = temp + sum;
		number = number / 10;
		}
		if(temp1 == temp) {
			System.out.println("arm");
		}else {
			System.out.println("not");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		digit(number);
		arm(number);
	}

}
