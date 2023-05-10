package zoo;

public class Fish extends Animal {
    public Fish(String name, int age, int weight, String food) {
        super(name, age, weight, food);
    }

    @Override
    public void move() {
        System.out.println("fish is swimming");
    }

    public void swim(){
        System.out.println("Swimming....");
    }
}
