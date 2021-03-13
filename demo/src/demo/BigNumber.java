
package demo;

public class BigNumber {
	static String out = "";
	static void firstBiggestNumber(int arr[]) {
		 
		for(int i = 0; i < arr.length; i++) {
			String str = String.valueOf(arr[i]);
			char str1 = str.charAt(1);
			for(int j=0; j<str.length();j++) {
				if(str.charAt(j) > str1) {
					str1  = str.charAt(j);
				}
			}
			out += str1;
		}
		System.out.println(out);
	}
	static void sort() {
		char temp=' ';
		char str1 = out.charAt(0);
		for(int i = 0; i < out.length(); i++) {
			if(out.charAt(i) < str1) {
				temp = out.charAt(i);
			}
			
		}
		System.out.println(temp);
	}
	static void secondBiggestNumber() {
		char str1 = out.charAt(0);
		for(int i=0; i< out.length(); i++) {
			if(out.charAt(i) > str1) {
				str1 = out.charAt(i);
			}
		}
		System.out.println(str1);
	}
	public static void main(String[] args) {
		int arr[] = {644,464,788,797,131,77,888,55};
		firstBiggestNumber(arr);
	    secondBiggestNumber();
		sort();
	}
}
