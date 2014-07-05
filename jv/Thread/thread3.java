import java.lang.*;
import java.lang.Thread;

class A extends Thread{
	public void run(){

		for(int i=1;i<=4;i++)
		{
			System.out.println("Thread:A ,i: "+i);
		}
		System.out.println("\tThread:A Complete");
		
		}
	}
	
class B extends Thread{
	public void run(){
		for(int j=1;j<=4;j++)
		{
			System.out.println("Thread:B ,j: "+j);
		}
		System.out.println("\tThread:B Complete\n");
		
		}
	}

class C extends Thread{
	public synchronized void run(){
		for(int k=1;k<=4;k++)
		{
			System.out.println("Thread:C ,k: "+k);
		}
		System.out.println("\tThread:C Complete\n");
		
		}
	}
	
class thread3 {
	public static void main(String args[])
	{
	A a=new A();
	B b=new B();
	C c=new C();

	c.setPriority(Thread.MAX_PRIORITY);
	b.setPriority(a.getPriority() + 2);
	a.setPriority(Thread.MIN_PRIORITY);
	
	System.out.println("Norm :"+String.valueOf(Thread.NORM_PRIORITY));
	
	System.out.println("Min :"+a.getPriority());
	
	System.out.println("Max :"+String.valueOf(Thread.MAX_PRIORITY));
	
	System.out.println("\nThread A Start");	
	a.start();
	
	System.out.println("Thread B Start");	
	b.start();

	System.out.println("Thread C Start");	
	c.start();

	System.out.println("End Of Main Thread\n");

		
	}
}
