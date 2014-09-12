package demo.solution;


public class BaseLambdas {
	public static void main(String[] args) {
		Runnable oldRunner = () -> System.out.println("Hello there !");
		oldRunner.run();
	}
}
