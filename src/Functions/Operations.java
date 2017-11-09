package Functions;


public class Operations implements Arithmetic{

	public static void main(String args[]) {
		Operations operate = new Operations();
		operate.run();
	}
	
	public void run() {
		
	}
	
	Arithmetic addFunction = (double numb1, double numb2) -> numb1 + numb2;
	Arithmetic multFunction = (double numb1, double numb2) -> numb1 * numb2;
	Arithmetic subFunction = (double numb1, double numb2) -> numb1 - numb2;
	Arithmetic divFunction = (double numb1, double numb2) -> numb1 / numb2;
	
	public double operate(Arithmetic function, double numb1, double numb2){
		return function(numb1, numb2);
	}
	
	
	
	@Override
	public double operate(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	
}



