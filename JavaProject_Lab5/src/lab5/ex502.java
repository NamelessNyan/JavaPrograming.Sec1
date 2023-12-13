package lab5;
import javax.swing.*;
public class ex502 {

	public static void main(String[] args) 
	{
		String yourEmail = JOpotionPane.showInputDiaLog("input your e-mail:");
        while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")) 
        {
        	yourEmail = JOpotionPane.showInputDiaLog("input your e-mail, again:");
        }
        //check email hotmail or gmail
        yourEmail = yourEmil.toLowerCase();
        if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) 
        {
        	JOptionPane.showMessageDiaLog(null,
        			"Your e-mail is "+yourEmail);
        }
        else 
        {
        	JOptionPane.showMessageDiaLog(null,
        			"Your e-mail is not hotmail or gmail dot com");
        }
	}

}
