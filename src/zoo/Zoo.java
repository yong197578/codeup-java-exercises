package zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal sprarrow1 = new Sprarrow("sp", 1, 1, "food");
        Bird sprarrow2 = new Sprarrow("sp", 1, 1, "food");
        sprarrow2.speak();
        sprarrow1.move();
        Chicken chicken1 = new Chicken ("d", 1, 1,"food");
        Animal chicken2 = new Chicken ("d", 1, 1,"food");
        chicken1.fly();
//        chicken2.fly(); //error
        moveAnimal(sprarrow1);
    }
    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
