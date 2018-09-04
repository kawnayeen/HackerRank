package algorithm.warmup;

/**
 * kawnayeen
 * 4/9/18
 */
public class _6_Staircase {
    private static final String SPACE = " ";
    private static final String HASH = "#";

    public String stairCase(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < (n - i - 1))
                    stringBuilder.append(SPACE);
                else
                    stringBuilder.append(HASH);
            }
            if (i + 1 != n)
                stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
