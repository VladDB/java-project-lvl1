package hexlet.code.Games;

import hexlet.code.Cli;

import java.util.Scanner;

public class MathProgress {
    public static void mathPrGame() {
        Scanner scAnswer = new Scanner(System.in);
        String wrongAnswer = " is wrong answer ;(. Correct answer was '";
        int howMuchCorrect = 0;
        final int maxAnswers = 3;
        final int borderForRandomValue = 100;
        final int borderForRandomPlace = 9;
        final int arrLength = 10;
        while (howMuchCorrect < maxAnswers) {
            int[] valueArr = new int[arrLength];
            valueArr[0] = (int) (Math.random() * borderForRandomValue);
            int valuePlus = (int) (Math.random() * borderForRandomPlace);
            int randomPlace = (int) (Math.random() * borderForRandomPlace);
            for (int i = 0; i < valueArr.length - 1; i++) {
                valueArr[i + 1] = valueArr[i] + valuePlus;
            }
            System.out.print("Question: ");
            for (int j = 0; j < valueArr.length; j++) {
                if (j == randomPlace) {
                    System.out.print(" .. ");
                    j++;
                }
                System.out.print(" " + valueArr[j] + " ");
            }
            System.out.print("\n" + "Your answer: ");
            int answer = scAnswer.nextInt();
            if (answer == valueArr[randomPlace]) {
                System.out.println("Correct!");
                howMuchCorrect++;
            } else {
                System.out.println("'" + answer + "'" + wrongAnswer + valueArr[randomPlace] + "'.");
                break;
            }
        }
        if (howMuchCorrect == maxAnswers) {
            Cli.winGame();
        }
    }
}
