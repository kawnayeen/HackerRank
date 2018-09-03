package datastructure.array;

/**
 * kawnayeen
 * 3/9/18
 */
public class _7_NewYearChaos {
    public static final String TOO_CHAOTIC = "Too chaotic";
    private static final int MAXIMUM_SINGLE_BRIBE = 2;

    public String minimumBribes(int[] q) {
        int totalNumberOfBribe = 0;
        boolean isTooChaotic = false;
        for (int i = 0; i < q.length; i++) {
            int misplacement = q[i] - (i + 1);
            if (misplacement > MAXIMUM_SINGLE_BRIBE) {
                isTooChaotic = true;
                break;
            }
            int overTaken = 0;

            // as someone can bribe only 2 person ahead of him
            // that's why taking max of 0 and (q[i] - 2)
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i])
                    overTaken++;
            }
            totalNumberOfBribe += overTaken;
        }
        if (isTooChaotic)
            return TOO_CHAOTIC;
        else
            return String.valueOf(totalNumberOfBribe);
    }
}
