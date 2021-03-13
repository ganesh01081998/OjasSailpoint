import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StartAndEndAddY {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The characters or strings, it will add Y at First and Last");
	List<String> list = Arrays.asList(sc.next(), sc.next(), sc.next());
	List<String> res = list.stream()
			                .map(x -> "y"+x+"y").collect(Collectors.toList());
	res.forEach(s -> System.out.println(s));
}
}