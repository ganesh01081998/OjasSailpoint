package demo;

import java.util.Scanner;

public class StackExample {

	static Scanner sc = new Scanner(System.in);

	static int top = -1;

	static int size = 20;

	static int arr[] = new int[size];

	public static void main(String[] args) {

// TODO Auto-generated method stub 

		int ch;

		do {

			System.out.println("Stack Operations");

			System.out.println("1. Push\n2. Pop\n3. Display\n4. Search\n5. Exit");

			System.out.println("Enter your choice");

			ch = sc.nextInt();

			switch (ch) {

			case 1:

				push();

				break;

			case 2:

				pop();

				break;

			case 3:

				display();

				break;

			case 4:

				search();

				break;

			case 5:

				System.exit(0);

				break;

			default:
				System.out.println("Please Select a valid choice(1-5)");

			}

		} while (ch != 5);

	}

	private static void search() {

// TODO Auto-generated method stub 

		System.out.println("enter An Element for search");

		int search = sc.nextInt();

		System.out.println("top " + top);

		for (int i = top; i >= 0; i--) {

			if (arr[i] == search) {

				System.out.println("Element Found at Position " + (top - i + 1));

			}

		}

	}

	private static void display() {

// TODO Auto-generated method stub 

		if (top >= 0) {

			System.out.println("The elements in the stack are ");

			for (int i = top; i >= 0; i--)

				System.out.println(arr[i]);

		}

		else {

			System.out.println("the stack is empty");

		}

	}

	private static void pop() {

// TODO Auto-generated method stub 

		if (top <= 0) {

			System.out.println("Stack is Empty");

		} else {

			top = top - 1;

			display();

		}

	}

	private static void push() {

// TODO Auto-generated method stub 

		if (top == size - 1) {

			System.out.println("Stack is Full");

		} else {

			System.out.println("Enter an Element to add");

			int ele = sc.nextInt();

			top = top + 1;

			arr[top] = ele;

		}

	}

}