package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void primeGame() {
        String gameTask = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[Engine.MAX_QUESTIONS];
        String[] rightAnswers = new String[Engine.MAX_QUESTIONS];
        for (int i = 0; i < Engine.MAX_QUESTIONS; i++) {
            questions[i] = oneQuestion();
            rightAnswers[i] = checkQuestion(questions[i]);
        }
        Engine.playGame(gameTask, questions, rightAnswers);
    }
    public static String oneQuestion() {
        return String.valueOf(Utils.getRandomNum());
    }
    public static String checkQuestion(String question) {
        int num = Integer.parseInt(question);
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return  "no";
            }
        }
        return "yes";
    }
}
