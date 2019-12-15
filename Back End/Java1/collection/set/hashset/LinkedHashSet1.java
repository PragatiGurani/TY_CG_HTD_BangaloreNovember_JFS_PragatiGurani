import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1
{
 public static void main(String[] args)
 {
	LinkedHashSet l1 = new LinkedHashSet();
	l1.add(12);
	l1.add(22);
	l1.add(62);
	l1.add(12);
	l1.add(null);
	l1.add(null);
	
	Iterator itr = l1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	System.out.println("*****************************************");
	
	LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
	l2.add(12);
	l2.add(32);
	l2.add(86);
	l2.add(32);
	l2.add(null);
	l2.add(null);
	
	Iterator<Integer> itr1 = l2.iterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
 }
}
