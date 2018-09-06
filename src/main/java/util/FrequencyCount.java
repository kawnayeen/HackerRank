package util;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static Map<Integer, Integer> countFrequency(int[] input) {
        Map<Integer, Integer> frequencyByNumber = new HashMap<>();
        for(int val: input){
            if(frequencyByNumber.containsKey(val)){
                int presentCount = frequencyByNumber.get(val);
                presentCount++;
                frequencyByNumber.put(val,presentCount);
            }else {
                frequencyByNumber.put(val,1);
            }
        }
        return frequencyByNumber;
    }
}
