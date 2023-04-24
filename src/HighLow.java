import java.util.Random;
import java.util.Scanner;

//public class HighLow {
//    public static void main(String[] args) {
//        boolean confirm = true;
//      while(confirm){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Welcome to Guess Game! \nEnter a number between 1 and 100: ");
//        int userInput = in.nextInt();
//        in.nextLine();
//          Random random = new Random();
//          int randomNumber = random.nextInt(100) + 1;
//          System.out.println(randomNumber);
//          while (randomNumber != userInput) {
//              if (randomNumber > userInput) {
//                  System.out.println("HIGHER, Please Enter number again: ");
//              } else {
//                  System.out.println("LOWER, Please Enter number again: ");
//              }
//              userInput = in.nextInt();
//              in.nextLine();
//          }
//          System.out.println("CORRECT");
//
//           System.out.println("Do you want to play again? [y/n]");
//           confirm = in.nextLine().equalsIgnoreCase("y");
//       }
//        System.out.println("Thanks For Playing! See you next time!");
//    }
//
//
//    }
public class HighLow {
    public static void main(String[] args) {
        boolean confirm = true;
        while (confirm) {
            int userInput = getGuessFromUser();
            int randomNumber = generateRandomNumber();
            playGame(userInput, randomNumber);
            confirm = askToContinue();
        }
        System.out.println("Thanks For Playing! See you next time!");
    }

    public static int getGuessFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to Guess Game! \nEnter a number between 1 and 100: ");
        int userInput = in.nextInt();
        in.nextLine(); // consume the newline character
        return userInput;
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
//        System.out.println(randomNumber);
        return randomNumber;
    }

    public static void playGame(int userInput, int randomNumber) {
        int maxGuess = 10;
        int guess = 0;
        while (randomNumber != userInput && guess < maxGuess) {
            guess++;
            if (randomNumber > userInput) {
                System.out.println("HIGHER, Please Enter number again: ");
            } else {
                System.out.println("LOWER, Please Enter number again: ");
            }
            Scanner in = new Scanner(System.in);
            userInput = in.nextInt();
            in.nextLine(); // consume the newline character
        }
        if (guess >= maxGuess) {
            System.out.println("You used them all guesses. Correct number is " + randomNumber);
        } else {
            System.out.println("Well Done! " + randomNumber + " is correct number. You attempted " + guess + " guesses");
        }
    }
    public static boolean askToContinue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play again? [y/n]");
        return in.nextLine().equalsIgnoreCase("y");
    }
}

