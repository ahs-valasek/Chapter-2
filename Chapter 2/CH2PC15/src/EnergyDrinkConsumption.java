
/**
 * Isaac Valasek
 * Energy Drink Consumption
 * Programming III
 * 9/11/19
 */
public class EnergyDrinkConsumption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //initialize variables
       int customers = 12467, nrgBuyer, citrus;
       double temp;
       
//       calculate variables
       temp = customers * .14;
       nrgBuyer = (int)Math.round(temp);
       temp = nrgBuyer *.64;
       citrus = (int)Math.round(temp);
      
//      print information
        System.out.println("The approximate amount of people who purchase "
                + "one or more energy drinks per week is " + nrgBuyer + " people.");
        System.out.println("The approximate amount of those people who prefer"
                + " the citrus flavor is " + citrus + " people.");
    }

}
