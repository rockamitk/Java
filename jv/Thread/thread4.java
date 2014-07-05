class A implements Runnable{
	public void run(){

		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A : "+i);
		}
		System.out.println("\tThread A Close");
		
		}
	}
	
class B implements Runnable{
	public void run(){

		for(int j=1;j<=10;j++)
		{
			System.out.println("Thread B : "+j);
		}
		System.out.println("\tThread B Close");
		
		}
	}
class thread4 {
	public static void main(String args[])
	{
	A a=new A();
	B b=new B();
	Thread threadA=new Thread(a);
	Thread threadB=new Thread(b);
	threadA.start();
	threadB.start();
	System.out.println("\tMain Thread  Close");
	
	}
}
