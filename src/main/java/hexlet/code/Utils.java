package hexlet.code;

public class Utils {
    private static final int BORDER_FOR_RANDOM = 99;
    public static int getRandomNum() {
        return (int) (1 + Math.random() * BORDER_FOR_RANDOM);
    }
}
