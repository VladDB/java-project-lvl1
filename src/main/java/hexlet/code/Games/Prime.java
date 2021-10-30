package hexlet.code.Games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        Scanner scAnswer = new Scanner(System.in);
        String wrongAnswer = "' is wrong answer ;(. Correct answer was '";
        int howMuchCorrect = 0;
        final int maxAnswers = 3;
        final int borderForRandomValue = 998;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (howMuchCorrect < maxAnswers) {
            int questionNum = (int) (Math.random() * borderForRandomValue + 2);
            System.out.println("Question: " + questionNum);
            System.out.print("Your answer: ");
            String answer = scAnswer.nextLine();
            String correctAnswer = "yes";
            for (int i = 2; i < questionNum; i++) {
                if (questionNum % i == 0) {
                    correctAnswer = "no";
                    break;
                }
            }
            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
                howMuchCorrect++;
            } else {
                System.out.println("'" + answer + wrongAnswer + correctAnswer + "'.");
                Cli.sayBye();
                break;
            }
        }
        if (howMuchCorrect == maxAnswers) {
            Cli.winGame();
        }
    }
}
