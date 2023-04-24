public class Person {

    private String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
    this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
//        Person me = new Person();
//        me.name = "Yong";
//        System.out.println(me.name);

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));//true
//        System.out.println(person1 == person2);//false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());//John
        System.out.println(person2.getName());//John
        person2.setName("Jane");
        System.out.println(person1.getName());//Jane
        System.out.println(person2.getName());//Jane
//        Person  person1 = new Person();
//        person1.setName("Yong");
//        System.out.println(person1.getName());
//
        person1.sayHello();
        person2.sayHello();

        Person person3 = new Person("Yong");
        System.out.println(person3.getName());
        person3.setName("Jin");
        System.out.println(person3.getName());
        person3.sayHello();



    }

}
