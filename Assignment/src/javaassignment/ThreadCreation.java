package javaassignment;

class ThreadCreation extends Thread{
	public void run()
	{
		System.out.println(" MY Thread is running");
	}

public static void main(String args[]) {
		{
	  		ThreadCreation obj=new ThreadCreation();
	  		obj.start();
	 	}
	} 
}
