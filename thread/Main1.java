package thread;
/*If the class implements the Runnable interface
 * the thread can be run by passing an instance of the
 * class to a Thread object's constructor and then calling the thread's 
 * start() method. 
  */
public class Main1 implements Runnable {

	public static void main(String[] args) {
		Main m=new Main();
		Thread t=new Thread(m,"anju");
		t.start();
		System.out.println("The name of the thread:"+t.getName());
	}
	@Override
	public void run()
	{
	}

	}


