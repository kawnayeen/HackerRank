package algorithm.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Values {
    int value;
    int index;

    public Values(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

public class _1_MaxStockProfit {
    int stockmax(int[] prices) {
        int maxValue = 0;
        List<Values> valuesList = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxValue) {
                maxValue = prices[i];
                valuesList.clear();
                valuesList.add(new Values(maxValue, i));
            } else if (i > 0 && prices[i] > prices[i - 1]) {
                valuesList.add(new Values(prices[i], i));
                int currentVal = prices[i];
                valuesList = valuesList.stream().filter(v -> v.value >= currentVal).collect(Collectors.toList());
            }
        }
        int totalStock = 0;
        int investmentAmount = 0;
        int totalProfit = 0;
        Values firstSellDay = valuesList.get(0);
        valuesList.remove(0);
        for (int i = 0; i < prices.length; i++) {
            if (i == firstSellDay.index) {
                totalProfit += (totalStock * prices[i] - investmentAmount);
                totalStock = 0;
                investmentAmount = 0;
                if (valuesList.isEmpty())
                    break;
                else {
                    firstSellDay = valuesList.get(0);
                    valuesList.remove(0);
                }
            } else {
                totalStock++;
                investmentAmount += prices[i];
            }
        }
        return totalProfit;
    }

    long maximizeProfit(int[] prices) {
        int maxValue = 0;
        long profit = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] > maxValue) {
                maxValue = prices[i];
            } else {
                profit += (maxValue - prices[i]);
            }
        }
        return profit;
    }
}
