import java.lang.Thread;

class A extends Thread{
	public synchronized void run(){

		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread:A ,i: "+i);
		}
		System.out.println("\tThread:A Complete");
		
		}
	}
	
class B extends Thread{
	public synchronized void run(){
		for(int j=1;j<=5;j++)
		{
			System.out.println("Thread:B ,j: "+j);
		}
		System.out.println("\tThread:B Complete\n");
		
		}
	}

class C extends Thread{
	public void run(){
		for(int k=1;k<=5;k++)
		{
			System.out.println("Thread:C ,k: "+k);
		}
		System.out.println("\tThread:C Complete\n");
		
		}
	}
	
class thread1 {
	public static void main(String args[])
	{
	new A().start();
	new B().start();
	new C().start();
	
	}
}
