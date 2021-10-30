package hexlet.code;

import hexlet.code.Games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StringBuilder allGames = new StringBuilder();
        System.out.println("Please enter the game number and press Enter.");
        allGames.append("1 - Greet");
        allGames.append("\n" + "2 - Even");
        allGames.append("\n" + "3 - Calc");
        allGames.append("\n" + "4 - GDC");
        allGames.append("\n" + "5 - Progression");
        allGames.append("\n" + "6 - Prime");
        allGames.append("\n" + "0 - Exit");
        System.out.println(allGames.toString());
        System.out.print("Your choice: ");
        Scanner scStart = new Scanner(System.in);
        int gameNumber = scStart.nextInt();
        switch (gameNumber) {
            case 1:
                Cli.sayHello();
                break;
            case 2:
                Cli.sayHello();
                Even.gameEven();
                break;
            case 3:
                Cli.sayHello();
                Calculator.gameCalc();
                break;
            case 4:
                Cli.sayHello();
                GCD.gcdGame();
            case 5:
                Cli.sayHello();
                MathProgress.mathPrGame();
            case 6:
                Cli.sayHello();
                Prime.primeGame();
            default:
                break;
        }
    }
}
