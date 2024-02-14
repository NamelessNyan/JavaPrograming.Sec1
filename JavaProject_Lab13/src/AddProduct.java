import java.io.*;
import java.util.*;
public class AddProduct {

	public static void main(String[] args) throws IOException{
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://product.txt",true));
		//create obj for input data from keyboard(console)
		Scanner scan = new Scanner(System.in);
		//Display and input data from keyboard
		System.out.println("Input product id: ");
		String productId = scan.next();
		System.out.println("Input product Name: ");
		String productName = scan.next();
		System.out.println("Input product Unit: ");
		int productUnit = scan.nextInt();
		System.out.println("Input product Price: ");
		float productPrice = scan.nextFloat();
		//save data to file
		writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
		System.out.println("Save file already...");
		
		writeFile.close();
	}

}
