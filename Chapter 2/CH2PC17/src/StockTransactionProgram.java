
/**
 * Isaac Valasek
 * Stock Transaction Program
 * Programming III
 * 9/11/19
 */
public class StockTransactionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double paidStockAmount, commission1, commission2, soldStockAmount, stockPerShareBuy = 32.87, stockPerShareSell =33.92, profit;
        int shareNum = 1000;
        
        //find the values
        paidStockAmount = shareNum * stockPerShareBuy;
        commission1 = paidStockAmount * .02;
        
        soldStockAmount = shareNum * stockPerShareSell;
        commission2 = soldStockAmount * .02;
        
        profit = soldStockAmount - paidStockAmount - commission1 - commission2;
        
        //display info
        System.out.println("Joe paid $" + paidStockAmount + " for the stock.");
        System.out.println("Joe sold the stock for $" + soldStockAmount + ".");
        System.out.println("Joe's first commission was $" + commission1 + '.');
        System.out.println("Joe's second commission was $" + commission2 + '.');
        System.out.println("Joe's profit was $" + profit + '.');
        
        
    }

}
