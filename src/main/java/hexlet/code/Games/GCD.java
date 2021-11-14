package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcdGame() {
        String gameTask = "Find the greatest common divisor of given numbers.";

        String[] questions = new String[Engine.MAX_QUESTIONS];
        String[] rightAnswers = new String[Engine.MAX_QUESTIONS];

        for (int i = 0; i < Engine.MAX_QUESTIONS; i++) {
            int firstNum = Utils.getRandomNum();
            int secondNum = Utils.getRandomNum();

            questions[i] = oneQuestion(firstNum, secondNum);
            rightAnswers[i] = checkQuestion(firstNum, secondNum);
        }

        Engine.playGame(gameTask, questions, rightAnswers);
    }
    public static String oneQuestion(int firstNum, int secondNum) {
        return firstNum + " " + secondNum;
    }
    public static String checkQuestion(int firstNum, int secondNum) {
        int minDel = 0;

        while (secondNum != 0) {
            minDel = secondNum;
            secondNum = firstNum % secondNum;
            firstNum = minDel;
        }

        return String.valueOf(minDel);
    }
}
