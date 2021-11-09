package hexlet.code;

import hexlet.code.Games.Calculator;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.MathProgress;
import hexlet.code.Games.Prime;

import java.util.Scanner;

public class App {
    private static final String GREET = "1";
    private static final String EVEN = "2";
    private static final String CALC = "3";
    private static final String GCD_GAME = "4";
    private static final String PROGRESSION = "5";
    private static final String PRIME = "6";
    public static void main(String[] args) {
        StringBuilder allGames = new StringBuilder();
        allGames.append(GREET + " - Greet").append("\n" + EVEN + " - Even").append("\n" + CALC + " - Calc")
                .append("\n" + GCD_GAME + " - GCD").append("\n" + PROGRESSION + " - Progression")
                .append("\n" + PRIME + " - Prime").append("\n" + "0 - Exit");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(allGames.toString());
        System.out.print("Your choice: ");
        Scanner reader = new Scanner(System.in);
        String gameNumber = reader.nextLine();
        switch (gameNumber) {
            case GREET:
                Cli.sayHello();
                break;
            case EVEN:
                Even.gameEven();
                break;
            case CALC:
                Calculator.gameCalc();
                break;
            case GCD_GAME:
                GCD.gcdGame();
                break;
            case PROGRESSION:
                MathProgress.mathPrGame();
                break;
            case PRIME:
                Prime.primeGame();
                break;
            default:
                break;
        }
    }
}
