package thread;
/*
 * The method sleep() is being used to halt 
 * the working of a thread for a given amount of time.
 */
public class Sleep_Example extends Thread  {
	public void run()
	{
		//for(int i=1;i<5;i++)
		//{
			//the thread will sleep for the 500 ms
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		//	System.out.println(i);
		//}
	}
	public static void main(String[] args) {
		Sleep_Example t1=new Sleep_Example();
		//Sleep_Example t2=new Sleep_Example();
		t1.start();
		//t2.start();
		try
		{
			t1.interrupt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	}


