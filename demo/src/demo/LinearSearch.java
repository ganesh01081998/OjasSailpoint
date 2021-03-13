package demo;

import java.util.Scanner;

public class LinearSearch {
	static String linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return "The element is found at index:" + " " + (i+1);
			}
		}
		return "The element is not found";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int number = sc.nextInt();
		int arr[] = new int[number];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array elements are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Enter the key value to search");
		int key = sc.nextInt();

		System.out.println(linearSearch(arr, key));
	}
}
