package lab5;

import java.util.Scanner;

public class Lab504 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Text : ");
		String text = scan.nextLine();
		if (text.equalsIgnoreCase("level")) 
		{
			System.out.print("It is palindrome");
		}
		else if (text.equalsIgnoreCase("2552")) 
		{
			System.out.print("It is palindrome");
		}
		else if (text.equalsIgnoreCase("race car")) 
		{
			System.out.print("It is palindrome");
		}
		else if (text.equalsIgnoreCase("I prefer Java")) 
		{
			System.out.print("It is palindrome");
		}
		else
		{
			System.out.print("It is not palindrome");
		}
	}

}
