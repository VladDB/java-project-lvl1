package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void sayHello() {
        String name;
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
