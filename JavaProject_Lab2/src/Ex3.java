import java.util.*;
import java.text.*;
public class Ex3 {

	public static void main(String[] args) {
		//create Class Scanner for input data from keyboard
		Scanner input = new Scanner(System.in);
		//Display
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println(); //เว้น 1 บรร
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is "+frm.format(totalPrice) + " baht.");
		float serviceCharge = totalPrice + (totalPrice*7/100);
		System.out.println("Add VAT 7% is "+ frm.format(serviceCharge) +" bath.");
	}

}
