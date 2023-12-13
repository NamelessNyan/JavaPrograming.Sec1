package lab5;
import javax.swing.*;
public class ex503_1 {

	public static void main(String[] args) 
	{
         String sentence = JOpotionPane.showInputDiaLog("input your e-mail:");
	        while(!sentence.endsWith(".")) 
	        {
	        	sentence = JOpotionPane.showInputDiaLog("Input a sentence, again: ");
	        }
	        int countSpace=0;
			for(int i=0;i<sentence.length()-1;i++) 
			{
				if(sentence.charAt(i)==' ') 
				{
					countSpace+=1;
				}
			}
	}

}
