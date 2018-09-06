package algorithm.implementation;

import java.util.*;

/**
 * kawnayeen
 * 6/9/18
 */
public class _7_MigratoryBirds {
    int migratoryBirds(List<Integer> arr) {
        Map<Integer, Birds> birdsById = new HashMap<>();
        List<Birds> birdList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Birds birds = new Birds(i);
            birdsById.put(i, birds);
            birdList.add(birds);
        }
        for (int sightedBird : arr)
            birdsById.get(sightedBird).sightingsCount++;
        long maxSighting = -1;
        int sightingIndex = -1;
        for (int i = 0; i < 5; i++) {
            if (birdList.get(i).sightingsCount > maxSighting) {
                maxSighting = birdList.get(i).sightingsCount;
                sightingIndex = i;
            }
        }
        return birdList.get(sightingIndex).id;
    }

    class Birds {
        int id;
        long sightingsCount;

        public Birds(int id) {
            this.id = id;
        }
    }
}
