
/**
 * 
 * This class displays a solution to the Towers 
 * of Hanoi game.
 *
 */

public class Hanoi 
{
	private int numDiscs;	//number of discs

	public Hanoi(int n)
	{
		numDiscs = n;
		
		moveDiscs(numDiscs, 1, 2, 3);
	}
	
	private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg)
	{
		if (num > 0)
		{
			moveDiscs (num -1, fromPeg, tempPeg, toPeg);
			System.out.println("Move a disc from peg " 
							+ fromPeg + " to peg " + toPeg);
			moveDiscs(num-1, tempPeg, toPeg, fromPeg);
			
		}
	}
	
	
}
