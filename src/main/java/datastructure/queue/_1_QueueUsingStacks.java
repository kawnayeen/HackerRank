package datastructure.queue;

import java.util.List;
import java.util.Stack;

public class _1_QueueUsingStacks {
    private static final String ENQUEUE = "1";
    private static final String DEQUEUE = "2";

    public void runQueries(List<String> queries) {
        Stack<Integer> primaryStack = new Stack<>();
        Stack<Integer> backup = new Stack<>();
        StringBuilder builder = new StringBuilder();
        int oldestVal = 0;
        for (String query : queries) {
            if (query.startsWith(ENQUEUE)) {
                int val = Integer.parseInt(query.substring(2));
                if (primaryStack.size() == 0)
                    oldestVal = val;
                primaryStack.push(val);
            } else if (query.startsWith(DEQUEUE)) {
                backup.clear();
                while (!primaryStack.isEmpty())
                    backup.push(primaryStack.pop());
                backup.pop();
                if (!backup.isEmpty())
                    oldestVal = backup.peek();
                else
                    oldestVal = 0;
                while (!backup.empty())
                    primaryStack.push(backup.pop());
            } else {
                builder.append(oldestVal);
                builder.append("\n");
            }
        }
        System.out.println(builder.toString());
    }
}
