package lecture;

public class Person {
    //every person will have name
    public String name;
    //constructor
    public Person(String name){
        this.name = name;
    }
    public void doWOrk(){
        System.out.println("Learn, Learn, Learn");
    }
    public void sayHello() {
        System.out.println("Hello from " + name);
    }
}
