package System.out;
import java.util.*;
import java.text.*;

public class Lab701 {

	public static void main(String[] args) 
	{
		int[] num;
		int i;
		Scanner input = new Scanner(System.in);
		for(i = 1;i<8;i++)
		{
			System.out.println("Input number "+i+" : ");
			num = input.nextInt();
		}
        System.out.println();
        int currentValue = currentData(num,i);
        if(num[i] % 2 == 0 )
        {
        	System.out.println("there are "+i+" of odd number");
        }
        else
        {
        	System.out.println("there are "+i+" of odd number");
        	System.out.println("list of odd number : "+num[i]);
        }
	}

	public static int currentData(int[] num,int index)
	{
		return num[index];
	}
}
