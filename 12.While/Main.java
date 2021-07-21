public class Main {
    public static void main(String[] args) {

        int number = 1;

        while (number < 5) {
            System.out.println("Incremented");
            number++;
        }
        System.out.println(number);
        System.out.println("Stopped");

        // do while - it executed once, because it runs before checking conditions

        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x > 5);
        System.out.println("Final value of x");
        System.out.println(x);
    }
}