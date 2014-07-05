import java.lang.Exception;

class MyException extends Exception
{
	MyException(String message)
	{
	super(String.valueOf(Integer.parseInt(message)*Integer.parseInt(message)));
	}
}

class exception3
{
	public static void main(String args[])
	{
	 int x=5,y=1000;
 	try
 	{
 		float z=(float) x / (float) y;
 		if(z < 0.01)
 		{
 			throw new MyException("15");
		}
	}
	 catch(MyException e)
	 {
	   System.out.println("Caught MyException: "+e);
	   System.out.println(e.getMessage());
	  }
	    
    	finally
    	{
    	System.out.println("Finaly Block");
    	}	
	}
	 
}
