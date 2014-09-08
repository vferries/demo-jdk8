package demo.jdk8;

public class BaseLambdas {
	public static void main(String[] args) {
		Runnable oldRunner = new Runnable() {
			public void run() {
				System.out.println("Hello there !");
			}
		};
		oldRunner.run();
	}
	
	public static void mainJava8(String[] args) {
		Runnable oldRunner = () -> System.out.println("Hello there !");
		oldRunner.run();
	}
}
