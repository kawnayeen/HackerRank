package algorithm.implementation;

import java.util.Arrays;

public class _17_AngryProfessor {
    static final String YES = "YES";
    static final String NO = "NO";

    String angryProfessor(int k, int[] a) {
        long onTimeStudents = Arrays.stream(a).filter(i -> i <= 0).count();
        if (onTimeStudents >= k)
            return NO;
        return YES;
    }
}
