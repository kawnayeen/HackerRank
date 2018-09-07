package _10_days_of_statistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_Quartiles {

    void printQuartiles(int[] arr) {
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;

        List<List<Integer>> indexes = quartilesIndex(arr.length);
        arr = Arrays.stream(arr).sorted().toArray();

        for (int val : indexes.get(0)) {
            q1 += arr[val];
        }
        q1 = q1 / indexes.get(0).size();

        for (int val : indexes.get(1)) {
            q2 += arr[val];
        }
        q2 = q2 / indexes.get(1).size();

        for (int val : indexes.get(2)) {
            q3 += arr[val];
        }
        q3 = q3 / indexes.get(2).size();

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }

    List<List<Integer>> quartilesIndex(int numberOfElement) {
        List<List<Integer>> indexes = new ArrayList<>();
        if (numberOfElement % 2 == 1) {
            // odd number of element, 2 segment will also have odd number of element
            int q2Index = numberOfElement / 2;
            int q1SecondIndex = numberOfElement / 4;
            int q1FirstIndex = q1SecondIndex - 1;
            int q3FirstIndex = q2Index + q1FirstIndex + 1;
            int q3SecondIndex = q2Index + q1SecondIndex + 1;
            indexes.add(Arrays.asList(q1FirstIndex, q1SecondIndex));
            indexes.add(Arrays.asList(q2Index));
            indexes.add(Arrays.asList(q3FirstIndex, q3SecondIndex));
        } else {
            if (numberOfElement % 4 == 0) {
                // even number of element, 2 segment will also have even number of element
                int q2SecondIndex = numberOfElement / 2;
                int q2FirstIndex = q2SecondIndex - 1;
                int q1SecondIndex = numberOfElement / 4;
                int q1FirstIndex = q1SecondIndex - 1;
                int q3FirstIndex = q2SecondIndex + q1FirstIndex;
                int q3SecondIndex = q2SecondIndex + q1SecondIndex;
                indexes.add(Arrays.asList(q1FirstIndex, q1SecondIndex));
                indexes.add(Arrays.asList(q2FirstIndex, q2SecondIndex));
                indexes.add(Arrays.asList(q3FirstIndex, q3SecondIndex));
            } else {
                // even number of element, 2 segment will have odd number of element
                int q2SecondIndex = numberOfElement / 2;
                int q2FirstIndex = q2SecondIndex - 1;
                int q1Index = numberOfElement / 4;
                int q3Index = q2SecondIndex + q1Index;
                indexes.add(Arrays.asList(q1Index));
                indexes.add(Arrays.asList(q2FirstIndex, q2SecondIndex));
                indexes.add(Arrays.asList(q3Index));
            }
        }
        return indexes;
    }
}
