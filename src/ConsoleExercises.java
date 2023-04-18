import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        final double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi);
        System.out.printf("The value of pi is approximately %s", pi);
        System.out.format("%nThe value of pi is approximately %.2f %n", pi);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);
//        What happens if you input something that is not an integer?
        //It will throw error and cannot proceed to next step
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please Enter Three Words: ");
//        String userInput2 = scanner2.nextLine();
        String word1 = scanner2.next();
        String word2 = scanner2.next();
        String word3 = scanner2.next();
        System.out.printf("You Entered: %n %s %s %s", word1, word2, word3);
//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please Enter Sentence:");
        String userInput3 = scanner3.nextLine();
        System.out.println("You Entered: " + userInput3);
//
//        do you capture all the words? No only return first word
//                Rewrite the above example using the nextLine method.
        Scanner scanner4 = new Scanner(System.in);
        scanner4.useDelimiter("\n");
        System.out.print("please Enter the width: ");
        String w = scanner4.nextLine();

//        Scanner scanner5 = new Scanner(System.in);
        System.out.print("please Enter the length: ");
        String l = scanner4.nextLine();


        double x = Double.parseDouble(w);
        double y = Double.parseDouble(l);
        double area = x * y;
        double perimeter = (x*2) + (y*2);
        System.out.println("Area is:" + area);
        System.out.println("Perimeter is:" + perimeter);
//      Example code
//        Scanner scanner = new Scanner(System.in);
//
//        // Set newline character as delimiter
//        scanner.useDelimiter("\n");
//
//        // Get user input for name
//        System.out.print("Enter your name: ");
//        String name = scanner.next();
//
//        // Get user input for age
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        // Get user input for city
//        System.out.print("Enter your city: ");
//        String city = scanner.next();
//
//        // Display the results
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("City: " + city);
//
//        // Close the scanner
//        scanner.close();
    }
}
