package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcdGame() {
        String gameTask = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[Engine.MAX_QUESTIONS];
        String[] rightAnswers = new String[Engine.MAX_QUESTIONS];
        for (int i = 0; i < Engine.MAX_QUESTIONS; i++) {
            questions[i] = oneQuestion();
            rightAnswers[i] = checkQuestion(questions[i]);
        }
        Engine.playGame(gameTask, questions, rightAnswers);
    }
    public static String oneQuestion() {
        return Utils.getRandomNum() + " " + Utils.getRandomNum();
    }
    public static String checkQuestion(String question) {
        int minDel = 0;
        String[] partsOfQuestion = question.split(" ");
        int num1 = Integer.parseInt(partsOfQuestion[0]);
        int num2 = Integer.parseInt(partsOfQuestion[1]);
        while (num2 != 0) {
            minDel = num2;
            num2 = num1 % num2;
            num1 = minDel;
        }
        return String.valueOf(minDel);
    }
}
