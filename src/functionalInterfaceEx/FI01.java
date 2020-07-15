package functionalInterfaceEx;

import java.util.List;
import java.util.function.Predicate;

public class FI01 {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(12,4,5,8,3,6,12);
		
		
		
extracted(numbers,  x -> x%2 ==0);

extracted(numbers,  x -> x%2 !=0);

}

	private static void extracted(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

	 }
