package algorithm.implementation;

public class _22_FindDigits {
    int findDigits(int n) {
        String str = String.valueOf(n);
        int divisorCount = 0;
        for (char c : str.toCharArray()) {
            int digit = Integer.parseInt(String.valueOf(c));
            if (digit > 0 && n % digit == 0)
                divisorCount++;
        }
        return divisorCount;
    }
}
