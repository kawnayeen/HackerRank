package algorithm.implementation;

public class _27_AppendDelete {
    public static final String YES = "Yes";
    public static final String NO = "No";

    String appendAndDelete(String s, String t, int k) {
        if (s.length() + t.length() < k)
            return YES;
        if (s.equals(t) && (k > (s.length() * 2) || k % 2 == 0))
            return YES;
        int sameIndex = 0;
        while (s.charAt(sameIndex) == t.charAt(sameIndex)) {
            sameIndex++;
            if (sameIndex == s.length() || sameIndex == t.length())
                break;
        }
        int differenceInSrc = 0;
        int differenceInDestination = 0;
        if (sameIndex < s.length())
            differenceInSrc = s.substring(sameIndex).length();
        if (sameIndex < t.length())
            differenceInDestination = t.substring(sameIndex).length();
        int totalDifference = differenceInSrc + differenceInDestination;
        if (totalDifference > k)
            return NO;
        if (totalDifference == k || ((totalDifference - k) % 2 == 0) || sameIndex == 0)
            return YES;
        return NO;
    }
}
