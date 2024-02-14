import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert()throws IOException {
		Scanner scan = new Scanner(System.in);
		PrintStream writeFile = new PrintStream(new File("d://employee.txt"));
		String answer;
		do 
		{
			header();
			System.out.print("Enter name\t: ");
			name = scan.next();
			System.out.print("Enter department : ");
			dept = scan.next();
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = scan.next().toLowerCase();
		}while(answer.equals("y"));
	}
	
	public void read() {
		int i = 1;
		int hr = 0;
		int pg = 0;
		int it = 0;
		try 
		{//create obj for read file use scanner class
			Scanner readFile = new Scanner(new File("d://employee.txt"));
			boolean check = false;
			while(readFile.hasNext())
			{
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept()))
				{
					System.out.println("("+i+") "+name);
					i++;
					check=true;
					if(dept == "HR")
					{
						hr++;
					}
					else if (dept == "Programmer")
					{
						pg++;
					}
					else if (dept == "IT")
					{
						it++;
					}
				}
			}
			if(check==true)
			{
				header();
				if(hr>0) 
				{
				    System.out.println("\nEmployee in dept HR is "+hr+" person.");
				}
				else if(pg>0)
				{
					System.out.println("\nEmployee in dept Progammer is "+pg+" person.");
				}
				else if(it>0)
				{
					System.out.println("\nEmployee in dept IT is "+it+" person.");
				}
			}
			if(check==false)
			{
				header();
				System.out.println("\nSorry, no dept : "+super.getDept()+" in File");
			}
			readFile.close();
		}catch(IOException e)
		{
			System.out.println("\nSorry, file not found...");
		}
	}

}
