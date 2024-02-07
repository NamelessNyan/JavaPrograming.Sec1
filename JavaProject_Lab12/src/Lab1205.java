import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args)throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("D://txtFile//student.txt"));
		Header();
		int i = 1;
		String tmp = "";		
		while((tmp = readFile.readLine())!=null)
		{
			String[] data = tmp.split("\t");
			String idStu = (data[0]);
			String name = (data[2].toUpperCase());
			double score = Double.parseDouble(data[4]);
			System.out.println(i+".\t"+data[0]+"\t"+Level(idStu)+"\t"+name.charAt(0)+"."+data[3]
					+"\t"+data[4]+"\t"+Status(score));
			i++;
		}
		
	}
	
	public static String Level(String id)throws IOException
	{
		if (id.endsWith("181317")) 
			return "4th";
		else
			return "3th";
	}
	
	public static String Status(double grade)throws IOException
	{
		if(grade>=2)
		{
			return "Pass";
		}
		else if(grade>=1&&grade<2)
		{
			return "Critical";
		}
		else
		{
			return "Retired";
		}
	}
	
	public static void Header()
	{
		System.out.println("No.\tID\tLevel\tName\tGrade\tStatus");
		System.out.println("**********************************************************");
		System.out.println();
	}

}
