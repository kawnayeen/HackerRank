package datastructure.array;

import java.util.ArrayList;
import java.util.List;

public class _3_DynamicArray {
    public List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> initialSequences = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int lastAnswer = 0;
        for (int i = 0; i < n; i++)
            initialSequences.add(new ArrayList<>());
        for (List<Integer> query : queries) {
            int indexOfSequence = (lastAnswer ^ query.get(1)) % n;
            if (query.get(0) == 1) {
                initialSequences.get(indexOfSequence).add(query.get(2));
            } else {
                int indexOfWantedValue = query.get(2) % initialSequences.get(indexOfSequence).size();
                lastAnswer = initialSequences.get(indexOfSequence).get(indexOfWantedValue);
                output.add(lastAnswer);
            }
        }
        return output;
    }
}
