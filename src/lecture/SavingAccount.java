package lecture;

public class SavingAccount extends Bank{

    public int accountNumber;
    public SavingAccount(String customer, int accountNumber){
        super(customer);
        this.accountNumber = accountNumber;

    }
}
