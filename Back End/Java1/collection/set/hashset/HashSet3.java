import java.util.HashSet;

public class HashSet3 
{ 
	public static void main(String[] args) 
	 {
	  HashSet<Student>	h1 = new HashSet<Student>();
	  //since constructor
	  h1.add(new Student(22, "Anu"));
	  h1.add(new Student(24, "Divya"));
	  h1.add(new Student(22, "Anu"));
	  h1.add(new Student(25, "Chinnu"));
	  
	  for(Student s1 : h1)
	  {
		  System.out.println(s1.studName +"  and age is" + s1.studAge);
	  }
	 }
}
