package chapter1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input two number : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
    }
}
