package hexlet.code.Games;

import hexlet.code.Engine;

public class Prime {
    public static void primeGame() {
        String gameTask = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[Engine.maxQuestions];
        String[] rightAnswers = new String[Engine.maxQuestions];
        for (int i = 0; i < Engine.maxQuestions; i++) {
            questions[i] = oneQuestion();
            rightAnswers[i] = checkQuestion(questions[i]);
        }
        Engine.playGame(gameTask, questions, rightAnswers);
    }
    public static String oneQuestion() {
        return String.valueOf(Engine.getRandomNum());
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
