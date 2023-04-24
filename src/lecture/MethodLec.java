package lecture;

public class MethodLec {
    public static void main(String[] args) {
    sayHello("Yong");
        System.out.println(returnThree());
        System.out.println(shout("You"));
//        System.out.println(sayHello());
        sayHello();
        sayHello("Hello", "Yong!");
        count(5);
        getPower(5, 5);
    }
    public static String sayHello(String name) {
        System.out.printf("Hello, %s!%n", name);
        return String.format("Hello, %s!%n", name);
    }
    public static String sayHello() {
        //wouldn't return "Hello World if sayHello() in main method
//        return "Hello, World!";
        System.out.println("Hello, World!");
        return String.format("Hello, World!");
    }
    //void means don't want return any value
    public static void sayHello(String greeting, String name){
        System.out.println(greeting + ", " + name);
    }

    public static int returnThree() {
        return 3;
    }
    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }
    public static long getPower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }



}
