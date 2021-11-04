package hexlet.code;

import hexlet.code.Games.Calculator;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.MathProgress;
import hexlet.code.Games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        StringBuilder allGames = new StringBuilder();
        System.out.println("Please enter the game number and press Enter.");
        allGames.append("1 - Greet");
        allGames.append("\n" + "2 - Even");
        allGames.append("\n" + "3 - Calc");
        allGames.append("\n" + "4 - GCD");
        allGames.append("\n" + "5 - Progression");
        allGames.append("\n" + "6 - Prime");
        allGames.append("\n" + "0 - Exit");
        System.out.println(allGames.toString());
        System.out.print("Your choice: ");
        Scanner scStart = new Scanner(System.in);
        int gameNumber = scStart.nextInt();
        switch (gameNumber) {
            case greet:
                Cli.sayHello();
                break;
            case even:
                Even.gameEven();
                break;
            case calc:
                Calculator.gameCalc();
                break;
            case gcd:
                GCD.gcdGame();
                break;
            case progression:
                MathProgress.mathPrGame();
                break;
            case prime:
                Prime.primeGame();
                break;
            default:
                break;
        }
    }
}
