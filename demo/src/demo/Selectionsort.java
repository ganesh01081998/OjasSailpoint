package demo;

import java.util.Scanner;

public class Selectionsort {

	public static void sort(int[] arr, int size) {
		for (int i = 0; i < size - 1; i++) {
			int index = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int small = arr[index];
			arr[index] = arr[i];
			arr[i] = small;
		}
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
		sort(arr, size);
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
