package thread;
/*
 * If the class extends the Thread class,
 * the thread can be run by creating an instance of the class
 * and call its start() method.
 * and overriding its run() method.
  */
public class Main extends Thread {

	public static void main(String[] args) {
			Main m=new Main();
		m.start();
		System.out.println("The thread is created with name:" +m.getName());
	}
	public void run()
	{
		System.out.println("The code is inside the thread");
	}

	}

}
