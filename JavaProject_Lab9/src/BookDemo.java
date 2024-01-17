import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input book title   : ");
		String title = input.next();
		System.out.println("Input book price   : ");
		float price = input.nextFloat();
		System.out.println("Input publish year : ");
		int publishyear = input.nextInt();
		System.out.println();
		
		Book b1 = new Book(title,price,publishyear);
		System.out.println(b1);

	}

}
