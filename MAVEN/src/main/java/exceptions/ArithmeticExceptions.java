package exceptions;

public class ArithmeticExceptions {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Program starting");
		try
		{
		  //int a = 10;
		  //System.out.println(a/0);
			
			String s = null;
			System.out.println(s.length()); 
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Cannot divide by zero");
		}
		
//		catch(NullPointerException ne)
//		{
//			System.out.println("Cannot be null");
//		}
//		
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("Array index out of bound");
		}
		
		catch(Exception ex)
		{
			System.out.println("Parent Exception");
		}
		finally
		{
		  System.out.println("Program ends");
		}
		System.out.println("Ending");

	}
}
