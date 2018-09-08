package algorithm.implementation;

public class _18_DrawingBook {
    int pageCount(int n, int p) {
        if (p == 1 || p == n)
            return 0;
        int pageTurnFromFront = (int) Math.ceil((p - 1) / 2f);
        int pageTurnFromBack;
        if (n % 2 == 1)
            pageTurnFromBack = (int) Math.floor((n - p) / 2f);
        else
            pageTurnFromBack = (int) Math.ceil((n - p) / 2f);
        return pageTurnFromFront < pageTurnFromBack ? pageTurnFromFront : pageTurnFromBack;
    }
}
