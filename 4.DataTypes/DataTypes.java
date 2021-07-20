/*

In java, there are 2 data types:

1. Primitive: byte, short, int, long, float, double, boolean, char
2. Non-primative: String, Array, Classess
More at: https://www.w3schools.com/java/java_data_types.asp

*/

public class DataTypes {
    public static void main(String[] args) {

        // Whole numbers
        // byte. Range of byte is -128 to 127. This can be used instead of int for storing small types.
        byte myNum = 100;
        System.out.println(myNum);

        // short. Range of short is -32768 to 32767.
        short myShortNum = 32767;
        System.out.println(myShortNum);

        // int. Range of integer is -2147483648 to 2147483647.
        int myIntNum = 342;
        System.out.println(myIntNum);


        // long. Range of long is -9223372036854775808 to 9223372036854775807.
        long myLongNum = 234234;
        System.out.println(myLongNum);

        // Floating data types: float and double. Which is usefull? The precision of float is only 6/7 decimal digits. But, double has 15 digits.
        // float. Range of float is 3.4e−038 to 3.4e+038.
        float myFloatNum = 3.14f;
        System.out.println(myFloatNum);

        // double. Range of double is 1.7e−308 to 1.7e+308.
        double myDoubleNum = 234.1d;
        System.out.println(myDoubleNum);

        // boolean
        boolean isPerson = true;
        System.out.println(isPerson);

        // char. It is used to store single character. Single quotes. 'A' or 'g'.
        char myChar = 'n';
        System.out.println(myChar);
        char a = 65;
        System.out.println(a);

        // String. Double quotes "salom".
        String message = "Say, hello!";
        System.out.println(message);

    }
}
