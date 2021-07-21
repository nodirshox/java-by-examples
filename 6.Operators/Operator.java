public class Operator {
    public static void main(String[] args) {
        // "+" operator
        int x = 100 + 60;

        // adding variables
        int sum1 = 50 + 10;     // 60 (50 + 10)
        int sum2 = sum1 + 20;   // 80 (60 + 20)
        int sum3 = sum1 + sum2; // 140 (60 + 80)
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        
        /* 
        
        Java operators grouping some categories:
         - Arifmetic operators
         - Assignment operators
         - Comparison operators
         - Logical operators
         - Bitwise operators

        1. Arifmetic operators:
        +, -, /, *, %, ++, --

        2. Assignment operators: 
        =, +=, -=, *=, /=, %=, ...
        For example: int x = 12;
        Others: https://www.w3schools.com/java/java_operators.asp

        3. Comparison operators:
        > (greater than), >= (greater or equal to), < (less than), <= (less or equal to), == (equal to), != (not equal to)

        if (a != b) {
            // returns true, if a is not equals to b.
        }

        4. Logical operators:
        && (and), || (or), ! (not, reverse the result)

        x < 5 && x < 10
        x < 5 || x < 10
        !(x < 5 && x < 10)
        
        */
        
    }
}