package zoo;

public class Chicken extends Bird implements Flyable{
    public Chicken(String name, int age, int weight, String food) {
        super(name, age, weight, food);
    }
    //overriding method - re-defining method
//    public void flying(){
//        System.out.println("Can't Fly");

    @Override
    public void fly() {
        System.out.println("Chicken cannot fly");
    }
}

