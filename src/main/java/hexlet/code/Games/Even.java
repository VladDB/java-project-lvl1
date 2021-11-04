package hexlet.code.Games;

import hexlet.code.Engine;

public class Even {
    public static void gameEven() {
        String gameTask = "Answer 'yes' if number even otherwise answer 'no'.";
        String[] questions = new String[Engine.maxQuestions];
        String[] rightAnswers = new String[Engine.maxQuestions];
        for (int i = 0; i < Engine.maxQuestions; i++) {
            questions[i] = String.valueOf(Engine.getRandomNum());
            rightAnswers[i] = Integer.parseInt(questions[i]) % 2 == 0 ? "yes" : "no";
        }
        Engine.playGame(gameTask, questions, rightAnswers);
    }
}
