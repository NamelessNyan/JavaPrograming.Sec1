package System.out;
import javax.swing.*;

public class Lab706 {

	public static void main(String[] args) 
	{
		int[] nums = {25,78,41,22,36,85,37};
		
		int indexNum = Integer.parseInt(JOptionPane.showInputDialog(
				"Input index of array: "));
        while(!(checkIndex(nums,indexNum)))
        {
        	indexNum = Integer.parseInt(JOptionPane.showInputDialog(
    				"Input index of array, again: "));
        }
        int currentValue = currentData(nums,indexNum);
        int prevValue = prevData(nums,indexNum);
        int nextValue = nextData(nums,indexNum);
        if(indexNum<0)
        {
            JOptionPane.showMessageDialog(null,"Current data,nums["+indexNum+
        		    "] is "+currentValue+"\nNo previous data"
        		    +"\nNext data,nums["+indexNum+"] is "+nextValue);
        }
        else if(indexNum>6)
        {
        	JOptionPane.showMessageDialog(null,"Current data,nums["+indexNum+
        		    "] is "+currentValue+"\nPrevious data,nums["+indexNum+
        		    "] is "+prevValue+"\nNo next data");
        }
        else
        {
        	JOptionPane.showMessageDialog(null,"Current data,nums["+indexNum+
        		    "] is "+currentValue+"\nPrevious data,nums["+indexNum+
        		    "] is "+prevValue+"\nNext data,nums["+indexNum+
        		    "] is "+nextValue);
        }

	}

	public static boolean checkIndex(int[] number,int index)
	{
		/*if((index>=number.length)||(index<0))
		{
	        return true;
		}
		else
		{
			return false;
		}*/
		return ((index>=number.length)||(index<0))?true:false;
	}
	
	public static int currentData(int[] nums,int index)
	{
		return nums[index];
	}
	
	public static int prevData(int[] nums,int index)
	{
		return nums[index-1];
	}
	
	public static int nextData(int[] nums,int index)
	{
		return nums[index+1];
	}
}
