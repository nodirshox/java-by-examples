public class Main {
    static void sayHello() {
        System.out.println("Hello, brothet from another mother.");
    }
    static void sayHelloWithName(String name) { // name is parameter
        System.out.println("Hello, " + name);
    }
    static void sayHelloWithNameAndAge(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
    public static void main(String[] args) {
        sayHello();
        sayHello();
        sayHelloWithName("Nodirbek"); // "Nodirbek" is argument
        sayHelloWithNameAndAge("Nodirbek", 20);
    }
}