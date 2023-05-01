package grades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Students> students = new HashMap<>();
        Students yong = new Students("Yong");
        yong.addGrade(87);
        yong.addGrade(84);
        yong.addGrade(33);
        students.put("yong1234", yong);
        yong.recordAttendance("2023-04-20", "A");
        yong.recordAttendance("2023-04-21", "A");
        yong.recordAttendance("2023-04-22", "P");
        Students jin = new Students("Jin");
        jin.addGrade(77);
        jin.addGrade(84);
        jin.addGrade(68);
        students.put("jin1234", jin);
        jin.recordAttendance("2023-04-20", "P");
        jin.recordAttendance("2023-04-21", "P");
        jin.recordAttendance("2023-04-22", "P");
        Students ian = new Students("Ian");
        ian.addGrade(100);
        ian.addGrade(97);
        ian.addGrade(93);
        students.put("ian1234", ian);
        ian.recordAttendance("2023-04-20", "A");
        ian.recordAttendance("2023-04-21", "P");
        ian.recordAttendance("2023-04-22", "P");

        System.out.println("Welcome!\n" + "Here are the GitHub username of our students: ");
        for(String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        boolean confirm;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("\nWhat student would you like to see more information on? Enter username " +
                    "\nor Do you want to see all students grade? Press \"csv\"" +
                    "\nor Do you want to see the class attendance? Press \"att\"");
            String userInput = in.nextLine();
            if(userInput.equalsIgnoreCase("csv")){
                for (Map.Entry<String, Students> entry : students.entrySet()) {
                    String username = entry.getKey();
                    Students student = entry.getValue();
                    System.out.println(student.getName() + "," + username + "," + student.getGradeAverage());
                }
            }else if(userInput.equalsIgnoreCase("att")) {
                System.out.println("Please enter the GitHub username of the student: ");
                String username = in.nextLine();
                if (!students.containsKey(username)) {
                    System.out.println("Sorry, no student found with the GitHub username of \"" + username + "\"");
                } else {
                    Students selectedStudent = students.get(username);
                    System.out.println("Attendance Percentage: " + selectedStudent.getAttendancePercentage());
                    List<String> absences = selectedStudent.getAbsentDates();
                    if (absences.isEmpty()) {
                        System.out.println("This student has no absence");
                    } else {
                        for (String date : absences) {
                            System.out.println(date);
                        }
                    }
                }
            }else if (!students.containsKey(userInput)) {
                System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\" or please correct keywords, \"csv\", \"att\"");
            }
            else {
                Students selectedStudent = students.get(userInput);
                System.out.println("Name: " + selectedStudent.getName() + "- GitHub username: " + userInput);
                System.out.println("Current Average: " + selectedStudent.getGradeAverage());
            }
            System.out.println("Would you like to see another report?");
            confirm = in.nextLine().equalsIgnoreCase("y");
        }while(confirm);
        System.out.println("Goodbye, and have a wonderful day");
    }
}
