package algorithm.implementation;

public class _28_UtopianTree {
    int utopianTree(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 2;
        if (n % 2 == 0)
            return utopianTree(n - 1) + 1;
        return utopianTree(n - 1) * 2;
    }
}
