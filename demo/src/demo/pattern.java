package demo;

public class pattern {

	public static void main(String[] args) {
		int c = 0;
		for (int i = 1; i < 5; i++) {
			for (int x = 1; x <= i; x++) {
				if (i > 2 && x != 1 && x != i) {
					System.out.print(c);
				} else {
					System.out.print("1");
				}
			}
			c++;
			System.out.println();
		}
	}
}