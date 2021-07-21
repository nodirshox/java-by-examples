public class Condition {
    public static void main(String[] args) {
        /*

        Java has different kind of logical conditions:
        a > b
        a >= b
        a < b
        a <= b
        a == b
        a != b

        We can use those conditions to perfom some logical operations using conditional statements:
        if
        else
        else if
        switch
        */

        // if statement will execute if condition is true
        double myBalance = 14.50d;
        if (myBalance > 10.00) { // output: true
            System.out.println("You have more than $10.00.");
        }

        // else keyword will work if if the condition is false
        int year = 2021;
        if (year >= 2050) {
            System.out.println("You cool man");
        } else {
            System.out.println("You good, good");
        }

        // else if - keyword can used for adding second if statement after the main
        year = 2030;
        if (year >= 2050) {
            System.out.println("You cool man");
        } else if (year >= 2025) {
            System.out.println("You did great job");
        } else {
            System.out.println("You good, good");
        }

        // ternary operator - used shorthad for if else
        // variable = (condition) ? expressionTrue :  expressionFalse;
        int myNumber = 50;
        String isEnough = (myNumber > 10) ? "Yes, you have more than 10$" : "Sorry, you need more money.";
        System.out.println(isEnough);
    }
}