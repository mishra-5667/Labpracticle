package Java.ac;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> ob=new ArrayList<Integer>();//creating arraylist
		//adding object in arraylist
		ob.add(4);
		ob.add(2);
		ob.add(5);
		//System.out.println(ob);
		Iterator a=ob.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
	}



	}


