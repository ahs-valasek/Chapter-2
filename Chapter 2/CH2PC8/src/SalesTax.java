
/**
 * Isaac Valasek
 * Sales Tax
 * Programming III
 * 9/9/19
 */
import java.util.Scanner;
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //import Scanner
        
        
        //declare variables
        double amount, sTax, cTax, totalTax, totalSale;
        Scanner keyboard = new Scanner(System.in);
  
        //Get amount
        System.out.println("Enter an amount you purchased:");
        amount = keyboard.nextDouble();
        
        //Calculate Tax
        sTax = (amount * .04);
        cTax = (amount * .02);
        totalTax = sTax + cTax;
        totalSale = totalTax + amount;
        
        //print tax info
        System.out.println("Amount: $" + amount);
        System.out.println("State sales tax: $" + sTax);
        System.out.println("County sales tax: $" + cTax);
        System.out.println("Total tax: $" + totalTax);
        System.out.println("Total Sale: $" + totalSale);
    }

}
