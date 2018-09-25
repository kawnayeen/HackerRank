package datastructure.stack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * kawnayeen
 * 25/9/18
 */
class Entry {
    long value;
    long maxValueUpToValue;
}

public class _2_MaximumElement {
    private static final String SPACE = " ";
    private static final String DELETE = "2";

    void processQueries(ArrayList<String> queries) {
        Stack<Entry> stack = new Stack<>();
        long maxValue = 0;
        for (String query : queries) {
            query = query.trim();
            if (query.contains(SPACE)) {
                long valToPush = Long.parseLong(query.substring(2));
                Entry entry = new Entry();
                entry.value = valToPush;
                maxValue = Math.max(maxValue, valToPush);
                entry.maxValueUpToValue = maxValue;
                stack.push(entry);
            } else if (query.equals(DELETE)) {
                stack.pop();
                if (stack.isEmpty())
                    maxValue = 0;
                else
                    maxValue = stack.peek().maxValueUpToValue;
            } else {
                System.out.println(String.valueOf(stack.peek().maxValueUpToValue));
            }
        }
    }
}
