package demo;

import java.util.Scanner;

public class FizzBizz {
	static String getOutputString(int inputNumber) {
		String output = "";
		if (inputNumber < 0) {
			output = "Error";
		} else {
			
			if(inputNumber % 3 == 0 && inputNumber % 5 == 0){
				output = "FIZZBIZZ";
			}else if (inputNumber % 3 == 0) {
				output = "FIZZ";
			} else if (inputNumber % 5 == 0) {
				output = "BIZZ";
			}  
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner readUserInput = new Scanner(System.in);
		System.out.println("Enter a number");
		int inputNumber = readUserInput.nextInt();
		System.out.println(getOutputString(inputNumber));
	}
}
