package demo;

import java.util.Scanner;

public class BubbleSort {
	public static void bubble(int[] arr, int size) {
		int temp = 0;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < (size - 1 - i); j++) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
	}

	public static void main(String args[]) {
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		bubble(arr, size);
		System.out.println("After sorting the elements");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");

		}
		sc.close();
	}

}
