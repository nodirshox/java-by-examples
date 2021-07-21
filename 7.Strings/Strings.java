public class Strings {
    public static void main(String[] args) {
        // A string collection of characters and it has double quotes
        String name = "Nodirbek";
        System.out.println("name: "+ name);

        // A string is actually is object. We can use some methods. For example: length of string
        System.out.println("Length of name is: " + name.length());

        // more methods: toUpperCase(), toLowerCase()
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // find character in a String: indexOf and it returs first found index otherwise -1.
        String companyName = "Google";
        System.out.println(companyName.indexOf("l"));

        // String concatenation: +
        String firstName = "Nodirbek";
        String lastName = "Ergashev";
        System.out.println("Full name: " + firstName + " " + lastName);

        // second method is concat
        System.out.println(firstName.concat(lastName));

        // escaping character: \',  \",  \\ (backslash)
        String someText = "Great is \"NOT\" great.";
        System.out.println(someText);

        String anotherText = "Great is \'NOT\' great.";
        System.out.println(anotherText);

        String otherText = "Some \\ backslash example.";
        System.out.println(otherText);

        // other escaping: \n (new line), \r (carriage return), \t (tab), \b (backspace), \f (form feed)
        // In java + used for adding number and concatenating string. Be carefull
        int x = 10;
        int y = 30;
        int z = x + y; // adding numbers 10 + 30 = 40
        System.out.println(z);

        String xString = "10";
        String yString = "30";
        String zString = xString + yString; // "10" + "30" = "1030"
        System.out.println(zString);

        // if you add number to string, it will be string concatenation
        String someResult = x + xString; // 10 + "10" = "1010"
        System.out.println(someResult);

    }
}