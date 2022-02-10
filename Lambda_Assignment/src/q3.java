import java.util.function.*;

public class q3 {

	public static void main(String[] args) {
		Runnable modify = () -> System.out.println("RUNNABLE");
		modify.run();

		Supplier<Double> product = () -> Math.random();
		System.out.println(product.get());

		Consumer<Integer> display = a -> System.out.println(a);
		display.accept(100);

	}
}
