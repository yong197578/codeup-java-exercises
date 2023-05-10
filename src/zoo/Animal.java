package zoo;



public abstract class Animal {

    private String name;
    private int age;
    private int weight;
    private String food;

    public Animal(String name, int age, int weight, String food) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.food = food;
    }
    public void speak(){
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My weight is " + weight);
        System.out.println("My eat" + food);
    }
    public abstract void move();

}
