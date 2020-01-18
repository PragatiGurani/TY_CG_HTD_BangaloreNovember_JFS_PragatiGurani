import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput
{
  public static void main(String[] args) 
  {
	  try {
	       FileOutputStream f1 = new FileOutputStream("chinnu.txt");
	       String s1 = "Pragati";
	       
	       byte[] b = s1.getBytes();
	       
	       f1.write(b);
	       System.out.println("Success...........");
	      }
	  catch(IOException e)
	  {
		  System.out.println(e.getMessage());
	  }
	
  }
}
