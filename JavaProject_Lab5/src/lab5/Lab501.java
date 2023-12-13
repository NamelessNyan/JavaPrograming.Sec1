package lab5;
import java.util.*;
public class Lab501 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String name = scan.nextLine();
		if(!name.endsWith(" "))
		{
		   System.out.println("Incorrect Name");
		}

	}

}
