public class HelloWorld {
    public static void main(String[] args) {
        //string must be "" sing quotes are reserved fpr single characters
        //sout + tab system.out.println
        System.out.println("Hello World");
//        System.out.println('d');
        System.out.println("Hello, Welcome to Java!");
        System.out.print("Hello My Name is ");
        System.out.print("Yong!");

        int myfavoriteNumber = 7;
        System.out.println(myfavoriteNumber);
        String myString = "This is String";
        System.out.println(myString);
        myString = "This is another String";
        System.out.println(myString);
//        myString = 3.14159; gives me an error
//        long myNumber = 123; // 3.14 - give me an error since it has decimal number
        //123L & 123 print 123
        float myNumber1 = 3.14f;

        double myNumber = 3.14; //float will give an error
        System.out.println(myNumber); //give me an error if there is no value to myNumber
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        int y = 5;
        System.out.println(++y);
        System.out.println(y);

//        int class = "Can't use this Name" error will happen
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; //throws cast exception error
//
////        int three = (int) "three"; t
//        System.out.println(three);
        int c = 4;
//        c = c + 5;
        c+=5;
        System.out.println(c);

        int d = 3;
        int e = 4;
//        e = e * d;
        e*=d;
        System.out.println(e);

        int f = 10;
        int g = 2;
//        f = f / g;
//        g = g - f;
        f/=g;
        g-=f;
        System.out.println(f);
        System.out.println(g);


        int highestValue = 2147483647; //throws error if assign 2147483648 and higher
        System.out.println(Integer.MAX_VALUE);
    }
}
