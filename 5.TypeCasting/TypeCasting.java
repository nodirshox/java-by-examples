/*

There are 2 type of casting:
1. Widening (auto): convert small value to bigger
byte -> short -> char -> int -> long -> float -> double

2. Narrowing (manual): convert large value to small
double -> float -> long -> int -> char -> short -> byte

*/
public class TypeCasting {
    public static void main(String[] args) {
        // widening casting
        int myInt = 17;
        double myDouble = myInt; // auto

        System.out.println(myInt);
        System.out.println(myDouble);

        // narrowing casting
        double balance = 1200.08d;
        int smallBalance = (int) balance;
        
        System.out.println(balance);
        System.out.println(smallBalance);
    }
}