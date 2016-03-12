/*    Author:   Tihomir Penev section 10
      Lab teacher: MacIsaac Carolyn MacIsaac
	  Purpose:  This program will simulate a game of Solitaire Dice (an invented game)
	  Assignment 3 date : 15-nov-2015
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Game {

	private 	int potAmount = 50;
	private 	int betAmount = 0;
	private 	Die dice1 = new Die();
	
	Assign3 main1 = new Assign3();
	Scanner input= new Scanner(System.in);

	public void getBetAmountFromUser(){
		
		do{

			System.out.println("Your current pot is : "+ potAmount);
			System.out.print("Enter your bet amount : ");
			betAmount=input.nextInt(); 

			while(betAmount == 0){
				System.out.println("You end the game with pot of "+ potAmount+"\n");
				JOptionPane.showMessageDialog(null,"You end the game with pot of "+ potAmount);
				
				betAmount=input.nextInt();
				
				
				
			}

			if(betAmount < 0 || betAmount > potAmount){
				System.out.print("ReEnter your bet amount - less that pot : ");
				betAmount=input.nextInt();
			}
			
			dice1.rollDie();

			int roll1 = dice1.rollDie();
			int roll2 = dice1.rollDie();
			int roll3 = dice1.rollDie();
			int sum=roll1+roll2+roll3;
			
			System.out.println("Your die are: " + roll1 + " and " + roll2 + " and " + roll3);
			if (roll1== roll2 && roll1 == roll3 && roll2 == roll3) {
				System.out.println("You WIN....triple your bet");
				JOptionPane.showMessageDialog(null,       "***You WIN....triple your bet***");
				potAmount = potAmount-betAmount+(betAmount*3);
				
			}

			else if (roll1 == roll2 || roll1 == roll3 || roll2 == roll3) {
				System.out.println("You WIN....double your bet");
				potAmount = potAmount-betAmount+(betAmount*2);

			}

			else if (sum>= 12) {
				System.out.println("You WIN....your bet back");
				potAmount=potAmount+(betAmount-betAmount);

			}
			else if (sum < 12) {
				System.out.println("You LOSE....your bet");
				potAmount=potAmount-betAmount;
				
			}

			else if (betAmount < 0 || betAmount > potAmount){
				System.out.println("Error - cannot bet less than 0 or more than " + potAmount + "...Enter your bet amount: ");
				betAmount = input.nextInt();			
			}
			if(potAmount == 0){
				System.out.println("Sorry You end the game with pot of "+ potAmount);
				JOptionPane.showMessageDialog(null, "              You looose  ;)");	
				int reply = JOptionPane.showConfirmDialog(null, "Do you wanna play again" + JOptionPane.YES_NO_OPTION);
		        if (reply == JOptionPane.YES_OPTION) {
		          JOptionPane.showMessageDialog(null, "HELLO");
		          Assign3 as = new Assign3();
		          as.main(null);
		        }
		        else {
		           JOptionPane.showMessageDialog(null, "GOODBYE");
		           System.exit(0);
		        }
				System.out.println();
				potAmount=input.nextInt();

				
					
				
			}

		} while (potAmount != 0 && potAmount > 0);

		
		
	}

	public void playGame(){
		System.out.println("Welcome to Solitaire Dice Game. Bet an amount - if the sum of the three die is greater\n"
				+ "than 12, you keep your bet, if you roll doubles you win double your\n"
				+ "bet, if you roll triples you win triple your bet, otherwise you lose your bet. A bet of 0 ends the game.\n");

	}

}