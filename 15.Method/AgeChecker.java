public class AgeChecker {
    static boolean checkAge(int age) {
        if (age < 18) {
            System.out.println("You are still young...");
            return false;
        }
        System.out.println("Allowed");
        return true;
    }

    public static void main(String [] args) {
        boolean isAllowed = checkAge(15);
        System.out.println(isAllowed);
    }
}