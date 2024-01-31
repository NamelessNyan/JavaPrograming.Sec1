import java.util.Scanner;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String titleInput = input.next();
		int publicYearInput = input.nextInt();
		String fristNameInput = input.next();
		String lastNameInput = input.next();
		String emailInput = input.next();
		System.out.println();
		
		FictionBook b1 = new FictionBook(fristNameInput,lastNameInput,publicYearInput,titleInput,emailInput);
		System.out.println(b1);

	}

}
