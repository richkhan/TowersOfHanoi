import java.util.Scanner;

public class HanoiGame {
	
	static public void main (String [] args)
	{

		System.out.println("Enter number of Discs: ");
		Scanner s = new Scanner(System.in);
		
		String discs = s.nextLine();
		int numOfDiscs = Integer.parseInt(discs);
		
		Hanoi towersOfHanoi = new Hanoi(numOfDiscs);
	}
}
