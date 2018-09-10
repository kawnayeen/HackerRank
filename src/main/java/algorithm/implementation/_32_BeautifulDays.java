package algorithm.implementation;

/**
 * kawnayeen
 * 10/9/18
 */
public class _32_BeautifulDays {
    int beautifulDays(int i, int j, int k) {
        int days = 0;
        for (int l = i; l <= j; l++) {
            String reverseStr = new StringBuilder(l+"").reverse().toString();
            int reverseVal = Integer.parseInt(reverseStr);
            int diff = Math.abs(l - reverseVal);
            if (diff % k == 0)
                days++;
        }
        return days;
    }
}
