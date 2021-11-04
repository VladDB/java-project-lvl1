package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int maxQuestions = 3;
    static final int borderForRandomValue = 99;
    public static void playGame(String gameTask, String[] question, String[] correctAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameTask);
        for (int i = 0; i < maxQuestions; i++) {
            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (answer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
                if (i == maxQuestions - 1) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswers[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
   }
    public static int getRandomNum() {
        return (int) (1 + Math.random() * borderForRandomValue);
    }
}
