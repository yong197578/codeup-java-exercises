package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter Any String: ");
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
    public int getInt2(){
        System.out.println("Please Enter a Number: ");
        int userInput = scanner.nextInt();
        return userInput;
    }
    public double getDouble() {
        System.out.print("Please enter a number including a decimal value: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input, please enter a number: ");
            scanner.nextLine();
        }
        double input = scanner.nextDouble();
        return input;
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
}
