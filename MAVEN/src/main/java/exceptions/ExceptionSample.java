package exceptions;

public class ExceptionSample
{
   
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//int a = 10;
		//System.out.println(a/0);   //runtime exception-arithmetic exception

		try
		{
		String s = null;
		System.out.println(s.length()); // null point exception
		}
		catch(NullPointerException e)
		{
			System.out.println("String should not be null"+e);
		}
	}

}
