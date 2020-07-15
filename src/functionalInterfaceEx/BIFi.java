package functionalInterfaceEx;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BIFi {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(12,4,5,8,3,6,12);
		
		//two input one output
		BiPredicate<Integer, String> biPredicate=(num,str)->{
			return num>10 && str.length()>5;
		};
		System.out.println(biPredicate.test(15, "jlfffkjsb"));
		
		BiFunction<Integer, String,String> biFunction=(num,str) ->
		{
			return num + " " +str;
		};
		System.out.println(biFunction.apply(15, "jkjhjbu"));
	
	BiConsumer<String, String> biConsumer=(s1,s2)
->{
	System.out.println(s1);
	System.out.println(s2);
};
biConsumer.accept("hhh", "ddff");
	}
}