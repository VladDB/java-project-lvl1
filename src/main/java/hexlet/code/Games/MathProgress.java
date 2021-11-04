package hexlet.code.Games;

import hexlet.code.Engine;

public class MathProgress {
    static final int LENGTH_OF_QUESTION = 10;
    public static void mathPrGame() {
        String gameTask = "What number is missing in the progression?";
        String[] questions = new String[Engine.MAX_QUESTIONS];
        String[] rightAnswers = new String[Engine.MAX_QUESTIONS];
        for (int i = 0; i < Engine.MAX_QUESTIONS; i++) {
            questions[i] = oneQuestion();
            rightAnswers[i] = checkQuestion(questions[i]);
        }
        Engine.playGame(gameTask, questions, rightAnswers);
    }
    public static String oneQuestion() {
        String question = "";
        int[] questionArr = createQuestionArray(LENGTH_OF_QUESTION);
        int missingPoint = placeForMiss(questionArr);
        for (int i = 0; i < questionArr.length; i++) {
            if (i == missingPoint) {
                question += ".. ";
            } else {
                question += questionArr[i] + " ";
            }
        }
        return question;
    }
    public static String checkQuestion(String question) {
        int answer = 0;
        String[] findMiss = question.split(" ");
        for (int i = 0; i < findMiss.length; i++) {
            if (("..".equals(findMiss[i])) && i != 0) {
                answer = (Integer.parseInt(findMiss[i - 1]) + Integer.parseInt(findMiss[i + 1])) / 2;
            }
            if (("..".equals(findMiss[i])) && i == findMiss.length - 1) {
                answer = (2 * Integer.parseInt(findMiss[i - 1]) - Integer.parseInt(findMiss[i - 2]));
            }
            if ("..".equals(findMiss[i])) {
                answer = 2 * Integer.parseInt(findMiss[i + 1]) - Integer.parseInt(findMiss[i + 2]);
            }
        }
        return Integer.toString(answer);
    }
    public static int[] createQuestionArray(int arrayLength) {
        int[] valueArr = new int[arrayLength];
        valueArr[0] = Engine.getRandomNum();
        int difference = Engine.getRandomNum();
        for (int i = 1; i < valueArr.length; i++) {
            valueArr[i] = valueArr[i - 1] + difference;
        }
        return valueArr;
    }
    public static int placeForMiss(int[] array) {
        return (int) (Math.random() * (array.length - 2));
    }
}
