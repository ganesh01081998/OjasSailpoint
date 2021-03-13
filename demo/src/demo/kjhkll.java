package demo;

import java.util.Arrays;

public class kjhkll {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char ch[] = new char[10];
//		System.out.println("Enter characters");
//		for(char i=0; i<ch.length; i++) {
//			 ch[i] = sc.next().charAt(i);
//		}
//		for(char i=0; i<ch.length; i++) {
//			System.out.println(ch[i]);
//		}
	//	System.out.println(16 << 2);
		int arr[] = {1,7,8,4,55,99,44,11,56};
		int max = Arrays.stream(arr).min().getAsInt();
		System.out.println(max);
	}
}
