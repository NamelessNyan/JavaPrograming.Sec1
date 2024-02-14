import java.util.*;
import java.io.*;
public class EmployeeInfo {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data?: ");
		choice = scan.next().toLowerCase();
		while(!(choice.equals("insert"))&&!(choice.equals("read")))
		{
			System.out.println("Please type insert or read data,again");
			choice = scan.next().toLowerCase();
		}
		//create obj : call all method in class saveandOpen
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert"))
		{
			obj.insert(); //call insert method from class saveandOpen
		}
		else if(choice.equals("read"))
		{
			System.out.print("\nEnter department: ");
			department = scan.next();
			obj.setDept(department);
			obj.read(); //call read() method from class saveandOpen
		}
		
	}

}
