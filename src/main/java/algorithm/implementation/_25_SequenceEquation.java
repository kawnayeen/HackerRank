package algorithm.implementation;

import java.util.HashMap;
import java.util.Map;

public class _25_SequenceEquation {
    int[] permutationEquation(int[] p) {
        Map<Integer, Integer> valuePosMap = new HashMap<>();
        for (int i = 0; i < p.length; i++) {
            valuePosMap.put(p[i], i + 1);
        }
        int[] output = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int temp = valuePosMap.get((i + 1));
            output[i] = valuePosMap.get(temp);
        }
        return output;
    }
}
