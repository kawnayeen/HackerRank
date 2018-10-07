package algorithm.implementation;

public class _45_HalloweenSale {
    int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        if (p > s)
            return 0;
        int totalGames = 0;
        int totalSpend = 0;
        int lastPrice = p;
        while ((totalSpend + lastPrice) <= s) {
            totalSpend += lastPrice;
            totalGames++;
            lastPrice = lastPrice - d;
            if (m > lastPrice)
                lastPrice = m;
        }
        return totalGames;
    }
}
