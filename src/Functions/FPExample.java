package Functions;

import java.util.function.BiFunction;

/**
 * I'll give you mine for now, look at it when you're done
 * or for reference if you get stuck.
 * @author aya
 *
 */

public class FPExample<T> {
	public T operate(final BiFunction<T, T, T> operator, 
			final T firstArg, 
			final T secondArg) {
		return operator.apply(firstArg, secondArg);
	}
	
	public void rangedTest(final BiFunction<T, T, T> operator,
			final T begin,
			final T end) {
		
	}

	public static void main(String[] args) {
		final FPExample<Double> fpExample = new FPExample<>();
		
		// operators
		final BiFunction<Double, Double, Double> 
			ADDITION = (x, y) -> x + y,
			SUBTRACTION = (x, y) -> x - y,
			MULTIPLICATION = (x, y) -> x * y,
			DIVISION = (x, y) -> x / y;
			
		// tests
		final double BEGIN = 20;
		final double END = 40;
		
		for (double i = BEGIN; i < END; ++i) {
			for (double j = BEGIN; j < END; ++j) {
				final double plusResult = fpExample.operate(ADDITION,  i,  j);
				System.out.println(i + " + " + j + " = " + plusResult);
				
				final double subtractResult = fpExample.operate(SUBTRACTION, i, j);
				System.out.println(i + " - " + j + " = " + subtractResult);
				
				final double multiplyResult = fpExample.operate(MULTIPLICATION, i, j);
				System.out.println(i + " * " + j + " = " + multiplyResult);
				
				final double divideResult = fpExample.operate(DIVISION, i, j);
				System.out.println(i + " / " + j + " = " + divideResult);
				
				System.out.println("--------------------");
			}
		}
	}
}
