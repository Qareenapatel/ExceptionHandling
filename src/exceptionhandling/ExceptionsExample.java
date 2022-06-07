package exceptionhandling;

public class ExceptionsExample {

	public static void main(String[] args) {
		
		System.out.println("started");
		//Thread.sleep(4000); //InterruptedException (CheckedException)
		
		
		int i=10;
		System.out.println(i/0); //ArithmeticException (Un-checkedExceptio)
		System.out.println("stopped");

	}

}
