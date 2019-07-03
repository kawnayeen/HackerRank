package algorithm.implementation;

import util.FrequencyCount;

import java.util.Map;

public class _53_RansomNote {
    void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineWords = FrequencyCount.countStringFrequency(magazine);
        Map<String, Integer> noteWords = FrequencyCount.countStringFrequency(note);
        boolean allFound = true;
        for (String key : noteWords.keySet()) {
            if (magazineWords.containsKey(key)) {
                if (magazineWords.get(key) < noteWords.get(key)) {
                    allFound = false;
                    break;
                }
            } else {
                allFound = false;
                break;
            }
        }

        if (allFound) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
