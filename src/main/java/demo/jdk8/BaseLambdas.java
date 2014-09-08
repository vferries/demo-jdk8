package demo.jdk8;

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
}
