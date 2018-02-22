/* Programmer: Cynthia Lee
 * Date created: 11/4/15
 * School: Midwood Highschool
 */ 
 
import java.util.*;

public class Main 
{
/**
 * The program will return the numerator or denominator of a fraction. It may also return a string inputted as an improper fraction.
 */
	public static void main(String[] args) 
	{
	    System.out.println("Make your arithmetic selection from the choices below:");
        System.out.println(" Add");
        System.out.println(" Subtract");
        System.out.println(" Multiply");
        System.out.println(" Divide\n");
        System.out.println( " Type \"quit\" to stop.");
        System.out.print(" Your choice? ");
        
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine( );
        
        while (!choice.equals("quit")&&!choice.equals("Quit"))
		{
        
        System.out.print("\nEnter first operand. " );
        String input1 = scan.nextLine();
        convertToFraction(input1);
        System.out.print("Enter second operand. " );
        String input2 = scan.nextLine();
        convertToFraction(input2);
        System.out.println(" ");
        int newNumerator1,newNumerator2,totalNumerator,totalDenominator,g;
        switch (choice)
        {
            case "Add": //addition
            case "add": //Notice we are providing for both capital Add and little add.
            newNumerator1 = getNumerator(input1)*getDenominator(input2);
            newNumerator2 = getNumerator(input2)*getDenominator(input1);
            totalNumerator = newNumerator1+newNumerator2;
            totalDenominator = getDenominator(input1)*getDenominator(input2);
            g = (gcf(totalNumerator,totalDenominator));
            System.out.println(convertToFraction(totalNumerator/g+"/"+totalDenominator/g));
            break;
            case "Subtract": //subtraction
            case "subtract":
            newNumerator1 = getNumerator(input1)*getDenominator(input2);
            newNumerator2 = getNumerator(input2)*getDenominator(input1);
            totalNumerator = newNumerator1-newNumerator2;
            totalDenominator = getDenominator(input1)*getDenominator(input2);
            g = (gcf(totalNumerator,totalDenominator));
            System.out.println(convertToFraction(totalNumerator/g+"/"+totalDenominator/g));
            break;
            case "Multiply": //multiplication
            case "multiply":
            totalNumerator = getNumerator(input1)*getNumerator(input2);
            totalDenominator = getDenominator(input1)*getDenominator(input2);
            g = (gcf(totalNumerator,totalDenominator));
            System.out.println(convertToFraction(totalNumerator/g+"/"+totalDenominator/g));
            break;
            case "Divide": //division
            case "divide":
            newNumerator2 = getDenominator(input2);
            int newDenominator2 = getNumerator(input2);
            totalNumerator = getNumerator(input1)*newNumerator2;
            totalDenominator = getDenominator(input1)*newDenominator2;
            g = (gcf(totalNumerator,totalDenominator));
            System.out.println(convertToFraction(totalNumerator/g+"/"+totalDenominator/g));
            break;
            default:
            System.out.println("Hey dummy, enter only a Add, Subtract, Multiply, or Divide!");
        }
        
        System.out.println("\nMake your arithmetic selection from the choices below:");
        System.out.println(" Add");
        System.out.println(" Subtract");
        System.out.println(" Multiply");
        System.out.println(" Divide\n");
        System.out.println( " Type \"quit\" to stop.");
        System.out.print(" Your choice? ");
        
        choice = scan.nextLine( );
		}
		System.out.println(gcf(20,4));
		System.out.println(gcf(5,7));
		System.out.println(gcf(100,75));
		System.out.println(gcf(4,20));
	}

	/**
	 * getNumerator should find the numerator from a string that is a fraction.
	 * 
	 * Precondition: the fraction parameter must be a valid fraction (a numerator, a
	 * slash, and a denominator, like 3/4, or a whole number, an underscore, a numerator,
	 * a slash, and a denominator, like 2_3/4).
	 * 
	 * @param fraction - the fraction to find the numerator of
	 * @return the numerator
	 */
	public static int getNumerator(String fraction)
	{
		// TODO: write code here that uses indexOf and substring to find the 
		// numerator part of fraction, then use Integer.parseInt (see bottom of code) to convert
		// it to a number and return it.
		if (fraction.indexOf("/")>=0 && fraction.indexOf("_")<0) { //Fraction only has /
		    int slash = fraction.indexOf("/");
		    String numerator = fraction.substring(0,slash); //(numerator) the number before the /
		    int n = Integer.parseInt(numerator);
		    return n; 
		} else if (fraction.indexOf("/")>=0 && fraction.indexOf("_")>=0) { //Fraction has _ and /
		    int underscore = fraction.indexOf("_");
		    String wholeNumber = fraction.substring(0,underscore); //the whole number before the _
		    int wn = Integer.parseInt(wholeNumber);
		    int slash = fraction.indexOf("/");
		    String denominator = fraction.substring(slash+1); //(denominator) the number after the /
		    int d = Integer.parseInt(denominator);
		    String numerator = fraction.substring(slash-1,slash); //(numerator) the number before the /
		    int n = Integer.parseInt(numerator);
		    int entireNumerator = (wn*d)+n;
		    return entireNumerator;
		} else {
		    return Integer.parseInt(fraction);
		}
	}

	/**
	 * getDenominator should find the denominator in a fraction string
	 * 
	 * Precondition: the fraction parameter must be a valid fraction or mixed number (a numerator,
	 * a slash, and a denominator, like 3/4, or a whole number, an underscore, a numerator,
	 * a slash, and a denominator, like 2_3/4)
	 * 
	 * @param fraction - the fraction to find the denominator of
	 * @return the denominator
	 */
	public static int getDenominator(String fraction)
	{
		// TODO: write code here that uses indexOf and substring to find the 
		// denominator part of fraction, then use Integer.parseInt (see bottom of code) to convert
		// it to a number and return it.
		if ((fraction.indexOf("/"))>=0) {
		int slash = fraction.indexOf("/");
		String denominator = fraction.substring(slash+1); //(denominator) the number after the /
		int d = Integer.parseInt(denominator);
		return d; 
		} else {
		    return 1;
	    }
	}
	/**
	 * convertToFraction should take a string input that may be a whole number, a mixed
	 * number, or a fraction and return it as a proper or improper fraction.
	 * 
	 * @param input - a whole number, mixed number, or fraction to convert
	 * @return - the equivalent of input as a fraction, proper or improper
	 */
	public static String convertToFraction(String input)
	{
		// TODO: use the String methods indexOf and substring along with some 
		// if and else statements to figure out if input is whole, mixed, or
		// fraction and to convert it to a proper or improper fraction. Be sure
		// to use getNumerator and getDenominator whenever you have a fraction
		// and need the numerator or denominator.
		if (getDenominator(input)==0) {
		    return "Undefined";
		} else if (getDenominator(input)==1) {
		    return getNumerator(input)+"";  
		} else if (input.indexOf("/")>=0) { 
		    return getNumerator(input)+"/"+getDenominator(input);
		} else { 
            return input;
	    }
	}
	
	public static int gcf(int a, int b) {
	    if(a<b) {
	       int temp = a;
	       a=b;
	       b=temp;
	    }
	    int r=1;
	    while (r>0) {
	        r = a%b;
	        a=b;
	        b=r;
	    }
	    return a;
	}
	
	//Integer.parseInt(String str) method converts a string into an int (if the string is integers)
	//For example: Integer.parseInt("17") returns the int 17, which you can now add to another int.
}
