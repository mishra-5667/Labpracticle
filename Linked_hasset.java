//It is an ordered and sorted collection of HashSet.
//It also maintains the insertion order.
package Java.ac;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hasset {

	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet<>();
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("D");
		//Traversing elements
		Iterator<String> it=lh.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}


