package chapter3;

public class Variable {
    public static void main(String[] args) {
        int variableA = 10;
        final int constantA = 20;

        variableA = 30;
        // constantA = 40; // in Java, final variable means that constant variable,
                           // so we cannot be set data after declaration.
    }
}
