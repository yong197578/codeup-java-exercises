import java.util.*;

public class GroceryList {
    private Map<String, List<Item>> groceryList;

    public GroceryList() {
        groceryList = new HashMap<>();
    }

    public void run() {
        System.out.println("Welcome to the grocery list app!");
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("Select the category (produce, dairy, meat): ");
            String category = scanner.nextLine();

            System.out.print("Enter the name of the item: ");
            String name = scanner.nextLine();

            System.out.print("Enter how many of the item: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // consume the new line character

            Item item = new Item(name, quantity);

            if (!groceryList.containsKey(category)) {
                groceryList.put(category, new ArrayList<>());
            }

            groceryList.get(category).add(item);

            System.out.print("Would you like to add another item? (yes/no) ");
            userInput = scanner.nextLine();
        } while (userInput.equalsIgnoreCase("yes"));

        if (!groceryList.isEmpty()) {
            System.out.println("\nHere is your grocery list:");

            for (String category : groceryList.keySet()) {
                System.out.println("\n" + category.toUpperCase() + ":");

                List<Item> items = groceryList.get(category);

                Collections.sort(items, Comparator.comparing(Item::getName));

                for (Item item : items) {
                    System.out.println("- " + item.getName() + " (" + item.getQuantity() + ")");
                }
            }
        }

        System.out.print("\nWould you like to input another list? (yes/no) ");
        userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("yes")) {
            groceryList.clear();
            run();
        } else {
            System.out.println("\nThank you for using the grocery list app!");
        }
    }

    public static void main(String[] args) {
        GroceryList app = new GroceryList();
        app.run();
    }
}

class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
