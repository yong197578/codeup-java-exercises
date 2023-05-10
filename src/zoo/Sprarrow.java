package zoo;

public class Sprarrow extends Bird implements Flyable{
    public Sprarrow(String name, int age, int weight, String food) {
        super(name, age, weight, food);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
}
