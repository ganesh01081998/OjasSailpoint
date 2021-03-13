package demo;

import java.util.Scanner;

public class QueueExample {

	static Scanner sc = new Scanner(System.in);

	static int front = 0, rear = 0;

	static int size = 20;

	static int arr[] = new int[size];

	public static void main(String[] args) {

// TODO Auto-generated method stub 

		int ch;

		do {

			System.out.println("Queue Operations");

			System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Search\n5. Exit");

			System.out.println("Enter your choice");

			ch = sc.nextInt();

			switch (ch) {

			case 1:

				insert();

				break;

			case 2:

				delete();

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

		if (front == rear) {

			System.out.println("Queue is Empty");

		} else {

			System.out.println("Enter an element to search");

			int search = sc.nextInt();

			for (int i = front; i < rear; i++) {

				if (search == arr[i]) {

					System.out.println(search + " found at position " + i);

				}

			}

		}

	}

	private static void display() {

// TODO Auto-generated method stub 

// TODO Auto-generated method stub 

		if (front == rear) {

			System.out.println("Queue is Empty");

		} else {

			for (int i = front; i < rear; i++) {

				System.out.println(arr[i]);

			}

		}

	}

	private static void delete() {

// TODO Auto-generated method stub 

		if (front == rear) {

			System.out.println("Queue is Empty");

		} else {

			front = front + 1;

			display();

		}

	}

	private static void insert() {

// TODO Auto-generated method stub 

		if (rear == size) {

			System.out.println("Queue is Full");

		} else {

			System.out.println("Enter an Element to insert");

			int ele = sc.nextInt();

			arr[rear] = ele;

			rear = rear + 1;

		}

	}

}