package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class MathProgress {
    static final int LENGTH_OF_QUESTION = 10;

    public static void mathPrGame() {
        String gameTask = "What number is missing in the progression?";

        String[] questions = new String[Engine.MAX_QUESTIONS];
        String[] rightAnswers = new String[Engine.MAX_QUESTIONS];

        for (int i = 0; i < Engine.MAX_QUESTIONS; i++) {
            int[] questionArr = createQuestionArray(LENGTH_OF_QUESTION);
            int missingPoint = placeForMiss(questionArr);

            rightAnswers[i] = String.valueOf(questionArr[missingPoint]);

            String[] quest = Arrays.stream(questionArr).mapToObj(String::valueOf).toArray(String[]::new);
            quest[missingPoint] = "..";
            questions[i] = String.join(" ", quest);
        }

        Engine.playGame(gameTask, questions, rightAnswers);
    }
    public static int[] createQuestionArray(int arrayLength) {
        int[] valueArr = new int[arrayLength];
        valueArr[0] = Utils.getRandomNum();
        int difference = Utils.getRandomNum();

        for (int i = 1; i < valueArr.length; i++) {
            valueArr[i] = valueArr[i - 1] + difference;
        }

        return valueArr;
    }
    public static int placeForMiss(int[] array) {
        return (int) (Math.random() * (array.length - 2));
    }
}
