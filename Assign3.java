/*    Author:   Tihomir Penev section 10
      Lab teacher: MacIsaac Carolyn MacIsaac
	  Purpose:  This program will simulate a game of Solitaire Dice (an invented game)
	  Assignment 3 date : 15-nov-2015
 */
import javax.swing.JOptionPane;

public class Assign3 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Wellcome to Assignment 3");		
		Game game1= new Game();
		game1.playGame();
		game1.getBetAmountFromUser();
	

	}

}


