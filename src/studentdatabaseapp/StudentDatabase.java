package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {


        //Ask how many new students we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudnets = in.nextInt();
        Student[] students = new Student[numOfStudnets];
        //create n number of new Students
        for(int i = 0; i < numOfStudnets; i++){
//            Student stu1 = new Student();
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for(int i = 0; i < numOfStudnets; i++) {
            System.out.println(students[i].toString());
        }
    }
}
