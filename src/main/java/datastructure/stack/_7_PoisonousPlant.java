package datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class _7_PoisonousPlant {
    int poisonousPlants(int[] p) {
        List<Integer> plants = new ArrayList<>();
        for (int val : p)
            plants.add(val);
        int numberOfDays = 0;
        while (true) {
            List<Integer> dieIndex = getDieIndex(plants);
            if (dieIndex.size() == 0) {
                break;
            }
            numberOfDays++;
            for (int i = 0; i < dieIndex.size(); i++) {
                plants.remove(dieIndex.get(i) - i);
            }
        }
        return numberOfDays;
    }

    List<Integer> getDieIndex(List<Integer> plants) {
        List<Integer> index = new ArrayList<>();
        for (int i = 1; i < plants.size(); i++) {
            if (plants.get(i) > plants.get(i - 1))
                index.add(i);
        }
        return index;
    }
}
