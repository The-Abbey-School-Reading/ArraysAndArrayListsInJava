public class Array_2D {
    public int[][] intArray = new int[2][4];
    public String[][] stringArray = new String[2][4];

    public static void main(String[] args) {

        int [][] intArray = {{1, 2, 3, 4}, {6, 7, 8, 9}};
        String[][] stringArray = {{"Hello", "World", "Java", "Arrays"}, {"Are", "Very", "Cool", "Things"}};

        for (int i = 0; i < 2; i ++){
            for (int j = 0 ; j < 4; j ++){
                System.out.printf("i = %d, f = %d, intArray value = %d, stringArray value = %s \n", i, j, intArray[i][j], stringArray[i][j]);
            }
        }
    }
}
