import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LengthOfStringOmit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The characters or strings, it Removes * from the given Strings");
		List<String> list = Arrays.asList(sc.next(), sc.next(), sc.next());
		List<String> res = list.stream()
				                .filter(x -> x.length() <= 4)
				                .collect(Collectors.toList());
	
		res.forEach(s -> System.out.println(s));
	}
}
