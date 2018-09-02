package _30_days_of_code._29_BitwiseAnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class _29_BitwiseAnd {
    public List<Integer> findMaximumBitwiseAnd(List<Pair> pairs) {
        Optional<Integer> maxSetValueOptional = pairs.stream().map(p -> new Integer(p.maxValueOfSet)).reduce(Integer::max);
        if (maxSetValueOptional.isPresent()) {
            int maximumValue = maxSetValueOptional.get();
            int[][] values = new int[maximumValue][maximumValue + 1];
            for (int i = 1; i < maximumValue; i++) {
                for (int j = i+1; j <= maximumValue; j++) {
                    int andVal = i & j;
                    values[i][j] = andVal;
                }
            }
            List<Integer> output = new ArrayList<>();
            for (Pair pair : pairs) {
                int upperLimit = pair.upperLimit;
                int maxVal = -1;
                for (int i = 1; i < pair.maxValueOfSet; i++) {
                    for (int j = 2; j <= pair.maxValueOfSet; j++) {
                        if (values[i][j] > maxVal && values[i][j] < upperLimit)
                            maxVal = values[i][j];
                    }
                }
                output.add(maxVal);
            }
            return output;
        }
        return null;
    }
}
