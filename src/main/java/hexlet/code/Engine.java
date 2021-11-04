package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_QUESTIONS = 3;
    static final int BORDER_FOR_RANDOM = 99;
    static final String MISTAKE = "' is wrong answer ;(. Correct answer was '";
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
            if (answer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
                if (i == MAX_QUESTIONS - 1) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                System.out.println("'" + answer + MISTAKE + correctAnswers[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
    }
    public static int getRandomNum() {
        return (int) (1 + Math.random() * BORDER_FOR_RANDOM);
    }
}
