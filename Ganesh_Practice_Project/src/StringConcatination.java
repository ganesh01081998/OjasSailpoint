import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringConcatination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The characters or strings, it Concat at last * ");
		List<String> list = Arrays.asList(sc.next(), sc.next(), sc.next());
		List<String> res = list.stream()
				                .map(x -> x + "*").collect(Collectors.toList());
		res.forEach(s -> System.out.println(s));

	}

}
