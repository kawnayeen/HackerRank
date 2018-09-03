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
            if (misplacement > 0)
                totalNumberOfBribe += misplacement;
            if (misplacement > MAXIMUM_SINGLE_BRIBE) {
                isTooChaotic = true;
                break;
            }
        }
        if (isTooChaotic)
            return TOO_CHAOTIC;
        else
            return String.valueOf(totalNumberOfBribe);
    }
}
