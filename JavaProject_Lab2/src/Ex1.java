
public class Ex1 {

	public static void main(String[] args) {
		String isbn ="IB2-6325-95-4-1", title="Basic Java Programming";
		int unit=5;
		//float price = 225.75f;
		double price = 225.75;
	    System.out.println("Book ISBN : "+isbn);
	    System.out.println("Book Title : "+title);
	    System.out.println("Book Unit : "+unit +" Books.");
	    System.out.println("Book ISBN : "+price +" Baht.");
	    System.out.println("--------------------------------");
	    double totalPrice = unit * price;
	    System.out.println("Total price is "+totalPrice);
	    double vat = totalPrice +(totalPrice*7/100); //calculate vat in baht
	    System.out.println("Add VAT 7% is "+vat);
	    
	}

}
