import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        boolean confirm;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Ask Bob Something: ");
            String respFromBob = in.nextLine();
            //I can use respFromBob.endsWith
            if (respFromBob.contains("?")) {
                System.out.println("Sure");
            } else if (respFromBob.endsWith("!")) {
                System.out.println("Whoa, chill out!");
                //respFromBob.isEmpty()
            } else if (respFromBob.equals("")) {
                System.out.println("Fine. Be that Way.");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Do you want to ask Bob more? [y/n]");
            confirm = in.nextLine().equalsIgnoreCase("y");

        } while (confirm);
        System.out.println("Ok. See you next time");


    }
}

