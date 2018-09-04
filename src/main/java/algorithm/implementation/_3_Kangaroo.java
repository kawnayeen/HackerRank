package algorithm.implementation;

public class _3_Kangaroo {
    public static final String YES = "YES";
    public static final String NO = "NO";

    String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 < v2 || v1 == v2)
            return NO;
        if ((x2 - x1) % (v1 - v2) == 0)
            return YES;
        return NO;
    }
}
