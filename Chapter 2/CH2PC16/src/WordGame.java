
/**
 * Isaac Valasek
 * Word Game
 * Programming III
 * 9/10/19
 */
import java.util.Scanner;
        
public class WordGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare variables
        String name, city, college, profession, animal, petName;
        int age;
        Scanner keyboard = new Scanner(System.in);
        
        //Ask for info
        System.out.print("Enter your name: ");
        name = keyboard.next();
        System.out.print("Enter your age: ");
        age = keyboard.nextInt();
        System.out.print("Enter the name of a city: ");
        city = keyboard.next();
        System.out.print("Enter the name of a college: ");
        college = keyboard.next();
        System.out.print("Enter a profession: ");
        profession = keyboard.next();
        System.out.print("Enter a type of animal: ");
        animal = keyboard.next();
        System.out.print("Enter a pet name: ");
        petName = keyboard.next();
        
        //Print story
        System.out.println("There was a person named " + name + " who lived in " + city + 
                ". At the age of " + age + ", " + name + " went to college at " + college +
                ". " + name + " graduated and went to work as a " + profession + ".\nThen, " + 
                name + " adopted a(n) " + animal + " named " + petName + ". They both lived "
                        + "happily every after");
    }

}
