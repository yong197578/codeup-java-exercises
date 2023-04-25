package lecture;

public class Bank {
    //customer
    public String customer;

    public Bank(String customer){
        this.customer = customer;
    }

    public static void main(String[] args) {
        SavingAccount sAccount1 = new SavingAccount("Yong", 1111);

        Bank bank1 = new Bank("nikki");

        System.out.println(sAccount1.customer);
        System.out.println(sAccount1.accountNumber);
        System.out.println(bank1.customer);
    }
}
