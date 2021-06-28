public abstract class Calculadora {

	private double result;
    
    public void add (double a, double b) {
   	 this.result = a + b;
   	 System.out.println("Result: " + this.result);
    }
    
    public void subtract (double a, double b) {
   	 this.result = a - b;
   	 System.out.println("Result: " + this.result);
    }
    
    public void multiply (double a, double b) {
   	 this.result = a * b;
   	 System.out.println("Result: " + this.result);
    }
    
    public void divide(double a, double b) {
   	 if (b != 0) {
   		this.result = a / b;
      	System.out.println("Result: " + this.result);
   	 } 
   	 else {
   		System.out.println("Denominator must be different from 0");
   	 }
    }
    
    public double getResult() {
   	 return this.result;
    }
    
    public void setResult(double result) {
   	 this.result = result;
    }
}

