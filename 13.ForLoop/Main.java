public class Main {
    public static void main(String[] args) {
        // if you know exactly number of iteration use for instead of while loop
        for (int index = 0; index < 10; index++) {
            System.out.println(index);
        }

        // forEach loop
        String[] cars = {"Nexia", "Tiko", "Ferrari", "Damas"};
        for (String i : cars) {
            System.out.println(i);
        }

        // break - is used exit the loop
        // continue - used used skip iteration
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                System.out.println("Skipped");
                continue;
            }
            if (i == 6) {
                System.out.println("Stopped");
                break;
            }
            System.out.println(i);
        }

        // we can use break and continue keywords in while.
    }
}