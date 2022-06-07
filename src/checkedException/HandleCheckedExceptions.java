package checkedException;

public class HandleCheckedExceptions {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("program is started");
		System.out.println("program is in progress");
		
		/*try
		{
		Thread.sleep(4000);// checked Exception
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}*/
		
		
		Thread.sleep(4000);// checked Exception
		
			
		System.out.println("program is completed");
		System.out.println("program is exited");
		
	}

}
