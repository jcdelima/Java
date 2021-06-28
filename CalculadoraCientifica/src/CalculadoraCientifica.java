public class CalculadoraCientifica extends Calculadora {

	public void exponentiation(double a, double b) {
		setResult(Math.pow(a, b));
		System.out.println("Result: " + getResult());
	}
	
	public void squareRoot(double a) {
		setResult(Math.sqrt(a));
		System.out.println("Result: " + getResult());
	}
}
