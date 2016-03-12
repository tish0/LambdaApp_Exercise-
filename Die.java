/*    Author:   Tihomir Penev section 10
      Lab teacher: MacIsaac Carolyn MacIsaac
	  Purpose:  This program will simulate a game of Solitaire Dice (an invented game)
	  Assignment 3 date : 15-nov-2015
 */
import java.util.Random;

	public class Die {
	
	public int rollDie () {
		
		Random dice = new Random ();
		return dice.nextInt(6) + 1;
				
	}

	public void displayDie () {

	}

}


