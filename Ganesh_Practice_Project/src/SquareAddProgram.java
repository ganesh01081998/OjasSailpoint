import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SquareAddProgram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The values, it will square and prouct added to  10");
		List<Integer> list = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt());
		List<Integer> res = list.stream()
				                .map(x -> (x * x) + 10).collect(Collectors.toList());
		res.forEach(s -> System.out.println(s));
	}
}