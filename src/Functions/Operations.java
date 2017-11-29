package Functions;



import java.util.Collection;
import java.util.HashSet;
import java.util.function.BiFunction;
import java.util.function.Function;


public class Operations<T> {
	
	BiFunction<Double, Double, Double> addFunction = (x, y) -> x + y;
	BiFunction<Double, Double, Double> multFunction = (x, y) -> x * y;
	BiFunction<Double, Double, Double> subFunction = (x, y) -> x - y;
	BiFunction<Double, Double, Double> divFunction = (x, y) -> x / y; 
	
	public static void main(String args[]) {
		
		Operations<Integer> operations = new Operations<Integer>();
		Collection<Integer>collection = new HashSet<Integer>();
		
		for(int i = 0; i<= 10; i ++) {
			collection.add(i);
		}
		
		operations.run();
		System.out.println(operations.map((x)-> x*2, collection));
	}
	
	public void run() {
		System.out.println(operate(multFunction, 6, 2));
		System.out.println(operate(addFunction, 5, 2));
		System.out.println(operate(subFunction,10,5));
		System.out.println(operate(divFunction,100,2));
	
	}
	
	public Collection<T> map(Function<T,T> Operate, Collection<T> collection) {
		Collection<T> clone = new HashSet<T>();
		for(T x : collection) {
			clone.add(
					Operate.apply(x));
		}	
		return clone;	
	
	}
	
	
	public double operate(BiFunction<Double, Double, Double > operation,  double x, double  y) {
		return (double) operation.apply(x, y);
	}

}