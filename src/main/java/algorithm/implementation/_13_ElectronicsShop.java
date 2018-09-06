package algorithm.implementation;

import java.util.Arrays;

/**
 * kawnayeen
 * 6/9/18
 */
public class _13_ElectronicsShop {
    int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int[] filteredKeyboards = Arrays.stream(keyboards).filter(i -> i < b).toArray();
        int[] filteredDrives = Arrays.stream(drives).filter(i -> i < b).toArray();
        int maximumAvailableCost = -1;
        for (int i = 0; i < filteredKeyboards.length; i++) {
            for (int j = 0; j < filteredDrives.length; j++) {
                int temp = filteredKeyboards[i] + filteredDrives[j];
                if (temp <= b) {
                    if (temp > maximumAvailableCost)
                        maximumAvailableCost = temp;
                }
            }
        }
        return maximumAvailableCost;
    }
}
