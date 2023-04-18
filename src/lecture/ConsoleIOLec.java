package lecture;//import always is top of the class
//this will grey out until it uses in class
import java.util.Scanner;

public class ConsoleIOLec {
   public static void main (String[] arg){
       String name = "7";
       String cohortName = "Kotlin";
       System.out.print("Favorite number " + name + "\n");
       System.out.println("Favorite number " + name);
       System.out.printf("Favorite Number %s %s", name, cohortName + "\n");
       System.out.printf("My favorite number is %s, and my cohort name is %s", name, cohortName);
       // scanner is variable.
       //create scanner
       Scanner scanner = new Scanner(System.in);
       Scanner scanner2 = new Scanner(System.in);
       System.out.println("What is the date today?");
       //next() only uses one word. You can enter several words but it only returns first word. ignore white space
       String userInput = scanner.next();

       System.out.println("You entered: --> \"" + userInput + "\" <--");
       System.out.printf("You entered: %s %n", userInput);

       //this grabs all words including white spaces
       System.out.println("Enter Something here: ");
       String userInput2 = scanner2.nextLine();
       System.out.println("You entered: " + userInput2);
       //using .nextInt()
       Scanner scanner3 = new Scanner(System.in);
       System.out.println("Enter Favorite Number:");
       int userInput3 = scanner3.nextInt();
       System.out.print("Your favorite number is: " + userInput3);


   }
}
