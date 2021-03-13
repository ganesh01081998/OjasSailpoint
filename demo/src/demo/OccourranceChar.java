package demo;

import java.util.Scanner;

public class OccourranceChar {
	static void characterCount(String inputString) {
		int count;
		for(int start = 0; start < inputString.length(); start++) {
		  count=0;
			for(int end = 0; end < inputString.length(); end++) {
				if(inputString.charAt(start) == inputString.charAt(end)) {
					count++;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString = sc.next();
		characterCount(inputString);
	}
}
