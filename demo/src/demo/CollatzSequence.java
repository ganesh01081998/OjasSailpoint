package demo;

import java.util.Scanner;

public class CollatzSequence {
	static String getCollatzSequence(int inputNumber) {
		String outputCollatzSequence = "";
		int count = 0;
		if (inputNumber < 0) {
			return "Error";
		} else {
			outputCollatzSequence += inputNumber + " ";
			
			while (inputNumber > 0) {

				if(count < 100 ) {
					if (inputNumber == 1) {
						break;
					} else if (inputNumber % 2 == 0) {
						inputNumber = inputNumber / 2;
						outputCollatzSequence += inputNumber + " ";
					} else {
						inputNumber = inputNumber * 3 + 1;
						outputCollatzSequence += inputNumber + " ";
					}
					count++;
				}
				else {
					return "100 tries completed";
				}
			}
		}
		return outputCollatzSequence;
	}

	public static void main(String[] args) {
		Scanner readUserInput = new Scanner(System.in);
		System.out.println("Enter a number to find CollatzSequence");
		int inputNumber = readUserInput.nextInt();
		System.out.println("The CollatzSequence is :"+" "+getCollatzSequence(inputNumber));
	}
}
