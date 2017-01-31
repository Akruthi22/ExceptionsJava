package main;

public class GreetPrinter {

    public void printHello(String name) {
        System.out.println("Hello, " + name);
    }

    public void greet(String name) {
        String greet = getGreet(name);
        System.out.println(greet);
    }

    public String getGreet(String name) {
        return "Hello, " + name;
    }
}
