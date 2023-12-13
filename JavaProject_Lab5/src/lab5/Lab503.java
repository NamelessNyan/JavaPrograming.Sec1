package lab5;
import java.util.*;
public class Lab503 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String meg = scan.nextLine();
			
            if (meg.indexOf("nichi")>=0||meg.indexOf("NICHI")>=0) 
            {
        	    System.out.println("Nichi is a sentence");
	        }
            else 
            {
        	    System.out.println(meg);
            }
	}
}
