package functionalInterfaceEx;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FI2 {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(12,4,5,8,3,6,12);
Predicate<Integer> predicate = x -> x % 2==0;

Function<Integer,Integer> mapper = x -> x*x;

Function<Integer,String >strmapper = x -> x + "";

Consumer<Integer> action = System.out::println;

numbers.stream().filter(predicate).map(mapper).forEach(action);

BinaryOperator<Integer> sumoperator = Integer::sum;

int sum =numbers.stream().reduce(0, sumoperator);

System.out.println(sum);
System.out.println(strmapper);
}

	 }
