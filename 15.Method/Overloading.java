public class Overloading {
    static int addNumbers(int a, int b) {
        return a + b;
    }
    static double addNumbers(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.println(addNumbers(5, 2));
        System.out.println(addNumbers(5.3, 4.7));
    }
}