package lecture;

public class ControlStatementsLoopsLec {
    public static void main(String[] args) {
        System.out.println(10 > 5);//true
        System.out.println(5 == 5);//true
        System.out.println(true == false);//false
        System.out.println(2 <= 2);//true

        System.out.println((true == true) || (true == false));//true
        System.out.println((true == true) && (true == false));//false
        boolean islogedIn = true;
        boolean isAdmin = false;
                if(islogedIn && isAdmin){
                    System.out.println("this is the admin page");
                }else {
                    System.out.println("logged in");
                }
    }
}
