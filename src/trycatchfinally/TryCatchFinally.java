package trycatchfinally;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		
		
		try
		{
			arr[4]=100; //ArrayIndexOutOfBoundsException
		}
         catch(ArrayIndexOutOfBoundsException e)
		{
	System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("this is finally block");
		}
		
		}
	}


