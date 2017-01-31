package main;

public class SuperGreeter {

    public static String superGreet(String name) {
        if (name == null || name.isEmpty()) {
            name = "Universe";
        }
        return String.format("Hello, %s! You definetly look great today!", name);
    }
}
