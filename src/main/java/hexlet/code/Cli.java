package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void sayHello() {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
