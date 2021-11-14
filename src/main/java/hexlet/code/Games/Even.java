package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void gameEven() {
        String gameTask = "Answer 'yes' if number even otherwise answer 'no'.";
        String[] questions = new String[Engine.MAX_QUESTIONS];
        String[] rightAnswers = new String[Engine.MAX_QUESTIONS];

        for (int i = 0; i < Engine.MAX_QUESTIONS; i++) {
            questions[i] = String.valueOf(Utils.getRandomNum());
            rightAnswers[i] = Integer.parseInt(questions[i]) % 2 == 0 ? "yes" : "no";
        }

        Engine.playGame(gameTask, questions, rightAnswers);
    }
}
