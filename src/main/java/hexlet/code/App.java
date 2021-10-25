package hexlet.code;

import hexlet.code.Games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet" +  "\n" + "2 - Even" + "\n" + "0 - Exit");
        System.out.print("Your choice: ");
        Scanner scStart = new Scanner(System.in);
        int gameNumber = scStart.nextInt();
        switch (gameNumber) {
            case 0:
                break;
            case 1:
                Cli.sayHello();
                break;
            case 2:
                Cli.sayHello();
                Even.gameEven();
                break;
            default:
                break;
        }
    }
}
