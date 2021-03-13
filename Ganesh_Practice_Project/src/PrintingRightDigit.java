import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintingRightDigit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The characters or strings, it will Print The Right Most Digit");
		List<Integer> list = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt());
		List<Integer> res = list.stream()
				                .map(x -> (x % 10)).collect(Collectors.toList());
		res.forEach(s -> System.out.println(s));
}
}
