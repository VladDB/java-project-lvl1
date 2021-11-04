package hexlet.code.Games;

import hexlet.code.Engine;

public class Calculator {
    static final int MAX_VALUE_OPERATOR = 3;
    public static void gameCalc() {
        String gameTask = "What is the result of the expression?";
        String[] questions = new String[Engine.maxQuestions];
        String[] rightAnswers = new String[Engine.maxQuestions];
        for (int i = 0; i < Engine.maxQuestions; i++) {
            questions[i] = oneQuestion();
            rightAnswers[i] = checkQuestion(questions[i]);
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
    public static String oneQuestion() {
        return Engine.getRandomNum() + " " + getRandomOperator() + " " + Engine.getRandomNum();
    }
    public static String checkQuestion(String question) {
        String[] checkExpression = question.split(" ");
        int num1 = Integer.parseInt(checkExpression[0]);
        int num2 = Integer.parseInt(checkExpression[2]);
        String operator = checkExpression[1];
        switch (operator) {
            case "+":
                return Integer.toString(num1 + num2);
            case "-":
                return Integer.toString(num1 - num2);
            default:
                return Integer.toString(num1 * num2);
        }
    }
}
