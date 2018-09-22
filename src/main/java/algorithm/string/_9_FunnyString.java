package algorithm.string;

public class _9_FunnyString {
    private static final String FUNNY = "Funny";
    private static final String NOT_FUNNY = "Not Funny";

    String funnyString(String s) {
        String reverseStr = new StringBuilder(s).reverse().toString();
        boolean notFunny = false;
        System.out.println(s + " " + reverseStr);
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(reverseStr.charAt(i + 1) - reverseStr.charAt(i))
                    != Math.abs(s.charAt(i + 1) - s.charAt(i))) {
                notFunny = true;
                break;
            }
        }
        if (notFunny)
            return NOT_FUNNY;
        return FUNNY;
    }
}
