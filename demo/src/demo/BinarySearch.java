package demo;

import java.util.Scanner;

public class BinarySearch {
	public static boolean searchElement(int arr[], int size, int key) {
		boolean isFound = false;
		int low = 0, high = size - 1, loc = 0;
		int mid = (low + high) / 2;
		while (low <= high) {

			if (arr[mid] < key) {
				low = mid + 1;
				loc++;

			} else if (arr[mid] == key) {
				isFound = true;
				loc++;
				break;
			} else {
				high = mid - 1;
				loc++;
			}
			mid = (low + high) / 2;
		}
		if (low > high) {
			System.out.println("element not in the array");

		}

		System.out.println("element found at " + (loc + 1));
		return isFound;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter key element");
		int key = sc.nextInt();
		System.out.println(searchElement(arr, size, key));
	}

}
