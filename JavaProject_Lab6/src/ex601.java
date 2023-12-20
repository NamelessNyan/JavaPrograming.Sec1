import javax.swing.*;
public class ex601 {

	public static void main(String[] args) 
	{
         inputEmail();
	}
	    //JOptionPane.showMessageDialog(null,"Your e-mail is "+inputEmail);
    public static void inputEmail() 
    {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
		boolean chkEmail = checkEmail(inputEmail);
        displayEmail(chkEmail,inputEmail);
	}//end
 
	public static boolean checkEmail(String email) 
	{
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) 
		{
			return true;
		}
		else return false;
		
	}//end
	public static void displayEmail(boolean chEmail,String inEmail) 
	{
		if(chEmail) 
		{
			JOptionPane.showMessageDialog(null,"Your e-mail is "+inEmail);
		}
		else 
		{
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail");
		}
	}
}
