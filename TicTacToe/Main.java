import java.util.*;

/*Programmers: Cynthia Lee
* Date created: 2/2/15
*/

/**
 * You will create a tic tac toe game that can be played between two players. 
 * The directions are purposely vague in order for you to develop the game
 * based on what you need. There are a few requirements to this project and the rest is up to you.
 * 1) You must create another class. You game should run in this main method by calling on methods or objects from the other class
 * 2) Your methods and class variables must make sense. You should be able to answer questions like: why did you make that method static?
 * 3) The game is played by two people who will enter moves through the keyboard, we are not introducing a computer player at this time.
 * 4) Your game should work and should work intuitively (add text, add functionality, add choice)
 * 5) Your game board should be formed by a 2d array. You should print the board after every move.
 * 6) Your program must contain author rem, method headers, and line rems,
 * 
 * Some methods you may need:
 * 1) print the gameboard
 * 2) change the player
 * 3) get the player's move
 * 4) check the validity of the player's move
 * 5) check for win conditions
 * 
 */

public class Main {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Type \"start\" to play TicTacToe!");
        System.out.println("Type \"quit\" to stop at any time.");
        String start = scan.nextLine( );

        if(!start.equalsIgnoreCase("start")&&!start.equalsIgnoreCase("quit")){ //if user does not enter "start" or "quit", program will stop
        System.out.println("Invalid input.");
        } else {
  
        while (!start.equalsIgnoreCase("quit")) //program will stop if "quit" is entered
		{
        System.out.println("Player 1, is \"x\".");    
        System.out.println("Player 2, is \"o\".");    

        System.out.println("NEW GAME START:");
        System.out.println("Input : Numbers 1-9, top left corner is 1.");
        game.initialBoard(); //makes empty board
        game.printBoard();
        TicTacToe.mark="x";
        
        while(TicTacToe.win1==false&&TicTacToe.win2==false&&!game.isBoardFull()){ //loops to ask players to enter moves until a player wins or board is full
        System.out.println("Player 1 choose move.");
        int input = scan.nextInt( );
        while (!game.validMove(input)) { //checks if move is valid
            System.out.println("That is an invalid move. Player 1 please pick another space.");
            input = scan.nextInt( );
        }
        game.move(input);
        game.printBoard();
        game.playerTurn(); //alternates the symbol from "x" to "o"
        game.checkWin();
        if(TicTacToe.win1==true||TicTacToe.win2==true||game.isBoardFull()) { //if statement needed to end right after if Player 1 wins game
            break;
        }
        System.out.println("Player 2 choose move.");
        input = scan.nextInt( );
        while (!game.validMove(input)) {
            System.out.println("That is an invalid move. Player 2 please pick another space.");
            input = scan.nextInt( );
        }
        game.move(input);
        game.printBoard();
        game.playerTurn();
        game.checkWin();
		}
		if (TicTacToe.win1==true) {
		    System.out.println("Player 1 has won!");
		} else if (TicTacToe.win2==true) {
		    System.out.println("Player 2 has won!");
		} else if (game.isBoardFull()) { //if game is full, and neither wins = tie game
		    System.out.println("Tie Game!");
		}
		
		game.initialBoard();
		System.out.println("Would you like to play again? Type \"yes\" or \"no\".");
	    String again = scan.nextLine( );
	    again = scan.nextLine( );
	   
	    switch(again) 
	    {
	        case "yes": //program will start from the beginning 
	        case "Yes":
	        System.out.println("Type \"start\" to play TicTacToe!"); 
            System.out.println("Type \"quit\" to stop at any time.");
            start = scan.nextLine( );   
            break;
            case "no": //program will terminate
            case "No":
            System.exit(0);
            break;
            default:
            while (!again.equalsIgnoreCase("yes")&&!again.equalsIgnoreCase("no")) { //keeps looping if "yes" or "no" is not entered
                System.out.println("Would you like to play again? Type \"yes\" or \"no\".");
                again = scan.nextLine( );
            }
            break;
	    } 
	    
	    
	    
        }
        }

    }
}
