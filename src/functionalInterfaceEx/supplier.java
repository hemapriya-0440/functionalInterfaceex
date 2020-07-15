package functionalInterfaceEx;

import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class supplier {
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
//supplier :No input -> return something

Supplier<Integer> random=()-> {
	Random rnf=new Random();
	return rnf.nextInt(1000);

};
System.out.println(random.get());

//Unary operator

UnaryOperator<Integer> operator=(x) -> 3*x; 
System.out.println(operator.apply(10));

}

	 }
