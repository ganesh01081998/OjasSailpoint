package demo;

public class Reverse {
	
	static int n1 = 0, n2 = 1, n3;
	public static void de(int n) {
		if(n > 0) {
			n3 = n1 + n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
			de(n - 1);
		}
	}
	
	public static void main(String[] args) {
		int n = 20;
		System.out.print(n1+" "+n2+" ");
		de(n - 2);
		
	}

}
