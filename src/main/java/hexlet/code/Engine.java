package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_QUESTIONS = 3;
    private static final String MISTAKE = "'%s' is wrong answer ;(. Correct answer was '%s'. \n Let's try again, %s!";

    public static void playGame(String gameTask, String[] question, String[] correctAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameTask);

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (!answer.equals(correctAnswers[i])) {
                System.out.printf(MISTAKE, answer, correctAnswers[i], name);
                return;
            } else {
                System.out.println("Correct!");
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
