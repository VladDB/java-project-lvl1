package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    static final int MAX_VALUE_OPERATOR = 3;

    public static void gameCalc() {
        String gameTask = "What is the result of the expression?";

        String[] questions = new String[Engine.MAX_QUESTIONS];
        String[] rightAnswers = new String[Engine.MAX_QUESTIONS];

        for (int i = 0; i < Engine.MAX_QUESTIONS; i++) {
            int firstNum = Utils.getRandomNum();
            int secondNum = Utils.getRandomNum();
            String operator = getRandomOperator();

            questions[i] = oneQuestion(firstNum, secondNum, operator);
            rightAnswers[i] = checkQuestion(firstNum, secondNum, operator);
        }

        Engine.playGame(gameTask, questions, rightAnswers);
    }
    public static String getRandomOperator() {
        int randomOperator = (int) (Math.random() * MAX_VALUE_OPERATOR);

        switch (randomOperator) {
            case 0:
                return "+";
            case 1:
                return "-";
            default:
                return "*";
        }
    }
    public static String oneQuestion(int firstNum, int secondNum, String operator) {
        return firstNum + " " + operator + " " + secondNum;
    }
    public static String checkQuestion(int firstNum, int secondNum, String operator) {
        switch (operator) {
            case "+":
                return Integer.toString(firstNum + secondNum);
            case "-":
                return Integer.toString(firstNum - secondNum);
            default:
                return Integer.toString(firstNum * secondNum);
        }
    }
}
