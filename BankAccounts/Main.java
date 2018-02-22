/**
 * Main class of the Java program.
 */

import java.io.*;
import java.util.*; //includes ArrayList
import java.text.*; //for NumberFormat

public class Main
{
    public static void main(String args[])
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        //Instantiate an ArrayList object here called aryList
        List<BankAccount> aryList = new ArrayList<>();
        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort)");
            name = kbReader.nextLine( );
            if( !name.equalsIgnoreCase("EXIT") )
            {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" "); //gives an eye-pleasing blank line
                // Create a BankAccount object
                BankAccount ab = new BankAccount(name,amount);
                // Add it to the ArrayList object
                aryList.add(ab);
            }
        }while(!name.equalsIgnoreCase("EXIT"));
        //Search aryList and print out the name and amount of the largest bank account
        BankAccount ba = aryList.get(0);//get first account in the list
        double maxBalance = ba.balance;
        String maxName = ba.name;
        for(int j = 1; j < aryList.size( ); j++)
        {   //Step through the remaining objects and decide which one has largest balance (compare each balance to maxBalance)
            if(maxBalance<aryList.get(j).balance) {    
                maxBalance = aryList.get(j).balance;
                maxName = aryList.get(j).name;
        }
        System.out.println("The account with the largest amount belongs to " + maxName);
        System.out.println("The amount is $" + maxBalance);  //Print answer
    }
}
}
