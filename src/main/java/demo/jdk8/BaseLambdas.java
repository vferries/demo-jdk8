package demo.jdk8;

import java.util.Comparator;
import java.util.Objects;


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
	
}
