class exception1{
	public static void main(String args[])
	{
	 
	 	int b=5;
	 	int a[]={3,10};
	
	 	try{
	 		int x=a[2] / b-a[1];
	 		System.out.println("x ="+x);
	 		
	 	    }
	 	   catch(ArithmeticException e){
	 	   System.out.println("Division by Zero");
	 	   }
	    
	    	catch(ArrayIndexOutOfBoundsException e)
	    	{
	    	System.out.println("Array Indexes error");
	    	}	
	    	catch(ArrayStoreException e)
	    	{
	    	System.out.println("Wrong Data Type");
	    	}	
	 int y=a[1] / a[0];
	 System.out.println("Y ="+y);
	 }
	 
}
