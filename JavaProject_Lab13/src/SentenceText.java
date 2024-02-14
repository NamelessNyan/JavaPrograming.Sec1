import java.io.*;
import java.util.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		// create obj for write(save) data to file using printstream class
		PrintStream writeFile = new PrintStream(new File("d://sentence.txt"));
		//create obj for input data from keyboard(console)
		Scanner scan = new Scanner(System.in);
		int i=1;
		while(true)
		{
			System.out.println("Sentence: ");
			String word = scan.next().toUpperCase();
			
			if(word.equalsIgnoreCase("stop"))
			{
				break;
			}
			//save data to file
			writeFile.println(i+":"+word);
			i++;
		}
		System.out.println("File is save!!");
		
		writeFile.close();

	}

}
