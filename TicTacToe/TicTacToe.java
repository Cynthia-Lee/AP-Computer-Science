public class TicTacToe {

static String mark;
static String[][] b;
static boolean win1;
static boolean win2;

/** Makes new board, sets each symbol to "-" */
    public static String[][] initialBoard() {
        win1=false;
        win2=false;
        b = new String [3][3];
        for(int r = 0; r<b.length; r++) { //rows
    		for(int c = 0; c<b[r].length;c++) { //columns	    
    		b[r][c] = "-";
    	    } 
    	}
    	return b;
    }
    
/** Prints board (add lines to board) */
    public static void printBoard() {
        System.out.println(b[0][0] + " | " + b[0][1] + " | " + b[0][2]);
        System.out.println("----------");
        System.out.println(b[1][0] + " | " + b[1][1] + " | " + b[1][2]);
        System.out.println("----------");
        System.out.println(b[2][0] + " | " + b[2][1] + " | " + b[2][2]);
    }
    
/** Switches symbol between "x" and "o" for alternating the players' turns */
     public static void playerTurn() { 
        if(mark.equals("x")){
            mark = "o";   
        }else{
            mark = "x";  
        }
    }
    
/** Checks if move is valid, not valid if space is already occupied by a symbol */
    public static boolean validMove(int num) { 
        if(num>9||num<1){ //player must choose a number 1-9
            return false;
        }
        switch(num) 
            {    
            case 1:
            if(b[0][0].equals("x")||b[0][0].equals("o")) {
                return false;
            }
            break;
            case 2:
            if(b[0][1].equals("x")||b[0][1].equals("o")) {
                return false;
            }
            break;
            case 3:
            if(b[0][2].equals("x")||b[0][2].equals("o")) {
                return false;
            }
            break;
            case 4:
            if(b[1][0].equals("x")||b[1][0].equals("o")) {
                return false;
            }
            break;
            case 5:
            if(b[1][1].equals("x")||b[1][1].equals("o")) {
                return false;
            }
            break;
            case 6:
            if(b[1][2].equals("x")||b[1][2].equals("o")) {
                return false;
            }
            break;
            case 7:
            if(b[2][0].equals("x")||b[2][0].equals("o")) {
                return false;
            }
            break;
            case 8:
            if(b[2][1].equals("x")||b[2][1].equals("o")) {
                return false;
            }
            break;
            case 9:
            if(b[2][2].equals("x")||b[2][2].equals("o")) {
                return false;
            }
            break;
            }
        return true;
        
    }
    
/** Places the player's symbol on the board */
    public static void move(int num) {
            switch(num) //mark = current player's symbol
            {    
            case 1:
            b[0][0]=mark;
            break;
            case 2:
            b[0][1]=mark;
            break;
            case 3:
            b[0][2]=mark;
            break;
            case 4:
            b[1][0]=mark;
            break;
            case 5:
            b[1][1]=mark;
            break;
            case 6:
            b[1][2]=mark;
            break;
            case 7:
            b[2][0]=mark;
            break;
            case 8:
            b[2][1]=mark;
            break;
            case 9:
            b[2][2]=mark;
            break;
            }
        }

/** Checks to see if either player won the game */
    public static void checkWin(){
        if((b[0][0]=="x"&&b[1][0]=="x"&&b[2][0]=="x")||(b[0][1]=="x"&&b[1][1]=="x"&&b[2][1]=="x")||(b[0][2]=="x"&&b[1][2]=="x"&&b[2][2]=="x")||//3 in a column
            (b[0][0]=="x"&&b[0][1]=="x"&&b[0][2]=="x")||(b[1][0]=="x"&&b[1][1]=="x"&&b[1][2]=="x")||(b[2][0]=="x"&&b[2][1]=="x"&&b[2][2]=="x")||//3 in a row
            (b[0][0]=="x"&&b[1][1]=="x"&&b[2][2]=="x")||(b[0][2]=="x"&&b[1][1]=="x"&&b[2][0]=="x")) {//3 diagonal
            win1 = true;
        }else if((b[0][0]=="o"&&b[1][0]=="o"&&b[2][0]=="o")||(b[0][1]=="o"&&b[1][1]=="o"&&b[2][1]=="o")||(b[0][2]=="o"&&b[1][2]=="o"&&b[2][2]=="o")||//3 in a column
            (b[0][0]=="o"&&b[0][1]=="o"&&b[0][2]=="o")||(b[1][0]=="o"&&b[1][1]=="o"&&b[1][2]=="o")||(b[2][0]=="o"&&b[2][1]=="o"&&b[2][2]=="o")||//3 in a row
            (b[0][0]=="o"&&b[1][1]=="o"&&b[2][2]=="o")||(b[0][2]=="o"&&b[1][1]=="o"&&b[2][0]=="o")) {//3 diagonal
            win2 =true;
        }
    }

/** Checks to see if board is full */
    public boolean isBoardFull() { //used to check a tie game
        boolean isFull=true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j] == "-") {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    
    
    
}
   
