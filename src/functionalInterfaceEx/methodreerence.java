package functionalInterfaceEx;

import java.util.List;
import java.util.function.Supplier;

public class methodreerence {
public static void main(String[] args) {
	List<String> list=List.of("Spring","Spring Boot","Microservices")	;
list.stream().map(String::toUpperCase).forEach(System.out::println);

Supplier<String> supp=String::new;
}
}
