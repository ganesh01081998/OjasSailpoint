package demo;

public class PossibleCombinations {
	public static void main(String[] args) {
		String str = "124";
		char[] input = str.toCharArray();
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				for (int z = 0; z < 3; z++) {					
						if (x != y && y != z && z != x) {
							System.out.println(input[x] + "" + input[y] + "" + input[z]);
						
					}
				}
			}
		}
	}
}
