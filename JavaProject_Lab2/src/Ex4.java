import javax.swing.*;
import java.text.*;
public class Ex4 {

	public static void main(String[] args) {
		//Input from dialogbox
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input product name : ");
	/*	String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		//Covent string to int
		int productUnit = Integer.parseInt(strUnit); */
		//input and convert data from dia box
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
		
		//input price per unit from dialog box
		String strPice = JOptionPane.showInputDialog("Input price per unit : ");;
		float pricePerUnit = Float.parseFloat(strPice);
	    //calculate total price 
		float totalPrice = productUnit * pricePerUnit;
		//display data to dialog box
		float vat = totalPrice + (totalPrice*7/100);
		JOptionPane.showMessageDialog(null, "Total Price is"
				+ frm.format(totalPrice) + " baht."+ 
				"\nAdd VAT 7% is "+ frm.format(vat) +" bath.");

	}

}
