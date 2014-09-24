package demo.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class BaseLambdas {
	public static void main(String[] args) {
		Runnable oldRunner = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello there !");
			}
		};
		oldRunner.run();
	}

	public void utilityClasses() {
		//Static and default methods on interfaces
		Comparator<String> comparator = Comparator.naturalOrder();
		//Many additions to standart libraries, interfaces and classes
	
		Objects.requireNonNull(comparator);
	}
	
	
	public void limitations() {
		//No variable modification
		int count = 0;
		List<String> list = Arrays.asList("a", "b", "c");
		//list.forEach(s -> count++);
		
		list.forEach(s -> {
			//throw new Exception("exception");
		});

		list.forEach(s -> {
			if ("b".equals(s)) {
				//break;	
			}
		});
		
		// Impossible to instanciate an abstract as a lambda expression, only interfaces !
		
		//java.util.function
		Function<Integer, String> function = i -> "The number to guess is " + i;
		Predicate<String> predicate = s -> true;
		Consumer<Integer> consumer = System.out::println;
		Supplier<List> supplier = ArrayList::new;
		BinaryOperator<Integer> add = (i1, i2) -> i1 + i2;
	}
}
