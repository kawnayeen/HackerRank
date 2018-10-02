package algorithm.implementation;

/**
 * kawnayeen
 * 2/10/18
 */
public class _44_ChocolateFeast {
    int chocolateFeast(int n, int c, int m) {
        int numberOfWrapper = n / c;
        int totalChocolate = numberOfWrapper;
        while (numberOfWrapper >= m) {
            totalChocolate += (numberOfWrapper / m);
            numberOfWrapper = (numberOfWrapper / m) + (numberOfWrapper % m);
        }
        return totalChocolate;
    }
}
