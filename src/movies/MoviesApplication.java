package movies;

import java.util.Scanner;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
//        boolean confirm;
//        Movie[] movies = MoviesArray.findAll();
//        Scanner in = new Scanner(System.in);
//        Input input = new Input();
//        do {
//            System.out.println("What would you like to do?\n" +
//                    "0 - exit\n" +
//                    "1 - view all movies\n" +
//                    "2 - view movies in the animated category\n" +
//                    "3 - view movies in the drama category\n" +
//                    "4 - view movies in the horror category\n" +
//                    "5 - view movies in the scifi category");
//            System.out.println(" ");
//
//            System.out.print("Enter your choice: ");
////            int userInput = in.nextInt();
//            int userInput = input.getInt();
////            in.nextLine();
//            if (userInput == 0) {
//                System.out.println("Thank you. See you next time");
//            } else if (userInput == 1) {
//                for (Movie movie : movies) {
//                    System.out.println(movie.getMoiveName() + " -- " + movie.getCategory());
//                }
//            } else if (userInput == 2) {
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equals("animated")) {
//                        System.out.println(movie.getMoiveName() + " -- " + movie.getCategory());
//                    }
//                }
//            } else if (userInput == 3) {
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equals("drama")) {
//                        System.out.println(movie.getMoiveName() + " -- " + movie.getCategory());
//                    }
//                }
//            } else if (userInput == 4) {
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equals("horror")) {
//                        System.out.println(movie.getMoiveName() + " -- " + movie.getCategory());
//                    }
//                }
//            } else if (userInput == 5) {
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equals("scifi")) {
//                        System.out.println(movie.getMoiveName() + " -- " + movie.getCategory());
//                    }
//                }
//            }
//            System.out.println("Continue [y/n]");
//           confirm = in.nextLine().equalsIgnoreCase("y");
//        }while(confirm);
//        System.out.println("Thank you. See you again");
        boolean cont = true;
        Movie[] movieArray = MoviesArray.findAll();
        Input sc = new Input();
        while(cont){
            System.out.println("What would you like to do?\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");
            System.out.println(" ");

            System.out.print("Enter your choice: ");
            int numb = sc.getInt(0, 7);
            switch(numb){
                case(0):
                    System.out.println("Do you want to quit?");
                    cont = false;
                    break;
                case(1):
                    for(Movie movies: movieArray){
                        System.out.println("Movie name: " + movies.getMoiveName() + "Movie Category: " + movies.getCategory());
                        break;
                    }
                case(2):
                   for(Movie movies: movieArray){
                       if (movies.getCategory().equals("animated")) {
                           System.out.println("Movie name: " + movies.getMoiveName() + "Movie Category: " + movies.getCategory());
                       }
                        break;
                    }
                case(3):
                    for(Movie movies: movieArray){
                        if (movies.getCategory().equals("drama")) {
                            System.out.println("Movie name: " + movies.getMoiveName() + "Movie Category: " + movies.getCategory());
                        }
                        break;
                    }
                case(4):
                    for(Movie movies: movieArray){
                        if (movies.getCategory().equals("horror")) {
                            System.out.println("Movie name: " + movies.getMoiveName() + "Movie Category: " + movies.getCategory());
                        }
                        break;
                    }
                case(5):
                    for(Movie movies: movieArray){
                        if (movies.getCategory().equals("scifi")) {
                            System.out.println("Movie name: " + movies.getMoiveName() + "Movie Category: " + movies.getCategory());
                        }
                        break;
                    }
                default:
                    System.out.println("wrong input");

            }
        }



    }
}
