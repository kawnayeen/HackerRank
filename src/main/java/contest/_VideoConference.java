package contest;

import java.util.*;

public class _VideoConference {
    List<String> solve(List<String> names) {
        // Write your code here
        List<String> output = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();
        output.add(String.valueOf(names.get(0).charAt(0)));
        count.put(names.get(0), 1);
        for (int i = 1; i < names.size(); i++) {
            String name = names.get(i);
            boolean found = false;
            for (int j = 1; j < name.length(); j++) {
                String sub = name.substring(0, j);
                boolean unique = true;
                for (int k = 0; k < i; k++) {
                    if (names.get(k).startsWith(sub)) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    output.add(sub);
                    found = true;
                    count.put(name, 1);
                    break;
                }
            }
            if (!found) {
                if (count.containsKey(name)) {
                    count.put(name, count.get(name) + 1);
                    output.add(name + " " + count.get(name));
                } else {
                    count.put(name, 1);
                    output.add(name);
                }
            }
        }
        return output;
    }
}
