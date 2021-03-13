package demo;

import java.util.Scanner;

public class Insertionsort {
	public static void sort(int[] arr) {
		int size = arr.length;
		for (int i = 1; i < size; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
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
		sort(arr);
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}