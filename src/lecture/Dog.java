package lecture;

public class Dog extends Animal{
    public String name;

    public Dog(int legs){
        super(legs);
    }

    public void makeSound(){
        System.out.println("woof");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(4);
        System.out.println(dog1.legs); //4
    }
}
