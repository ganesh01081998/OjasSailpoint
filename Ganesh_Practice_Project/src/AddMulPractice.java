import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddMulPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The values, it add +1 and Multiply with 10");
		List<Integer> list = Arrays.asList(1,2,3);

		List<Integer> res = list.stream()
				                .map(x -> (x + 1) * 10).collect(Collectors.toList());
		res.forEach(s -> System.out.println(s));
	}

}
