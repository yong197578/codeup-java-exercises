import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
//        int num1 = 5;
//        int num2 = 5;
//        System.out.println(addition(num1, num2));
//        addition(5, 2);
//        subtraction(5, 2);
//        multi(5, 2);
//        division(5, 5);
////        division(5, 0); throw errors
//        modulus(5, 2);
//        System.out.println(multiply(5, 2));
//


        Scanner in = new Scanner(System.in);
//        boolean confirm;
//        getInteger(1, 10);
//--------------------------------------------------------------------------
//       do {
//           System.out.print("Enter a number between 1 and 10: ");
//           int userInput = getInteger(1, 10);
//           System.out.println("You entered: " + userInput);
//           System.out.println("Continue [y/n]");
//           confirm = in.nextLine().equalsIgnoreCase("y");
//       }while(confirm);
//        System.out.println("ok, Bye");
//--------------------------------------------------------------------
//        getInteger(1, 10);
//        System.out.println(factorial());
        //------------------------------------------------------------------
//        do {
//                System.out.print("Enter a number between 1 and 10: ");
//                int userInput2 = in.nextInt();
//                in.nextLine();
//                System.out.println(userInput2 + "! = " + factorial(userInput2));
//                System.out.println("Continue [y/n]");
//                confirm = in.nextLine().equalsIgnoreCase("y");
//
//        }while(confirm);
//        System.out.println("Ok, bye");
//-----------------------------------------------------------------------------------------
//        System.out.print("Enter the number of sides for a pair of dice: ");
//        int sides = in.nextInt();
//
//        boolean rollAgain = true;
//        while (rollAgain) {
//            int roll1 = rollDice(sides);
//            int roll2 = rollDice(sides);
//
//            System.out.println("You rolled: " + roll1 + " and " + roll2);
//
//            System.out.print("Roll again? (y/n): ");
//            String input = in.next();
//            rollAgain = input.equalsIgnoreCase("y");

        //----------------------------------------------------------------------
//        System.out.println("Enter the number of sides for a pair of dice: ");
//        int sides = in.nextInt();
//        in.nextLine();
//        boolean rollAgain;
//        do {
//            int roll1 = rollDice(sides);
//            int roll2 = rollDice(sides);
//
//            System.out.println("First Dice: " + roll1 + " " + "Second Dice: " + roll2);
//            System.out.println("Roll Again[y/n]");
//            rollAgain = in.nextLine().equalsIgnoreCase("y");
//        }while(rollAgain);
//        System.out.println("Thanks for Playing!");
//
//    }
//--------------------------------------------------------------------------------------------

//    public static int rollDice(int side){
//        int diceNum = (int) (Math.random() * side)+1;
//        return diceNum;
//    }

    //---------------------------------------------------------------------

// ------------------------------------------------------------------------------------------
//    /public static int factorial(int input){
//        int result = 1;
//        for(long i = 1; i <= input; i++){
//            result *= i;
//        }
//        return result;
//    }
//--------------------------------------------------------------------
//    public static long factorial(){
//        int userFactorial = getInteger(1, 10);
//        long startNumber = 1;
//        for (int i=1; i<= userFactorial; i++){
//            startNumber *= i;
//        }
//        boolean choice = userToContinue();
//        if(choice){
//            factorial();
//        }
//        System.out.println(startNumber);
//        return startNumber;
//
//    }

    //----------------------------------------------------
//    public static boolean userToContinue(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Do you want to continue?");
//        String answer = in.nextLine();
//        if(answer.equalsIgnoreCase("y")){
//            return true;
//        }else{
//            return false;
//        }
//    }
    //---------------------------------------------------------------
//    public static int getInteger(int min, int max){
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if(input < min || input > max){
//            System.out.println("Wrong input! Please try again");
//            input = getInteger(min, max);
//        }
//        return input;
//    }
//    public static int getInteger(int min, int max){
//        System.out.println("Enter a number btw 1 to 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//        if(userInput >= min && userInput <= max){
//            return userInput;
//        }
//        return getInteger(min, max);
//    }
//    public static void addition(int x, int y) {
//        System.out.println(x + y);
//    }
//    public static int addition(int x, int y){
//        return x + y;
//    }
//
//    public static void subtraction(int x, int y) {
//        System.out.println(x - y);
//    }
//
//    public static void multi(int x, int y) {
//        System.out.println(x * y);
//    }
//
//    public static void division(int x, int y) {
//        System.out.println(x / y);
//    }
//
//    public static void modulus(int x, int y) {
//        System.out.println(x % y);
//    }
//
//    public static int multiply(int a, int b) {
//        if (a == 0 || b == 0) {
//            return 0;
//        } else if (b > 0) {
//            return a + multiply(a, b - 1);
//        } else {
//            return -multiply(a, -b);
//        }
//
//
        System.out.println(dice());
    }
    public static String dice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int sides = scanner.nextInt();
        int dice1 = (int) ((Math.random() * sides) + 1);
        int dice2 = (int)((Math.random() * sides) + 1);
        return dice1 + " " + dice2;
    }
}

