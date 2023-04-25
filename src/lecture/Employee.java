package lecture;

public class Employee extends Person{
    //pull employee from person class Inheritance
    public Employee (String employeeName){
        super(employeeName);
    }
    //override method
    public void sayHello(){
        System.out.println("Employee greeting from " + name);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Yong");
        employee1.sayHello(); //output - Hello from Yong
        employee1.doWOrk();
        System.out.println(employee1.name);
        employee1.sayHello(); //Employee greeting from Yong
    }
}
