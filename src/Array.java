public class Array {

    public int[] intArray = new int[5];
    public String[] stringArray = new String[4];

    public static void main(String[] args) {
        // Example of an integer array
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Example of a String array
        String[] stringArray = {"Hello", "World", "Java", "Arrays"};
        System.out.println("String Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
    }
}
