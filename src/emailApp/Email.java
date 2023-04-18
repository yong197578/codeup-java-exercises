package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateMail;
    private String email;
    private String companySuffix = "aeycompany.com";

    //Constructor to receive the first and Last name
    //this is global variable and firstName is local string
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        //Call a method asking for the department and return the department
        this.department = setDepartment();
//        System.out.println("Department: " + this.department);
        //Generate random password length = pw length
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        //combine element to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//        System.out.println("Your email is: " + email);
    }
    //ask for the department
    private String setDepartment(){
        System.out.print("New Worker: " + firstName + " " + lastName + "DEPARTMENT CODE\n1 for Sale\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){
            return "sales";
        }else if(depChoice == 2) {
            return "dev";
        }else if(depChoice == 3){
            return "acct";
        }else {
            return "";
        }

    }


    private String randomPassword(int length){
        String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUXYZ0123456789!@#$%";
        //each array is character
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //set the mailbox Capacity
    public void setMailboxcapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateMail = altEmail;
    }
    //Change the password
    public void changPassword(String password){
        this.password = password;
    }
    //get method
    public int getMailboxCapacity() { return mailboxCapacity;}
    public String getAlternateMail() {return alternateMail;}
    public String getPassword() {return password;}
    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName + " \nCompany Email: " + email + " \nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}
