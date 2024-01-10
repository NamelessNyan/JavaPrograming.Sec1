import java.util.*;
public class TestPiggyBank {
	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//PiggyBank pb = new PiggyBank();
		
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : "+ 34);
		System.out.println("Money Total : "+ pb.getTotal());
		pb.addTen (13);
		System.out.println("add 10 Baht Money : "+ 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
		
	}
	
	public static void inputCoin()
	{
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please define size of Piggybank: ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Money Total : "+ pb.getPiggyBank());
		MainMenu();
	}
	
	public static void MainMenu()
	{
		while(true)
		{
			pb.line();
			System.out.println("Memu of PiggyBank");
			pb.line();
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			pb.line();
			System.out.println("Please Select Memu[1-5] : ");
			int select = scan.nextInt();
			
			if (select == 1)
			{				
				System.out.println("Insert 1 Baht Money: ");
				pb.addOne(scan.nextInt());
			}
			else if (select == 2)
			{
				System.out.println("Insert 2 Baht Money: ");
				pb.addTwo(scan.nextInt());
			}
			else if (select == 3)
			{
				System.out.println("Insert 5 Baht Money: ");
				pb.addFive(scan.nextInt());
			}
			else if (select == 4)
			{
				System.out.println("Insert 10 Baht Money: ");
				pb.addTen(scan.nextInt());
			}
			else
			{
				System.out.println("Bye Bye");
				break;
			}
			System.out.println("Money Total : "+ pb.getTotal());
		}
	}
	
}
