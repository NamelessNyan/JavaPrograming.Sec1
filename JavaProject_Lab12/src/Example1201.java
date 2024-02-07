import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException{
		//use scanner class read data from file
		Scanner readFile = new Scanner(new File("D://txtFile//MemberLogin.txt"));
		while (readFile.hasNext())
		{
			String fname = readFile.next();
			String lname = readFile.next();
			readFile.next();//read password data
			String email = readFile.next().toUpperCase();
			
			System.out.println(fname+" "+"("+email+")");
		}
		readFile.close();

	}

}
