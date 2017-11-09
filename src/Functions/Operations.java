package Functions;

import java.util.function.BiFunction;

public class Operations{
	
	BiFunction<Double, Double, Double> addFunction = (numb1, numb2) -> numb1 + numb2;
	BiFunction<Double,Double,Double> multFunction = (numb1, numb2) -> numb1 * numb2;
	BiFunction<Double,Double,Double> subFunction = (numb1, numb2) -> numb1 - numb2;
	BiFunction<Double,Double,Double> divFunction = (numb1, numb2) -> numb1 / numb2; 

	public static void main(String args[]) {
		Operations operate = new Operations();
		operate.run();
	}
	
	public void run() {
		System.out.println(Operate(multFunction, 6, 2));
		System.out.println(this.Operate(addFunction, 5, 2));
		System.out.println(Operate(subFunction,10,5));
		System.out.println(Operate(divFunction,100,2));
		
		
		
	}// gud luk
	
	
	
	public double Operate(BiFunction<Double, Double, Double > operation, double numb1, double numb2) {
		return operation.apply(numb1, numb2);
	}

}



