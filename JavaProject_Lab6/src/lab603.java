import java.util.*;
public class lab603 {
    static Scanner scan = new Scanner(System.in);
    static String fullName,firstName,sencondName;

	public static void main(String[] args) 
	{
		System.out.print("Plese enter your name, separated by a space."
				+ "\n:");
		firstName = scan.next();
		System.out.print("");
		sencondName = scan.next();
		System.out.print(" ");
		fullName = scan.next();
		abbreviatName(firstName,sencondName);
		System.out.print(fullName);
	}
	
	public static void abbreviatName(String fullName)
	{
		if(firstName.endsWith(" "))
		{
			System.out.print(firstName.charAt(0)+".");
		}
		if(sencondName.endsWith(" "))
		{
		    System.out.print(sencondName.charAt(0)+".");
		}	
	}

}
