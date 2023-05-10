package zoo;

public class Bird extends Animal implements Flyable{

    //constructor
    public Bird(String name, int age, int weight, String food) {
        super(name, age, weight, food);
    }

    @Override
    public void move() {
        System.out.println("flapping wings....");
    }

    @Override
    public void fly() {
        System.out.println("fly from Bird");
    }
//    public void flying(){
//        System.out.println("Flying...");
//    }
}
