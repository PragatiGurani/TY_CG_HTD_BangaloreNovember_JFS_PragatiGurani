import java.util.HashSet;

public class HashSet4
{
 public static void main(String[] args) 
 {
	 HashSet<Person>	h1 = new HashSet<Person>();
	  h1.add(new Person(12, "Anu"));
	  h1.add(new Person(63, "Bhanu"));
	  h1.add(new Person(54, "Devi"));
	  h1.add(new Person(12, "Anu"));
	  
	  for(Person s1 : h1)
	  {
		  System.out.println(s1.name +"  and age is" + s1.age);
	  }
 }
}
