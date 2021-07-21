public class Main {
    public static void main(String[] args) {
        // Math.max(a, b) - is used find greater element
        int a = 10;
        int b = 12;
        int maxNum = Math.max(a, b);
        System.out.println(maxNum);

        // Math.im(a, b) - finding lowest value of given 2 values
        int minNum = Math.min(a, b);
        System.out.println(minNum);

        // Math.sqrt(a) - square root of number
        System.out.println(Math.sqrt(16));

        // Math.abs(a) - absolute value of number (modules, positive)
        System.out.println(Math.abs(-2.3));

        // Math.random() - give random number between 0.0(inclusive) and 1.0(exclusive);
        System.out.println(Math.random());

        // Generate random number between 0 - 100;
        System.out.println((int)(Math.random() * 100));
    }
}