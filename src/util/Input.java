package util;

import lecture.Person;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Please Enter: ");
        return scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public Boolean yesNo1(){
        String input = getString("Please Enter y or yes to continue");
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }
    public Boolean yesNo() {
        String input;
        boolean validInput = false;
        boolean isYes = false;
        do {
            System.out.print("Please enter 'y' or 'yes' to continue: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                isYes = true;
                validInput = true;
            } else {
                System.out.println("Invalid input. Please try again. Boolean value is: " + validInput);
            }
        } while (!validInput);
        return isYes;
    }

    public int getInt() {
        System.out.print("Please enter a number: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input, please enter a number: ");
            scanner.nextLine();
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.printf("Please enter a number between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.printf("Invalid input, please enter a number between %d and %d: ", min, max);
                scanner.nextLine();
            }
            input = scanner.nextInt();
            scanner.nextLine();
        } while (input < min || input > max);
        return input;
    }
    public int getInt2(int min, int max){
        System.out.println("Please enter number between " + min  + "and " + max );

        int userInput = scanner.nextInt();
        if(userInput < min || userInput > max){
            return getInt2(min, max);
        }
        return userInput;

    }
    public int getInt2() {
//        System.out.println("Please Enter a Number: ");
//        int userInput = scanner.nextInt();
//        return userInput;
        while (true) {
            try {
                System.out.println("Please Enter Integer:");
                String userInput = getString();
                return Integer.valueOf(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Try again");
            }
        }
    }
    public double getDouble() {
//        System.out.print("Please enter a number including a decimal value: ");
//        while (!scanner.hasNextDouble()) {
//            System.out.print("Invalid input, please enter a number: ");
//            scanner.nextLine();
//        }
//        double input = scanner.nextDouble();
//        return input;

       while(true){
           try{
               System.out.println("Please Enter number:");
               String userInput = getString();
               return Double.parseDouble(userInput);
           } catch(NumberFormatException e){
               System.out.println("Wrong input. Please enter number including decimal");
           }
       }
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.printf("Please enter a number between %.2f and %.2f: ", min, max);
            while (!scanner.hasNextDouble()) {
                System.out.printf("Invalid input, please enter a number between %.2f and %.2f: ", min, max);
                scanner.nextDouble();
            }
            input = scanner.nextDouble();
        } while (input < min || input > max);
        return input;
    }
    public int getBinary(){
        while(true){
            try{
                System.out.println("Please Enter Binary Number");
                String userInput = getString();
                return Integer.valueOf(userInput, 2);
            }catch(NumberFormatException e){
                System.out.println("wrong input. please try again");
            }
        }
    }
    public int getHexidecimal() {
        while(true){
            try{
                System.out.println("Enter Hexidecimal Number");
                String userInput = getString();
                return Integer.valueOf(userInput, 16);
            }catch (NumberFormatException e){
                System.out.println("wrong input. please try again");
            }
        }

    }
    public String getGroceryListYesOrNo() {
        System.out.println("Would like to get your grocery list? yes/no");
        return scanner.nextLine();
    }
    public String getGroceryList(){
        return scanner.nextLine();
    }
    public Integer getGroceryListNum(){
        return scanner.nextInt();
    }
}
