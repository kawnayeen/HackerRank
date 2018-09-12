package _10_days_of_statistics;

import util.DoubleUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * kawnayeen
 * 12/9/18
 */
public class _1_InterQuartileRange {
    void prepareArray(int[] uniqueVal, int[] occurrence) {
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < uniqueVal.length; i++) {
            int val = uniqueVal[i];
            for (int k = 0; k < occurrence[i]; k++)
                values.add(val);
        }
        System.out.println(values);
        int[] valueArr = values.stream().mapToInt(Integer::intValue).toArray();
        printInterQuartiles(valueArr);
    }

    void printInterQuartiles(int[] arr) {
        int q1 = 0;
        int q3 = 0;

        List<List<Integer>> indexes = quartilesIndex(arr.length);
        System.out.println(indexes);
        arr = Arrays.stream(arr).sorted().toArray();

        for (int val : indexes.get(0)) {
            q1 += arr[val];
        }
        double quartileOne = (q1 * 1.0) / indexes.get(0).size();

        for (int val : indexes.get(2)) {
            q3 += arr[val];
        }
        double quartileThree = (q3 * 1.0) / indexes.get(2).size();
        System.out.println(DoubleUtil.round((quartileThree - quartileOne), 1));
    }

    List<List<Integer>> quartilesIndex(int numberOfElement) {
        List<List<Integer>> indexes = new ArrayList<>();
        if (numberOfElement % 2 == 1) {
            if (numberOfElement % 4 == 3) {
                int q2Index = numberOfElement / 2;
                int q1FirstIndex = numberOfElement / 4;
                int q3FirstIndex = q2Index + q1FirstIndex + 1;
                indexes.add(Arrays.asList(q1FirstIndex));
                indexes.add(Arrays.asList(q2Index));
                indexes.add(Arrays.asList(q3FirstIndex));
            } else {
                // odd number of element, 2 segment will also have odd number of element
                int q2Index = numberOfElement / 2;
                int q1SecondIndex = numberOfElement / 4;
                int q1FirstIndex = q1SecondIndex - 1;
                int q3FirstIndex = q2Index + q1FirstIndex + 1;
                int q3SecondIndex = q2Index + q1SecondIndex + 1;
                indexes.add(Arrays.asList(q1FirstIndex, q1SecondIndex));
                indexes.add(Arrays.asList(q2Index));
                indexes.add(Arrays.asList(q3FirstIndex, q3SecondIndex));
            }
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
