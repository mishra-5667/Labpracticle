package thread;
/*
 * MIN_PRIORITY
 * NORM_PRIORITY
 * MAX_PRIORITY
 * setPriority:to set the thread's priority
 * getPriority:to print the thread's Priority
 *By default Minimum priority of a thread is 1.
 *Maximum priority of a thread is 10.
 */
public class ThreadPriority extends Thread {
	 public void run()
	 {
		 System.out.println("Running thread Priority is:" + Thread.currentThread().getPriority());
	 }
	public static void main(String[] args) {
		
		ThreadPriority m1= new ThreadPriority();
		ThreadPriority m2=new ThreadPriority();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
	}
	}


