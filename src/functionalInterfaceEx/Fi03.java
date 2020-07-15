package functionalInterfaceEx;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fi03 {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(12,4,5,8,3,6,12);

		List<Integer> squareno=extracted(numbers, number -> number*number);
		List<Integer> cubeno=extracted(numbers, number -> number*number*number);
		System.out.println(squareno);
		System.out.println(cubeno);

	}

	private static List<Integer> extracted(List<Integer> numbers, Function<Integer, Integer> mapper) {
		return numbers.stream().map(mapper).collect(Collectors.toList());
	}
	}


