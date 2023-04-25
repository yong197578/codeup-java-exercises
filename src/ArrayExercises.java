import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); //[I@4617c264
        System.out.println(Arrays.toString(numbers));

//        String[] names = {"Yong", "John", "Jin"};
        Person[] people = new Person[3];
        people[0] = new Person("Yong");
        people[1] = new Person("John");
        people[2] = new Person("Jin");
        for(Person names: people){
            System.out.println(names.getName());
        }
        Person[] newPeople = addPerson(people, new Person("alice"));
        System.out.println(newPeople[newPeople.length-1].getName());

    }
    public static Person[] addPerson(Person[] people, Person personToAdd) {
//        Person[] newPeople = new Person[people.length + 1];
//        for (int i = 0; i < people.length; i++) {
//            newPeople[i] = people[i];
//        }
//        newPeople[people.length] = personToAdd;
//        return newPeople;
        Person[] newPeople = Arrays.copyOf(people, people.length +1);
        newPeople[people.length] = personToAdd;
        return newPeople;
    }
}

