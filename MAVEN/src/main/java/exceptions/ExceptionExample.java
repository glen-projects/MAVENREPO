package exceptions;

public class ExceptionExample 
{
    public static void vote(int age) throws ArithmeticException
    {   
    	if(age<18)
    	{
    	  throw new ArithmeticException("Invalid");
    	}
    	else
    	{
    		System.out.println("Valid");
    	}
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			ExceptionExample.vote(15);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Below 18");
		}

	}

}

