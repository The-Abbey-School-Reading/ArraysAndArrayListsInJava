import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Kiwi");

        // Access elements from the ArrayList
        System.out.println("First fruit: " + fruits.get(0));

        // Remove an element from the ArrayList
        fruits.remove("Banana");

        // Remove an element by index
        fruits.remove(1); // Removes the element at index 1 (Orange)


        // Iterate through the ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if the ArrayList contains a specific element
        if (fruits.contains("Orange")) {
            System.out.println("The list contains Orange.");
        } else {
            System.out.println("The list does not contain Orange.");
        }

        // Get the size of the ArrayList
        System.out.println("Number of fruits in the list: " + fruits.size());
    }
}

