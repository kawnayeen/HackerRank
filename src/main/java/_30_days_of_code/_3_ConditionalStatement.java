package _30_days_of_code;

public class _3_ConditionalStatement {
    public static String WEIRD = "Weird";
    public static String NOT_WEIRD = "Not Weird";

    public String getFeedback(int value) {
        if (value % 2 == 1)
            return WEIRD;
        if (value <= 5)
            return NOT_WEIRD;
        if (value <= 20)
            return WEIRD;
        return NOT_WEIRD;
    }
}
