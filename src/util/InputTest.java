package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("You entered: " + in.getString());
        System.out.println("Your boolean value is: " + in.yesNo());
        System.out.println("Your boolean value is: " + in.yesNo1());
        System.out.println("You Enter: " + in.getInt());
        System.out.println("You Enter: " + in.getInt2());
        System.out.println("You Enter: " + in.getInt(1, 10));
        System.out.println("You Enter: " + in.getInt2(1, 12));
        System.out.println(in.getDouble());
        System.out.println(in.getDouble(1.0, 5.4));
    }
}
