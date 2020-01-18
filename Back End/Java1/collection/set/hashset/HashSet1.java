import java.util.HashSet;

public class HashSet1 
{
  public static void main(String[] args)
  {
	  HashSet hs = new HashSet();
	  hs.add(23);
	  hs.add(86);
	  hs.add(12);
	  hs.add(44);
	  hs.add(23);
	  hs.add(null); 
	  hs.add(null);
	  for(Object object : hs)
	  {
	// System.out.println(object.hashCode()); //ges value 2times
		  System.out.println(object);
	  }
	  
	  HashSet<String> h1 = new HashSet<String>();
	  h1.add("abc");
	  h1.add("pqr");
	  h1.add(null);
	  h1.add(null);
	  for(String object : h1)
	  {
		 //ystem.out.println(object.hashCode()); //ges value 2times
		  System.out.println(object);
	  }
  }
  
  
}
