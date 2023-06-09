package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    //using static means you can use variable only available in this class
    private static int id = 1000;
    //constructor prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();
//        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);


    }
    //generate unique ID
    private void setStudentID(){
        //Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll(){
        //get inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else {
                break;
            }

        }while(1 != 0);
//        System.out.println("Enrolled In: " + courses);
//        System.out.println("Tuition Balance: " + tuitionBalance);

    }
    //View balance
    public void viewBalance(){
        System.out.println("Your Balance is: $" + tuitionBalance);
    }

    //Pay tuition
    //int can be double
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //Show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID + "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;

    }
}
