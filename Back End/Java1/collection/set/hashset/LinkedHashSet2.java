import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 
{
 public static void main(String[] args) 
 {
	 LinkedHashSet<Employee> l1 = new LinkedHashSet<Employee>();
		l1.add(new Employee(48, "ABC"));
		l1.add(new Employee(75, "PQR"));
		l1.add(new Employee(47, "XYZ"));
		l1.add(new Employee(47, "XYZ"));
		//l1.add(new Employee(null); // there is no null name and age
		
		
		Iterator<Employee> itr = l1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next()); //if we dont over-ride hascode and boolean we get fully qualified name
		}
		
 }
}
