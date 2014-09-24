import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;



public class F {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> calc1 = CompletableFuture.supplyAsync(F::calculateResult1);
		System.out.println(calc1.get());
		CompletableFuture<String> calc2 = CompletableFuture.supplyAsync(F::calculateResult2);
		CompletableFuture<String> calc3 = CompletableFuture.supplyAsync(F::calculateResult1);
		CompletableFuture<Void> c = CompletableFuture.allOf(calc1, calc2, calc3);
		c.get();
		System.out.println("Finished");
	}
	
	public static String calculateResult1() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("calculateResult1");
		return "result1";
	}

	public static String calculateResult2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("calculateResult2");
		return "result1";
	}
}
