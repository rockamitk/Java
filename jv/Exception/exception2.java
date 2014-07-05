import java.io.*;
import java.lang.*;

class exception2{
	public static void main(String args[])
	{
	 
	 	int invalid=0;
	 	int number,count=0;
 		for(int i=0;i< args.length;i++)
	 	{
		 try{
	 		     number=Integer.parseInt(args[i]);
	 	    }
	 		
		    catch(ArithmeticException e){
			invalid=invalid + 1;
			System.out.println("Invalid Number :"+args[i]);
			continue;
	 	   }
	 	   count+=1;
		}
		
		  System.out.println("Valid Numbers :"+count);
		  System.out.println("Invalid Numbers:"+invalid);
	    
	 }
	 
}
