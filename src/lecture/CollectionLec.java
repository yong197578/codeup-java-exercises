package lecture;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionLec {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(0,21);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.indexOf(19));

        ArrayList<String> coffee = new ArrayList<>();
        coffee.add("light");
        coffee.add("medium");
        coffee.add("medium");
        coffee.add("dark");
        System.out.println(coffee);
        System.out.println(coffee.isEmpty());
        System.out.println(coffee.contains("espresso"));
        coffee.remove("espresso");
        coffee.remove("medium");
        System.out.println(coffee);
        coffee.remove(2);
        System.out.println(coffee);

        HashMap<String, String> username = new HashMap<>();
        username.put("Yong", "yong197578");
        username.get("Yong");
        username.get("Jin");

        System.out.println(username);
        System.out.println(username.get("Yong"));
        System.out.println(username.getOrDefault("Jin", "gojin!"));
        System.out.println(username.containsKey("Yong"));
        System.out.println(username.containsKey("jung"));
        System.out.println(username.containsValue("yong197578"));
        username.put("jung", "jung1234");
        System.out.println(username);
        HashMap<Integer, String> username2 = new HashMap<>();
        username2.put(1, "you");
        System.out.println(username2);
        username2.putIfAbsent(2, "yong");
        System.out.println(username2);
        username2.remove(1);
        System.out.println(username2);
    }
}
