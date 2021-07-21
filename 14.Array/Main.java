public class Main {
    public static void main(String[] args) {
        // Array is used to storing same type of values
        String[] names = {"Nodir", "Ergashev", "Good boy"};

        int[] numbers = {1, 2, 4, 7, 9, 99};

        // accessing element of array by index
        System.out.println(names[1]);

        // update value
        names[1] = "Ergashev2";
        System.out.println(names[1]);

        // method: length
        System.out.println(names.length);

        // iterate array using loop
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        // using forEach
        for (String name : names) {
            System.out.println(name);
        }

        // multi-dimentional array
        int[][] myNumbers = {{1, 2}, {6, 7, 99}};

        // accessing element
        System.out.println(myNumbers[1][2]); // 99  [index of n-th of array][index of that element in array]

        // iteration with 2 nested loops
        System.out.println("Started...");
        for (int index = 0; index < myNumbers.length; ++index) {
            for (int inner = 0; inner < myNumbers[index].length; ++inner) {
                System.out.println(myNumbers[index][inner]);
            }
        }
    }
}