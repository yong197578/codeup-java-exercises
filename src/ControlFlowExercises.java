import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i < 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        for(int i=5; i <= 15; i++){
//            System.out.println(i);
//        }

//        int j=0;
//        do{
//            System.out.println(j += 2);
//        } while(j < 100);
//            for(int j=0; j<= 100; j+=2){
//                System.out.println(j);
//            }
//
//        int x = 100;
//        do {
//            System.out.println(x -= 5);
//        }while(x > -10);
//        for(int x=100; x>= -10; x-= 5){
//            System.out.println(x);
//        }

//        long y = 2;
//        do {
//            System.out.println(y);
//            y = y * y;
//        } while (y <= 1000000);
//        for(long y=2; y<=1000000; y*=y){
//            System.out.println(y);
//        }


//        for(int i = 1; i <=100; i++){
//            if(i % 3 ==0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//
//        }
        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("What number would you like to go up to? ");
//            int userInput = scanner.nextInt();
//            System.out.println("Do you want to continue? y/n");
//            String userConfirm = scanner.next();
//            if (userConfirm.equalsIgnoreCase("y")) {
//                System.out.println("Here is your Table!");
//                System.out.printf("%-6s | %-8s | %-6s%n", "number", "squared", "cubed");
//                System.out.println("------ | -------- | -----");
//                for (int i = 1; i <= userInput; i++) {
//                    int squared = i * i;
//                    int cubed = i * i * i;
//                    System.out.printf("%-6d | %-8d | %-6d%n", i, squared, cubed);
//                }
//
//            } else {
//                System.out.println("see you next time");
//                break;
//            }
//        }
//        boolean confirm;
//        do {
//            System.out.println("What number would you like to go up to? ");
//            int userInput = scanner.nextInt();
//            System.out.println("Here is your Table!");
//            System.out.printf("%-6s | %-8s | %-6s%n", "number", "squared", "cubed");
//            System.out.println("------ | -------- | -----");
//            for (int i = 1; i <= userInput; i++) {
//                int squared = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-6d | %-8d | %-6d%n", i, squared, cubed);
//            }
//            System.out.println("Continue [y/n]");
//            confirm = scanner.next().equalsIgnoreCase("y");
//
//
//        } while (confirm);
//        System.out.println("See you next time");
//    }
//}

//        while(true) {
//            System.out.print("Please Enter Your Grade: ");
//            int userInput = scanner.nextInt();
//            System.out.println("Your Grade is " + userInput + "\nDo you want to continue to see letter grade? [y/n]");
//            String confirm = scanner.next();
//            if (confirm.equalsIgnoreCase("y")) {
//                if (userInput >= 88) {
//                    System.out.println("Your letter grade is A!");
//                } else if (userInput < 88 && userInput >= 80) {
//                    System.out.println("Your letter grade is B!");
//                } else if (userInput < 80 && userInput >= 67) {
//                    System.out.println("Your letter grade is C!");
//                } else if (userInput < 67 && userInput >= 60) {
//                    System.out.println("Your letter grade is D!");
//                } else {
//                    System.out.println("You have Failing! F");
//                }
//            } else {
//                break;
        boolean confirm;
        do{
            System.out.print("Please Enter Your Grade: ");
            int userInput = scanner.nextInt();
            System.out.println("Your Grade is " + userInput);
            if (userInput >= 88) {
                System.out.println("Your letter grade is A!");
                } else if (userInput >= 80) {
                    System.out.println("Your letter grade is B!");
                } else if (userInput >= 67) {
                    System.out.println("Your letter grade is C!");
                } else if (userInput >= 60) {
                    System.out.println("Your letter grade is D!");
                } else {
                    System.out.println("You have Failing! F");
                }
            System.out.println("Continue [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y");
        }while(confirm);
        System.out.println("See you next time");
            }
        }

//        while (true) {
//            System.out.print("Please Enter Your Grade: ");
//            int userInput = scanner.nextInt();
//            System.out.println("Your Grade is " + userInput + "\nDo you want to continue to see letter grade? [y/n]");
//            String confirm = scanner.next();
//            if (confirm.equalsIgnoreCase("y")) {
//                String letterGrade = "";
//                if (userInput >= 97) {
//                    letterGrade = "A+";
//                } else if (userInput >= 93) {
//                    letterGrade = "A";
//                } else if (userInput >= 90) {
//                    letterGrade = "A-";
//                } else if (userInput >= 87) {
//                    letterGrade = "B+";
//                } else if (userInput >= 83) {
//                    letterGrade = "B";
//                } else if (userInput >= 80) {
//                    letterGrade = "B-";
//                } else if (userInput >= 77) {
//                    letterGrade = "C+";
//                } else if (userInput >= 73) {
//                    letterGrade = "C";
//                } else if (userInput >= 70) {
//                    letterGrade = "C-";
//                } else if (userInput >= 67) {
//                    letterGrade = "D+";
//                } else if (userInput >= 63) {
//                    letterGrade = "D";
//                } else if (userInput >= 60) {
//                    letterGrade = "D-";
//                } else {
//                    letterGrade = "F";
//                }
//
//                System.out.println("Letter grade: " + letterGrade);
//            }else {
//                break;
//            }
////        }
//    }
//}