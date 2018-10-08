package contest;

public class DiverseString {
    String solve(int n, int k) {
        // Write your code here
        if (n == 1 && k == 1)
            return "a";
        if (n == k)
            return "NONE";
        if (k == 2 && n % 2 == 1) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n / 2; i++)
                builder.append('a');
            builder.append('b');
            for (int i = 0; i < n / 2; i++)
                builder.append('a');
            return builder.toString();
        }
        return "NONE";
    }
}
