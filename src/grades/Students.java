package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        ArrayList<Double> grade = new ArrayList<>();
        grade.add(87.0);
        grade.add(77.0);
        grade.add(94.5);
        System.out.println(grade);

    }

    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Students(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    // returns the student's name

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return (double) sum /this.grades.size();
    }
    public void recordAttendance(String date, String value){
        attendance.put(date, value.toUpperCase());
    }
    public double getAttendancePercentage() {
        int totalDates = attendance.size();
        int absence = 0;
        for (String value : attendance.values()) {
            if (value.equalsIgnoreCase("A")) {
                absence++;
            }
        }
        return (double)(totalDates - absence)/totalDates * 100;
    }
    public List<String> getAbsentDates(){
        List<String> absentDates = new ArrayList<>();
        for(HashMap.Entry<String, String> entry : attendance.entrySet()){
            String date = entry.getKey();
            String value = entry.getValue();
            if(value.equalsIgnoreCase("A")){
                absentDates.add(date);
            }
        }return absentDates;
    }
}

